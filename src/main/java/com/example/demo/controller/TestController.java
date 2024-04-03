package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class TestController {


    @GetMapping("/hola")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hola desde API", HttpStatus.OK);
    }

}
