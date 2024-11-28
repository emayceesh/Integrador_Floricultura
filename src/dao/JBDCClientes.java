/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Model.ClientesModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class JBDCClientes {
    private JBDCConnect conexao;
   

    // Construtor da classe
    public JBDCClientes() {
        // Inicializa a conexão usando a classe JBDCConnect
        this.conexao = new JBDCConnect();
    }
            
    
    
    public void CadastroClientes(ClientesModel cadastroclientes){
        String sql = "INSERT INTO cliente_floricultura (nomecliente, telefonecliente, cepcliente,"
                + " enderecocliente, numerocliente, bairrocliente, UF, TipoDocumento,"
                + " Documento, email, cidadecliente) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
                
         try
        {
            //tenta realizar a conexão, se retornar verdadeiro entra no IF
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement ConexaoSentenca = this.conexao.getConnection().prepareStatement(sql);
                
                
                ConexaoSentenca.setString(1,cadastroclientes.getNomecliente()); 
                ConexaoSentenca.setString(2,cadastroclientes.getTelefonecliente());
                ConexaoSentenca.setString(3,cadastroclientes.getCepcliente()); 
                ConexaoSentenca.setString(4,cadastroclientes.getEnderecocliente());
                ConexaoSentenca.setString(5,cadastroclientes.getNumerocliente());
                ConexaoSentenca.setString(6,cadastroclientes.getBairrocliente());
                ConexaoSentenca.setString(7,cadastroclientes.getUf());
                ConexaoSentenca.setString(8,cadastroclientes.getTipoDocumento());
                ConexaoSentenca.setString(9,cadastroclientes.getDocumento());
                ConexaoSentenca.setString(10,cadastroclientes.getEmail());
                ConexaoSentenca.setString(11,cadastroclientes.getcidadecliente());
                
                ConexaoSentenca.execute(); //executa o comando no banco
                ConexaoSentenca.close(); //fecha a sentença
                this.conexao.getConnection().close(); //fecha a conexão com o banco
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }        
        
    }
    
    public void AtualizarCliete(ClientesModel cadastroclientes){
        String sql = "UPDATE cliente_floricultura as c SET c.nomecliente = ?,\n"
                + " c.telefonecliente = ?,\n"
                + " c.cepcliente = ?,\n"
                + " c.enderecocliente = ?,\n"
                + " c.numerocliente = ?,\n"
                + " c.bairrocliente = ?,\n"
                + " c.UF = ?,\n"
                + " c.TipoDocumento = ?,\n"
                + " c.Documento = ?,\n"
                + " c.email = ?,\n"
                + " c.cidadecliente = ?\n"
                + "WHERE c.idcliente = ?";
                
         try
        {
            //tenta realizar a conexão, se retornar verdadeiro entra no IF
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement ConexaoSentenca = this.conexao.getConnection().prepareStatement(sql);
                
                
                ConexaoSentenca.setString(1,cadastroclientes.getNomecliente()); 
                ConexaoSentenca.setString(2,cadastroclientes.getTelefonecliente());
                ConexaoSentenca.setString(3,cadastroclientes.getCepcliente()); 
                ConexaoSentenca.setString(4,cadastroclientes.getEnderecocliente());
                ConexaoSentenca.setString(5,cadastroclientes.getNumerocliente());
                ConexaoSentenca.setString(6,cadastroclientes.getBairrocliente());
                ConexaoSentenca.setString(7,cadastroclientes.getUf());
                ConexaoSentenca.setString(8,cadastroclientes.getTipoDocumento());
                ConexaoSentenca.setString(9,cadastroclientes.getDocumento());
                ConexaoSentenca.setString(10,cadastroclientes.getEmail());
                ConexaoSentenca.setString(11,cadastroclientes.getcidadecliente());
                ConexaoSentenca.setInt(12, cadastroclientes.getIdcliente());
                
                ConexaoSentenca.execute(); //executa o comando no banco
                ConexaoSentenca.close(); //fecha a sentença
                this.conexao.getConnection().close(); //fecha a conexão com o banco
                
                
                
            }
            
            
              
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }        
        
    }
    
    
    
    public ArrayList<ClientesModel> MostrarListaclientes() {

        ArrayList<ClientesModel> ListaClientes = new ArrayList<ClientesModel>();
        String sql = "SELECT \n" +
"    c.idcliente, \n" +
"    c.nomecliente, \n" +
"    c.telefonecliente, \n" +
"    c.cepcliente, \n" +
"    c.bairrocliente, \n" +
"    c.enderecocliente, \n" +
"    c.numerocliente, \n" +
"    c.uf, \n" +
"    c.tipoDocumento, \n" +
"    c.documento, \n" +
"    c.email, c.cidadecliente \n" +
"FROM \n" +
"    cliente_floricultura AS c\n" +
"ORDER BY \n" +
"    c.idcliente;";
        
        
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);

                //recebe o resultado da consulta
                ResultSet SentencaCLientes = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while (SentencaCLientes.next()) {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela Escola
                    ClientesModel ClientesModel = new ClientesModel();
                    ClientesModel.setIdcliente(SentencaCLientes.getInt("idcliente"));
                    ClientesModel.setNomecliente(SentencaCLientes.getString("nomecliente"));
                    ClientesModel.setTelefonecliente(SentencaCLientes.getString("telefonecliente"));
                    ClientesModel.setCepcliente(SentencaCLientes.getString("cepcliente"));
                    ClientesModel.setEnderecocliente(SentencaCLientes.getString("enderecocliente"));
                    ClientesModel.setNumerocliente(SentencaCLientes.getString("numerocliente"));
                    ClientesModel.setBairrocliente(SentencaCLientes.getString("bairrocliente"));
                    ClientesModel.setUf(SentencaCLientes.getString("UF"));
                    ClientesModel.setTipoDocumento(SentencaCLientes.getString("TipoDocumento"));
                    ClientesModel.setDocumento(SentencaCLientes.getString("Documento"));
                    ClientesModel.setEmail(SentencaCLientes.getString("Email"));
                    ClientesModel.setcidadecliente(SentencaCLientes.getString("cidadecliente"));
                  

                    ListaClientes.add(ClientesModel);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }

            return ListaClientes;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    
        public ArrayList<ClientesModel> ConsultaCliente(int IdCliente) {

        ArrayList<ClientesModel> ClienteSelecionado = new ArrayList<ClientesModel>();
                String sql = "SELECT \n" +
"    c.idcliente, \n" +
"    c.nomecliente, \n" +
"    c.telefonecliente, \n" +
"    c.cepcliente, \n" +
"    c.bairrocliente, \n" +
"    c.enderecocliente, \n" +
"    c.numerocliente, \n" +
"    c.uf, \n" +
"    c.tipoDocumento, \n" +
"    c.documento, \n" +
"    c.email, c.cidadecliente \n" +
"FROM \n" +
"    cliente_floricultura AS c\n" +
"WHERE \n" +
"    c.idcliente = ?;";
        
        
        
        try {
            if (this.conexao.conectar()) {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);

                //recebe o resultado da consulta
                sentenca.setInt(1,IdCliente);
                ResultSet SentencaCLientes = sentenca.executeQuery();
                
                //percorrer cada linha do resultado
                while (SentencaCLientes.next()) {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela Escola
                    ClientesModel ClientesModel = new ClientesModel();
                    ClientesModel.setIdcliente(SentencaCLientes.getInt("idcliente"));
                    ClientesModel.setNomecliente(SentencaCLientes.getString("nomecliente"));
                    ClientesModel.setTelefonecliente(SentencaCLientes.getString("telefonecliente"));
                    ClientesModel.setCepcliente(SentencaCLientes.getString("cepcliente"));
                    ClientesModel.setEnderecocliente(SentencaCLientes.getString("enderecocliente"));
                    ClientesModel.setNumerocliente(SentencaCLientes.getString("numerocliente"));
                    ClientesModel.setBairrocliente(SentencaCLientes.getString("bairrocliente"));
                    ClientesModel.setUf(SentencaCLientes.getString("UF"));
                    ClientesModel.setTipoDocumento(SentencaCLientes.getString("TipoDocumento"));
                    ClientesModel.setDocumento(SentencaCLientes.getString("Documento"));
                    ClientesModel.setEmail(SentencaCLientes.getString("Email"));
                    ClientesModel.setcidadecliente(SentencaCLientes.getString("cidadecliente"));

                    GuardarClienteSelecionado.setClienteSelecionado(ClienteSelecionado);
                    ClienteSelecionado.add(ClientesModel);
                }
                
                sentenca.close();
                this.conexao.getConnection().close();
            }

            return ClienteSelecionado;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void ExcluirCliente(ClientesModel IdClientes) {
        //string com a consulta que será executada no banco
        String sql = "DELETE FROM cliente_floricultura WHERE cliente_floricultura.idcliente = ?";
        
        try
        {
            //tenta realizar a conexão, se retornar verdadeiro entra no IF
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement ConexaoSentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //subtitui as interrograções da consulta, pelo valor específico
                ConexaoSentenca.setInt(1,IdClientes.getIdcliente()); //subsitui a primeira ocorrência da interrogação pelo atributo nome
                
                ConexaoSentenca.execute(); //executa o comando no banco
                ConexaoSentenca.close(); //fecha a sentença
                this.conexao.getConnection().close(); //fecha a conexão com o banco
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    
     public ArrayList <ClientesModel> FiltrarClientes(ClientesModel cadastro) {

        ArrayList<ClientesModel> ListaCliente = new ArrayList<ClientesModel>();
        int ValorConsulta = cadastro.getValorConsulta();
        String ColunaSelecionada = null;
        switch(ValorConsulta){
            case 0:
                ColunaSelecionada = "c.idcliente";
                break;
            case 1:
                ColunaSelecionada = "c.nomecliente";
                break;
            case 2:
                ColunaSelecionada = "c.telefonecliente";
                break;
            case 3:
                ColunaSelecionada = "c.Email";
                break;
            case 4:
                ColunaSelecionada = "c.Documento";
                break;
            case 5:
                ColunaSelecionada = "c.TipoDocumento";
                break;
        }
        String sql = "SELECT \n" +
"    c.idcliente, \n" +
"    c.nomecliente, \n" +
"    c.telefonecliente, \n" +
"    c.cepcliente, \n" +
"    c.bairrocliente, \n" +
"    c.enderecocliente, \n" +
"    c.numerocliente, \n" +
"    c.uf, \n" +
"    c.tipoDocumento, \n" +
"    c.documento, \n" +
"    c.email, c.cidadecliente \n" +
"FROM \n" +
"    cliente_floricultura AS c WHERE " + ColunaSelecionada + " = ? \n" +
"ORDER BY \n" +
"    c.idcliente;";
        try {
            if (this.conexao.conectar()) {

                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //idImovel, Nome, Locador, Locatário, CEP, MatrículaImóvel, Preço
               switch(ValorConsulta){
            case 0:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
            case 1:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
            case 2:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
            case 3:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
            case 4:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
            case 5:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
            case 6:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
            case 7:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
            case 8:
                sentenca.setString(1,cadastro.getItemPesquisar());
                break;
        }

                //recebe o resultado da consulta
                ResultSet SentencaCLientes = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while (SentencaCLientes.next()) {
                    ClientesModel ClientesModel = new ClientesModel();
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela 
                    ClientesModel.setIdcliente(SentencaCLientes.getInt("idcliente"));
                    ClientesModel.setNomecliente(SentencaCLientes.getString("nomecliente"));
                    ClientesModel.setTelefonecliente(SentencaCLientes.getString("telefonecliente"));
                    ClientesModel.setCepcliente(SentencaCLientes.getString("cepcliente"));
                    ClientesModel.setEnderecocliente(SentencaCLientes.getString("enderecocliente"));
                    ClientesModel.setNumerocliente(SentencaCLientes.getString("numerocliente"));
                    ClientesModel.setBairrocliente(SentencaCLientes.getString("bairrocliente"));
                    ClientesModel.setUf(SentencaCLientes.getString("UF"));
                    ClientesModel.setTipoDocumento(SentencaCLientes.getString("TipoDocumento"));
                    ClientesModel.setDocumento(SentencaCLientes.getString("Documento"));
                    ClientesModel.setEmail(SentencaCLientes.getString("Email"));
                    ClientesModel.setcidadecliente(SentencaCLientes.getString("cidadecliente"));
                    

                    ListaCliente.add(ClientesModel);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }

           
            return ListaCliente;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
     
     
    public class GuardarClienteSelecionado {

        private static ArrayList<ClientesModel> ClienteSelecionado = new ArrayList<>();

        public static ArrayList<ClientesModel> getClienteSelecionado() {
            return ClienteSelecionado;
        }

        public static void setClienteSelecionado(ArrayList<ClientesModel> Cliente) {
            ClienteSelecionado = Cliente;
        }
    }
}
