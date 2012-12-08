<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>

<body>
    <s:form action="register">
        <s:textfield name="user.username" label="Username" />
        <s:password name="user.password" label="Password" />
        <s:password name="user.confirmPassword" label="Password Confirmation" />
        <s:submit value="Register" />
    </s:form>
</body>
</html>
