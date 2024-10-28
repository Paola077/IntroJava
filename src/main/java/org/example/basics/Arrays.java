package org.example.basics;

public class Arrays {
    public static void main(String[] args) {

        //Crear un arreglo de 4 enteros
        // Definir un array de 5 ciudades
        // con 2 ForEach imprimir todas las lineas de los números y todas las ciudades

        int [] numbers = {1,2,3,4,5};
        for (int number : numbers) {
            System.out.println(number);
        }
        String [] cities = {"Alicante", "Barcelona", "Valencia", "Burgos", "Valladolid"};
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

