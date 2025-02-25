/*
10/02/2025
Primeiro exemplo de POO em Java
*/
package com.exemplo01;

public class Exemplo01 {

    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Neymar Jr.";
        j.camisa = 10;
        j.clube = "Santos FC";
        j.mostrarInfo();
 
        Jogador j2 = new Jogador();
        j2.nome = "Gil";
        j2.camisa = 4;
        j2.clube = "Santos FC";
        j2.mostrarInfo();
    }
}
