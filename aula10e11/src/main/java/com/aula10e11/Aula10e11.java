package com.aula10e11;
//AULA 10 - CONCEITOS DE CLASSES ABSTRATAS E INTERFACES
//AULA 11 - POLIMORFISMO DE SUBTIPOS

public class Aula10e11 {

    public static void main(String[] args) {
        //inicio - primeira parte da aula: classes abstratas e interfaces
        //Forma f = new Forma(5); exemplo de tentativa de instanciar uma classe abstrata. não se pode fazer isso com classes abstratas.
        Circulo c = new Circulo(7);
        System.out.println(c.calcularArea());

        //Mamifero m = new Mamifero(); exemplo de tentativa de instanciar uma intrface. não pode instanciar uma interface.
        //exemplos corretos: 
        /*Gato g = new Gato();
        g.arranhar(); //metodo do gato
        g.mamar(); //metodo do mamifero
        g.respirar(); //metodo do servivo
        g.reproduzir(); //metodo do mamifero
        g.emitirSom(); //metodo do mamifero
        System.out.println(Mamifero.NUMERO_DE_OLHOS); //chamada de uma constante, não precisou instanciar a classe.
        Mamifero.andar();*/
        //fim da primeira parte da aula
        //inicio da segunda parte da aula - polimorfismo de subtipos
        Mamifero m = new Gato(); //o compilador aceita pq gato é um mamifero -> polimorfismo de subtipos: Gato <= Mamifero (gato é mamífero)

        //SerVivo s = new Gato(); // Gato <= SerVivo
        //m.arranhar(); -> em tempo de compilação, o java não sabe que m é gato, apenas que é mamifero. logo, a linha é rejeitada pelo compilador.
        /*m.reproduzir();
        m.mamar();
        s.reproduzir();*/
        //procurar um metodo = despacho estatico
        //executar um metodo = despacho dinamico
        Gato g = (Gato) m;
        g.arranhar();

        //gerar inserts sql
        Produto p = new Produto();
        System.out.println(Gerador.gerarInsert(p));

        Cliente cli = new Cliente();
        System.out.println(Gerador.gerarInsert(cli));
    }
}
