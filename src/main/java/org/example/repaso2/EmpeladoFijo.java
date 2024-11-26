package org.example.repaso2;

public class EmpeladoFijo extends Empleado{

    public EmpeladoFijo(String name, int salario) {
        super(name, salario);
    }

    @Override
    public void cobrar() {
        System.out.println("this.salario");
    }
}
