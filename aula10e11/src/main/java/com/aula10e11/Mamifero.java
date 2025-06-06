package com.aula10e11;

public interface Mamifero extends SerVivo {

    int NUMERO_DE_OLHOS = 2; //constante

    //1. comportamento do metodo depende das subclasses? SIM
    //2. vc faz sentido aqui? NÃO
    void mamar();

    //1. comportamento do metodo depende das subclasses? SIM
    //2. vc faz sentido aqui? NÃO 
    void emitirSom();

    public static void andar() {
        System.out.println("andou");
    }

}
