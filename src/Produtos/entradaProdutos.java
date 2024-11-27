/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Produtos;

import dao.JBDCConnect;
import TelaInicial.TelaBoasVindas;
import dao.JBDCEntradadeProdutos;
import Model.NomeIDFornecedoresModel;
import Model.NomeIDOperadorModel;
import Model.TabelaEntradadeProdutosModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

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
        carregarFornecedoresNaCB();
        carregarOperadoresNaCB();
        MostrarProdutosTabela();
    }

    /*private void registrarEntradaProduto() {
        int linhaSelecionada = tabelaEntradaProdutos.getSelectedRow();
        if (linhaSelecionada >= 0) {
            // Pegando os dados do produto
            String idProduto = tabelaEntradaProdutos.getValueAt(linhaSelecionada, 0).toString();
            int quantidadeEntrada = Integer.parseInt(qtdProduto.getText()); // Supõe que a quantidade foi informada no campo
            String novoFornecedor = fornecedorProdutoCB.getSelectedItem().toString(); // Caso o fornecedor tenha sido alterado
            String idOperador = "Operador"; // Aqui você pode pegar o ID do operador (se necessário)

            // Atualizar a quantidade do produto na tabela produtos
            boolean quantidadeAtualizada = JBDCEntradadeProdutos.adicionarQuantidade(idProduto, quantidadeEntrada);

            // Inserir a entrada do produto na tabela entrada_de_produtos
            boolean entradaRegistrada = JBDCEntradadeProdutos.registrarEntradaProduto(idProduto, quantidadeEntrada, novoFornecedor, idOperador);

            if (quantidadeAtualizada && entradaRegistrada) {
                JOptionPane.showMessageDialog(null, "Entrada do produto registrada com sucesso!");
                MostrarProdutosTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao registrar a entrada do produto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto na tabela.");
        }
    }*/

    private void carregarFornecedoresNaCB() {
        JBDCConnect jbdcConnect = new JBDCConnect();

        if (jbdcConnect.conectar()) {
            List<NomeIDFornecedoresModel> fornecedores = null;
            try {
                JBDCEntradadeProdutos cadastroFornecedoresDao = new JBDCEntradadeProdutos();

                // Chama o método para obter os fornecedores
                fornecedores = cadastroFornecedoresDao.getIDNomeFornecedor();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                jbdcConnect.desconectar();
            }

            if (fornecedores != null) {
                for (NomeIDFornecedoresModel fornecedor : fornecedores) {
                    fornecedorProdutoCB.addItem(fornecedor);
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

                JBDCEntradadeProdutos cadastroOperadoresDao = new JBDCEntradadeProdutos();

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

    public void MostrarProdutosTabela() {

        DefaultTableModel model = (DefaultTableModel) tabelaEntradaProdutos.getModel();

        if (model.getColumnCount() == 0) {
            model.addColumn("ID Produto");
            model.addColumn("Nome Produto");
            model.addColumn("Quantidade");
            model.addColumn("Fornecedor");
        }

        model.setRowCount(0);

        JBDCEntradadeProdutos ListaProdutos = new JBDCEntradadeProdutos();
        ArrayList<TabelaEntradadeProdutosModel> listaProdutos = ListaProdutos.MostrarListaProdutos();

        for (TabelaEntradadeProdutosModel produto : listaProdutos) {
            Object[] row = {
                produto.getIdProduto(),
                produto.getIdproduto_entrada(),
                produto.getQuantidadeProduto(),
                produto.getIdfornecedor_entrada()
            };
            model.addRow(row);
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
        fornecedorProdutoCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        qtdProduto = new javax.swing.JTextField();
        operadorEntradanaCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEntradaProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nomeProdutoEntrada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

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

        fornecedorProdutoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorProdutoCBActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Fornecedor");

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

        tabelaEntradaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Produto", "Qntd", "Fornecedor"
            }
        ));
        tabelaEntradaProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaEntradaProdutos.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaEntradaProdutos);
        if (tabelaEntradaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaEntradaProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaEntradaProdutos.getColumnModel().getColumn(1).setPreferredWidth(176);
            tabelaEntradaProdutos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelaEntradaProdutos.getColumnModel().getColumn(3).setPreferredWidth(174);
        }

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nome do Produto");

        nomeProdutoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdutoEntradaActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Produtos:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(485, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(fornecedorProdutoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(79, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(operadorEntradanaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nomeProdutoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nomeProdutoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fornecedorProdutoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operadorEntradanaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(adicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        int selectedRow = tabelaEntradaProdutos.getSelectedRow();

        if (selectedRow >= 0) {

            String idProduto = tabelaEntradaProdutos.getValueAt(selectedRow, 0).toString();
            String quantidadeTexto = qtdProduto.getText().trim();
            String novoFornecedor = fornecedorProdutoCB.getSelectedItem().toString();

            if (quantidadeTexto.isEmpty() || !quantidadeTexto.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Por favor, insira uma quantidade válida.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int quantidadeAdicionada = Integer.parseInt(quantidadeTexto);

            JBDCEntradadeProdutos dao = new JBDCEntradadeProdutos();
            boolean sucessoQuantidade = dao.adicionarQuantidade(idProduto, quantidadeAdicionada);

            if (!sucessoQuantidade) {
                JOptionPane.showMessageDialog(this, "Erro ao adicionar a quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!novoFornecedor.equals(tabelaEntradaProdutos.getValueAt(selectedRow, 2).toString())) {
                boolean sucessoFornecedor = dao.atualizarFornecedorDoProduto(idProduto, novoFornecedor);
                if (!sucessoFornecedor) {
                    JOptionPane.showMessageDialog(this, "Erro ao atualizar o fornecedor.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            MostrarProdutosTabela();
            qtdProduto.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um produto na tabela.", "Erro", JOptionPane.ERROR_MESSAGE);
        }


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

    private void fornecedorProdutoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorProdutoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorProdutoCBActionPerformed

    private void nomeProdutoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProdutoEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retornar;
    private javax.swing.JLabel TituloLabel2;
    private javax.swing.JLabel TituloLabel3;
    private javax.swing.JButton adicionarProduto;
    private javax.swing.JComboBox<NomeIDFornecedoresModel> fornecedorProdutoCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeProdutoEntrada;
    private javax.swing.JComboBox<NomeIDOperadorModel> operadorEntradanaCB;
    private javax.swing.JTextField qtdProduto;
    private javax.swing.JTable tabelaEntradaProdutos;
    // End of variables declaration//GEN-END:variables

    private void ShowPanel(TelaBoasVindas TelaInicial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
