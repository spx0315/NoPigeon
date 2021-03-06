package com.no_pigeon_date.demo.dao;

import com.no_pigeon_date.demo.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<UsersEntity,String> {

    public UsersEntity findByUsernameAndPassword(String username ,String password);

    public List<UsersEntity> findByUsername(String username);

}
