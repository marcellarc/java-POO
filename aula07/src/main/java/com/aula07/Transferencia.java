package com.aula07;

public class Transferencia {

    public static void transferir(Conta de, Conta para, double valor) {
        if (de.getSaldo() >= valor) {
            de.retirar(valor);
            para.depositar(valor);
        } else {
            System.out.println("SALDO INSUFICIENTE");
        }
    }

}
