package com.codemany.account.action;

import com.codemany.account.model.User;
import com.codemany.account.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private static final long serialVersionUID = -389833745243649130L;

    private String username;
    private String password;

    private UserService userService;

    public String execute() throws Exception {
        User u = userService.authenticate(username, password);
        if (u == null) {
            return INPUT;
        }

        ActionContext.getContext().getSession().put(User.SESSION_KEY, u);
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
