package com.rahul.demo.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/hello")
    public String sayHello() {
        int i = 5 / 0;
        return "hello Greetings !";
    }

    @RequestMapping("/user")
    public String user() {
        return "Hello user Greetings !";
    }
}
