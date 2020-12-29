package com.quizz.dao;

import com.quizz.dto.User;
import java.sql.Connection;
import com.quizz.dto.quizzParticipate;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Participatedao 
{
    private PreparedStatement ps;
    
    public boolean saveParticipate(quizzParticipate u)
    {
        try 
        {    
            Connection cnn=Dbconnection.getconnection();
            String q="insert into quizz.participate (Name,mail,scType,type) values(?,?,?,?)";
            ps=cnn.prepareCall(q);
            ps.setString(1,u.getPname());
            ps.setString(2,u.getPmail());
            ps.setString(3,u.getPscname());
            ps.setInt(4,u.getPknow());
            ps.executeUpdate();
            cnn.close();
            
            return true;
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Error "+ex.getMessage());
            return false;
        }
    }
}
