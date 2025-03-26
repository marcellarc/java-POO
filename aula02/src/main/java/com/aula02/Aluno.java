package com.aula02;

public class Aluno {

    private String nome, ra;
    private double pr;

    public Aluno(String nome, String ra, double pr){
        this.nome = nome;
        this.ra = ra;
        this.pr = Math.max(0, pr); // validação
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("PR: " + pr);
    }
    
    //acesso escrita -> nao fazer
    public void setPr(double pr){
        this.pr = pr;
    }

    //acesso leitura 
    public double getPR(){
        return pr;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }
}
