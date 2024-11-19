/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Produtos;


import dao.JBDCConnect;
import TelaInicial.TelaBoasVindas;
import dao.JBDCEntradadeProdutos;
import Model.EntradaProdutosModel;
import Model.NomeIDCategoriaModel;
import Model.NomeIDOperadorModel;
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author Patryk
 */
public class entradaProdutos extends javax.swing.JPanel {

    /**
     * Creates new form entradaProdutos
     */
    public entradaProdutos() {
        initComponents();
        carregarCategoriasNaCB();
        carregarOperadoresNaCB();
    }

    private void carregarCategoriasNaCB() {
        JBDCConnect jbdcConnect = new JBDCConnect(); // Supondo que você tenha um construtor padrão

        if (jbdcConnect.conectar()) {
            List<NomeIDCategoriaModel> categorias = null;
            try {

                JBDCEntradadeProdutos cadastroCategoriasDao = new JBDCEntradadeProdutos(jbdcConnect.getConnection());

                categorias = cadastroCategoriasDao.getCategorias();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {

                jbdcConnect.desconectar();
            }

            if (categorias != null) {
                for (NomeIDCategoriaModel categoria : categorias) {
                    categoriaProdutoCB.addItem(categoria);
                }
            }
        } else {
            System.out.println("Falha ao conectar ao banco de dados.");
        }
    }

    private void carregarOperadoresNaCB() {
        JBDCConnect jbdcConnect = new JBDCConnect();

        if (jbdcConnect.conectar()) {
            List<NomeIDOperadorModel> operadores = null;
            try {

                JBDCEntradadeProdutos cadastroOperadoresDao = new JBDCEntradadeProdutos(jbdcConnect.getConnection());

                operadores = cadastroOperadoresDao.getIDNomeOperador();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {

                jbdcConnect.desconectar();
            }

            if (operadores != null) {
                for (NomeIDOperadorModel operador : operadores) {
                    operadorEntradanaCB.addItem(operador);
                }
            }
        } else {
            System.out.println("Falha ao conectar ao banco de dados.");
        }

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        TituloLabel2 = new javax.swing.JLabel();
        TituloLabel3 = new javax.swing.JLabel();
        Retornar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        adicionarProduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        categoriaProdutoCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        qtdProduto = new javax.swing.JTextField();
        operadorEntradanaCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nomeProdutoEntrada = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(815, 589));

        jPanel2.setBackground(new java.awt.Color(185, 35, 44));

        TituloLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TituloLabel2.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloLabel2.setText("Entrada de Produtos");

        TituloLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TituloLabel3.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloLabel3.setText("Casa da Planta");

        Retornar.setBackground(new java.awt.Color(185, 35, 44));
        Retornar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Retornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Back To_1.png"))); // NOI18N
        Retornar.setBorder(null);
        Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        adicionarProduto.setBackground(new java.awt.Color(239, 86, 96));
        adicionarProduto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        adicionarProduto.setForeground(new java.awt.Color(255, 255, 255));
        adicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edit_1.png"))); // NOI18N
        adicionarProduto.setText("Adicionar Produto");
        adicionarProduto.setBorderPainted(false);
        adicionarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarProdutoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Adicionar Produtos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Aqui é possível dar entrada em novos produtos.");

        categoriaProdutoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaProdutoCBActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("ID - Categoria");

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Quantidade");

        qtdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdProdutoActionPerformed(evt);
            }
        });
        qtdProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtdProdutoKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Operador");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produtos", "Quantidade", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nome do Produto");

        nomeProdutoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdutoEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(categoriaProdutoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(164, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(operadorEntradanaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nomeProdutoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeProdutoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoriaProdutoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operadorEntradanaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGap(39, 39, 39)
                .addComponent(adicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(TituloLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(Retornar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TituloLabel2)))
                        .addGap(0, 364, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Retornar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloLabel3)
                .addGap(67, 67, 67)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornarActionPerformed
        TelaBoasVindas TelaInicial = new TelaBoasVindas();
        ShowPanel(TelaInicial);        // TODO add your handling code here:
    }//GEN-LAST:event_RetornarActionPerformed

    private void adicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarProdutoActionPerformed

        

    }//GEN-LAST:event_adicionarProdutoActionPerformed

    private void qtdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdProdutoActionPerformed

    private void qtdProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtdProdutoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit((c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_qtdProdutoKeyTyped

    private void categoriaProdutoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaProdutoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaProdutoCBActionPerformed

    private void nomeProdutoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProdutoEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retornar;
    private javax.swing.JLabel TituloLabel2;
    private javax.swing.JLabel TituloLabel3;
    private javax.swing.JButton adicionarProduto;
    private javax.swing.JComboBox<NomeIDCategoriaModel> categoriaProdutoCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeProdutoEntrada;
    private javax.swing.JComboBox<NomeIDOperadorModel> operadorEntradanaCB;
    private javax.swing.JTextField qtdProduto;
    // End of variables declaration//GEN-END:variables

    private void ShowPanel(TelaBoasVindas TelaInicial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
