package org.example.bookManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private ArrayList <Book> bookList = new ArrayList<>();

    public Application() {
        //this.bookList.add(new Book("A123", "Title", "Author"));
    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
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
        if(option == 2) this.printBookList();
    }

    private void printBookList() {
        if (bookList.isEmpty()) System.out.println("No hay libros");
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}