package com.boot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping(value = "/")
    public String root(){
        return name;
    }



    @RequestMapping(value = "/exception")
    public ResponseEntity<Object> exception(){
        logger.info("You are calling exception interface.");
        throw new ProductNotfoundException();
    }

    @RequestMapping(value = "/myInterceptor")
    public String myInterceptor(){
        logger.info("You are calling myInterceptor interface.");
        return "myInterceptor";
    }

    @RequestMapping(value = "/hello")
    public String hello(HttpServletRequest request){
        logger.info("hello," + request.getRequestURL());
        return "sprint-boot2-autotest";
    }

    @RequestMapping(value = "/post/hello", method = RequestMethod.POST)
    public String postHello(@RequestParam String id, @RequestParam String name, @RequestParam String price){
        logger.info("id," + id);
        logger.info("name," + name);
        logger.info("price," + price);
        return "Post Success";
    }
}
