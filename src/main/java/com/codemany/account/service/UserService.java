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

    public void addUser(User user) throws UserAlreadyExistsException {
        User u = getUser(user.getUsername());
        if (u != null) {
            //register.user.already.exists
            throw new UserAlreadyExistsException();
        }
        userDao.addUser(user);
    }
}
