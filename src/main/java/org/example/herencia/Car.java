package org.example.herencia;

public class Car extends Vehiculo{
    public Car(String marca) {
        super(marca);
        this.ruedas = 4;
    }

    @Override
    public void acelerar() {
       this.velocity += 30;
    }

    @Override
    public void frenar() {
        this.velocity -= 20;
    }
}
