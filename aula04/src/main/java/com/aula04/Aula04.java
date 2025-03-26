package com.aula04;

public class Aula04 {

    public static void main(String[] args) {
        Sapo s1 = new Sapo();
        Sapo s2 = new Sapo();
        Sapo s3 = new Sapo();
        System.out.println(s1.getQtPulo()); //1
        System.out.println(s2.getQtPulo()); //1
        System.out.println(s3.getQtPulo()); //1
        System.out.println(Sapo.getQtSapo()); //3

        Bateria b = new Bateria(50);
        Celular cel = new Celular(b, "Marcella", "13991518506", Status.OFF);
        cel.ligar();
        cel.mostrarInfo();
    }
}
