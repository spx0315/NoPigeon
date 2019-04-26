package com.no_pigeon_date.demo.dao;

import com.no_pigeon_date.demo.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UsersEntity,String> {
}
