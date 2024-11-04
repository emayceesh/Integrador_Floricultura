/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import Model.NomeIDCategoriaModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Model.NomeIDProdutosModel;

/**
 *
 * @author Patryk
 */
public class JBDCCadastroProdutos {
    private JBDCConnect conexao;

    public JBDCCadastroProdutos() {
        this.conexao = new JBDCConnect();
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
