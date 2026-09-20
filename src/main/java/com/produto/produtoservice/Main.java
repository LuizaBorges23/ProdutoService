package com.produto.produtoservice;

import com.produto.produtoservice.Produto; 

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setDescricao("Produto de limpeza");
        System.out.println("Descricao do produto: "+produto.getDescricao());
    }
}
