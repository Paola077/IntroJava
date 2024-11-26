package org.example.bookManager;

import org.example.bookManager.presentation.BookConsoleView;

public class Main {
    public static void main(String[] args) {
        BookConsoleView app = new BookConsoleView();
        app.printMenu();

       // MySQLBookRepository bookRepository = new MySQLBookRepository();

       // Book newBook2 = new Book("A130", "Title 5", "Author 5");
        //
        // bookRepository.save(newBook2);

      //  bookRepository.deleteByIsbn("A123");

      // List<Book> list = bookRepository.findAll();

      //  for(Book book : list) {
      //      System.out.println(book);
      //  }

    /*   Optional<Book> optionalBook = bookRepository.findByIsbn("A127");
       if(optionalBook.isPresent()) {/      Book book = optionalBook.get();
           System.out.println(book);
       }

       if (optionalBook.isEmpty()) {
           System.out.println("El libro no existe");
       }

        System.out.println();*/

    }

}
