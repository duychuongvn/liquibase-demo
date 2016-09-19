package com.github.duychuongvn.liquibasedemo;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.duychuongvn.liquibasedemo.dao.entity.User;
import com.github.duychuongvn.liquibasedemo.model.UserModel;
import com.github.duychuongvn.liquibasedemo.user.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring-data.xml");
        
        Random random = new Random();
        UserService userService = applicationContext.getBean(UserService.class);
        UserModel userModel = new UserModel();
        userModel.setFirstName("First Name " + random.nextInt(9));
        userModel.setLastName("Last Name" + random.nextInt(9));
        userModel.setUsername("user name" + random.nextInt(9));
        User user = userService.create(userModel);
        System.out.println(user);
        System.out.println(userService.findAll());
    }
}
