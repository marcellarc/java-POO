package com.aula07;

public class Carro {

    private EstadoDoCarro estado;
    private double velocidade;

    public Carro() {
        estado = EstadoDoCarro.DESLIGADO;
    }

    public EstadoDoCarro getEstado() {
        return estado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void alterarEstado() {
        switch (estado) {
            case DESLIGADO ->
                estado = EstadoDoCarro.LIGADO;
            case LIGADO ->
                estado = EstadoDoCarro.MOVENDO;
            case MOVENDO -> {
                estado = EstadoDoCarro.PARADO;
                velocidade = 0;
            }
            case PARADO ->
                estado = EstadoDoCarro.DESLIGADO;
        }
    }

    public void acelerar(double incremento) {
        if (estado == EstadoDoCarro.MOVENDO) {
            velocidade += incremento;
        }
    }

    public void mostrar() {
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Estado: " + estado);
    }

    public boolean isMOVENDO() {
        return estado == EstadoDoCarro.MOVENDO;
    }
}
