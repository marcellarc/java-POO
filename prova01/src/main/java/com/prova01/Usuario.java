package com.prova01;

public class Usuario {

    private String nome;
    private Mensagem mensagemRecebida;

    public void criarMensagem(String texto) {
        mensagemRecebida = new Mensagem(nome, texto); 
    }

    public void receber(Mensagem m){
        if (m != null){
            mensagemRecebida = m;
        }
    }

    public void lerMensagem(){
        System.out.println(nome);
        System.out.println(mensagemRecebida.getConteudo());
    }

    public void apagarMensagem(){
        mensagemRecebida = null;
    }

}
