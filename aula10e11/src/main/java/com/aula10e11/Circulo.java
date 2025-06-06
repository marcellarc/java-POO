package com.aula10e11;

//circulo <= forma (circulo é forma)
public class Circulo extends Forma {

    public Circulo(double medida) {
        super(medida);
    }

    @Override //metodo sobrescrito
    public double calcularArea() {
        double r = getMedida();
        return Math.PI * r * r;
    }

    @Override
    public double calcularPeri() {
        double r = getMedida();
        return 2 * Math.PI * r;
    }

}
