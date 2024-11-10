package com.home.controller.impl;

import com.home.controller.UserController;
import com.home.dto.User;
import com.home.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    UserLogic userLogic;

    @Override
    public List<User> users() {
        return userLogic.users();
    }

    @Override
    public User user(int id) {
        return userLogic.user(id);
    }
    @Override
    public String save(User user) {
        userLogic.save(user);
        return "201";
    }

    @Override
    public String update(int id, User user) {
        userLogic.update(id,user);
        return "200";
    }

    @Override
    public String delete(int id) {
        userLogic.delete(id);
        return "200";
    }
}
