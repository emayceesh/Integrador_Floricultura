/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Patryk
 */
public class EntradaProdutosModel {

    private String produtosExistentesCB;
    private String categoriaProdutoCB;
    private String fornecedorProduto;
    private String operadorEntradaProduto;
    private int qtdProduto;
    

    public EntradaProdutosModel(String produtosExistentesCB, String categoriaProdutoCB, String fornecedorProduto, String operadorEntradaProduto, int qtdProduto) {
        this.produtosExistentesCB = produtosExistentesCB;
        this.categoriaProdutoCB = categoriaProdutoCB;
        this.fornecedorProduto = fornecedorProduto;
        this.operadorEntradaProduto = operadorEntradaProduto;
        this.qtdProduto = qtdProduto;
    }

    //Getters
    
    public String getProdutosExistentesCB() {
        return produtosExistentesCB;
    }
    public String getCategoriaProdutoCB() {
        return categoriaProdutoCB;
    }

    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    public String getOperadorEntradaProduto() {
        return operadorEntradaProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    //Setters
    public void setProdutosExistentesCB(String produtosExistentesCB) {
        this.produtosExistentesCB = produtosExistentesCB;
    }

    public void setCategoriaProdutoCB(String categoriaProdutoCB) {
        this.categoriaProdutoCB = categoriaProdutoCB;
    }

    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }

    public void setOperadorEntradaProduto(String operadorEntradaProduto) {
        this.operadorEntradaProduto = operadorEntradaProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

}
