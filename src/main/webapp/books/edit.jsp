<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBookShelf</title>
</head>

<body>
<h1>Editing book</h1>

<s:form action="editBook">
  <s:include value="_form.jsp" />
  <div class="actions">
    <s:submit value="Update" />
  </div>
</s:form>

<s:a href="showBook.action?bookId=%{book.id}">Show</s:a> |
<s:a action="listBook">Back</s:a>
</body>
</html>
