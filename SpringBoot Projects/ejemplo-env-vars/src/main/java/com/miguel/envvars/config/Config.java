package com.miguel.envvars.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${persona.nombre}")
    private String nombre;

    @Value("${persona.apellido}")
    private String apellido;

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

}
