package com.kosta.hboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {
    public HouseController(){
        System.out.println("HouseController");
    }
    @GetMapping("/house")
    public String hous(){
        return "index";
    }

}
