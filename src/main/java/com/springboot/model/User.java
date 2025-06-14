package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("user_name")
    public String username;
    public String email;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(){
        this.email = email;
    }
}
