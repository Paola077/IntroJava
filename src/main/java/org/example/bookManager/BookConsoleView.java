package org.example.bookManager;

import java.util.Scanner;

public class BookConsoleView {

    private final BookManager bookManager = new BookManager();
    private Scanner scanner = new Scanner(System.in);

    public BookConsoleView() {

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
        var bookList = bookManager.getAllBooks();
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}