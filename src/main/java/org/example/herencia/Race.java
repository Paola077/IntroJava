package org.example.herencia;

import java.util.List;

public class Race {

    List<Vehiculo> peloton = List.of(new Car("seat"), new Moto("Moto"), new Camion("Camion"));


    public void start(List<Vehiculo> peloton) {
        for (Vehiculo vehiculo : peloton) {
            vehiculo.acelerar();
            System.out.println(vehiculo);
        }
    }
}

