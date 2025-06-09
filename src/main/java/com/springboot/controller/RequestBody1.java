package com.springboot.controller;

import org.springframework.web.bind.annotation.*;
import com.springboot.model.User;

@RestController
@RequestMapping(value = "/api")
public class RequestBody1 {
    @PostMapping(path = "/saveUser")
    public String  setUserDetails(@RequestBody User user){
        return "User Created with username : "+ user.username+ " and email: "+user.email;
    }
}
