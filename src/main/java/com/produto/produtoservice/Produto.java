package com.produto.produtoservice;

import jakarta.servlet.annotation.WebServlet;

@WebServlet
public class Produto implements ProdutoService{
    private int id;
    private String descricao;

    public  Produto() {

    }

    public Produto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void adicionarProduto() {

    }

    @Override
    public void lerProduto() {

    }

    @Override
    public void atualizarProduto() {

    }

    @Override
    public void deletarProduto() {

    }
}
