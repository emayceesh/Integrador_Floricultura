/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Patryk
 */
public class ProdutosModel {

    private int idProdutoPrimaria;
    private String idFornecedorProdutos;
    private String idProdutoCategoria;
    private String nomeProduto;
    private String quantidadeProduto;
    private int precoProdutoUnitario;
    private int descontoProduto;
    private String descricaoProduto;
    private String itempesquisar;
    private int valorconsulta;

    public ProdutosModel(){
        
    }
    
    public ProdutosModel(String idFornecedorProdutos, String idProdutoCategoria, 
                   String nomeProduto, String quantidadeProduto, 
                   int precoProdutoUnitario, int descontoProduto, String descricaoProduto) {
        this.idFornecedorProdutos = idFornecedorProdutos;
        this.idProdutoCategoria = idProdutoCategoria;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProdutoUnitario = precoProdutoUnitario;
        this.descontoProduto = descontoProduto;
        this.descricaoProduto = descricaoProduto;
    }
    
    public ProdutosModel(int idProdutoPrimaria, String idFornecedorProdutos, String idProdutoCategoria, 
                   String nomeProduto, String quantidadeProduto, 
                   int precoProdutoUnitario, int descontoProduto, String descricaoProduto) {
        this.idProdutoPrimaria = idProdutoPrimaria;
        this.idFornecedorProdutos = idFornecedorProdutos;
        this.idProdutoCategoria = idProdutoCategoria;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProdutoUnitario = precoProdutoUnitario;
        this.descontoProduto = descontoProduto;
        this.descricaoProduto = descricaoProduto;
    }

    // Getters e Setters
    public int getIdProdutoPrimaria() {
        return idProdutoPrimaria;
    }

    public void setIdProdutoPrimaria(int idProdutoPrimaria) {
        this.idProdutoPrimaria = idProdutoPrimaria;
    }

    public String getIdFornecedorProdutos() {
        return idFornecedorProdutos;
    }

    public void setIdFornecedorProdutos(String idFornecedorProdutos) {
        this.idFornecedorProdutos = idFornecedorProdutos;
    }

    public String getIdProdutoCategoria() {
        return idProdutoCategoria;
    }

    public void setIdProdutoCategoria(String idProdutoCategoria) {
        this.idProdutoCategoria = idProdutoCategoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public int getPrecoProdutoUnitario() {
        return precoProdutoUnitario;
    }

    public void setPrecoProdutoUnitario(int precoProdutoUnitario) {
        this.precoProdutoUnitario = precoProdutoUnitario;
    }

    public int getDescontoProduto() {
        return descontoProduto;
    }

    public void setDescontoProduto(int descontoProduto) {
        this.descontoProduto = descontoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
     public int getValorConsulta() {
        return valorconsulta;
    }

    public void setValorConsulta(int valorconsulta) {
        this.valorconsulta = valorconsulta;
    }
    
     public String getItemPesquisar() {
        return itempesquisar;
    }

    public void setItemPesquisar(String itempesquisar) {
        this.itempesquisar = itempesquisar;
    }
   }
