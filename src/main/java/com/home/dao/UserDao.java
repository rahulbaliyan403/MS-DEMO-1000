package com.home.dao;

import com.home.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    List<UserEntity> users();

    Optional<UserEntity> user(int id);

    void save(UserEntity userEntity);

    void update(UserEntity userEntity);

    void delete(int id);
}
