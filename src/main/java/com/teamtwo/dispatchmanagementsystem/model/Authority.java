package com.teamtwo.dispatchmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authority" )
public class Authority {
    @Id
    private String username;
    //private String authority;
    public Authority(){
    }
    public Authority(String username){
        this.username = username;
        //this.authority = authority;
    }
    public String getUsername(){
        return this.username;
    }
   /* public String getAuthority(){
        return this.authority;
    }
*/
    public Authority setUsername(String username) {
        this.username = username;
        return this;
    }
/*
    public Authority setAuthority(String authority) {
        this.authority = authority;
        return this;
    }

 */
}
