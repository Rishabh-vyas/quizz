package com.quizz.controller;

import com.quizz.dao.Userdao;
import com.quizz.dto.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "register",urlPatterns = {"/saveuser"})
public class RegisterServlet extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String name=req.getParameter("uname");
        String mail=req.getParameter("email");
        String pass=req.getParameter("pass");
        int type=Integer.parseInt(req.getParameter("type"));
        int know=Integer.parseInt(req.getParameter("know"));
        User u=new User(name, mail, pass, type, know);
        
        Userdao dao=new Userdao();
        boolean st=dao.saveuser(u);
        resp.sendRedirect("re.jsp?st="+st);
        
    }
    
}
