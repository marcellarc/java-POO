package com.prova01;

public class Mensagem {

    private String conteudo, remetente;

    public Mensagem(String conteudo, String remetente) {
        this.conteudo = conteudo;
        this.remetente = remetente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getRemetente() {
        return remetente;
    }
    
}
