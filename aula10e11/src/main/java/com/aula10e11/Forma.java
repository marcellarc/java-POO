package com.aula10e11;

public abstract class Forma {

    private double medida;

    public Forma(double medida) {
        this.medida = medida;
    }

    public double getMedida() {
        return medida;
    }

    //só classes abstratas podem ter metodos abstratos
    //metodos abstratos: metodos que so fazem sentido nas subclasses
    //identificar classe abstrata com duas perguntas:
    //1. comportamento do metodo depende das subclasses? se sim, é abstrato.
    //2. vc faz sentido aqui? se nao, é abstrato.
    public abstract double calcularArea();

    public abstract double calcularPeri();

}
