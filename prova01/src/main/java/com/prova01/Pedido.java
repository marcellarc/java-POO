package com.prova01;

public class Pedido {

    private EstadoDoPedido estado;
    private double valorTotal, valorTaxa;

    public Pedido(){
        estado = EstadoDoPedido.NOVO;
    }

    public EstadoDoPedido getEstado() {
        return estado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorTaxa() {
        return valorTaxa;
    }

    public void proximoEstado() {
        switch(estado){
            case NOVO -> estado = EstadoDoPedido.PROCESSANDO;
            case PROCESSANDO -> estado = EstadoDoPedido.ENVIADO;
            case ENVIADO -> estado = EstadoDoPedido.ENTREGUE;
            default -> {} //nao precisa do default já que nao há condições contrárias
        }
    }

    public void mostrarResumo(){
        System.out.println("Estado: " + estado);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Valor da taxa: " + valorTaxa);
    }

    public void adicionarItem(double preco){
        if (estado == EstadoDoPedido.NOVO){
            valorTotal += preco;
            valorTaxa += valorTotal > 500 ? 1.5 * 0.1 : 1.5; //se valor for > 500
        }
    }


}
