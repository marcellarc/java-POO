package com.aula09;

public class Circulo extends Forma{

    //medida aqui eh o raio
    public Circulo(double medida) {
        super(medida);
    }

    @Override
    public double calcularArea(){
        return Math.PI*getMedida()*getMedida();
    }

    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*getMedida();
    }

}
