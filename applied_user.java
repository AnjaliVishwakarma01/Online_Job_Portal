/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author hp
 */
public class applied_user {
   
    private int id;
    private String name;
    private String email;
    private String password;
    private String qualification;
    private String role; 
    
 
    

    public applied_user () {
        super();//To change body of generated methods, choose Tools | Templates.
    }

    public applied_user(int id, String name, String email, String ps, String qua) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
   
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    

    
    public applied_user( String name,  String email, String password) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
       
    }
}
