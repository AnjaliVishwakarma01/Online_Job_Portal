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
public class user {
   
    private int id;
    private String name;
    private String email;
    private String password;
    private String qualification;
    private String role; 
    
    public user( String name, String qualification, String email, String password, String role) {
        super();
        this.name = name;
         this.qualification = qualification;
        this.email = email;
        this.password = password;
       
        this.role = role;
    }
 
    

    public user() {
        super();//To change body of generated methods, choose Tools | Templates.
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
