/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Produtos;

import dao.JBDCConnect;
import TelaInicial.TelaBoasVindas;
import dao.JBDCEntradadeProdutos;
import Model.NomeIDProdutosModel;
import Model.EntradaProdutosModel;
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
        carregarProdutosNaCB();
    }

    private void carregarProdutosNaCB() {
        JBDCConnect jbdcConnect = new JBDCConnect();

        if (jbdcConnect.conectar()) {
            List<NomeIDProdutosModel> produtos = null;
            try {

                JBDCEntradadeProdutos cadastroProdutosDao = new JBDCEntradadeProdutos(jbdcConnect.getConnection());

                produtos = cadastroProdutosDao.getNomesDosProdutos();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Sempre desconecte após terminar
                jbdcConnect.desconectar();
            }

            // Adicione os produtos ao JComboBox
            if (produtos != null) {
                for (NomeIDProdutosModel produto : produtos) {
                    produtosExistentesCB.addItem(produto);
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
        cadastrar_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fornecedorProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        operadorEntradaProduto = new javax.swing.JTextField();
        categoriaProdutoCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        qtdProduto = new javax.swing.JTextField();
        produtosExistentesCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

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

        cadastrar_button.setBackground(new java.awt.Color(239, 86, 96));
        cadastrar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cadastrar_button.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edit_1.png"))); // NOI18N
        cadastrar_button.setText("Adicionar Produto");
        cadastrar_button.setBorderPainted(false);
        cadastrar_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Adicionar Produtos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Aqui é possível dar entrada em novos produtos.");

        fornecedorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorProdutoActionPerformed(evt);
            }
        });
        fornecedorProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fornecedorProdutoKeyTyped(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Fornecedor");

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Operador");

        operadorEntradaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadorEntradaProdutoActionPerformed(evt);
            }
        });
        operadorEntradaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                operadorEntradaProdutoKeyTyped(evt);
            }
        });

        categoriaProdutoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plantas", "Cactos", "Arbustos" }));
        categoriaProdutoCB.setSelectedIndex(-1);
        categoriaProdutoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaProdutoCBActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Categoria");

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
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

        produtosExistentesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosExistentesCBActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Produtos Existentes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cadastrar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(fornecedorProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(produtosExistentesCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(categoriaProdutoCB, 0, 140, Short.MAX_VALUE)
                                                .addComponent(operadorEntradaProduto))
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtosExistentesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaProdutoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operadorEntradaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(cadastrar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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
                        .addGap(0, 467, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Retornar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloLabel3)
                .addGap(67, 67, 67)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cadastrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_buttonActionPerformed
        String[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(
                this,
                "Produto Adicionado!" + "\n"
                + "Nome: " + produtosExistentesCB.getSelectedItem() + "\n"
                + "Quantidade: " + qtdProduto.getText() + "\n"
                + "Fornecedor: " + fornecedorProduto.getText() + "\n"
                + "Operador: " + operadorEntradaProduto.getText() + "\n"
                + "Categoria: " + categoriaProdutoCB.getSelectedItem() + "\n\n\n"
                + "Cadastrar novo produto?" + "\n",
                "Confirmação de Cadastro",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                options,
                options[0]);
        if (resposta == 1) {
            TelaBoasVindas TelaInicial = new TelaBoasVindas();
            ShowPanel(TelaInicial);
        } else {
            produtosExistentesCB.setSelectedItem(-1);
            qtdProduto.setText("");

            fornecedorProduto.setText("");
            operadorEntradaProduto.setText("");
            categoriaProdutoCB.setSelectedIndex(-1);
            cadastrar_button.requestFocus();
        }
    }//GEN-LAST:event_cadastrar_buttonActionPerformed

    private void fornecedorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorProdutoActionPerformed

    private void fornecedorProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fornecedorProdutoKeyTyped
        char keyPress = evt.getKeyChar();
        if (!Character.isAlphabetic(keyPress) && keyPress != ' ') {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorProdutoKeyTyped

    private void operadorEntradaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadorEntradaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operadorEntradaProdutoActionPerformed

    private void operadorEntradaProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_operadorEntradaProdutoKeyTyped
        char keyPress = evt.getKeyChar();
        if (!Character.isAlphabetic(keyPress) && keyPress != ' ') {
            evt.consume();
        }                // TODO add your handling code here:
    }//GEN-LAST:event_operadorEntradaProdutoKeyTyped

    private void qtdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdProdutoActionPerformed

    private void qtdProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtdProdutoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit((c))) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_qtdProdutoKeyTyped

    private void produtosExistentesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosExistentesCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtosExistentesCBActionPerformed

    private void categoriaProdutoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaProdutoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaProdutoCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retornar;
    private javax.swing.JLabel TituloLabel2;
    private javax.swing.JLabel TituloLabel3;
    private javax.swing.JButton cadastrar_button;
    private javax.swing.JComboBox<String> categoriaProdutoCB;
    private javax.swing.JTextField fornecedorProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField operadorEntradaProduto;
    private javax.swing.JComboBox<NomeIDProdutosModel> produtosExistentesCB;
    private javax.swing.JTextField qtdProduto;
    // End of variables declaration//GEN-END:variables

    private void ShowPanel(TelaBoasVindas TelaInicial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
