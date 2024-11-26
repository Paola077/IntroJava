package org.example.repaso2;

public abstract class Empleado {
    private String name; // Encapsular este metodo para cambiarlo
    protected int salario;


    public Empleado(String name, int salario) {
        this.name = name;
        this.salario = salario;
    }
    //Pertenece a la clase no al objeto
    public static void hola() {
        System.out.println("Hola");
    }

    public abstract void cobrar();


    // Getter y Setter
    public void setName(String name){
        //No retorna nada modifica
        if(name == null) return; //Clausula de guarda o Early Return
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}
