package org.example.coches;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche("Seat", "Ibiza", 2000, 2.300);
        coche.printInformacion();
        coche.conducir(1000);
        System.out.println("Despues de conducir un tiempo: ");
        coche.printInformacion();
    }
}
