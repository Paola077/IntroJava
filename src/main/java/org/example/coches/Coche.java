package org.example.coches;

import java.util.List;

public class Coche {
        private String marca;
        private String modelo;
        private int año;
        private double kilometraje;

        public Coche(String marca, String modelo, int año, double kilometraje) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
            this.kilometraje = kilometraje;
        }

        public void conducir (double km) {
            if (km > 0) {
                this.kilometraje = this.kilometraje + km;
            }
        }

        public void printInformacion() {
            System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + año + "\nKilometraje: \n" + kilometraje);
        }
}

