package org.example.bookManager.presentation;

import org.example.bookManager.logic.BookRepository;
import org.example.bookManager.logic.Book;
import org.example.bookManager.logic.BookManager;
import org.example.bookManager.persistance.InMemoryRepository;
import org.example.bookManager.persistance.MySQLBookRepository;

import java.util.List;
import java.util.Scanner;

public class BookConsoleView {

    private final BookManager bookManager;
    private final BookRepository inMemoryRepository;
    private final BookRepository mySqlRepository;
    private Scanner scanner = new Scanner(System.in);

    public BookConsoleView() {
        this.mySqlRepository = new MySQLBookRepository();
        this.inMemoryRepository = new InMemoryRepository();
        this.bookManager = new BookManager(new MySQLBookRepository());
    }


    public void printMenu() {

        String[] menu = {
                "1. Añadir libro",
                "2. Ver todos los libros",
                "3. Eliminar libro",
                "4. Cambiar repositorio",
                "5. Salir",
        };

        byte option = 0;

        while (option != 5) {

            for (String item : menu) {
                System.out.println(item);
            }

            System.out.println("Selecciona una opción");

            String input = scanner.nextLine(); // TODO comprobar que sea un numero "3"

            try {
                option = Byte.parseByte(input); // 1
            } catch (Exception ex) {
                System.out.println("Esto no es un número");
                continue;
            }

            if (option < 1 || option > 6) {
                System.out.println("Número fuera de rango");
                continue;
            }
            System.out.println("Ha elegido: " + menu[option - 1]);
            this.optionSelector(option);

            System.out.println("___________________________");
        }
    }

    private void optionSelector(byte option) {
        if(option == 1) this.printAddBookMenu();
        if(option == 2) this.printBookList();
        if(option == 3) this.printRemoveBookMenu();
        if(option == 4) this.printChangeRepository();
    }

    private void printChangeRepository() {
        System.out.println("Seleccione un repositoyio:");
        System.out.println("1.Memoria");
        System.out.println("2.Base de datos MySQL");
        System.out.println("Seleccione una opción:");

        String optionRepository = scanner.nextLine();
        if (optionRepository.equals("1")) {
            bookManager.changeRepository(inMemoryRepository);
        }

        if (optionRepository.equals("2")) {
            bookManager.changeRepository(mySqlRepository);
        }
    }

    private void printRemoveBookMenu() {
        System.out.println("ISBN del libro a borrar: ");
        String isbnToDelete = scanner.nextLine();

        this.bookManager.deleteByIsbn(isbnToDelete);
        System.out.println("Se ha eliminado el libro " + isbnToDelete);
    }

    private void printAddBookMenu() {
        System.out.println("Añade el ISBN: ");
        String isbn = scanner.nextLine();

        System.out.println("Añade el titulo del libro");
        String title = scanner.nextLine();

        System.out.println("Añade el autor");
        String author = scanner.nextLine();

        try {
            this.bookManager.createBook(isbn, title, author);
            System.out.println("El libro se ha creado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void printBookList() {
        List<Book> bookList = bookManager.getAllBooks();

        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}