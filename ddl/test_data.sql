USE jbookshelf;

-- Insert test data for users table
INSERT INTO users (id, username, password) VALUES(1, "test", "test");
INSERT INTO users (id, username, password) VALUES(2, "guest", "guest");
INSERT INTO users (id, username, password) VALUES(3, "fuzz", "fuzz");

-- Insert test data for books table
INSERT INTO books (id, title, description, image_url, price, author, isbn, publisher, user_id)
    VALUES(1, 'Galloway Book of Running', 'The best book on running', '', '49.50', 'Jeff Galloway', 'ABC001', 'Manning', 1);
INSERT INTO books
    VALUES(2, 'The Complete Book of Running', 'Oldest book of running', '', '19.50', 'James Fixx', 'ABC002', 'Manning', 1);
INSERT INTO books
    VALUES(3, 'The Runners Handbook', 'Bestselling Guide for Beginning and Intermediate Runners', '', '37.00', 'Bob Glover', 'ABC003', 'Manning', 1);
INSERT INTO books 
    VALUES(4, 'Daniel Running Formula', 'Proven programs 800m to Marathon', '', '53.00', 'Jack Tupper Daniels', 'ABC004', 'Manning', 1);
INSERT INTO books 
    VALUES(5, 'Chi Running', 'Revolutionary approach to effortless, injury-free running', '', '59.00', 'Danny Drever', 'ABC005', 'Oreilly', 2);
INSERT INTO books 
    VALUES(6, 'Running for Mortals', 'A common sense plan for changing your life through running', '', '95.00', 'John Bingham', 'ABC006', 'Oreilly', 2);
INSERT INTO books 
    VALUES(7, 'Marathoning for Mortals', 'Regular person guide to marathon', '', '38.00', 'John Bingham', 'ABC007', 'BroadView', 3);
INSERT INTO books 
    VALUES(8, 'Marathon', 'The Ultimate Training Guide', '', '39.00', 'Hal Higdon', 'ABC008', 'BroadView', 3);
