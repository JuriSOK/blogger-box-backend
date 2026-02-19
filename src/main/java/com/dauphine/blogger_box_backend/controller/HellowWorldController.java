package com.dauphine.blogger_box_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {

    @GetMapping("/hello/{name}")
    public String sayHi(@PathVariable String name) {
        return "Hi " + name;
    }
    //http://localhost:7575/hello/arnaud

    @GetMapping("/hello")
    public String sayHiV2(@RequestParam String name) {
        return "v2 - Hi " + name;
    }
    //http://localhost:7575/hello?name=Arnaud pour tester







}
