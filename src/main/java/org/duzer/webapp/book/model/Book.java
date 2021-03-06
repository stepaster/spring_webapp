package org.duzer.webapp.book.model;

/**
 * Класс библиотечной книги.
 */
public class Book {
    private int idBook;
    private String bookAuthor;
    private String nameBook;
    private String ISBNBook;
    private String bookTaker;

    public Book() {
    }

    public Book(String bookAuthor, String nameBook, String ISBNBook, String bookTaker) {
        this.bookAuthor = bookAuthor;
        this.nameBook = nameBook;
        this.ISBNBook = ISBNBook;
        this.bookTaker = bookTaker;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getISBNBook() {
        return ISBNBook;
    }

    public void setISBNBook(String ISBNBook) {
        this.ISBNBook = ISBNBook;
    }

    public String getBookTaker() {
        return bookTaker;
    }

    public void setBookTaker(String bookTaker) {
        this.bookTaker = bookTaker;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
