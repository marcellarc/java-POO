package com.aula01;

public class Cachorro {
    String nome, raca;

    Cachorro(String nome, String raca){
        this.nome = nome; /* this.nome é atributo, nome é local (parametro)*/
        this.raca = raca;
    }

    void latir(){
        System.out.println(nome + ": AUAUAU");
    }
    void mostrarRaca(){
        System.out.println(raca);
    }
}
