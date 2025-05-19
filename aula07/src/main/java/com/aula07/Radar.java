package com.aula07;

import java.util.ArrayList;

public class Radar {

    private ArrayList<Carro> carros;

    public Radar() {
        carros = new ArrayList<Carro>();
    }

    public void inserir(Carro carro) {
        if (carro != null) {
            carros.add(carro);
        }
    }

    public void exibirCarrosEmMovimento() {
        double soma = 0;
        int qtd = 0;
        for (Carro carro : carros) {
            //if(carro.getEstado() == EstadoDoCarro.MOVENDO){
            if (carro.isMOVENDO()) {
                soma += carro.getVelocidade();
                qtd++;
                carro.mostrar();
            }
        }
        double media = soma / qtd;
        System.out.println("QTD: " + qtd);
        System.out.println("Velocidade media: " + media);
    }

    public void listarDesligados() {
        for (Carro carro : carros) {
            if (carro.getEstado() == EstadoDoCarro.DESLIGADO) {
                carro.mostrar();
            }
        }
    }

}
