package org.example.herencia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Car car1 = new Car("Seat");
        Moto moto1 = new Moto("Yamaha");
        Camion camion1 = new Camion("Encava");

        car1.acelerar();
        moto1.acelerar();
        car1.frenar();
        moto1.frenar();
        camion1.acelerar();
        camion1.frenar();


        System.out.println("Car: ");

        System.out.println(car1.getMarca());
        System.out.println(car1.getVelocity());
        System.out.println(car1.getRuedas());

        System.out.println("Moto");

        System.out.println(moto1.getMarca());
        System.out.println(moto1.getVelocity());
        System.out.println(moto1.getRuedas());

        System.out.println("Camión");

        System.out.println(camion1.getMarca());
        System.out.println(camion1.getVelocity());
        System.out.println(camion1.getRuedas());
    }
}
