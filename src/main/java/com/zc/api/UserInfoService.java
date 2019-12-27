package com.zc.api;

import com.zc.po.User;
import com.zc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserInfoService {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAllUser", method = RequestMethod.POST)
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @RequestMapping(value = "/findByUserName", method = RequestMethod.POST)
    public User findByUserName(@RequestBody String username) {
        return userService.findByUsername(username);
    }
}
