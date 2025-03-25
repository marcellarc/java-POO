package com.ex01;

public class Ex01 {

    public static void main(String[] args) {
        Produto p = new Produto("molho", 2.5, Status.BAIXO);
        p.mostrarInfo();
        p.mostrarPreco();

        Produto p2 = new Produto("agua", 1.5, Status.NORMAL);
        p2.mostrarInfo();
        p2.mostrarPreco();
    }
}
