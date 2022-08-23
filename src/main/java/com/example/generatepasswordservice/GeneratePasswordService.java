package com.example.generatepasswordservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class GeneratePasswordService {
    @RequestMapping(value = "/{name}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name) {
        return "Hi, "+name+"\nYour new password is "+(int) (Math.random()*1000000000);
    }
}
