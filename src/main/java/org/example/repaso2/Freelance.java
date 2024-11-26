package org.example.repaso2;

public class Freelance extends Empleado{

    public Freelance(String name, int salario) {
        super(name, salario);
    }

    @Override
    public void cobrar() {
        System.out.println("La factura es diferente");
    }
}





