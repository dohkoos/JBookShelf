package com.codemany.account.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.codemany.book.model.Book;

public class User implements Serializable {
    private static final long serialVersionUID = -101885742532588984L;

    public static final String SESSION_KEY = "user_session_key";

    private Long id;
    private String username;
    private String password;
    private String confirmPassword;
    private Set<Book> books = new HashSet<Book>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
