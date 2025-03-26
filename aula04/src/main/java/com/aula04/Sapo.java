package com.aula04;

public class Sapo {

    private int qtPulo; //Cada sapo terá qtPulo
    private static int qtSapo; //Um qtSapo para todos.

    public Sapo() {
        qtPulo++;
        qtSapo++;
    }

    public int getQtPulo() {
        return qtPulo;
    }

    public static int getQtSapo() {
        return qtSapo;
    }

}
