package com.home.logic.impl;

import com.google.gson.Gson;
import com.home.dao.UserDao;
import com.home.dto.User;
import com.home.entity.UserEntity;
import com.home.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserLogicImpl implements UserLogic {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> users() {
        List<User> users = new ArrayList<>();
        List<UserEntity>  usersEntity =userDao.users();
        Gson gson = new Gson();
        System.out.println(gson.toJson(usersEntity));
       for (UserEntity userEntity : usersEntity)
       {
           User user = new User();
           user.setId(userEntity.getUserId());
           user.setName(userEntity.getUserName());
           user.setPassword(userEntity.getUserPassword());
           user.setEmail(userEntity.getUserEmail());
           user.setSalary(userEntity.getUserSalary());
           users.add(user);
       }
        return users;
    }
}
