package com.no_pigeon_date.demo.service;


import com.no_pigeon_date.demo.dao.UserDao;
import com.no_pigeon_date.demo.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private UserDao userDao;


    public boolean Find(String name, String password) {
        boolean b = true;

        List<UsersEntity> All = userDao.findAll();//调用dao层方法，读取数据库数据
        System.out.println("================" + All);
        for (int i = 0; i <= All.size(); i++) {//将数据库中的数据全部拿出，一个一个比较，好在数据不多


            UsersEntity one = All.get(i);
            if (name.equals(one.getNickname()) && password.equals(one.getPassword())) {//两种渠道的得到的数据进行比较

                b = true;
                break;
            } else {

                b = false;
                break;
            }


        }

        return b;
    }
}