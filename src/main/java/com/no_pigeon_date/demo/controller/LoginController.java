package com.no_pigeon_date.demo.controller;

import com.no_pigeon_date.demo.dao.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginRepository loginRepository;
}
