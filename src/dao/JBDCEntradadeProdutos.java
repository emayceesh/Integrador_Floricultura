/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.EntradaIDProdutosConstModel;
import Model.EntradaProdutosModel;
import Model.NomeFornecedorModel;
import Model.NomeIDCategoriaModel;
import Model.NomeIDOperadorModel;
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

    private Connection conexao;

    public JBDCEntradadeProdutos(Connection conexao) {
        this.conexao = conexao;
    }

    public void inserirProduto(EntradaIDProdutosConstModel adcProduto) {
        String sql = "INSERT INTO entrada_de_produtos (idproduto_entrada, quantidadeProduto, idfornecedor_entrada, idoperador_entrada, idCategoria_entrada) VALUES (?, ?, ?, ?, ?)";

        JBDCConnect jbdcConnect = new JBDCConnect();

        if (jbdcConnect.conectar()) {
            try (Connection conn = jbdcConnect.getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {

                statement.setInt(1, adcProduto.getProduto().getId()); 
            statement.setInt(2, adcProduto.getQuantidadeProduto()); 
            statement.setInt(3, adcProduto.getFornecedor().getId()); 
            statement.setInt(4, adcProduto.getOperador().getId()); 
            statement.setInt(5, adcProduto.getCategoria().getId());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                jbdcConnect.desconectar();
            }
        } else {
            System.out.println("Erro ao conectar ao banco de dados.");
        }
    }

    //Método para buscar os nomes dos Produtos
    public List<NomeIDProdutosModel> getNomesDosProdutos() {
        List<NomeIDProdutosModel> produtos = new ArrayList<>();
        String sql = "SELECT idProduto, nomeProduto FROM produtos";

        try (Connection conn = this.conexao; Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

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

    public List<NomeIDCategoriaModel> getCategorias() {
        List<NomeIDCategoriaModel> categorias = new ArrayList<>();
        String sql = "SELECT IdCategoria, NomeCategoria FROM categoria";

        try (Connection conn = this.conexao; Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("IdCategoria");
                String nome = rs.getString("NomeCategoria");
                categorias.add(new NomeIDCategoriaModel(id, nome));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categorias;
    }

    public List<NomeIDOperadorModel> getIDNomeOperador() {
        List<NomeIDOperadorModel> operadores = new ArrayList<>();
        String sql = "SELECT idoperador, nomeoperador FROM usuario_sistema_floricultura";

        try (Connection conn = this.conexao; Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("idoperador");
                String nome = rs.getString("nomeoperador");
                operadores.add(new NomeIDOperadorModel(id, nome));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return operadores;
    }

    public List<NomeFornecedorModel> getFornecedorIDNome() {
        List<NomeFornecedorModel> fornecedores = new ArrayList<>();
        String sql = "SELECT idfornecedor, nomefornecedor FROM fornecedor_floricultura";

        try (Connection conn = this.conexao; Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("idfornecedor");
                String nome = rs.getString("nomefornecedor");
                fornecedores.add(new NomeFornecedorModel(id, nome));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fornecedores;
    }

}
