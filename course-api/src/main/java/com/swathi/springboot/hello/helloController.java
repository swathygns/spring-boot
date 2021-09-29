package com.swathi.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hello from springboot";
    }
    @RequestMapping("/bye")
    public String sayBye(){
        return "Bye from springboot";
    }
   
}