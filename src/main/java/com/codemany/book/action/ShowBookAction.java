package com.codemany.book.action;

import com.codemany.book.model.Book;
import com.codemany.book.service.BookService;

import com.opensymphony.xwork2.ActionSupport;

public class ShowBookAction extends ActionSupport {
    private static final long serialVersionUID = 2538923417705852774L;

    private Book book;
    private Long bookId;

    private BookService bookService;

    public String execute() throws Exception {
        book = bookService.getBook(bookId);
        return SUCCESS;
    }

    public Book getBook() {
        return book;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
