package com.quizz.dao;

import com.quizz.dto.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Userdao 
{
    private PreparedStatement ps;
    public boolean saveuser(User user)
    {        
        try 
        {
             Connection cnn= Dbconnection.getconnection();
             String q="insert into quizz.user (name,mail,password,type,knowledge) values(?,?,?,?,?)";
             ps=cnn.prepareStatement(q);
             ps.setString(1,user.getName());
             System.out.println(user.getName());
             ps.setString(2,user.getMail());
             ps.setString(3,user.getPass());
             ps.setInt(4,user.getType());
             ps.setInt(5,user.getKnowledge());
             int i=ps.executeUpdate();
             cnn.close();
             return true;
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Error Register "+ex.getMessage());
            return false;
        }
        
    }
    
   
    
    public User loginUser(String mail,String pass)
    {
        User u=null;
        try 
        {
            Connection cnn=Dbconnection.getconnection();
            String q="select * from user where mail=? and password=?";
            ps=cnn.prepareStatement(q);
            ps.setString(1,mail);
            ps.setString(2,pass);
            ResultSet ss=ps.executeQuery();
            while(ss.next())
            {
                int uid=ss.getInt("uid");
                String name=ss.getString("name");
                String email=ss.getString("mail");
                int type=ss.getInt("type");
                int know=ss.getInt("knowledge");
                int otp=ss.getInt("otp");
                int isverify=ss.getInt("isVerify");
                String phone=ss.getString("phone");
                
                u=new User(uid, name, email, phone, type, know, otp, isverify);   
            }
            cnn.close();
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(Userdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
        
    }
    
    public boolean checkPassword(int uid,String oldpass,String newpass)
    {
        Connection cnn;
        try
        {
             cnn = Dbconnection.getconnection();
             String q="update user set password=? where uid=? and  password=?";
             ps=cnn.prepareStatement(q);
             ps.setString(1,newpass);
             ps.setInt(2, uid);
             ps.setString(3,oldpass);
             ps.executeUpdate();
             cnn.close();
             return true;
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Error Message "+ex.getMessage());
            return false;
        }
    }
}
