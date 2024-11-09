package com.home.controller.impl;

import com.home.controller.UserController;
import com.home.dto.User;
import com.home.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
