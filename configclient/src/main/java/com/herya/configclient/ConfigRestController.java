package com.herya.configclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class ConfigRestController {
    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping(path = "/")
    public String GetGreetingMessage(){
        return greetingMessage;
    }

}
