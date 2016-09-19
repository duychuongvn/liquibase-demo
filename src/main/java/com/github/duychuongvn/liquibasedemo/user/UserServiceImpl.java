package com.github.duychuongvn.liquibasedemo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.duychuongvn.liquibasedemo.dao.entity.User;
import com.github.duychuongvn.liquibasedemo.dao.repository.UserRepository;
import com.github.duychuongvn.liquibasedemo.model.UserModel;

@Service()
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public User create(UserModel userModel) {
		User user = new User();
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setUsername(userModel.getUsername());
		return userRepository.save(user);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	

}
