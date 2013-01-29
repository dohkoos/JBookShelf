package com.codemany.book.action;

import java.util.ArrayList;
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
        if (bookList == null) {
            bookList = new ArrayList<Book>();
        }
        bookList.addAll(getCurrentUser().getBooks());
        return "list";
    }

    public String show() throws Exception {
        book = getCurrentUser().getBook(bookId);
        return "show";
    }

    public String input() throws Exception {
        if (bookId != null) {
            book = getCurrentUser().getBook(bookId);
        }
        return INPUT;
    }

    public String saveOrUpdate() throws Exception {
        book.setUser(getCurrentUser());
        bookService.saveOrUpdateBook(book);
        return SUCCESS;
    }

    public String delete() throws Exception {
        Book book = getCurrentUser().getBook(bookId);
        if (book != null) {
            bookService.deleteBook(bookId);
            getCurrentUser().getBooks().remove(book);
        }
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

    private User getCurrentUser() {
        return (User)ActionContext.getContext().getSession().get(User.SESSION_KEY);
    }
}
