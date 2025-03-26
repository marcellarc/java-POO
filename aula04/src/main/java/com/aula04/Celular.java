package com.aula04;

public class Celular {

    private String nome, numero;
    private Bateria bat;
    private Status status;

    public Celular(Bateria bat, String nome, String numero, Status status) {
        this.bat = bat;
        this.nome = nome;
        this.numero = numero;
        this.status = status;
    }

    public void ligar() {
        if (bat.isVazio() || status.isON()) {
            return;
        }
        bat.gastar(5);
        System.out.println("Ola, " + nome);
        status = Status.ON;
    }

    public void desligar() {
        if (status.isON()) {
            status = Status.OFF;
            System.out.println("...");
        }
    }

    public void mostrarInfo() {
        if (!bat.verificarEnergia() || !status.isON()) {
            return;
        }
        bat.gastar(5);
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
    }

}
