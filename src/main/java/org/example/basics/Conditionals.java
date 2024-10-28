package org.example.basics;

public class Conditionals {
    public static void main(String[] args) {

        //imprimir en usuario esta activo si esta activo
        //imprimir el usuario no esta activo si no esta activo

        boolean isActive = false;

        if (isActive) {
            System.out.println("El usuario esta activo");
        } else {
            System.out.println("El usuario no esta activo");
        }

        // variable que sea la edad de un usuario
        // imprimir el usuario es mayor de edad si es mayor de 18 o más y el usuario es menor si tiene 17 o menos.

        int userAge = 16;
        if (userAge >= 18) {
            System.out.println("El usuario es mayor de edad");
        } else {
            System.out.println("El usuario es menor de edad");
        }
    }
}
