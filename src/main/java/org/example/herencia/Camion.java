package org.example.herencia;

public class Camion extends Vehiculo{

    public Camion(String marca) {
        super(marca);
        this.ruedas = 8;
    }

    @Override
    public void acelerar() {
        this.velocity += 50;
    }

    @Override
    public void frenar() {
        this.velocity -= 30;
    }
}
