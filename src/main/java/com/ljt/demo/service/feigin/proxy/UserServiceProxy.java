package com.ljt.demo.service.feigin.proxy;

import com.ljt.demo.param.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("User")
public interface UserServiceProxy {
    @PostMapping("/ljtuser/register")
    void saveUser(User user);
}
