package com.codemany.book.service;

import java.util.List;

import com.codemany.book.dao.BookDao;
import com.codemany.book.model.Book;

public class BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> getBookList() {
        return bookDao.getBookList();
    }

    public Book getBook(Long bookId) {
        return bookDao.getBook(bookId);
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(Long bookId) {
        bookDao.deleteBook(bookId);
    }
}
