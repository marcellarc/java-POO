package com.aula09;

public class Foo {

    //LP = []
    public static void metodo(){
        System.out.println("METODO metodo");
    }

    //LP = [int]
    public static void metodo(int x){
        System.out.println("METODO metodo " + x);
    }

    //LP = [int] - ERRO
    //public static void metodo(int y){
    //    System.out.println("METODO metodo " + y);
    //}

    //LP = [String]
    public static void metodo(String x){
        System.out.println("METODO metodo " + x);
    }

    //LP = [String, int]
    public static void metodo(String x, int y){
        System.out.println("METODO metodo " + x + " " + y);
    }

    //LP = [int, String]
    public static void metodo(int y, String x){
        System.out.println("METODO metodo " + x + " " + y);
    }

}
