/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package floricultura;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class entrada_de_produtos extends javax.swing.JFrame {

    /** Creates new form floricultura_tela */
    public entrada_de_produtos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome_produto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qtd_produto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        data_entrada_produto = new javax.swing.JFormattedTextField();
        fornecedor_produto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        operador_entrada_produto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        categoria_produto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cadastrar_button = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Entrada de Produtos");

        nome_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_produtoActionPerformed(evt);
            }
        });
        nome_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nome_produtoKeyTyped(evt);
            }
        });

        jLabel2.setText("Nome do Produto");

        jLabel3.setText("Quantidade");

        qtd_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtd_produtoActionPerformed(evt);
            }
        });
        qtd_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtd_produtoKeyTyped(evt);
            }
        });

        jLabel4.setText("Data de Entrada");

        try {
            data_entrada_produto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_entrada_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_entrada_produtoActionPerformed(evt);
            }
        });
        data_entrada_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                data_entrada_produtoKeyTyped(evt);
            }
        });

        fornecedor_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedor_produtoActionPerformed(evt);
            }
        });
        fornecedor_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fornecedor_produtoKeyTyped(evt);
            }
        });

        jLabel5.setText("Fornecedor");

        operador_entrada_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operador_entrada_produtoActionPerformed(evt);
            }
        });
        operador_entrada_produto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                operador_entrada_produtoKeyTyped(evt);
            }
        });

        jLabel6.setText("Operador");

        categoria_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plantas", "Cactos", "Arbustos" }));
        categoria_produto.setSelectedIndex(-1);

        jLabel7.setText("Categoria");

        cadastrar_button.setText("Cadastrar Produto");
        cadastrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_buttonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrar_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(nome_produto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtd_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(data_entrada_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(fornecedor_produto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(operador_entrada_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(categoria_produto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data_entrada_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornecedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operador_entrada_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton)
                    .addComponent(cadastrar_button))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_produtoActionPerformed

    private void qtd_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtd_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtd_produtoActionPerformed

    private void qtd_produtoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtd_produtoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit((c))){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_qtd_produtoKeyTyped

    private void nome_produtoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome_produtoKeyTyped
        char keyPress = evt.getKeyChar();
        if(!Character.isAlphabetic(keyPress) && keyPress != ' '){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_nome_produtoKeyTyped

    private void data_entrada_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_entrada_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_entrada_produtoActionPerformed

    private void data_entrada_produtoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_data_entrada_produtoKeyTyped
                // TODO add your handling code here:
    }//GEN-LAST:event_data_entrada_produtoKeyTyped

    private void fornecedor_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedor_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedor_produtoActionPerformed

    private void fornecedor_produtoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fornecedor_produtoKeyTyped
        char keyPress = evt.getKeyChar();
        if(!Character.isAlphabetic(keyPress) && keyPress != ' '){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedor_produtoKeyTyped

    private void operador_entrada_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operador_entrada_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operador_entrada_produtoActionPerformed

    private void operador_entrada_produtoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_operador_entrada_produtoKeyTyped
        char keyPress = evt.getKeyChar();
        if(!Character.isAlphabetic(keyPress) && keyPress != ' '){
            evt.consume();
        }                // TODO add your handling code here:
    }//GEN-LAST:event_operador_entrada_produtoKeyTyped

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    String[] options = {"Sim", "Cancelar"};
        int resposta = JOptionPane.showOptionDialog(
        this,
        "Esta ação apagará todos os campos, tem certeza?",
        "Confirmação",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.WARNING_MESSAGE,
        null,
        options,
        options[0]
    );
    if (resposta == 0) {
        this.dispose();
    } else {
        cancelButton.requestFocus();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void cadastrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_buttonActionPerformed
        String[] options = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(
            this, 
            "Cadastro efetuado!"+ "\n" +  
            "Nome: " + nome_produto.getText() + "\n" +
            "Quantidade: " + qtd_produto.getText() + "\n" +
            "Data de Entrada: " + data_entrada_produto.getText() + "\n" +
            "Fornecedor: " + fornecedor_produto.getText() + "\n" +
            "Operador: " + operador_entrada_produto.getText() + "\n" +
            "Categoria: " + categoria_produto.getSelectedItem() + "\n\n\n" +
            "Cadastrar novo produto?" +"\n",
            "Confirmação de Cadastro",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            options,
            options[0]);
        if (resposta == 1) {
            this.dispose();
        }else{
            nome_produto.setText("");
            qtd_produto.setText("");
            data_entrada_produto.setText("");
            fornecedor_produto.setText("");
            operador_entrada_produto.setText("");
            categoria_produto.setSelectedIndex(-1);
            cadastrar_button.requestFocus();
        }
    }//GEN-LAST:event_cadastrar_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(entrada_de_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrada_de_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrada_de_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrada_de_produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrada_de_produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_button;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> categoria_produto;
    private javax.swing.JFormattedTextField data_entrada_produto;
    private javax.swing.JTextField fornecedor_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nome_produto;
    private javax.swing.JTextField operador_entrada_produto;
    private javax.swing.JTextField qtd_produto;
    // End of variables declaration//GEN-END:variables

}
