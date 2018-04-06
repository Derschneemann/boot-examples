package com.dsm.examples.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping(path="/foo")
    public String getFoo(){
        return "Hello Foo!";
    }
}
