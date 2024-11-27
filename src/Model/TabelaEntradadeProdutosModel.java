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
    private int idProduto;
    private String idproduto_entrada;
    private int quantidadeProduto;
    private String idfornecedor_entrada;
    
    public TabelaEntradadeProdutosModel(){
    
    }
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public String getIdproduto_entrada() {
        return idproduto_entrada;
    }

    public void setIdproduto_entrada(String idproduto_entrada) {
        this.idproduto_entrada = idproduto_entrada;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
    public String getIdfornecedor_entrada() {
        return idfornecedor_entrada;
    }

    public void setIdfornecedor_entrada(String idfornecedor_entrada) {
        this.idfornecedor_entrada = idfornecedor_entrada;
    }

    public TabelaEntradadeProdutosModel(int idProduto, String idproduto_entrada,int quantidadeProduto, String idfornecedor_entrada) {
        this.idProduto = idProduto;
        this.idproduto_entrada = idproduto_entrada;
        this.quantidadeProduto = quantidadeProduto;
        this.idfornecedor_entrada = idfornecedor_entrada;
    }
}
