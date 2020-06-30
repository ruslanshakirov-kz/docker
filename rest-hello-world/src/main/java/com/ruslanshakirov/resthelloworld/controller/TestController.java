package com.ruslanshakirov.resthelloworld.controller;

import com.ruslanshakirov.resthelloworld.dto.HelloWorldBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello-world")
    public String helloWorldStr() {
        return "Hello, world v3.0";
    }

    @GetMapping(path = "/hello-world-bean", produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello, world");
    }
}
