/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Patryk
 */
public class JBDCConnect {
    
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    public JBDCConnect(){
    this.servidor = "200.195.171.124";
    this.banco = "grupo07_integrador_floricultura";
    this.usuario = "grupo07";
    this.senha = "Vu9EIaowZuJ3mBsP";
    }
     public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return this.conexao != null ;
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
        
    }
    public Connection getConnection() {
        return conexao;
    }
    
    public void desconectar() {
        try {
            if (this.conexao != null && !this.conexao.isClosed()) {
                this.conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Exibe a pilha de erros se falhar ao fechar
        }
    }
           
}
