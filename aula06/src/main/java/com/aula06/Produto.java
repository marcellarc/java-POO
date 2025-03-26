package com.aula06;

public class Produto {

    private String nome;
    private double preco;
    private Tipo tipo;

    public Produto(String nome, double preco, Tipo tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Tipo: " + tipo);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
