package com.aula10e11;

import java.util.ArrayList;

public class Cliente implements Tabela {

    @Override
    public String getNomeTabela() {
        return "Cliente";
    }

    @Override
    public ArrayList<String> getCampos() {
        ArrayList<String> aux = new ArrayList<String>();
        aux.add("nome");
        aux.add("cpf");
        aux.add("idade");

        return aux;
    }

}
