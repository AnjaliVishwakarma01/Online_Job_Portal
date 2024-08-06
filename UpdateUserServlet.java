/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.dao.userDAO;
import com.db.DBConnection;
import com.entity.user;
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
@WebServlet("/update_profile")
public class UpdateUserServlet extends HttpServlet{
    @Override
   
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
     
    try {
        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String qua=req.getParameter("qua");
        String email=req.getParameter("email");
        String ps=req.getParameter("ps");
        userDAO dao=new userDAO(DBConnection.getConn());
        
         
        user u=new user();
        u.setId(id);
        u.setName(name);
        u.setQualification(qua);
        u.setPassword(ps);
        u.setEmail(email);
        
        boolean f=dao.updateUser(u);
        HttpSession session =req.getSession();
        if(f){
            session.setAttribute("succMsg","profile update Successfully");
            resp.sendRedirect("home.jsp");
        }
        else{
            session.setAttribute("succMsg","Something wrong on server");
            resp.sendRedirect("home.jsp");
        }
      
        
        
        
        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
    
}
}