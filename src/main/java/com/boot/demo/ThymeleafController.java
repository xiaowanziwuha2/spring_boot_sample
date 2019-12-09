package com.boot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
