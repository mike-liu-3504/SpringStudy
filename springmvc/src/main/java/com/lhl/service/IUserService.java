package com.lhl.service;

import com.lhl.model.User;

/**
 * @description:
 * @author: lhl
 * @create: 2020/12/12
 **/
public interface  IUserService {
    public User selectUser(long userId);
}
