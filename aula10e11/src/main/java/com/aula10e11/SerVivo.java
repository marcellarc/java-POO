package com.aula10e11;

public interface SerVivo {

    //1. comportamento do metodo depende das subclasses? não.
    //default é so para interface
    default void respirar() {
        System.out.println("HUUMMMMMFF FUUUU");
    }

    //1. comportamento do metodo depende das subclasses? SIM
    //2. vc faz sentido aqui? NÃO
    //entao é abstrato
    void reproduzir();

}
