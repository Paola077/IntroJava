package org.example.basics;

public class Conditionals {
    public static void main(String[] args) {


        boolean isActive = false;

        if (isActive) {
            System.out.println("El usuario esta activo");
        } else {
            System.out.println("El usuario no esta activo");
        }


        int userAge = 16;
        if (userAge >= 18) {
            System.out.println("El usuario es mayor de edad");
        } else {
            System.out.println("El usuario es menor de edad");
        }
    }
}
