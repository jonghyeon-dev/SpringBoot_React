package com.src.reacttest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/")
    public String test(){
        return "Fisrt Controller";
    }

    @GetMapping("/showMe")
    public List<String> showMe(){
        return Arrays.asList("첫번째 인사","두번쨰 인사");
    }
}
