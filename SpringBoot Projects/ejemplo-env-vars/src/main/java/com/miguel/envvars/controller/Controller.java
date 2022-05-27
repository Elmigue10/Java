package com.miguel.envvars.controller;

import com.miguel.envvars.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@CrossOrigin("*")
public class Controller {

    @Autowired
    private Config config;

    @GetMapping("")
    public String envVars(){
        return "Hello i'm "+config.getNombre() + " " + config.getApellido() + " 😎⚡";
    }

}
