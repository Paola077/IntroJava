package org.example.repaso2;

public class EmpleadoParcial extends Empleado{

    private int horas;

    public EmpleadoParcial(String name, int salario, int horas) {
        super(name, salario);
        this.horas = horas;
    }

    @Override
    public void cobrar() { //polimorfismo utilizando la herencia
        System.out.println("cobro" + this.salario + this.horas);
    }
}
