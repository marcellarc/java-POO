package com.aula09;

//Retangulo <= Forma
//Retangulo IS-A Forma
public class Retangulo extends Forma{

    private double medida2;

    public Retangulo(double medida, double medida2){
        //chama o construtor da superclasse
        super(medida);
        this.medida2 = medida2;
    }

    public double getMedida2() {
        return medida2;
    }

    @Override
    public double calcularPerimetro(){
        return 2*(getMedida() + medida2);
    }

    @Override
    public double calcularArea(){
        //return medida*medida2; CASO MEDIDA SEJA protected
        return getMedida()*medida2;
    }

}
