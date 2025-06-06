package com.aula10e11;

public class Cachorro implements Mamifero {

    @Override
    public void mamar() {
        System.out.println("mamou como cachorro");
    }

    @Override
    public void emitirSom() {
        System.out.println("au au au au");
    }

    @Override
    public void reproduzir() {
        System.out.println("reproduziu como cachorro");
    }

    public void pular() {
        System.out.println("pulou!");
    }

}
