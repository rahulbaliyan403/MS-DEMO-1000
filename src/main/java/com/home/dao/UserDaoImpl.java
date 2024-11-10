package com.home.dao;

import com.home.entity.UserEntity;
import com.home.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements  UserDao{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> users() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> user(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    public void update(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
