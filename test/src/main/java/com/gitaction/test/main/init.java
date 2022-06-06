package com.gitaction.test.main;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class init {
    @GetMapping("/main")
    public String index() {        
        return "index";
    }
}