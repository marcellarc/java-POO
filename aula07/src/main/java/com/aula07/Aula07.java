package com.aula07;

public class Aula07 {

    public static void main(String[] args) {
        Radar radar = new Radar();
        
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        c1.alterarEstado(); // Liga o carro
        c1.alterarEstado(); // Começa a se mover
        c1.acelerar(30);    // Acelera

        c2.alterarEstado(); // Liga o carro
        c2.alterarEstado(); // Começa a se mover
        c2.acelerar(50);    // Acelera

        //c3 permanece desligado

        radar.inserir(c1);
        radar.inserir(c2);
        radar.inserir(c3);

        radar.exibirCarrosEmMovimento();

        radar.listarDesligados();

        Conta conta1 = new Conta("Marcella", 500);
        Conta conta2 = new Conta("Mariana", 100);

        conta1.depositar(300);
        conta1.retirar(30);
        conta2.depositar(100);

        Transferencia.transferir(conta1, conta2, 400);
        Transferencia.transferir(conta1, conta2, 30);

    }
}
