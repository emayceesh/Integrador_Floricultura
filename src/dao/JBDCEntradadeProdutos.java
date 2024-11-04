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
import Model.NomeIDProdutosModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
        String sql = "INSERT INTO entrada_de_produtos (idproduto_entrada, quantidadeProduto, idfornecedor_entrada, idoperador, idCategoria)"
                + "   VALUES (?, ?, ?, ?, ?)";

        try {
            if (this.conexao.conectar()) {
                Connection conn = this.conexao.getConnection();
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, adcProduto.getIdprodutos_entrada());
                    statement.setInt(2, adcProduto.getQuantidadeProduto());
                    statement.setString(3, adcProduto.getIdfornecedor_entrada());
                    statement.setString(4, adcProduto.getIdoperador());
                    statement.setString(5, adcProduto.getIdCategoria());

                    // Executa a inserção
                    statement.executeUpdate();
                }
            } else {
                System.out.println("Erro ao conectar ao banco de dados."); // Log se a conexão falhar
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Exibe o erro no console para depuração
        }
    }
    
    //Método para buscar os nomes dos Produtos
    public List<NomeIDProdutosModel> getNomesDosProdutos() {
        List<NomeIDProdutosModel> produtos = new ArrayList<>();
        String sql = "SELECT idProduto, nomeProduto FROM produtos";

        try (Connection conn = this.conexao.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("idProduto");
                String nome = rs.getString("nomeProduto");
                produtos.add(new NomeIDProdutosModel(id, nome));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produtos;
    }
    
}
