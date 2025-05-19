package com.aula07;

public class Conta {

    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void retirar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    public boolean temSaldo() {
        return saldo > 0;
    }

}
