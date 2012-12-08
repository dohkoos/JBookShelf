<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBookShelf</title>
</head>

<body>
    <s:if test="#session.user != null">
        <s:a action="listBook">All Books</s:a>
        Welcome, you have logined.
        <s:a action="logout">Logout</s:a>
    </s:if>
    <s:else>
        <s:a action="login!input">Login</s:a> |
        <s:a action="register!input">Register</s:a>
    </s:else>
</body>
</html>
