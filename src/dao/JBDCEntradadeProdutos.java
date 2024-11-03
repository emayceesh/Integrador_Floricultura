/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Produtos.entradaProdutos;
import Model.EntradaProdutosModel;
import java.util.List;
/**
 *
 * @author Patryk
 */
public class JBDCEntradadeProdutos {

    private JBDCConnect conexao;

    public JBDCEntradadeProdutos() {
        this.conexao = new JBDCConnect();
    }

    public void inserirProduto(EntradaProdutosModel adcProduto) {
        String sql = "INSERT INTO entrada_de_produtos (idproduto_entrada, quantidadeProduto, idfornecedor_entrada)"
                + "idoperador, idCategoria"
                + "VALUES (?, ?, ?, ?, ?)";

        try {
            if (this.conexao.conectar()) {
                Connection conn = this.conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);

                statement.setString(1, adcProduto.getProdutosExistentesCB());
                statement.setInt(2, adcProduto.getQtdProduto());
                statement.setString(3, adcProduto.getFornecedorProduto());
                statement.setString(4, adcProduto.getOperadorEntradaProduto());
                statement.setString(5, adcProduto.getCategoriaProdutoCB());
            }
        }catch (SQLException e) {
            e.printStackTrace(); // Exibe o erro no console para depuração
        }
        
        

    }

}
