<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBookShelf</title>
</head>

<body>
<h1>Add book</h1>

<s:form action="addBook" method="post">
  <s:include value="_form.jsp" />
  <div class="actions">
    <s:submit value="Save" />
  </div>
</s:form>

<s:a action="listBook">Back</s:a>
</body>
</html>
