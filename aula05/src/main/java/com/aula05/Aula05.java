package com.aula05;

public class Aula05 {

    public static void main(String[] args) {

        Produto p1 = new Produto("Apagador", 20, Tipo.ESCRITORIO);
        Produto p2 = new Produto("FLASHDRIVE", 150, Tipo.TECNOLOGIA);
        Produto p3 = new Produto("Lapis", 5, Tipo.ESCRITORIO);
        Carrinho k = new Carrinho();
        k.cadastrar(p1);
        k.cadastrar(p2);
        k.cadastrar(p3);
        //k.cadastrar(null);
        //k.remover();
        k.listar();
        System.out.println("\nTotal escritorio: " + k.calcTotalTipo(Tipo.ESCRITORIO));
        System.out.println("Total tecnologia: " + k.calcTotalTipo(Tipo.TECNOLOGIA));
        System.out.println("Total vestuario: " + k.calcTotalTipo(Tipo.VESTUARIO));
        System.out.println("Total da compra: " + k.calcularTotal());
    }
}
