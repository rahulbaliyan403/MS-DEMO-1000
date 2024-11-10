package com.home.controller;

import com.home.dto.User;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping(value = "/demo1000")
public interface UserController {

    @GetMapping(value = "/users")
    List<User> users();

    @GetMapping(value = "/user/{id}")
    public User user(@PathVariable int id);

    @PostMapping(value = "/save")
    public String save(@RequestBody User user);

    @PutMapping(value = "/update/{id}")
    public String update(@PathVariable int id, @RequestBody User user);

    @DeleteMapping(value = "/user/{id}")
    public String delete(@PathVariable int id);

}
