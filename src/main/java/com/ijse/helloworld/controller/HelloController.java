package com.ijse.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //annotations - predefined components
public class HelloController {
   
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!!";
    }

    @GetMapping("/read")
        public String sayRead(){
            return "You are reading!!";
        }
    
}
