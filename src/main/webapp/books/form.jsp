<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBookShelf</title>
</head>

<body>
<s:if test="book.id != null">
    <h1>Editing book</h1>
</s:if>
<s:else>
    <h1>Add book</h1>
</s:else>

<s:form action="saveOrUpdateBook" method="post">
    <div class="field">
        <s:hidden name="book.id" value="%{book.id}" />
    </div>
    <div class="field">
        <s:textfield name="book.title" label="Title" />
    </div>
    <div class="field">
        <s:textarea name="book.description" label="Description" rows="5" cols="25" />
    </div>
    <div class="field">
        <s:textfield name="book.image_url" label="Image URL" />
    </div>
    <div class="field">
        <s:textfield name="book.price" label="Price" />
    </div>
    <div class="field">
        <s:textfield name="book.author" label="Author" />
    </div>
    <div class="field">
        <s:textfield name="book.isbn" label="ISBN" />
    </div>
    <div class="field">
        <s:textfield name="book.publisher" label="Publisher" />
    </div>
    <div class="actions">
        <s:if test="book.id != null">
        <s:submit value="Update" />
        </s:if>
        <s:else>
        <s:submit value="Save" />
        </s:else>
  </div>
</s:form>

<s:if test="book.id != null">
<s:a href="showBook.action?bookId=%{book.id}">Show</s:a> |
</s:if>
<s:a action="listBook">Back</s:a>
</body>
</html>
