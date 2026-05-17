package com.produto.produtoservice;


import jakarta.servlet.annotation.WebServlet;

@WebServlet
public interface ProdutoService {

    void adicionarProduto();
    void lerProduto();
    void atualizarProduto();
    void deletarProduto();

}
