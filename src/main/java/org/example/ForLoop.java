package org.example;

public class ForLoop {
    public static void main(String[] args) {
        // imprimir por consola los números de 5 a 10 usando un for

        for (int numbers = 5; numbers <= 10; numbers++) {
            System.out.println("numbers = " + numbers );
       }

        // imprimir solamente los numeros pares del 5 al 10

        for (int numbers = 5; numbers <= 10; numbers++){
           if (numbers % 2 == 0) {
               System.out.println(numbers);
           }
       }

        // imprimir los numeros del 5 al 10 con un bucle while y los numeros impares con el bucle while

        int count = 0;
        while (count < 10) {
            System.out.println("contador = " + count);
            count++;
        }

        int countNoPair = 0;
        while (countNoPair <= 10) {
            if (countNoPair % 2 != 0) {
                System.out.println(countNoPair);
            }
            countNoPair++;
        }
    }
}
