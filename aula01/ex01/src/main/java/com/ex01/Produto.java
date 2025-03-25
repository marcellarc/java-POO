package com.ex01;

public class Produto {

    String nome;
    double preco;
    Status status;

    Produto(String nome, double preco, Status status) {
        this.nome = nome;
        this.preco = preco;
        this.status = status;
    }

    void mostrarInfo() {
        switch (this.status) {
            case NORMAL:
                System.out.println(this.nome + ": NORMAL");
                break;
            case PROMOCAO:
                System.out.println(this.nome + ": EM PROMOÇÃO");
                break;
            case BAIXO:
                System.out.println(this.nome + ": BAIXO ESTOQUE");
                break;
        }
    }

    void mostrarPreco() {
        switch (this.status) {
            case NORMAL:
                System.out.println("Preco: " + this.preco);
                break;
            case PROMOCAO:
                System.out.println("Preco: " + this.preco * 0.8);
                break;
            case BAIXO:
                System.out.println("Preco: " + this.preco * 1.1);
                break;

        }
    }
}
