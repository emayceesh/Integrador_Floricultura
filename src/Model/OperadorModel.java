/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pedro
 */
public class OperadorModel {
    private int idUser;
    private String nome;
    private String user;
    private String senha;
    
    public OperadorModel(){
        
    }
    
    public OperadorModel(String nome, String user){
        this.nome = nome;
        this.user = user;
    }
    
    public OperadorModel(int idUser,String nome, String user){
        this.idUser = idUser;
        this.nome = nome;
        this.user = user;
    }
    
    public int getidUser(){
        return idUser;
    }
    
    public void setidUser(int idUser){
            this.idUser = idUser;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return user;
    }
    
    public void setEmail(String user){
        this.user = user;
    }
    
}
