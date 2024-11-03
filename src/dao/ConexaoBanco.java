package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Objeto

public class ConexaoBanco {

    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
//Construtor

    public ConexaoBanco() {
        this.servidor = "200.195.171.124";
        this.banco = "grupo07_integrador_floricultura";
        this.usuario = "grupo07";
        this.senha = "Vu9EIaowZuJ3mBsP";
    }

    public boolean conectar() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.usuario, this.senha);
            return true;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão: " + ex.getMessage(),ex);
        }
    }
    
    public void fecharConexao() {
        if (conexao != null) {
            try {
                conexao.close(); 
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar a conexão: " + ex.getMessage());
            }
        }
    }

}
