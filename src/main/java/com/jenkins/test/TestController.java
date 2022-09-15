package com.jenkins.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestController {
   
    
    @GetMapping(path="/", produces = "application/json")
    public String getEmployees() 
    {
        return "Hello WORLD";
    }
    
}
