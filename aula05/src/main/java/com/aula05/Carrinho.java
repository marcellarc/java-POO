package com.aula05;

public class Carrinho {

    private Produto[] carrinho; //pilha lifo
    private static final int QTD_MAX = 5;
    private int topo; //indice do topo, começa c 0

    public Carrinho() {
        carrinho = new Produto[QTD_MAX];
    }

    public void cadastrar(Produto p) {
        assert p != null : "Produto nao pode ser nulo";
        assert topo < QTD_MAX : "Topo excedido";
        carrinho[topo++] = p;
    }

    public Produto remover() {
        assert topo > 0 : "Topo deve ser maior que 0";
        Produto prodTopo = carrinho[--topo];//retirando 1 indice do topo, apontando para posiçao anterior
        carrinho[topo] = null; //e atribuindo null para a posiçao indicada 
        return prodTopo;
    }

    public double calcularTotal() {
        double soma = 0;

        for (int i = 0; i < topo; i++) {
            soma += carrinho[i].getPreco();
        }

        return soma;
    }

    public double calcTotalTipo(Tipo t) {
        double soma = 0;

        for (int i = 0; i < topo; i++) {
            if (t == carrinho[i].getTipo()) {
                soma += carrinho[i].getPreco();
            }
        }

        return soma;
    }

    public void listar() {
        for (int i = 0; i < topo; i++) {
            carrinho[i].mostrar();
        }
    }

}
