/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Model.VendasModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author gm
 */
public class JBDCVendas {
    private JBDCConnect conexao;
    
    public JBDCVendas(){
        this.conexao = new JBDCConnect();
    }
    
    public void RealizarVenda(VendasModel realizarvendas) {
        String sql = "INSERT INTO vendas (idvenda,"
                + "idcliente"
                + "operador_venda"
                + "produto_venda"
                + "quantidadeVenda"
                + "codigoVenda"
                + "dataVenda)";
    }
}
