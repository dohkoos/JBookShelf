<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBookShelf</title>
</head>

<body>
    <s:if test="#session.logined">
        Welcome, you have logined. <a href="<%= request.getContextPath() %>/logout.action">Logout</a>
    </s:if>
    <s:else>
        <a href="<%= request.getContextPath() %>/login!input.action">Login</a> |
        <a href="<%= request.getContextPath() %>/register!input.action">Register</a>
    </s:else>
</body>
</html>
