package com.aula10e11;

import java.util.ArrayList;

public class Produto implements Tabela {

    @Override
    public String getNomeTabela() {
        return "Produto";
    }

    @Override
    public ArrayList<String> getCampos() {
        ArrayList<String> aux = new ArrayList<String>();
        aux.add("nome");
        aux.add("valor");
        aux.add("tipo");
        aux.add("qtd");

        return aux;
    }

}
