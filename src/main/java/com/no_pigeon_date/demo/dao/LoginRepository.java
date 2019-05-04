package com.no_pigeon_date.demo.dao;

import com.no_pigeon_date.demo.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<UsersEntity,Integer> {
}
