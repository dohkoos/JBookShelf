<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<body>
    <p>User: test/test</p>
    <s:form action="login">
        <s:textfield key="username" label="Username" />
        <s:password key="password" label="Password" />
        <s:submit value="Login" />
    </s:form>
</body>
</html>
