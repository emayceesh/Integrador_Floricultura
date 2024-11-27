/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author gm
 */
public class VendasModel {
    private int idvenda;
    private int idcliente;
    private int operador_venda;
    private int produto_venda;
    private int quantidadeVenda;
    private String codigo_venda;
    private LocalDate dataVenda;
    
    public VendasModel(){
        
    }
    
    public VendasModel(int idvenda, int idcliente, int operador_venda,
            int produto_venda, int quantidade_venda, String codigo_venda,
            LocalDate datavenda) {
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

    public int getOperador_venda() {
        return operador_venda;
    }

    public void setOperador_venda(int operador_venda) {
        this.operador_venda = operador_venda;
    }

    public int getProduto_venda() {
        return produto_venda;
    }

    public void setProduto_venda(int produto_venda) {
        this.produto_venda = produto_venda;
    }

    public int getQuantidade_venda() {
        return quantidadeVenda;
    }

    public void setQuantidade_venda(int quantidade_venda) {
        this.quantidadeVenda = quantidade_venda;
    }

    public String getCodigo_venda() {
        return codigo_venda;
    }

    public void setCodigo_venda(String codigo_venda) {
        this.codigo_venda = codigo_venda;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
}
