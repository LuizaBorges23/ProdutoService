package com.produto.produtoservice;

import jakarta.jws.WebMethod;
import jakarta.servlet.annotation.WebServlet;

@WebServlet
public class ProdutoDAO implements ProdutoService{
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
    @WebMethod
    public String adicionarProduto(String descricao) {
        return null;
    }
}
