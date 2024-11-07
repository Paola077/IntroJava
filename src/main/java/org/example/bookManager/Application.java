package org.example.bookManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private ArrayList <Book> bookList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Application() {
        this.bookList.add(new Book("A123", "Title", "Author"));
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

        //Crear funcion solo de logica
        this.deleteByIsbn(isbnToDelete);
        System.out.println("Se ha eliminado el libro " + isbnToDelete);
    }

    private void deleteByIsbn(String isbnToDelete) {
        //For
        bookList.removeIf(book -> book.getIsbn().equals(isbnToDelete));
    }

    private void printAddBookMenu() {
        System.out.println("Añade el ISBN: ");
        String isbn = scanner.nextLine();

        System.out.println("Añade el titulo del libro");
        String title = scanner.nextLine();

        System.out.println("Añade el autor");
        String author = scanner.nextLine();

        //Tendria que crear un book y añadirlo a la bokList

        try {
            this.createBook(isbn, title, author);
            System.out.println("El libro se ha creado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void createBook(String isbn, String title, String author) {
        //buscar si existe en la lista un book con el isbn igual -> Si existe salir y dar un mensaje

       /* for (Book book : bookList) {
            if (isbn.equals(book.getIsbn())) {
                throw new IllegalArgumentException("Este book ya existe");
            }
        }*/


        //Ejemplo de la programacion funcional

        if (bookList.stream().anyMatch(book -> book.getIsbn().equals(isbn))) {
            throw new IllegalArgumentException("Este book ya existe");
        }

        Book newBook = new Book(isbn, title, author);
        bookList.add(newBook);

        //Comprobar que no esta en la lista, hay que crearlo en logica
    }


    private void printBookList() {
        if (bookList.isEmpty()) System.out.println("No hay libros");
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}