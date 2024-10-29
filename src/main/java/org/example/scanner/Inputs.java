package org.example.scanner;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUserName = "admin";
        String correctPassword = "1234";
        int maxInputs = 3;

        while (maxInputs > 0) {
            System.out.println("Introduce un nombre de usuario: ");
            String userName = scanner.nextLine();
            System.out.println("Introduce una contraseña: ");
            String password = scanner.nextLine();
            if (userName.equals(correctUserName) && password.equals(correctPassword)) {
                System.out.println("Usuario autenticado con éxito!");
                break;
            }
            System.out.println("Contraseña incorrecta, inténtelo de nuevo.");
            maxInputs--;
        }
        if (maxInputs == 0) {
            System.out.println("Demasiados intentos");
        }
        scanner.close();
    }
}
