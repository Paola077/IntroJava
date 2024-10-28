package org.example.coches;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche("Seat", "Ibiza", 2000, 2.5);
        coche.printInformacion();
        coche.conducir(2.5);
        System.out.println("Despues de conducir un tiempo: ");
        coche.printInformacion();
    }
}
