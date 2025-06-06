package com.aula10e11;

//se serVivo <= Mamifero
//e Gato <= Mamifero
//entao Gato <= serVivo
//(se servivo é mamifero e gato é mamifero, entao gato é servivo)
public class Gato implements Mamifero {

    @Override
    public void mamar() {
        System.out.println("mamou como gato");
    }

    @Override
    public void reproduzir() {
        System.out.println("reproduziu como gato");

    }

    @Override
    public void emitirSom() {
        System.out.println("miauuuu");
    }

    public void arranhar() {
        System.out.println("arranhou!");
    }

}
