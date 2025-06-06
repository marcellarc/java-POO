package com.prova01;

import java.util.ArrayList;

public class Fila {

    private ArrayList<Pedido> fila;

    public Fila() {
        fila = new ArrayList<Pedido>();
    }

    public void adicionar(Pedido p){
        if (p != null){
            fila.add(p);
        }
    }

    public void listar(EstadoDoPedido estado){
        for (Pedido pedido : fila) {
            if(pedido.getEstado() == estado){
                pedido.mostrarResumo();
            }
        }
    }

    public double[] calcularTotal() {
        double[] aux = new double[2];
        double valorAux = 0;
        double valorTaxaAux = 0;

        for(Pedido pedido : fila) {
            valorAux += pedido.getValorTotal();
            valorTaxaAux += pedido.getValorTaxa();
        }

        aux[0] = valorAux;
        aux[1] = valorTaxaAux;
        return aux;
    } 

}
