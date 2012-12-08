<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBookShelf</title>
</head>

<body>
<p>
  <b>Title:</b>
  <s:property value="book.title" />
</p>

<p>
  <b>Description:</b>
  <s:property value="book.description" />
</p>

<p>
  <b>Image url:</b>
  <s:property value="book.image_url" />
</p>

<p>
  <b>Price:</b>
  <s:property value="book.price" />
</p>

<p>
  <b>Author:</b>
  <s:property value="book.author" />
</p>

<p>
  <b>ISBN:</b>
  <s:property value="book.isbn" />
</p>

<p>
  <b>Publisher:</b>
  <s:property value="book.publisher" />
</p>


<s:a href="editBook!input.action?bookId=%{book.id}">Edit</s:a> |
<s:a action="listBook">Back</s:a>
</body>
</html>
