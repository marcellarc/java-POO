package com.aula02;
//import com.teste.Foo;

public class Aula02 {

    public static void main(String[] args) {
        Aluno a = new Aluno ("Marcella", "0050482323011",8.95);
        //a.setPr(-3);
        a.mostrarInfo();
        System.out.println(a.getPR());
        //Foo f = new Foo();
        // z é público em foo, logo tem acesso liberado aqui
        //f.z = 7; //escrita 
        //int aux = f.z; //leitura
        //System.out.println(aux);

        // y é default, logo nao tem acesso por causa do package
        // f.y = 10; //escrita
        // int aux2 = f.y; //leitura
        // System.out.println (aux2);

       // f.x = 14;
       // System.out.println(f.x);
    }
}
