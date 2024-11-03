/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Produtos.entradaProdutos;
import Model.EntradaProdutosModel;
/**
 *
 * @author Patryk
 */
public class JBDCEntradadeProdutos {
    
    private JBDCConnect conexao;

    public JBDCEntradadeProdutos() {
        this.conexao = new JBDCConnect();
    }
}
