<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBookShelf</title>
</head>

<body>
<h1>Listing books</h1>

<table>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Image url</th>
        <th>Price</th>
        <th>Author</th>
        <th>ISBN</th>
        <th>Publisher</th>
        <th>Action</th>
    </tr>

<s:iterator value="bookList">
    <tr>
        <td><s:property value="title" /></td>
        <td><s:property value="description" /></td>
        <td><s:property value="image_url" /></td>
        <td><s:property value="price" /></td>
        <td><s:property value="author" /></td>
        <td><s:property value="isbn" /></td>
        <td><s:property value="publisher" /></td>
        <td>
            <s:a href="showBook.action?bookId=%{id}">Show</s:a>
            <s:a href="inputBook.action?bookId=%{id}">Edit</s:a>
            <s:a href="deleteBook.action?bookId=%{id}" preInvokeJS="confirm('Are you sure?');" method="delete">Destroy</s:a>
        </td>
    </tr>
</s:iterator>
</table>

<br />

<s:a action="inputBook">Add</s:a>
</body>
</html>
