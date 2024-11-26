/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.NomeIDCategoriaModel;
import Model.NomeIDOperadorModel;
import Model.TabelaEntradadeProdutosModel;
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

    }

    public void inserirProduto() {
        String sql = "INSERT INTO entrada_de_produtos (idproduto_entrada, quantidadeProduto, idfornecedor_entrada, idoperador_entrada, idCategoria_entrada) VALUES (?, ?, ?, ?, ?)";

        JBDCConnect jbdcConnect = new JBDCConnect();

        if (jbdcConnect.conectar()) {
            try (Connection conn = jbdcConnect.getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {

                ///INCOMPLETA
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

        JBDCConnect jbdcConnect = new JBDCConnect();

        try {
            if (jbdcConnect.conectar()) {
                Connection conn = jbdcConnect.getConnection();

                try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        int id = rs.getInt("IdCategoria");
                        String nome = rs.getString("NomeCategoria");
                        categorias.add(new NomeIDCategoriaModel(id, nome));
                    }
                }
            } else {
                System.out.println("Erro ao conectar ao banco de dados.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jbdcConnect.desconectar();
        }

        return categorias;
    }

    public List<NomeIDOperadorModel> getIDNomeOperador() {
        List<NomeIDOperadorModel> operadores = new ArrayList<>();
        String sql = "SELECT idoperador, nomeoperador FROM usuario_sistema_floricultura";

        JBDCConnect jbdcConnect = new JBDCConnect();

        try {

            if (jbdcConnect.conectar()) {

                Connection conn = jbdcConnect.getConnection();

                try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        int id = rs.getInt("idoperador");
                        String nome = rs.getString("nomeoperador");
                        operadores.add(new NomeIDOperadorModel(id, nome));
                    }
                }
            } else {
                System.out.println("Erro ao conectar ao banco de dados.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fechar a conexão, se necessário
            jbdcConnect.desconectar();
        }

        return operadores;
    }

    public ArrayList<TabelaEntradadeProdutosModel> MostrarListaProdutos() {

        ArrayList<TabelaEntradadeProdutosModel> listaProdutos = new ArrayList<>();

        String sql = "SELECT "
                + "    p.NomeProduto, "
                + "    ep.quantidadeProduto, "
                + "    c.NomeCategoria "
                + "FROM entrada_de_produtos ep "
                + "JOIN produtos p ON ep.idproduto_entrada = p.idProduto "
                + "JOIN categoria c ON ep.IdCategoria_entrada = c.IdCategoria "
                + "ORDER BY ep.idproduto_entrada;";

        JBDCConnect jbdcConnect = new JBDCConnect();

        try {

            if (jbdcConnect.conectar()) {

                Connection conn = jbdcConnect.getConnection();

                try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

                    while (rs.next()) {
                        TabelaEntradadeProdutosModel produto = new TabelaEntradadeProdutosModel();

                        produto.setIdproduto_entrada(rs.getString("NomeProduto"));
                        produto.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                        produto.setIdCategoria_entrada(rs.getString("NomeCategoria"));

                        listaProdutos.add(produto);
                    }
                }
            } else {
                System.out.println("Erro ao conectar ao banco de dados.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            jbdcConnect.desconectar();
        }

        return listaProdutos;
    }

    public boolean adicionarQuantidade(String idProduto, int quantidadeAdicionada) {
        String sql = "UPDATE produtos SET QuantidadeProduto = QuantidadeProduto + ? WHERE iDProduto = ?";
        JBDCConnect jbdcConnect = new JBDCConnect();

        try {
            if (jbdcConnect.conectar()) {
                Connection conn = jbdcConnect.getConnection();

                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, quantidadeAdicionada);
                pstmt.setString(2, idProduto);

                int rowsAffected = pstmt.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jbdcConnect.desconectar();
        }
        return false;
    }

    public boolean categoriaExiste(String nomeCategoria) {
        String sql = "SELECT COUNT(*) FROM categoria WHERE NomeCategoria = ?";
        JBDCConnect jbdcConnect = new JBDCConnect();

        try {
            if (jbdcConnect.conectar()) {
                Connection conn = jbdcConnect.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nomeCategoria);

                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0; // Retorna true se a categoria existir
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jbdcConnect.desconectar();
        }

        return false; // Retorna false se a categoria não existir
    }

    public boolean atualizarCategoria(String idProduto, String novaCategoria) {
        String sql = "UPDATE entrada_de_produtos SET IdCategoria_entrada = (SELECT IdCategoria FROM categoria WHERE NomeCategoria = ?) WHERE idproduto_entrada = ?";
        JBDCConnect jbdcConnect = new JBDCConnect();

        try {
            if (jbdcConnect.conectar()) {
                Connection conn = jbdcConnect.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, novaCategoria);
                pstmt.setString(2, idProduto);

                int rowsAffected = pstmt.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            jbdcConnect.desconectar();
        }
        return false;
    }

}
