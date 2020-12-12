package com.lhl.service.impl;

import com.lhl.dao.IUserDao;
import com.lhl.model.User;
import com.lhl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: lhl
 * @create: 2020/12/12
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
