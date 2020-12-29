package com.quizz.controller;

import com.quizz.dao.Userdao;
import com.quizz.dto.User;
import java.io.IOException;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "oldPassworldCheck",urlPatterns = {"/checkPassword"})

public class CheckPassword extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        User userData=(User)req.getSession().getAttribute("loginuser");
        int id=userData.getUid();
        String oldpass=req.getParameter("oldpass");
        String newpass=req.getParameter("newpass");
        System.out.println("1111111");
                
        Userdao userdao=new Userdao();
        boolean st=userdao.checkPassword(id, oldpass, newpass);
        System.out.println(st);
        resp.sendRedirect("successPassChanged.jsp?st=true");
        
    }
    
}
