package com.manishpvt.quickstart.quickstart_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String helloWorld(){

        return "Hello Manish!";

    }
}
