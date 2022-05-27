package com.miguel.jwt.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class ExampleController {

    @GetMapping("/prueba")
    public String prueba(){
        return "Prueba";
    }

}
