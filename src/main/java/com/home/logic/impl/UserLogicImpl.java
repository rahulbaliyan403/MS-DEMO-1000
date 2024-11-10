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
import java.util.Optional;

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

    @Override
    public User user(int id) {
        Optional<UserEntity> userEntity= userDao.user(id);
        User user = new User();
        user.setId(userEntity.get().getUserId());
        user.setName(userEntity.get().getUserName());
        user.setPassword(userEntity.get().getUserPassword());
        user.setEmail(userEntity.get().getUserEmail());
        user.setSalary(userEntity.get().getUserSalary());
        return user;
    }

    @Override
    public void save(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getName());
        userEntity.setUserPassword(user.getPassword());
        userEntity.setUserEmail(user.getEmail());
        userEntity.setUserSalary(user.getSalary());
        userDao.save(userEntity);

    }

    @Override
    public void update(int id, User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(id);
        userEntity.setUserName(user.getName());
        userEntity.setUserPassword(user.getPassword());
        userEntity.setUserEmail(user.getEmail());
        userEntity.setUserSalary(user.getSalary());
        userDao.update(userEntity);

    }

    @Override
    public void delete(int id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(id);
        userDao.delete(userEntity.getUserId());
    }

}
