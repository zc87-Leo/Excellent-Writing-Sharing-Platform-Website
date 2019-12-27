package com.zc.service;

import com.zc.po.User;

import java.util.List;

public interface UserService {

    User checkUser(String username, String password);

    List<User> findAllUser();

    User findByUsername(String username);
}
