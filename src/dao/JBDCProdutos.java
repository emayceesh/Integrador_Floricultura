/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import Model.NomeIDCategoriaModel;
import Model.ProdutosModel;
import dao.JBDCConnect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patryk
 */
public class JBDCProdutos {
    private JBDCConnect conexao;

    public JBDCProdutos() {
        this.conexao = new JBDCConnect();
    }
   

    public void CadastroProdutos(ProdutosModel produto) {
        String sql = "INSERT INTO produtos (idFornecedor_produtos, idProdutoCategoria, NomeProduto, " +
             "QuantidadeProduto, PrecoProdutoUnitario, DescontoProduto, DescricaoProduto) " +
             "VALUES ((SELECT idFornecedor FROM ornecedor_floricultura WHERE nomefornecedor = ?), " +
             "(SELECT idCategoriaPrimaria FROM categoria_primaria WHERE NomeCategoria = ?), ?, ?, ?, ?, ?);";

        try {
            if (this.conexao.conectar()) {
                PreparedStatement ConexaoSentenca = this.conexao.getConnection().prepareStatement(sql);

                ConexaoSentenca.setString(1, produto.getIdFornecedorProdutos());
                ConexaoSentenca.setString(2, produto.getIdProdutoCategoria());
                ConexaoSentenca.setString(3, produto.getNomeProduto());
                ConexaoSentenca.setString(4, produto.getQuantidadeProduto());
                ConexaoSentenca.setInt(5, produto.getPrecoProdutoUnitario());
                ConexaoSentenca.setInt(6, produto.getDescontoProduto());
                ConexaoSentenca.setString(7, produto.getDescricaoProduto());

                ConexaoSentenca.execute();
                ConexaoSentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void AtualizarProduto(ProdutosModel produto) {
        String sql = "UPDATE produtos SET idFornecedor_produtos = ?, idProdutoCategoria = ?, NomeProduto = ?, " +
                     "QuantidadeProduto = ?, PrecoProdutoUnitario = ?, DescontoProduto = ?, DescricaoProduto = ? " +
                     "WHERE idProduto = ?";

        try {
            if (this.conexao.conectar()) {
                PreparedStatement ConexaoSentenca = this.conexao.getConnection().prepareStatement(sql);

                ConexaoSentenca.setString(1, produto.getIdFornecedorProdutos());
                ConexaoSentenca.setString(2, produto.getIdProdutoCategoria());
                ConexaoSentenca.setString(3, produto.getNomeProduto());
                ConexaoSentenca.setString(4, produto.getQuantidadeProduto());
                ConexaoSentenca.setInt(5, produto.getPrecoProdutoUnitario());
                ConexaoSentenca.setInt(6, produto.getDescontoProduto());
                ConexaoSentenca.setString(7, produto.getDescricaoProduto());
                ConexaoSentenca.setInt(8, produto.getIdProdutoPrimaria());

                ConexaoSentenca.execute();
                ConexaoSentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public ArrayList<ProdutosModel> MostrarListaProdutos() {
        ArrayList<ProdutosModel> ListaProdutos = new ArrayList<>();
        String sql = "SELECT \n" +
"    i.idProduto, \n" +
"    i.NomeProduto, \n" +
"    i.QuantidadeProduto, \n" +
"    i.PrecoProdutoUnitario, \n" +
"    i.DescontoProduto, \n" +
"    i.DescricaoProduto, \n" +
"    f.nomefornecedor,\n" +
"    c.NomeCategoria\n" +
"FROM produtos AS i\n" +
"LEFT JOIN fornecedor_floricultura AS f ON (f.idfornecedor = i.idFornecedor_produtos)\n" +
"LEFT JOIN categoria AS c ON (c.IdCategoria = i.idProdutoCategoria)\n" +
"ORDER BY i.idProduto;"; 

        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultado = sentenca.executeQuery();

                while (resultado.next()) {
                    ProdutosModel produto = new ProdutosModel();
                    produto.setIdProdutoPrimaria(resultado.getInt("idProduto"));
                    produto.setIdFornecedorProdutos(resultado.getString("nomefornecedor"));
                    produto.setIdProdutoCategoria(resultado.getString("NomeCategoria"));
                    produto.setNomeProduto(resultado.getString("NomeProduto"));
                    produto.setQuantidadeProduto(resultado.getString("QuantidadeProduto"));
                    produto.setPrecoProdutoUnitario(resultado.getInt("PrecoProdutoUnitario"));
                    produto.setDescontoProduto(resultado.getInt("DescontoProduto"));
                    produto.setDescricaoProduto(resultado.getString("DescricaoProduto"));

                    ListaProdutos.add(produto);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return ListaProdutos;
    }

    public void ExcluirProduto(int idProdutoPrimaria) {
        String sql = "DELETE FROM produtos WHERE idProduto = ?";

        try {
            if (this.conexao.conectar()) {
                PreparedStatement ConexaoSentenca = this.conexao.getConnection().prepareStatement(sql);
                ConexaoSentenca.setInt(1, idProdutoPrimaria);

                ConexaoSentenca.execute();
                ConexaoSentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public ArrayList <ProdutosModel> FiltrarProdutos(ProdutosModel produto) {

    ArrayList<ProdutosModel> ListaProduto = new ArrayList<ProdutosModel>();
    int ValorConsulta = produto.getValorConsulta();
    String ColunaSelecionada = null;

    // Seleciona a coluna a ser filtrada com base no valor da consulta
    switch(ValorConsulta) {
        case 0:
            ColunaSelecionada = "p.idProduto";
            break;
        case 1:
            ColunaSelecionada = "p.NomeProduto";
            break;
        case 2:
            ColunaSelecionada = "c.NomeCategoria";
            break;
        case 3:
            ColunaSelecionada = "f.nomefornecedor";
            break;
        case 4:
            ColunaSelecionada = "p.PrecoProdutoUnitario";
            break;
        case 5:
            ColunaSelecionada = "p.DescontoProduto";
            break;
    }

    // SQL para selecionar produtos com base na coluna filtrada
    String sql = "SELECT \n" +
    "    p.idProduto, \n" +
    "    p.NomeProduto, \n" +
    "    p.QuantidadeProduto, \n" +
    "    p.PrecoProdutoUnitario, \n" +
    "    p.DescontoProduto, \n" +
    "    p.DescricaoProduto, \n" +
    "    f.nomefornecedor, \n" +
    "    c.NomeCategoria\n" +
    "FROM \n" +
    "    produtos AS p \n" +
    "LEFT JOIN \n" +
    "    fornecedor_floricultura AS f ON f.idfornecedor = p.idFornecedor_produtos \n" +
    "LEFT JOIN \n" +
    "    categoria AS c ON c.IdCategoria = p.idProdutoCategoria \n" +
    "WHERE " + ColunaSelecionada + " LIKE ? \n" +
    "ORDER BY \n" +
    "    p.idProduto;";

   
    try {
        if (this.conexao.conectar()) {

            PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);

            // Setando o parâmetro da consulta com o valor de pesquisa
            switch(ValorConsulta) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    sentenca.setString(1, produto.getItemPesquisar());
                    break;
                case 6: // Filtro por fornecedor
                    sentenca.setString(1, produto.getIdFornecedorProdutos());
                    break;
                case 7: // Filtro por categoria do produto
                    sentenca.setString(1, produto.getIdProdutoCategoria());
                    break;
            }

            // Recebe o resultado da consulta
            ResultSet SentencaProdutos = sentenca.executeQuery();

            // Percorre cada linha do resultado
            while (SentencaProdutos.next()) {
                ProdutosModel produtoModel = new ProdutosModel();
                produtoModel.setIdProdutoPrimaria(SentencaProdutos.getInt("idProduto"));
                produtoModel.setNomeProduto(SentencaProdutos.getString("NomeProduto"));
                produtoModel.setQuantidadeProduto(SentencaProdutos.getString("QuantidadeProduto"));
                produtoModel.setPrecoProdutoUnitario(SentencaProdutos.getInt("PrecoProdutoUnitario"));
                produtoModel.setDescontoProduto(SentencaProdutos.getInt("DescontoProduto"));
                produtoModel.setDescricaoProduto(SentencaProdutos.getString("DescricaoProduto"));
                produtoModel.setIdFornecedorProdutos(SentencaProdutos.getString("nomefornecedor"));
                produtoModel.setIdProdutoCategoria(SentencaProdutos.getString("NomeCategoria"));

                ListaProduto.add(produtoModel);
            }

            sentenca.close();
            this.conexao.getConnection().close();
        }
        return ListaProduto;
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
}

    public ArrayList<ProdutosModel> ConsultaProduto(int IdProduto) {

    ArrayList<ProdutosModel> ProdutoSelecionado = new ArrayList<ProdutosModel>();
    String sql = "SELECT \n" +
    "    p.idProduto, \n" +
    "    p.NomeProduto, \n" +
    "    p.QuantidadeProduto, \n" +
    "    p.PrecoProdutoUnitario, \n" +
    "    p.DescontoProduto, \n" +
    "    p.DescricaoProduto, \n" +
    "    p.idFornecedor_produtos, \n" +
    "    p.idProdutoCategoria \n" +
    "FROM \n" +
    "    produtos AS p\n" +
    "WHERE \n" +
    "    p.idProduto = ?;";  // Filtro pelo idProduto

    try {
        if (this.conexao.conectar()) {
            PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);

            // Recebe o resultado da consulta
            sentenca.setInt(1, IdProduto); // Define o parâmetro do idProduto
            ResultSet SentencaProdutos = sentenca.executeQuery();

            // Percorre cada linha do resultado
            while (SentencaProdutos.next()) {
                // Resgata os dados de cada linha, selecionando pelo nome das colunas da tabela produtos
                ProdutosModel produtoModel = new ProdutosModel();
                produtoModel.setIdProdutoPrimaria(SentencaProdutos.getInt("idProduto"));
                produtoModel.setNomeProduto(SentencaProdutos.getString("NomeProduto"));
                produtoModel.setQuantidadeProduto(SentencaProdutos.getString("QuantidadeProduto"));
                produtoModel.setPrecoProdutoUnitario(SentencaProdutos.getInt("PrecoProdutoUnitario"));
                produtoModel.setDescontoProduto(SentencaProdutos.getInt("DescontoProduto"));
                produtoModel.setDescricaoProduto(SentencaProdutos.getString("DescricaoProduto"));
                produtoModel.setIdFornecedorProdutos(SentencaProdutos.getString("idFornecedor_produtos"));
                produtoModel.setIdProdutoCategoria(SentencaProdutos.getString("idProdutoCategoria"));

                ProdutoSelecionado.add(produtoModel);
            }

            sentenca.close();
            this.conexao.getConnection().close();
        }

        return ProdutoSelecionado;
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
}

}

