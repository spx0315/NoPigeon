package com.no_pigeon_date.demo.controller;

import com.no_pigeon_date.demo.dao.UserDao;
import com.no_pigeon_date.demo.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/user/*")
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "longin";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    //注册
    @RequestMapping("/addregister")
    public String register(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setNickname(username);
        usersEntity.setPassword(password);
        usersEntity.setSex(sex);
        userDao.save(usersEntity);
        return "index";
    }

    @PostMapping("/save")
    public String save(String username,String password,String sex){
        UsersEntity user = new UsersEntity();
        user.setUid((int)(Math.random()*100));
        user.setNickname(username);
        user.setPassword(password);
        user.setSex(sex);
        user.setLevel(1);
        user.setExp(0);
        userDao.save(user);
        return "login";
    }



}
