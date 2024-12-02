/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author gm
 */
public class VendasModel {
    private int idvenda;
    private int idcliente;
    private String operador_venda;
    private String produto_venda;
    private int valor_consulta;
    private String quantidadeVenda;
    private String codigo_venda;
    private String item_pesquisado;
    private String dataVenda;
    
    public VendasModel(){
        
    }
    
    public VendasModel(int idvenda, int idcliente, String operador_venda,
            String produto_venda, String quantidade_venda, String codigo_venda,
            Date datavenda) {
        this.idvenda = idvenda;
        this.idcliente = idcliente;
        this.operador_venda = operador_venda;
        this.produto_venda = produto_venda;
        this.quantidadeVenda = quantidadeVenda;
        this.codigo_venda = codigo_venda;
        this.dataVenda = dataVenda;
    }
    
    
    // Getters e Setters

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getOperador_venda() {
        return operador_venda;
    }

    public void setOperador_venda(String operador_venda) {
        this.operador_venda = operador_venda;
    }

    public String getProduto_venda() {
        return produto_venda;
    }

    public void setProduto_venda(String produto_venda) {
        this.produto_venda = produto_venda;
    }

    public String getQuantidade_venda() {
        return quantidadeVenda;
    }

    public void setQuantidade_venda(String quantidade_venda) {
        this.quantidadeVenda = quantidade_venda;
    }

    public String getCodigo_venda() {
        return codigo_venda;
    }

    public void setCodigo_venda(String codigo_venda) {
        this.codigo_venda = codigo_venda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public int getValor_Consulta() {
        return valor_consulta;
    }
    
    public void setValor_Consulta(int valor_consulta) {
        this.valor_consulta = valor_consulta;
    }
    
    public String getItem_Pesquisado() {
        return item_pesquisado;
    }
    
    public void setItem_Pesquisado() {
        this.item_pesquisado = item_pesquisado;
    }
}
