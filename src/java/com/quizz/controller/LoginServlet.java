package com.quizz.controller;

import com.quizz.dao.Userdao;
import com.quizz.dto.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "login",urlPatterns = {"/loginuser"})

public class LoginServlet extends HttpServlet
{

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String mail=req.getParameter("email");
        String pass=req.getParameter("pass");
        
        Userdao dao=new Userdao();
        User userData=dao.loginUser(mail, pass);
        
        if(userData==null)
        {
            resp.sendRedirect("passNotMach.jsp");
        }
        else
        {
            HttpSession session=req.getSession();
            session.setAttribute("loginuser",userData);
            LoginServlet l=(LoginServlet)new LoginServlet();
                    
            System.out.println("Succesfully Login");
            resp.sendRedirect("quizz.jsp?lg=true");
        }
    }
    
    
}
