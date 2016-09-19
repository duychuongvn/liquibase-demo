package com.github.duychuongvn.liquibasedemo.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.duychuongvn.liquibasedemo.dao.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
