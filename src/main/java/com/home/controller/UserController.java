package com.home.controller;

import com.home.dto.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@RequestMapping(value = "/demo1000")
public interface UserController {

    @GetMapping(value = "/users")
    List<User> users();

}
