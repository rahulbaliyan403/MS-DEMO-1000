package com.home.logic;

import com.home.dto.User;

import java.util.List;


public interface UserLogic {

    List<User> users();

    User user(int id);

    void save(User user);

    void update(int id, User user);

    void delete(int id);
}
