package org.example.bookManager.logic;

import java.util.List;
import java.util.Optional;

public class BookManager {

    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void createBook(String isbn, String title, String author) {
        Optional<Book> optionalBook = bookRepository.findByIsbn(isbn);

        if(optionalBook.isPresent()) {
            throw new IllegalArgumentException("Este book ya existe");
        }

        Book newBook = new Book(isbn, title, author);
        bookRepository.save(newBook);
    }

    public void deleteByIsbn(String isbnToDelete) {
        bookRepository.deleteByIsbn(isbnToDelete);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void changeRepository(BookRepository newRepository) {
        this.bookRepository = newRepository;
    }
}