package com.ljt.demo.controller;

import com.ljt.demo.param.User;
import com.ljt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("saveUser")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
