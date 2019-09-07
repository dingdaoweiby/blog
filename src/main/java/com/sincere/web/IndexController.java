package com.sincere.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("")
    public String index() {
        System.out.println("-----Index Controller index() method is invoked to return index page");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

}
