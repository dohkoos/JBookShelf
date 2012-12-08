<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="/struts-tags" prefix="s" %>

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
