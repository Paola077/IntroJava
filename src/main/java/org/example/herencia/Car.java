package org.example.herencia;

public class Car extends Vehiculo{
    public Car(String marca) {
        super(marca);
        this.ruedas = 4;
    }

    @Override
    public void acelerar() {
    this.velocity += 20;
    }

    @Override
    public void frenar() {
    this.velocity -= 20;
    }

    @Override
    public String toString() {
        return "El coche va a: " + this.velocity + " Km/h";
    }
}
