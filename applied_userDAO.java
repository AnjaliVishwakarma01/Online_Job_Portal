/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.entity.applied_user;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author hp
 */
public class applied_userDAO {
    private Connection conn;
    
    public applied_userDAO(Connection conn){
        this.conn=conn;
    }
    public boolean addAppliedUser(applied_user u){
        boolean f=false;
        try{
            
            String sql="insert into applied_user(name,qualification,email)values(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getQualification());
            ps.setString(3, u.getEmail());
            
            int i=ps.executeUpdate();
            if(i==1){
                f=true;
            }
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public boolean applied_user(applied_user u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
