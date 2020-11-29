CREATE SCHEMA book_db;

CREATE TABLE books(
 id BIGINT IDENTITY(1,1) NOT NULL,
 isbn VARCHAR(100),
 bookName VARCHAR(100) NOT NULL,
 description VARCHAR(255),
 price DOUBLE NOT NULL,
 offerPrice DOUBLE,
 enabledForSale BOOLEAN NOT NULL,
 imageUrl VARCHAR(255)
);

CREATE TABLE author(
 authorId BIGINT IDENTITY(1,1),
 authorName VARCHAR(100)
);

CREATE TABLE category(
 categoryId BIGINT IDENTITY(1,1),
 categoryName VARCHAR(100)
);