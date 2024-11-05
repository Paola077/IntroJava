package org.example.repaso;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", 200) ;
        Car car2 = new Car("BMW");

        car1.acelerar();
        car2.acelerar();
        car1.frenar();


        System.out.println("Empieza la carrera");
        System.out.println("Participantes " + car1.getMarca() + " va a: " + car1.getVelocity() + "km/s");
        System.out.println("Participantes " + car2.getMarca() + " va a: " + car2.getVelocity() + "km/s");
    }
}
