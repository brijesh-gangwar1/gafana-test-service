package com.tmetrics.gafana_test_service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/slow")
    public String slow() throws InterruptedException {
        Thread.sleep(1000);
        return "Slow response";
    }
}
