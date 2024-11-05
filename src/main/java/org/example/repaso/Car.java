package org.example.repaso;

public class Car {

    private String marca;
    private int velocity;

    public Car(String marca) {
        this.marca = marca;
        this.velocity = 0;
    }

    public Car(String marca, int velocity) {
        this.marca = marca;
        this.velocity = velocity;
    }


    public void acelerar() {
        this.velocity += 10;
    }

    public void frenar() {
        this.velocity -= 10;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.isEmpty() || marca.isBlank()) return;
        this.marca = marca;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity (int velocity) {
        this.velocity = velocity;
    }


}
