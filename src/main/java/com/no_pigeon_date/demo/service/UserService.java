package com.no_pigeon_date.demo.service;


import com.no_pigeon_date.demo.dao.UserDao;
import com.no_pigeon_date.demo.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;


    public UsersEntity FindNameAndPassword(String username,String password){
        return userDao.findByUsernameAndPassword(username,password);
    }

    public void save(UsersEntity usersEntity){
        userDao.save(usersEntity);
    }

    public List<UsersEntity> findByName(String username){
        return userDao.findByUsername(username);
    }

//    public String login(UsersEntity usersEntity){
//        UsersEntity user = userDao.getOneUser(usersEntity.getNickname());
//        if(user==null){
//            return "Can't find a user.";
//        }
//        else if(!user.getPassword().equals(usersEntity.getPassword())){
//            return "Wrong password.";
//        }
//        else {
//            usersEntity.setUid(user.getUid());
//            return "welcome to no-pigeon portable";
//        }
//
//    }
//
//    public String register(UsersEntity usersEntity){
//        if(userDao.getOneUser(usersEntity.getNickname())==null){
//            userDao.setOneUser(usersEntity);
//            return "sccuessfully registered";
//        }
//        else {
//            return "please rename your account";
//        }
//    }
}
