package com.codemany.book.action;

import com.codemany.book.service.BookService;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteBookAction extends ActionSupport {
    private static final long serialVersionUID = 2538923417705852774L;

    private Long bookId;

    private BookService bookService;

    public String execute() throws Exception {
        bookService.deleteBook(bookId);
        return SUCCESS;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
