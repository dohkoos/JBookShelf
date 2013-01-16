CREATE DATABASE IF NOT EXISTS jbookshelf;

USE jbookshelf;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS books;

CREATE TABLE users (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(20) NOT NULL,
    password varchar(50) NOT NULL,
    PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE books (
    id int NOT NULL AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    description text,
    image_url varchar(255),
    price decimal(8, 2) NOT NULL,
    author varchar(255) NOT NULL,
    isbn varchar(255) NOT NULL,
    publisher varchar(255) NOT NULL,
    user_id int NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
