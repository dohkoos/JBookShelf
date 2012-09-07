package com.codemany.account.service;

import com.codemany.account.dao.UserDao;
import com.codemany.account.model.User;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser(String username) {
        return userDao.getUser(username);
    }
}
