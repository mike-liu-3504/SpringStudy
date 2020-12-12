package com.lhl.dao;

import com.lhl.model.User;

/**
 * @description:
 * @author: lhl
 * @create: 2020/12/12
 **/
public interface IUserDao {
    User selectUser(long id);
}
