/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.EntradaProdutosModel;
import Model.NomeIDCategoriaModel;
import Model.NomeIDOperadorModel;
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

    public void inserirProduto() {
        String sql = "INSERT INTO entrada_de_produtos (idproduto_entrada, quantidadeProduto, idfornecedor_entrada, idoperador_entrada, idCategoria_entrada) VALUES (?, ?, ?, ?, ?)";

        JBDCConnect jbdcConnect = new JBDCConnect();

        if (jbdcConnect.conectar()) {
            try (Connection conn = jbdcConnect.getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {

                
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
}
