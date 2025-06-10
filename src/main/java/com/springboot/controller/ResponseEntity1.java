package com.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ResponseEntity1 {

    @GetMapping(path = "/FetchUser")
    public ResponseEntity<String>  getUserDetails(@RequestParam(value = "firstname") String firstname){
        String output = "User details with firstname: "+firstname;
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}
