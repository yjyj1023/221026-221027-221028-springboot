package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName(){
        return "YeonJae";
    }

    //http://localhost:8080/api/v1/get-api/variable1/1
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    //http://localhost:8080/api/v1/get-api/request1?name=YeonJae&email=70003738@gmail.com&organization=멋사
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization){
        return name+" "+email+" "+organization;
    }
}
