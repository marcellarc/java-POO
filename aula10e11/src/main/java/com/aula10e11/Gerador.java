package com.aula10e11;

import java.util.ArrayList;

public class Gerador {

    public static String trocar(String str) {
        char[] aux = str.toCharArray();
        aux[aux.length - 1] = ')';
        return new String(aux);
    }

    public static String gerarInsert(Tabela t) {

        String sql = "INSERT INTO ";

        sql = sql + t.getNomeTabela() + "(";

        ArrayList<String> campos = t.getCampos();

        for (String campo : campos) {
            sql = sql + campo + ",";
        }

        sql = trocar(sql);
        sql = sql + " VALUES(";

        for (String campo : campos) {
            sql = sql + "?,";
        }

        sql = trocar(sql) + ";";

        return sql;
    }

}
