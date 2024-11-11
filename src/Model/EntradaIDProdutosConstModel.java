/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Patyrk
 */
public class EntradaIDProdutosConstModel {
    private NomeIDProdutosModel produto;
    private int quantidadeProduto;
    private NomeIDProdutosModel fornecedor;
    private NomeIDProdutosModel operador;
    private NomeIDProdutosModel categoria;

    // Construtor
    public EntradaIDProdutosConstModel(NomeIDProdutosModel produto, int quantidadeProduto, 
                                NomeIDProdutosModel fornecedor, NomeIDProdutosModel operador, 
                                NomeIDProdutosModel categoria) {
        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
        this.fornecedor = fornecedor;
        this.operador = operador;
        this.categoria = categoria;
    }

    // Getters
    public NomeIDProdutosModel getProduto() {
        return produto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public NomeIDProdutosModel getFornecedor() {
        return fornecedor;
    }

    public NomeIDProdutosModel getOperador() {
        return operador;
    }

    public NomeIDProdutosModel getCategoria() {
        return categoria;
    }
}

