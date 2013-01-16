package com.codemany.account.interceptor;

import java.util.Collections;
import java.util.Set;

import com.codemany.account.model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.util.TextParseUtil;

public class AuthorizationInterceptor extends AbstractInterceptor {
    private static final long serialVersionUID = -5140884040684756043L;

    protected Set<String> skipActions = Collections.emptySet();

    public void setSkipActions(String skipActions) {
        this.skipActions = TextParseUtil.commaDelimitedStringToSet(skipActions);
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        User user = (User)invocation.getInvocationContext()
                .getSession().get(User.SESSION_KEY);

        boolean isLogined = user != null;
        String action = invocation.getProxy().getActionName();
        if (isLogined || skipActions.contains(action)) {
            return invocation.invoke();
        } else {
            return Action.LOGIN;
        }
    }
}
