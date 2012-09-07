package com.codemany.account.action;

import com.codemany.account.dao.UserDao;
import com.codemany.account.model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = -389833745243649130L;

    private String username;
    private String password;

    public String execute() throws Exception {
        if (username == null || username.length() == 0
                || password == null || password.length() == 0) {
            return INPUT;
        }

        User u = UserDao.getUser(username);
        if (u == null) {
            return INPUT;
        }
        if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
            ActionContext.getContext().getSession().put("logined", true);
            return SUCCESS;
        }

        return INPUT;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
