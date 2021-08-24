package com.swathi.springboot.com.swathi.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping
    public String sayHi(){
        return "Hello from springboot";
    }
}