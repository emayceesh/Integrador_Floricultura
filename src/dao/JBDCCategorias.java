/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.NomeIDCategoriaModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class JBDCCategorias {

    private JBDCConnect conexao;

    public JBDCCategorias() {
        this.conexao = new JBDCConnect();
    }

    public ArrayList<NomeIDCategoriaModel> getCategorias() {
        ArrayList<NomeIDCategoriaModel> categorias = new ArrayList<>();
        String sql = "SELECT IdCategoria,NomeCategoria FROM categoria";

        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                 ResultSet SentecaCategoria = sentenca.executeQuery();
                 
                 while (SentecaCategoria.next()) {
                     NomeIDCategoriaModel CategoriaModel = new NomeIDCategoriaModel();
                     CategoriaModel.setId(SentecaCategoria.getInt("IdCategoria"));
                     CategoriaModel.setNome(SentecaCategoria.getString("NomeCategoria"));
                     
                     categorias.add(CategoriaModel);
                }
                 
                 sentenca.close();
                this.conexao.getConnection().close();
            }
            return categorias;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categorias;
    }
    
    public void  AdicionarCategoria(NomeIDCategoriaModel AdicionarCategoriaModel) {
        String sql = "INSERT into categoria (NomeCategoria) VALUES (?);";

        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                 
                 sentenca.setString(1,AdicionarCategoriaModel.getNome());
                 
                 sentenca.execute();
                 sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }
    
    public void  ExcluirCategoria(NomeIDCategoriaModel IdCategoria) {
        String sql = "DELETE FROM categoria WHERE IdCategoria = ?";

        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                 
                 sentenca.setInt(1,IdCategoria.getId());
                 
                 sentenca.execute();
                 sentenca.close();
                this.conexao.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

}
