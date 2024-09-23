/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package floricultura.TelaInicial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import Clientes.CadastroCliente;
import floricultura.entrada_de_produtos;
import floricultura.saida_de_produtos;
import Clientes.CadastroCliente;
import Clientes.ConsultaClientes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

import Clientes.CadastroClientes;
import floricultura.TelaInicial.TelaBoasVindas;
import Clientes.ClientesPrincipal;

/**
 *
 * @author pedro
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        JButton [] btns = {Principal,RealizarVendaRapida,CadastroRapido,ConsultaRapida,CadastroProdutosRapido,ConsultaProdutosRapido,ConsultarVendas};
       for(JButton btn : btns){
           btn.setBackground(new Color(186,47,57));
           btn.setUI(new BasicButtonUI());
           btn.addMouseListener(new MouseListener(){
               @Override
               public void mouseClicked(MouseEvent e){
                   
               }
               @Override
               public void mousePressed(MouseEvent e){
                   
               }
               @Override 
                public void mouseReleased(MouseEvent e){
                   
               }
               @Override
               public void mouseEntered(MouseEvent e){
                    btn.setBackground(new Color(239,86,96));
               }
               @Override
               public void mouseExited(MouseEvent e){
                   btn.setBackground(new Color(186,47,57));
               }
           
           });
           }
       
       TelaBoasVindas TelaPrincipal = new TelaBoasVindas();
       ShowPanel(TelaPrincipal);
       
       
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuRapido = new javax.swing.JLabel();
        RealizarVendaRapida = new javax.swing.JButton();
        CadastroRapido = new javax.swing.JButton();
        ConsultaRapida = new javax.swing.JButton();
        CadastroProdutosRapido = new javax.swing.JButton();
        ConsultaProdutosRapido = new javax.swing.JButton();
        Principal = new javax.swing.JButton();
        Separator = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        ConsultarVendas = new javax.swing.JButton();
        Content = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        Produtos = new javax.swing.JMenu();
        CadastroProduto = new javax.swing.JMenuItem();
        ConsultaProduto = new javax.swing.JMenuItem();
        Clientes = new javax.swing.JMenu();
        CadastroCliente = new javax.swing.JMenuItem();
        ConsultaClientes = new javax.swing.JMenuItem();
        Vendas = new javax.swing.JMenu();
        ConsultaVendas = new javax.swing.JMenuItem();
        RealizarVenda = new javax.swing.JMenuItem();
        Categoria = new javax.swing.JMenu();
        CategoriasSubmenu = new javax.swing.JMenu();
        CadastroCategoria = new javax.swing.JMenuItem();
        VisualizarCategoria = new javax.swing.JMenuItem();
        SubCategoriasSubmenu = new javax.swing.JMenu();
        CadastroSubCategoria = new javax.swing.JMenuItem();
        VisualizarSubCategoria = new javax.swing.JMenuItem();
        Estoque = new javax.swing.JMenu();
        EntradaProdutos = new javax.swing.JMenuItem();
        SaidaProdutos = new javax.swing.JMenuItem();
        Logs = new javax.swing.JMenu();
        VisualizarLog = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 45, 45));

        jPanel1.setBackground(new java.awt.Color(218, 58, 68));

        MenuRapido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuRapido.setForeground(new java.awt.Color(242, 242, 242));
        MenuRapido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuRapido.setText("Menu Rápido:");

        RealizarVendaRapida.setBackground(new java.awt.Color(239, 86, 96));
        RealizarVendaRapida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RealizarVendaRapida.setForeground(new java.awt.Color(255, 255, 255));
        RealizarVendaRapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cash.png"))); // NOI18N
        RealizarVendaRapida.setText("Realizar Venda");
        RealizarVendaRapida.setBorderPainted(false);
        RealizarVendaRapida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RealizarVendaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVendaRapidaActionPerformed(evt);
            }
        });

        CadastroRapido.setBackground(new java.awt.Color(239, 86, 96));
        CadastroRapido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CadastroRapido.setForeground(new java.awt.Color(255, 255, 255));
        CadastroRapido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edit_1.png"))); // NOI18N
        CadastroRapido.setText("Cadastrar Cliente");
        CadastroRapido.setBorderPainted(false);
        CadastroRapido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroRapidoActionPerformed(evt);
            }
        });

        ConsultaRapida.setBackground(new java.awt.Color(239, 86, 96));
        ConsultaRapida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConsultaRapida.setForeground(new java.awt.Color(255, 255, 255));
        ConsultaRapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Person_1.png"))); // NOI18N
        ConsultaRapida.setText("Consultar Cliente");
        ConsultaRapida.setBorderPainted(false);
        ConsultaRapida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConsultaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaRapidaActionPerformed(evt);
            }
        });

        CadastroProdutosRapido.setBackground(new java.awt.Color(239, 86, 96));
        CadastroProdutosRapido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CadastroProdutosRapido.setForeground(new java.awt.Color(255, 255, 255));
        CadastroProdutosRapido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Box_1.png"))); // NOI18N
        CadastroProdutosRapido.setText("Cadastrar Produtos");
        CadastroProdutosRapido.setBorderPainted(false);
        CadastroProdutosRapido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastroProdutosRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroProdutosRapidoActionPerformed(evt);
            }
        });

        ConsultaProdutosRapido.setBackground(new java.awt.Color(239, 86, 96));
        ConsultaProdutosRapido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConsultaProdutosRapido.setForeground(new java.awt.Color(255, 255, 255));
        ConsultaProdutosRapido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Task.png"))); // NOI18N
        ConsultaProdutosRapido.setText("Consultar Produtos");
        ConsultaProdutosRapido.setBorderPainted(false);
        ConsultaProdutosRapido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Principal.setBackground(new java.awt.Color(239, 86, 96));
        Principal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Principal.setForeground(new java.awt.Color(255, 255, 255));
        Principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Smart Home Shield.png"))); // NOI18N
        Principal.setText("Home");
        Principal.setBorderPainted(false);
        Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalActionPerformed(evt);
            }
        });

        Separator.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Separator.setForeground(new java.awt.Color(255, 255, 255));
        Separator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Separator.setText("Sistema Floricultura");
        Separator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Casa da Planta");
        Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ConsultarVendas.setBackground(new java.awt.Color(239, 86, 96));
        ConsultarVendas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ConsultarVendas.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Task.png"))); // NOI18N
        ConsultarVendas.setText("Consultar Vendas");
        ConsultarVendas.setBorderPainted(false);
        ConsultarVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RealizarVendaRapida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuRapido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CadastroRapido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ConsultaRapida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CadastroProdutosRapido, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
            .addComponent(ConsultaProdutosRapido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Separator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ConsultarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(MenuRapido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RealizarVendaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastroProdutosRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultaProdutosRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );

        Produtos.setText("Produtos");

        CadastroProduto.setText("Cadastro de Produto");
        CadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroProdutoActionPerformed(evt);
            }
        });
        Produtos.add(CadastroProduto);

        ConsultaProduto.setText("Consultar Produto");
        Produtos.add(ConsultaProduto);

        jMenuBar.add(Produtos);

        Clientes.setText("Clientes");

        CadastroCliente.setText("Cadastrar Clientes");
        CadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroClienteActionPerformed(evt);
            }
        });
        Clientes.add(CadastroCliente);

        ConsultaClientes.setText("Consultar Clientes");
        ConsultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClientesActionPerformed(evt);
            }
        });
        Clientes.add(ConsultaClientes);

        jMenuBar.add(Clientes);

        Vendas.setText("Vendas");

        ConsultaVendas.setText("Consultar Vendas");
        Vendas.add(ConsultaVendas);

        RealizarVenda.setText("RealizarVendas");
        Vendas.add(RealizarVenda);

        jMenuBar.add(Vendas);

        Categoria.setText("Categorias");

        CategoriasSubmenu.setText("Categorias");

        CadastroCategoria.setText("Adicionar Categoria");
        CadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroCategoriaActionPerformed(evt);
            }
        });
        CategoriasSubmenu.add(CadastroCategoria);

        VisualizarCategoria.setText("Visualizar Categorias");
        VisualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarCategoriaActionPerformed(evt);
            }
        });
        CategoriasSubmenu.add(VisualizarCategoria);

        Categoria.add(CategoriasSubmenu);

        SubCategoriasSubmenu.setText("SubCategorias");

        CadastroSubCategoria.setText("Adicionar SubCategoria");
        CadastroSubCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroSubCategoriaActionPerformed(evt);
            }
        });
        SubCategoriasSubmenu.add(CadastroSubCategoria);

        VisualizarSubCategoria.setText("Visualizar SubCategorias");
        VisualizarSubCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarSubCategoriaActionPerformed(evt);
            }
        });
        SubCategoriasSubmenu.add(VisualizarSubCategoria);

        Categoria.add(SubCategoriasSubmenu);

        jMenuBar.add(Categoria);

        Estoque.setText("Estoque");

        EntradaProdutos.setText("Entrada de Produtos");
        EntradaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaProdutosActionPerformed(evt);
            }
        });
        Estoque.add(EntradaProdutos);

        SaidaProdutos.setText("Saida de Produtos");
        SaidaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaidaProdutosActionPerformed(evt);
            }
        });
        Estoque.add(SaidaProdutos);

        jMenuBar.add(Estoque);

        Logs.setText("Logs");

        VisualizarLog.setText("Visualizar Logs");
        Logs.add(VisualizarLog);

        jMenuBar.add(Logs);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroProdutoActionPerformed

    
    private void SaidaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaidaProdutosActionPerformed
        // TODO add your handling code here:
        new saida_de_produtos().setVisible(true);
    }//GEN-LAST:event_SaidaProdutosActionPerformed

    private void CadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroClienteActionPerformed

    private void EntradaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaProdutosActionPerformed
        // TODO add your handling code here:
        new entrada_de_produtos().setVisible(true);
    }//GEN-LAST:event_EntradaProdutosActionPerformed

    private void RealizarVendaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarVendaRapidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RealizarVendaRapidaActionPerformed

    private void CadastroRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroRapidoActionPerformed
        // TODO add your handling code here:
           CadastroClientes CdnClientes = new CadastroClientes();
        ShowPanel(CdnClientes);

    }//GEN-LAST:event_CadastroRapidoActionPerformed

    private void CadastroProdutosRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroProdutosRapidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroProdutosRapidoActionPerformed

    private void CadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroCategoriaActionPerformed
        // TODO add your handling code here:
        new AddCategoria().setVisible(true);
    }//GEN-LAST:event_CadastroCategoriaActionPerformed

    private void VisualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarCategoriaActionPerformed
        // TODO add your handling code here:
        new AddCategoria().setVisible(true);
    }//GEN-LAST:event_VisualizarCategoriaActionPerformed

    private void CadastroSubCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroSubCategoriaActionPerformed
        // TODO add your handling code here:
        new AddSubCategoria().setVisible(true);
    }//GEN-LAST:event_CadastroSubCategoriaActionPerformed

    private void VisualizarSubCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarSubCategoriaActionPerformed
        // TODO add your handling code here:
        new AddSubCategoria().setVisible(true);
    }//GEN-LAST:event_VisualizarSubCategoriaActionPerformed

    private void ConsultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClientesActionPerformed
        // TODO add your handling code here:
        new ConsultaClientes().setVisible(true);
    }//GEN-LAST:event_ConsultaClientesActionPerformed

    private void PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalActionPerformed
        // TODO add your handling code here:
        TelaBoasVindas TelaPrincipal = new TelaBoasVindas();
        ShowPanel(TelaPrincipal);
    }//GEN-LAST:event_PrincipalActionPerformed

    private void ConsultaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaRapidaActionPerformed
        // TODO add your handling code here:
        ClientesPrincipal CLPrincipal = new ClientesPrincipal();
        ShowPanel(CLPrincipal);
    }//GEN-LAST:event_ConsultaRapidaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    /**private void ShowPanel(JFrame p){;
        p.setSize(650, 557);
        p.setLocation(0,0);
        
        Content.removeAll();
        Content.add(p,BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    } */
    
    
    private void ShowPanel(JPanel p){
        p.setSize(799, 700);
        p.setLocation(0,0);
        
        Content.removeAll();
        Content.add(p, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastroCategoria;
    private javax.swing.JMenuItem CadastroCliente;
    private javax.swing.JMenuItem CadastroProduto;
    private javax.swing.JButton CadastroProdutosRapido;
    private javax.swing.JButton CadastroRapido;
    private javax.swing.JMenuItem CadastroSubCategoria;
    private javax.swing.JMenu Categoria;
    private javax.swing.JMenu CategoriasSubmenu;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenuItem ConsultaClientes;
    private javax.swing.JMenuItem ConsultaProduto;
    private javax.swing.JButton ConsultaProdutosRapido;
    private javax.swing.JButton ConsultaRapida;
    private javax.swing.JMenuItem ConsultaVendas;
    private javax.swing.JButton ConsultarVendas;
    private javax.swing.JPanel Content;
    private javax.swing.JMenuItem EntradaProdutos;
    private javax.swing.JMenu Estoque;
    private javax.swing.JMenu Logs;
    private javax.swing.JLabel MenuRapido;
    private javax.swing.JButton Principal;
    private javax.swing.JMenu Produtos;
    private javax.swing.JMenuItem RealizarVenda;
    private javax.swing.JButton RealizarVendaRapida;
    private javax.swing.JMenuItem SaidaProdutos;
    private javax.swing.JLabel Separator;
    private javax.swing.JMenu SubCategoriasSubmenu;
    private javax.swing.JLabel Titulo;
    private javax.swing.JMenu Vendas;
    private javax.swing.JMenuItem VisualizarCategoria;
    private javax.swing.JMenuItem VisualizarLog;
    private javax.swing.JMenuItem VisualizarSubCategoria;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}