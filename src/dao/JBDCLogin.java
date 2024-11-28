/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.OperadorModel;
import TelaInicial.TelaBoasVindas;
import TelaInicial.TelaInicial;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author pedro
 */
public class JBDCLogin {
    
    private JBDCConnect conexao;
   

    // Construtor da classe
    public JBDCLogin() {
        // Inicializa a conexão usando a classe JBDCConnect
        this.conexao = new JBDCConnect();
    }
   
    public boolean AuthRegistro(String User, String Senha){
        ArrayList<OperadorModel> Autenticado = new ArrayList<OperadorModel>();
        String sql = "SELECT u.idoperador, u.nomeoperador, u.usuariosistema "
                + "FROM usuario_sistema_floricultura as u WHERE usuariosistema = ? AND senhasistema = ? ";
        
        try{
            
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement banco = this.conexao.getConnection().prepareStatement(sql);
                
                //subtitui as interrograções da consulta, pelo valor específico //subsitui a primeira ocorrência da interrogação pelo atributo nome
                banco.setString(1,User);
                banco.setString(2,Senha); 
                
                ResultSet resultadoConsulta = banco.executeQuery();
                
                if(resultadoConsulta.next()){

                    OperadorModel UserAutenticado = new OperadorModel();
                    UserAutenticado.setidUser(resultadoConsulta.getInt("idoperador"));
                    UserAutenticado.setNome(resultadoConsulta.getString("nomeoperador"));
                    UserAutenticado.setEmail(resultadoConsulta.getString("usuariosistema"));
                    
                   
                    
                    resultadoConsulta.close();
                    banco.close();
                    this.conexao.getConnection().close();
                   
                    return true;
                }else{
                     JOptionPane.showMessageDialog(null, "Não foi possível conectar, Usuário ou senha Incorretos!", "",  JOptionPane.INFORMATION_MESSAGE);
                      resultadoConsulta.close();
                     banco.close();
                     this.conexao.getConnection().close();
                     return false;
                }
                
                
            }
                
            
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return false;
    }
}
