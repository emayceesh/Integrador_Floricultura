/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Patryk
 */
public class TabelaEntradadeProdutosModel {
    private String idprodutos_entrada;
    private int quantidadeProduto;
    private String idCategoria_entrada;
    

    public String getIdprodutos_entrada() {
        return idprodutos_entrada;
    }

    public void setIdprodutos_entrada(String idprodutos_entrada) {
        this.idprodutos_entrada = idprodutos_entrada;
    }

    public String getIdCategoria_entrada() {
        return idCategoria_entrada;
    }

    public void setIdCategoria_entrada(String idCategoria) {
        this.idCategoria_entrada = idCategoria;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public TabelaEntradadeProdutosModel(String idprodutos_entrada, String idCategoria, int quantidadeProduto) {
        this.idprodutos_entrada = idprodutos_entrada;
        this.idCategoria_entrada = idCategoria;
        this.quantidadeProduto = quantidadeProduto;
    }
}
