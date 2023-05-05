package com.fission.lab.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloWorldController {

     @GetMapping("/name/{name}")
    public  String displayName(@PathVariable("name") String name)
    {
         return  "Hello " + name;
    }


}
