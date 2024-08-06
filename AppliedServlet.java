/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.dao.applied_userDAO;

import com.db.DBConnection;
import com.entity.applied_user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author hp
 */

@WebServlet("/applieduser")
        public class AppliedServlet extends HttpServlet{

   
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
        try{
        String name=req.getParameter("name");
             String qua=req.getParameter("qua");
             String email=req.getParameter("email");
             
             applied_userDAO dao =new applied_userDAO(DBConnection.getConn());
              applied_user u=new applied_user(name,qua,email);
               boolean f=dao.addAppliedUser(u);
             HttpSession session =req.getSession();
           
              if(f){
             session.setAttribute("succmsg","Applied Successfully");
             resp.sendRedirect("home.jsp");
            }
         else{
             session.setAttribute("succmsg","Something wrong on server");
               resp.sendRedirect("home.jsp");
             
         }
              
        
        } 
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
