package com.codemany.book.action;

import java.util.List;

import com.codemany.account.model.User;
import com.codemany.book.model.Book;
import com.codemany.book.service.BookService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
    private static final long serialVersionUID = 2538923417705852774L;

    private Long bookId;
    private Book book;
    private List<Book> bookList;

    private BookService bookService;

    public String list() throws Exception {
        bookList = bookService.getBookList();
        return "list";
    }

    public String show() throws Exception {
        book = bookService.getBook(bookId);
        return "show";
    }

    public String input() throws Exception {
        if (bookId != null) {
            book = bookService.getBook(bookId);
        }
        return INPUT;
    }

    public String saveOrUpdate() throws Exception {
        User user = (User)ActionContext.getContext().getSession().get(User.SESSION_KEY);
        book.setUser(user);
        bookService.saveOrUpdateBook(book);
        return SUCCESS;
    }

    public String delete() throws Exception {
        bookService.deleteBook(bookId);
        return SUCCESS;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
