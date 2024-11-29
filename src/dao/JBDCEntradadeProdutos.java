/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.EntradaProdutosModel;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.NomeIDCategoriaModel;
import Model.NomeIDFornecedoresModel;
import Model.NomeIDProdutosModel;
import Model.NomeIDOperadorModel;
import Model.TabelaEntradadeProdutosModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patryk
 */
public class JBDCEntradadeProdutos {

    private JBDCConnect conexao;

    public JBDCEntradadeProdutos() {

    }

    public List<NomeIDFornecedoresModel> getIDNomeFornecedor() {
        List<NomeIDFornecedoresModel> fornecedores = new ArrayList<>();
        String sql = "SELECT idfornecedor, nomefornecedor FROM fornecedor_floricultura";

        JBDCConnect jbdcConnect = new JBDCConnect();

        try {
            if (jbdcConnect.conectar()) {
                Connection conn = jbdcConnect.getConnection();

                try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        int id = rs.getInt("idfornecedor");
                        String nome = rs.getString("nomefornecedor");
                        fornecedores.add(new NomeIDFornecedoresModel(id, nome));
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

        return fornecedores;
    }

    //MOstra os produtos na tabela
    public ArrayList<TabelaEntradadeProdutosModel> MostrarListaProdutos() {

        ArrayList<TabelaEntradadeProdutosModel> listaProdutos = new ArrayList<>();

        String sql = "SELECT "
                + "   p.idProduto, "
                + "   p.NomeProduto, "
                + "   p.QuantidadeProduto, "
                + "   COALESCE(c.nomefornecedor, 'Sem Fornecedor') AS nomefornecedor "
                + "FROM produtos p "
                + "LEFT JOIN fornecedor_floricultura c ON p.idFornecedor_produtos = c.idfornecedor "
                + "ORDER BY p.idProduto;";

        JBDCConnect jbdcConnect = new JBDCConnect();

        try {

            if (jbdcConnect.conectar()) {

                Connection conn = jbdcConnect.getConnection();

                try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

                    while (rs.next()) {
                        TabelaEntradadeProdutosModel produto = new TabelaEntradadeProdutosModel();

                        produto.setIdProduto(rs.getInt("idProduto"));
                        produto.setIdproduto_entrada(rs.getString("NomeProduto"));
                        produto.setQuantidadeProduto(rs.getInt("QuantidadeProduto"));
                        produto.setIdfornecedor_entrada(rs.getString("nomefornecedor"));

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

    //Adiciona a quantidade escolhida pelo usuário ao item selecionado na tabela
    public boolean adicionarQuantidade(String idProduto, int quantidadeAdicionada) {
        String sql = "UPDATE produtos SET QuantidadeProduto = QuantidadeProduto + ? WHERE idProduto = ?";
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
            System.err.println("Erro ao executar o método adicionarQuantidade:");
            e.printStackTrace();
        } finally {
            jbdcConnect.desconectar();
        }
        return false;
    }

    public boolean registrarEntradaProduto(String idProduto, int quantidadeEntrada, String idFornecedor, String idOperador) {
        String sql = "INSERT INTO entrada_de_produtos (idproduto_entrada, quantidadeProduto, idfornecedor_entrada, idoperador_entrada, dataEntrada) "
                + "VALUES (?, ?, ?, ?, CURRENT_TIMESTAMP)";
        JBDCConnect jbdcConnect = new JBDCConnect();

        try {
            if (jbdcConnect.conectar()) {
                Connection conn = jbdcConnect.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, idProduto);
                pstmt.setInt(2, quantidadeEntrada);
                pstmt.setString(3, idFornecedor);
                pstmt.setString(4, idOperador);

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

    //Atualiza o fornecedor do produto caso o usuário decida muda-lo
    public boolean atualizarFornecedorDoProduto(String idProduto, String novoFornecedor) {
        String sql = "UPDATE produtos "
                + "SET idFornecedor_produtos = ("
                + "    SELECT idfornecedor FROM fornecedor_floricultura WHERE nomefornecedor = ?"
                + ") "
                + "WHERE idProduto = ? AND EXISTS ("
                + "    SELECT 1 FROM fornecedor_floricultura WHERE nomefornecedor = ?"
                + ")";
        JBDCConnect jbdcConnect = new JBDCConnect();

        try {
            if (jbdcConnect.conectar()) {
                Connection conn = jbdcConnect.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, novoFornecedor);
                pstmt.setString(2, idProduto);
                pstmt.setString(3, novoFornecedor);

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

    public ArrayList<EntradaProdutosModel> filtrarProdutos(String colunaSelecionada, String valorPesquisa) {
        ArrayList<EntradaProdutosModel> listaProdutos = new ArrayList<>();

        String colunaSQL;
        switch (colunaSelecionada) {
            case "ID do Produto":
                colunaSQL = "p.idproduto";
                break;
            case "Nome do Produto":
                colunaSQL = "p.nomeproduto";
                break;
            case "Fornecedor":
                colunaSQL = "f.nomefornecedor";
                break;
            default:
                throw new IllegalArgumentException("Coluna inválida: " + colunaSelecionada);
        }

        String sql = "SELECT p.idProduto, p.NomeProduto, p.QuantidadeProduto, f.nomefornecedor "
                + "FROM produtos AS p "
                + "INNER JOIN fornecedor_floricultura AS f ON p.idFornecedor_produtos = f.idfornecedor "
                + "WHERE " + colunaSQL + " LIKE ?";

        JBDCConnect jbdcConnect = new JBDCConnect();
        try {
            if (jbdcConnect.conectar()) {
                PreparedStatement sentenca = jbdcConnect.getConnection().prepareStatement(sql);

                sentenca.setString(1, "%" + valorPesquisa + "%");

                ResultSet resultados = sentenca.executeQuery();

                while (resultados.next()) {
                    EntradaProdutosModel produto = new EntradaProdutosModel(
                            resultados.getString("idProduto"),
                            resultados.getString("NomeProduto"),
                            resultados.getInt("QuantidadeProduto"),
                            resultados.getString("nomefornecedor")
                    );
                    listaProdutos.add(produto);
                }

                sentenca.close();
                jbdcConnect.getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return listaProdutos;
    }

    

}
