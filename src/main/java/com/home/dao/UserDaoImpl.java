package com.home.dao;

import com.home.entity.UserEntity;
import com.home.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements  UserDao{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> users() {
        return userRepository.findAll();
    }
}
