package com.aula06;

import java.util.ArrayList;
import java.util.Optional;

public class Carrinho {

    //lista de produtos
    private ArrayList<Produto> carrinho;

    public Carrinho(){
        //a lista deve ser criada na memoria antes de seu uso
        carrinho = new ArrayList<Produto>();
    }

    public void adicionar(Produto p){
        if(p != null){
            carrinho.add(p); //add = metodo do arraylist
        }
    }

    public void listar(){
        /*for(int i = 0; i < carrinho.size(); i++){ //for p cada indice do carrinho
            carrinho.get(i).mostrar();
        }*/

       //foreach
       for (Produto produto : carrinho){ //for p cada produto do carrinho
            produto.mostrar();
       }
    }

    public double calcularTotal(){
        double soma = 0;
        for(Produto produto : carrinho){
            soma += produto.getPreco();
        }

        return soma;
    }

    public double calcularTotalporTipo(Tipo t){
        double soma = 0;
        for(Produto produto : carrinho){
            if(t == produto.getTipo())
                soma += produto.getPreco();
        }

        return soma;
    }

    //retornar o primeiro produto que achar
    public Optional<Produto> buscarPrimeiroPorNome(String nome){
        for(Produto produto : carrinho){
            if(nome.equals(produto.getNome())) //equals compara conteudo, == compara endereço de memoria
                return Optional.of(produto);
        }

        return Optional.empty();
    }

    public ArrayList<Produto> buscarPorNome(String nome){
        ArrayList<Produto> aux = new ArrayList<Produto>();
        for(Produto produto : carrinho){
            if(produto.getNome().equals(nome)){
                aux.add(produto);
            }
        }
        return aux;
    }

    public void removerPorNome(String nome){
        Optional<Produto> produtoAchadoOuNao = buscarPrimeiroPorNome(nome);
        if(produtoAchadoOuNao.isPresent()){
            carrinho.remove(produtoAchadoOuNao.get());
        }else {
            System.out.println("Produto nao achado");
        }
    }

}
