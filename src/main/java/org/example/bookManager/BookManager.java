package org.example.bookManager;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public void createBook(String isbn, String title, String author) {
        for (Book book : bookList) {
            if (isbn.equals(book.getIsbn())) {
                throw new IllegalArgumentException("Este book ya existe");
            }
        }
        Book newBook = new Book(isbn, title, author);
        bookList.add(newBook);
    }

    public void deleteByIsbn(String isbnToDelete) {
        bookList.removeIf(book -> book.getIsbn().equals(isbnToDelete));
    }

    public ArrayList<Book> getAllBooks() {
        return this.bookList;
    }
}