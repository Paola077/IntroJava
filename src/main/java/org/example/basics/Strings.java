package org.example.basics;

public class Strings {
    public static void main(String[] args) {

        // Strings
        String name = "Paola";

        String userName = new String("PaolaP");

        String fullName = name + " " + userName;

        System.out.println(fullName);

        // Imprimir por consola una comparación de dos Strings con .equals

        String name1 = "Pedro";
        if (name1.equals("Pedro")) {
            System.out.println("El nombre es: " + name1);
        }

    }
}
