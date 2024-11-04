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
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class JBDCCategorias {

    private Connection conexao;

    public JBDCCategorias(Connection conexao) {
        this.conexao = conexao;
    }

    //Recupera ID e NOME das categorias 
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

}
