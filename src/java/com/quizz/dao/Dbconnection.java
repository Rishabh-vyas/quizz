package com.quizz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection 
{
    public static Connection getconnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/quizz";
        Connection cnn=DriverManager.getConnection(url,"root","root");
        return cnn;
    }
}
