package org.example.coches;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche("Seat", "Ibiza", 2000, 30000.5);
        coche.printInformacion();
        coche.conducir(2000);
        System.out.println("\nDespues de conducir un tiempo: \n");
        coche.printInformacion();
    }
}
