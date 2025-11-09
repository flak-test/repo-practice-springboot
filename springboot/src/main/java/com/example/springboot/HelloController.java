package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        String saludo="Hello, Spring Boot! ";
        LocalDate fecha=LocalDate.now();
        DateTimeFormatter formateadorFecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String text=fecha.format(formateadorFecha); //esto da ya al fecha pero en formato y con un tipo String

        return saludo+text;
    }
}