package com.aula01;

public class Aula01 {

    public static void main(String[] args) {
        Contador k = new Contador();
        k.incrementar();
        k.incrementar();
        k.incrementar();
        k.incrementar();
        k.decrementar();
        k.mostrar();
        k.zerar();
        k.mostrar();
        k.decrementar();
        k.mostrar();

        Cachorro c = new Cachorro("PIPO","SRD");
        c.latir();
        c.mostrarRaca();

        Cachorro d = new Cachorro("PINGO","PINSCHER");
        d.latir();
        d.mostrarRaca();

        Aluno a = new Aluno("JOAO", Curso.ADS);
        a.mostrarInformacao();

        Aluno b = new Aluno("MARI", Curso.RH);
        b.mostrarInformacao();
    }
}
