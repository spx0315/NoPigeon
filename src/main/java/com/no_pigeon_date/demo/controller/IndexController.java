package com.no_pigeon_date.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value="/login.go")
    public String userLogin(){
        //System.out.println("userLogin.do");
        return "login";
    }
}
