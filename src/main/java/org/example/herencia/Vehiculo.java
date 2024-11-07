package org.example.herencia;

public abstract class Vehiculo {
    private String marca;
    protected int velocity;
    protected int ruedas;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocity = 0;
    }

    public abstract void acelerar();

    public abstract void frenar();

}
