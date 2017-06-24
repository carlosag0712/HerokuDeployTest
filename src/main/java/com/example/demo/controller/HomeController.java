package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by carlosarosemena on 2017-06-24.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World in Heroku";
    }
}
