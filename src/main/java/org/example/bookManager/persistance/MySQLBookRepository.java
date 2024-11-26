package org.example.bookManager.persistance;

import org.example.bookManager.logic.BookRepository;
import org.example.bookManager.config.MySQLConnection;
import org.example.bookManager.logic.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MySQLBookRepository implements BookRepository {

    @Override
    public void save(Book book) {
       /* String sql = "INSERT INTO books (isbn, title, author) VALUES ('%s', '%s','%s')"
            .formatted(book.getIsbn(),book.getTitle(),book.getAuthor());*/

        String sql = "INSERT INTO books (isbn, title, author) VALUES (?, ?, ?)";

        try (Connection connection = MySQLConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, book.getIsbn());
            statement.setString(2, book.getTitle());
            statement.setString(3, book.getAuthor());
            statement.execute();


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Book> findAll() {
        String sql = "SELECT * FROM books";
        List<Book> bookList = new ArrayList<>();

        try (Connection connection = MySQLConnection.getConnection();
             Statement statement = connection.createStatement())

        {
             ResultSet res = statement.executeQuery(sql);

            while (res.next()) {
              String isbn = res.getString("isbn");
              String title = res.getString("title");
              String author = res.getString("author");

              Book book = new Book(isbn, title, author);
              bookList.add(book);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } return bookList;
    }


    @Override
    public void deleteByIsbn(String isbn) {
        String sql = "DELETE FROM `books` WHERE isbn='%s'";

        try (  Connection connection = MySQLConnection.getConnection();
               PreparedStatement statement = connection.prepareStatement(sql);)
        {
            statement.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());;
        }
    }


    @Override
    public Optional<Book> findByIsbn(String isbn) {
        String sql = "SELECT * FROM books WHERE isbn = ?";

        try( Connection connection = MySQLConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql))
        {
           statement.setString(1,sql);

            ResultSet res = statement.executeQuery();

            if(res.next()) {
                Book book = new Book(res.getString("isbn"),
                        res.getString("title"),
                        res.getString("author"));

                return Optional.of(book);
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());;
        }
        return Optional.empty();
    }
}