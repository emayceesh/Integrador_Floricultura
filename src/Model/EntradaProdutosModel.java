/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Patryk
 */
public class EntradaProdutosModel {

    private String idprodutos_entrada;
    private String idCategoria;
    private String idfornecedor_entrada;
    private String idoperador;
    private int quantidadeProduto;

    public String getIdprodutos_entrada() {
        return idprodutos_entrada;
    }

    public void setIdprodutos_entrada(String idprodutos_entrada) {
        this.idprodutos_entrada = idprodutos_entrada;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getIdfornecedor_entrada() {
        return idfornecedor_entrada;
    }

    public void setIdfornecedor_entrada(String idfornecedor_entrada) {
        this.idfornecedor_entrada = idfornecedor_entrada;
    }

    public String getIdoperador() {
        return idoperador;
    }

    public void setIdoperador(String idoperador) {
        this.idoperador = idoperador;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public EntradaProdutosModel(String idprodutos_entrada, String idCategoria, String idfornecedor_entrada, String idoperador, int quantidadeProduto) {
        this.idprodutos_entrada = idprodutos_entrada;
        this.idCategoria = idCategoria;
        this.idfornecedor_entrada = idfornecedor_entrada;
        this.idoperador = idoperador;
        this.quantidadeProduto = quantidadeProduto;
    }
}

    