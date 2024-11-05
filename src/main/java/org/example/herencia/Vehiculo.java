package org.example.herencia;

public class Vehiculo {
    private String marca;
    protected int velocity;
    protected int ruedas;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocity = 0;
    }

    public void acelerar () {
        this.velocity += 10;
    }

    public void frenar () {
        this.velocity -= 5;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getRuedas() {
        return ruedas;
    }

}
