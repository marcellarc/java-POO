package com.prova01;

public class Servidor {

    public static void enviar(Usuario de, Usuario para, Mensagem m) {
        para.receber(m);
        de.apagarMensagem();
    }

}
