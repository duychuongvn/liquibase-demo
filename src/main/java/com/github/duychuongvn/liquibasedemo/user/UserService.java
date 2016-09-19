package com.github.duychuongvn.liquibasedemo.user;

import java.util.List;

import com.github.duychuongvn.liquibasedemo.dao.entity.User;
import com.github.duychuongvn.liquibasedemo.model.UserModel;

public interface UserService {

	User create(UserModel userModel);
	List<User> findAll();
}
