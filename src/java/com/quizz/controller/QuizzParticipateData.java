package com.quizz.controller;

import com.quizz.dao.Participatedao;
import com.quizz.dao.Userdao;
import com.quizz.dto.User;
import com.quizz.dto.quizzParticipate;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "participateData",urlPatterns = {"/partData"})
public class QuizzParticipateData extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String pname=req.getParameter("pname");
        String mail=req.getParameter("pmail");
        String pscname=req.getParameter("pscname");
        int pknow=Integer.parseInt(req.getParameter("pknow"));
        
        quizzParticipate qp=new quizzParticipate(pname, mail, pscname, pknow);
        
        Participatedao pp=new Participatedao();
        boolean st=pp.saveParticipate(qp);        
        
        if(qp==null)
        {
            System.out.println("Failed !");
        }
        else
        {
            LoginServlet ll=new LoginServlet();
            HttpSession seesion=req.getSession();
            seesion.setAttribute("loginuser",qp);
            System.out.println("lllllllllllllllllllllllllllllllllllllllllllllll "+qp.getPname());
            if(qp.getPknow()==1)
            {
                resp.sendRedirect("Quizz_know_1.jsp?st="+st);
            }
            else if(qp.getPknow()==2)
            {
                resp.sendRedirect("Quizz_know_2.jsp?st="+st);
            }
            else if(qp.getPknow()==3)
            {
                resp.sendRedirect("Quizz_know_3.jsp?st="+st);
            }
            else if(qp.getPknow()==4)
            {
                resp.sendRedirect("Quizz_know_4.jsp?st="+st);
            }
        }
    }
    
}
