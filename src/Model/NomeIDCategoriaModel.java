/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Matheus
 */
public class NomeIDCategoriaModel {
    private int id;
    private String nome;

    public NomeIDCategoriaModel(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String IDNome = id + " " + nome;
        return IDNome; // Isso garante que o JComboBox mostre o nome
    }
}
