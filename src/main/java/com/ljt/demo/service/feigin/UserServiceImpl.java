package com.ljt.demo.service.feigin;

import com.ljt.demo.param.User;
import com.ljt.demo.service.UserService;
import com.ljt.demo.service.feigin.proxy.UserServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserServiceProxy userServiceProxy;
    @Override
    public void saveUser(User user) {
        userServiceProxy.saveUser(user);
    }
}
