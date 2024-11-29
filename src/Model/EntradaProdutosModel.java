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
    private int quantidadeProduto;
    private String idCategoria_entrada;
    private String idfornecedor_entrada;
    private String idoperador_entrada;
    private String itempesquisar;
    private int valorconsulta;

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

    public String getIdfornecedor_entrada() {
        return idfornecedor_entrada;
    }

    public void setIdfornecedor_entrada(String idfornecedor_entrada) {
        this.idfornecedor_entrada = idfornecedor_entrada;
    }

    public String getIdoperador_entrada() {
        return idoperador_entrada;
    }

    public void setIdoperador_entrada(String idoperador) {
        this.idoperador_entrada = idoperador;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getItempesquisar() {
        return itempesquisar;
    }

    public void setItempesquisar(String itempesquisar) {
        this.itempesquisar = itempesquisar;
    }

    public int getValorconsulta() {
        return valorconsulta;
    }

    public void setValorconsulta(int valorconsulta) {
        this.valorconsulta = valorconsulta;
    }

    public EntradaProdutosModel(String idprodutos_entrada, String idCategoria, String idfornecedor_entrada, String idoperador, int quantidadeProduto,
            String itempesquisar, int valorconsulta) {
        this.idprodutos_entrada = idprodutos_entrada;
        this.idCategoria_entrada = idCategoria;
        this.idfornecedor_entrada = idfornecedor_entrada;
        this.idoperador_entrada = idoperador;
        this.quantidadeProduto = quantidadeProduto;
        this.itempesquisar = itempesquisar;
        this.valorconsulta = valorconsulta;
    }

    public EntradaProdutosModel(String idprodutos_entrada,String itempesquisar , int quantidadeProduto, String idfornecedor_entrada ) {
        this.idprodutos_entrada = idprodutos_entrada;
        this.itempesquisar = itempesquisar;
        this.quantidadeProduto = quantidadeProduto;
        this.idfornecedor_entrada = idfornecedor_entrada;
    }   

}
