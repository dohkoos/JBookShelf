package com.codemany.account.action;

import com.codemany.account.dao.UserDao;
import com.codemany.account.model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = -389833745243649130L;

    private String username;
    private String password;

    private UserDao userDao;

    public String execute() throws Exception {
        if (username == null || username.length() == 0
                || password == null || password.length() == 0) {
            return INPUT;
        }

        User u = userDao.getUser(username);
        if (u == null || !password.equals(u.getPassword())) {
            return INPUT;
        }

        ActionContext.getContext().getSession().put("logined", true);
        return SUCCESS;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
