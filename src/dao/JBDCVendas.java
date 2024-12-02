/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Model.VendasModel;
import java.sql.Date;
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
    
    public void RealizarVenda(VendasModel realizavendas) {
        String sql = "INSERT INTO vendas (idvenda,"
                + "idcliente"
                + "operador_venda"
                + "produto_venda"
                + "quantidadeVenda"
                + "codigoVenda"
                + "dataVenda) VALUES (?,?,?,?,?,?,?);";
        
        try {
            if(this.conexao.conectar()){
            PreparedStatement ConexaoSentenca = this.conexao.getConnection().prepareStatement(sql);
            
                ConexaoSentenca.setInt(1, realizavendas.getIdvenda());
                ConexaoSentenca.setInt(2, realizavendas.getIdcliente());
                ConexaoSentenca.setString(3, realizavendas.getOperador_venda());
                ConexaoSentenca.setString(4, realizavendas.getProduto_venda());
                ConexaoSentenca.setString(5, realizavendas.getQuantidade_venda());
                ConexaoSentenca.setString(6, realizavendas.getCodigo_venda());
                ConexaoSentenca.setString(7,  realizavendas.getDataVenda());
                
                ConexaoSentenca.execute();
                ConexaoSentenca.close();
                this.conexao.getConnection().close();
            }
        }catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public ArrayList<VendasModel> MostrarListavendas() {
        
        ArrayList<VendasModel> ListaVendas = new ArrayList<VendasModel>();
        String sql = "Select \n"
                + "v.idvenda, \n"
                + "v.idcliente, \n"
                + "v.operador_venda, \n"
                + "v.produto_venda, \n"
                + "v.quantidade_venda, \n"
                + "v.codigoVenda, \n"
                + "v.dataVenda \n"
                + "FROM \n"
                + "Vendas as v\n"
                + "ORDER BY \n"
                + "     v.idvenda;";
        
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                ResultSet SentencaVendas = sentenca.executeQuery();
                
                while (SentencaVendas.next()) {
                    VendasModel VendasModel = new VendasModel();
                    VendasModel.setIdvenda(SentencaVendas.getInt("idvenda"));
                    VendasModel.setIdcliente(SentencaVendas.getInt("idcliente"));
                    VendasModel.setOperador_venda(SentencaVendas.getString("operador_venda"));
                    VendasModel.setProduto_venda(SentencaVendas.getString("produto_venda"));
                    VendasModel.setQuantidade_venda(SentencaVendas.getString("quantidade_venda"));
                    VendasModel.setCodigo_venda(SentencaVendas.getString("codigoVenda"));
                    VendasModel.setDataVenda(SentencaVendas.getString("dataVenda"));
                    
                    ListaVendas.add(VendasModel);
                }
                
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }
    
    public ArrayList<VendasModel> ConsultaVenda(int idvenda) {
        ArrayList<VendasModel> VendaSelecionada = new ArrayList<VendasModel>();
        String sql = "Select \n"
                + "v.idvenda, \n"
                + "v.idcliente, \n"
                + "v.operador_venda, \n"
                + "v.produto_venda, \n"
                + "v.quantidade_venda, \n"
                + "v.codigoVenda, \n"
                + "v.dataVenda \n"
                + "FROM \n"
                + "Vendas as v\n"
                + "ORDER BY \n"
                + "     v.idvenda;";
        
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setInt(1, idvenda);
                ResultSet SentencaVendas = sentenca.executeQuery();
                
                while (SentencaVendas.next()) {
                    VendasModel VendasModel = new VendasModel();
                    VendasModel.setIdvenda(SentencaVendas.getInt("idvenda"));
                    VendasModel.setIdcliente(SentencaVendas.getInt("idcliente"));
                    VendasModel.setOperador_venda(SentencaVendas.getString("operador_venda"));
                    VendasModel.setProduto_venda(SentencaVendas.getString("produto_venda"));
                    VendasModel.setQuantidade_venda(SentencaVendas.getString("quantidade_venda"));
                    VendasModel.setCodigo_venda(SentencaVendas.getString("codigoVenda"));
                    VendasModel.setDataVenda(SentencaVendas.getString("dataVenda"));
                    
                    GuardarVendaSelecionada.setVendaSelecionada(VendaSelecionada);
                    VendaSelecionada.add(VendasModel);
                }
                
                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return VendaSelecionada;
        }catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void ExcluirVenda(VendasModel idvenda) {
        String sql = "DELETE FROM vendas WHERE vendas.idvenda= ?";
        
        try {
            if(this.conexao.conectar()) {
                PreparedStatement ConexaoSentenca = this.conexao.getConnection().prepareStatement(sql);
                
                ConexaoSentenca.setInt(1, idvenda.getIdvenda());
                
                ConexaoSentenca.execute();
                ConexaoSentenca.close();
                this.conexao.getConnection().close();
            }
        }catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public ArrayList<VendasModel> FiltrarVendas(VendasModel vendas) {
        
        ArrayList<VendasModel> ListaVenda = new ArrayList<VendasModel>();
        int ValorConsulta = vendas.getValor_Consulta();
        String ColunaSelecionada = null;
        
        switch(ValorConsulta) {
            case 0:
                ColunaSelecionada = "v.idvenda";
                break;
            case 1:
                ColunaSelecionada = "v.idcliente";
                break;
            case 2:
                ColunaSelecionada = "v.operador_venda";
                break;
            case 3:
                ColunaSelecionada = "v.produto_venda";
                break;
            case 4:
                ColunaSelecionada = "v.quantidade_venda";
                break;
            case 5:
                ColunaSelecionada = "v.quantidade_venda";
                break;
            case 6:
                ColunaSelecionada = "v.codigoVenda";
                break;
            case 7:
                ColunaSelecionada = "v.dataVenda";
                break;
        }
        String sql = "Select \n"
                + "v.idvenda, \n"
                + "v.idcliente, \n"
                + "v.operador_venda, \n"
                + "v.produto_venda, \n"
                + "v.quantidade_venda, \n"
                + "v.codigoVenda, \n"
                + "v.dataVenda \n"
                + "FROM \n"
                + "Vendas as v\n"
                + "ORDER BY \n"
                + "     v.idvenda;";
        
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                switch(ValorConsulta) {
                    case 0:
                        sentenca.setString(1, vendas.getItem_Pesquisado());
                        break;
                    case 1:
                        sentenca.setString(1, vendas.getItem_Pesquisado());
                        break;
                    case 2:
                        sentenca.setString(1, vendas.getItem_Pesquisado());
                        break;
                    case 3:
                        sentenca.setString(1, vendas.getItem_Pesquisado());
                        break;
                    case 4:
                        sentenca.setString(1, vendas.getItem_Pesquisado());
                        break;
                    case 5:
                        sentenca.setString(1, vendas.getItem_Pesquisado());
                        break;
                    case 6:
                        sentenca.setString(1, vendas.getItem_Pesquisado());
                        break;
                    case 7:
                        sentenca.setString(1, vendas.getItem_Pesquisado());
                        break;
                }
                
                ResultSet SentencaVendas = sentenca.executeQuery();
                
                while(SentencaVendas.next()) {
                    VendasModel VendasModel = new VendasModel();
                    VendasModel.setIdvenda(SentencaVendas.getInt("idvenda"));
                    VendasModel.setIdcliente(SentencaVendas.getInt("idcliente"));
                    VendasModel.setOperador_venda(SentencaVendas.getString("operador_venda"));
                    VendasModel.setProduto_venda(SentencaVendas.getString("produto_venda"));
                    VendasModel.setQuantidade_venda(SentencaVendas.getString("quantidade_venda"));
                    VendasModel.setCodigo_venda(SentencaVendas.getString("codigoVenda"));
                    VendasModel.setDataVenda(SentencaVendas.getString("dataVenda"));
                    
                    ListaVenda.add(VendasModel);
                }
                
                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return ListaVenda;
        }catch(SQLException ex) {
            throw new RuntimeException(ex);
        }   
    }
    
    public class GuardarVendaSelecionada {
        private static ArrayList<VendasModel> VendaSelecionada = new ArrayList<>();
        
        public static ArrayList<VendasModel> getVendaSelecionada() {
            return VendaSelecionada;
        }
        
        public static void setVendaSelecionada(ArrayList<VendasModel> Venda) {
            VendaSelecionada = Venda;
        }
    }
    
}
