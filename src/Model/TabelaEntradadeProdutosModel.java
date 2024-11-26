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
    private String idproduto_entrada;
    private int quantidadeProduto;
    private String idCategoria_entrada;
    
    public TabelaEntradadeProdutosModel(){
    
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
    
    public String getIdCategoria_entrada() {
        return idCategoria_entrada;
    }

    public void setIdCategoria_entrada(String idCategoria_entrada) {
        this.idCategoria_entrada = idCategoria_entrada;
    }

    public TabelaEntradadeProdutosModel(String idproduto_entrada,int quantidadeProduto, String idCategoria_entrada) {
        this.idproduto_entrada = idproduto_entrada;
        this.quantidadeProduto = quantidadeProduto;
        this.idCategoria_entrada = idCategoria_entrada;
    }
}
