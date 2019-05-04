package com.no_pigeon_date.demo.dao;

import com.no_pigeon_date.demo.entity.UsersEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UsersEntity,String> {
    //获得一个User类
    @Select("select * from user where nickname=#{nickname} limit 1")
    UsersEntity getOneUser(String nickname);

    //插入一个User
    @Insert("insert into user (nickname,password) values(#{nickname},#{password})")
    boolean setOneUser(UsersEntity user);
}
