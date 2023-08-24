package com.teamtwo.dispatchmanagementsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name = "user")
@JsonDeserialize(builder =  User.Builder.class)
public
class User {
    @Id
    private String username;
    @JsonIgnore
    private String password;
    public User(){}
    private User(Builder builder){
        this.username = builder.username;
        this.password = builder.password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public User setUsername(String username){
        this.username = username;
        return this;
    }
    public User setPassword(String password){
        this.password = password;
        return this;
    }
    public static class Builder{
        @JsonProperty("username")
        private String username;
        @JsonProperty("password")
        private String password;
        public Builder
        setUsername(String username){
            this.username = username;
            return this;
        }
        public Builder setPassword(String password){
            this.password = password;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}

