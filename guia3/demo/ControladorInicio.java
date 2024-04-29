package com.guia3.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio (){
        return "Este es mi inicio"
    }
}
