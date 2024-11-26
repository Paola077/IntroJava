package org.example.bookManager.logic;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    void save(Book book);

    List<Book> findAll();

    void deleteByIsbn(String isbn);

    Optional<Book> findByIsbn(String isbn);
}
