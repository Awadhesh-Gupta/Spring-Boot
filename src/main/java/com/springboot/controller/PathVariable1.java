package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/API")
public class PathVariable1 {
    @GetMapping(path = "/Fetchuser/{firstname}")
    public String getUserDetails(@org.springframework.web.bind.annotation.PathVariable(value = "firstname") String firstname){
        return "Feching and returning user details based on firstname: "+firstname;
    }
}
