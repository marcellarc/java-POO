package com.aula04;

public class Bateria {

    private int carga;

    public Bateria(int carga) {
        this.carga = Math.min(Math.max(0, carga), 100);
    }

    public void gastar(int qt) {
        int aux = Math.min(carga, qt);
        assert (aux > carga) : "aux tem que ser maior que carga";
        carga = carga - aux;
    }

    public void recarregar() {
        carga = carga <= 95 ? carga + 5 : 100;
        // Expressao_Booleana ? SIM : NAO
    }

    public boolean isVazio() {
        return carga == 0;
    }

    public boolean verificarEnergia() {
        return carga >= 5;
    }

}
