/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Clientes;

import java.awt.BorderLayout;
import javax.swing.JPanel;

import Clientes.CadastrodeClientes;
import TelaInicial.TelaBoasVindas;
import dao.JBDCClientes;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import Model.ClientesModel;
import javax.swing.JOptionPane;
import Clientes.EditarClientes;
/**
 *
 * @author pedro
 */
public class ClientesPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form ClientesPrincipal
     */
    public ClientesPrincipal() {
        initComponents();
        MostrarClientesTabela();
        JButton [] btns = { CdClientesBtn, PesquisarBtn, Retornar, RecarregarTabela, ExcluirClientesBtn, EditarClientes, DetalharClientes};
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
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCentral = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        CdClientesBtn = new javax.swing.JButton();
        PesquisaLabel = new javax.swing.JLabel();
        PesquisaText = new javax.swing.JTextField();
        FiltroLabel = new javax.swing.JLabel();
        FiltroCombo = new javax.swing.JComboBox<>();
        PesquisarBtn = new javax.swing.JButton();
        RecarregarTabela = new javax.swing.JButton();
        ExcluirClientesBtn = new javax.swing.JButton();
        EditarClientes = new javax.swing.JButton();
        DetalharClientes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TituloLabel2 = new javax.swing.JLabel();
        TituloLabel3 = new javax.swing.JLabel();
        Retornar = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Consulta de Clientes");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Aqui é possível consultar os clientes da floricultura com suas respectivas informações.");

        TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nome do Cliente", "Telefone", "Email", "Documento", "Tipo do Documento"
            }
        ));
        TabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaClientes);
        if (TabelaClientes.getColumnModel().getColumnCount() > 0) {
            TabelaClientes.getColumnModel().getColumn(0).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(1).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(2).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(3).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(4).setResizable(false);
            TabelaClientes.getColumnModel().getColumn(5).setResizable(false);
        }

        CdClientesBtn.setBackground(new java.awt.Color(239, 86, 96));
        CdClientesBtn.setForeground(new java.awt.Color(255, 255, 255));
        CdClientesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edit.png"))); // NOI18N
        CdClientesBtn.setText("Cadastrar Clientes");
        CdClientesBtn.setBorderPainted(false);
        CdClientesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CdClientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdClientesBtnActionPerformed(evt);
            }
        });

        PesquisaLabel.setText("Pesquisar:");

        FiltroLabel.setText("Filtro:");

        FiltroCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id do Cliente", "Nome do Cliente", "Telefone", "Email", "Documento", "Tipo do Documento" }));

        PesquisarBtn.setBackground(new java.awt.Color(239, 86, 96));
        PesquisarBtn.setForeground(new java.awt.Color(255, 255, 255));
        PesquisarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Search.png"))); // NOI18N
        PesquisarBtn.setText("Pesquisar");
        PesquisarBtn.setBorderPainted(false);
        PesquisarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PesquisarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarBtnActionPerformed(evt);
            }
        });

        RecarregarTabela.setBackground(new java.awt.Color(239, 86, 96));
        RecarregarTabela.setForeground(new java.awt.Color(255, 255, 255));
        RecarregarTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Available Updates_1.png"))); // NOI18N
        RecarregarTabela.setBorderPainted(false);
        RecarregarTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RecarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecarregarTabelaActionPerformed(evt);
            }
        });

        ExcluirClientesBtn.setBackground(new java.awt.Color(239, 86, 96));
        ExcluirClientesBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExcluirClientesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Close.png"))); // NOI18N
        ExcluirClientesBtn.setText("Excluir Cliente");
        ExcluirClientesBtn.setBorderPainted(false);
        ExcluirClientesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExcluirClientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirClientesBtnActionPerformed(evt);
            }
        });

        EditarClientes.setBackground(new java.awt.Color(239, 86, 96));
        EditarClientes.setForeground(new java.awt.Color(255, 255, 255));
        EditarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Box_1.png"))); // NOI18N
        EditarClientes.setText("Editar Clientes");
        EditarClientes.setBorderPainted(false);
        EditarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarClientesActionPerformed(evt);
            }
        });

        DetalharClientes.setBackground(new java.awt.Color(239, 86, 96));
        DetalharClientes.setForeground(new java.awt.Color(255, 255, 255));
        DetalharClientes.setText("Detalhar Info");
        DetalharClientes.setBorderPainted(false);
        DetalharClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DetalharClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalharClientesActionPerformed(evt);
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PesquisaText, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PesquisaLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CdClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(FiltroLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(FiltroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(PesquisarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExcluirClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DetalharClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(RecarregarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RecarregarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CdClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ExcluirClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DetalharClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisaLabel)
                    .addComponent(FiltroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisaText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(185, 35, 44));

        TituloLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TituloLabel2.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloLabel2.setText("Consulta Clientes");

        TituloLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TituloLabel3.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloLabel3.setText("Casa da Planta - Sistema Imobiliário");

        Retornar.setBackground(new java.awt.Color(185, 35, 44));
        Retornar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Retornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Back To_1.png"))); // NOI18N
        Retornar.setBorder(null);
        Retornar.setBorderPainted(false);
        Retornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelCentralLayout = new javax.swing.GroupLayout(PainelCentral);
        PainelCentral.setLayout(PainelCentralLayout);
        PainelCentralLayout.setHorizontalGroup(
            PainelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelCentralLayout.setVerticalGroup(
            PainelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCentralLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelCentral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PainelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornarActionPerformed
        // TODO add your handling code here:
        TelaBoasVindas TelaInicio = new TelaBoasVindas();
        ShowPanel(TelaInicio);
    }//GEN-LAST:event_RetornarActionPerformed

    private void CdClientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdClientesBtnActionPerformed
        // TODO add your handling code here:
        CadastrodeClientes CadastroClientes = new CadastrodeClientes();
        ShowPanel(CadastroClientes);
    }//GEN-LAST:event_CdClientesBtnActionPerformed

    private void PesquisarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarBtnActionPerformed
        // TODO add your handling code here:
        
        RecarregarClientesTabela();
        JBDCClientes ListadeCliente = new JBDCClientes();
        ClientesModel ListadoModel = new ClientesModel();
        ListadoModel.setValorConsulta(FiltroCombo.getSelectedIndex());
        ListadoModel.setItemPesquisar(PesquisaText.getText());
        ArrayList<ClientesModel> ListaClientes = ListadeCliente.FiltrarClientes(ListadoModel);
         
        DefaultTableModel modelo = (DefaultTableModel) TabelaClientes.getModel();
        modelo.setRowCount(0);

    for (ClientesModel ClientesModel : ListaClientes) {
        modelo.addRow(new Object[] {
            ClientesModel.getIdcliente(),
            ClientesModel.getNomecliente(),
            ClientesModel.getTelefonecliente(),
            ClientesModel.getEmail(),
            ClientesModel.getDocumento(),
            ClientesModel.getTipoDocumento(),
        });
    }
    
    if(ListaClientes.isEmpty()){
        JOptionPane.showMessageDialog(null, "Nenhum item encontrado!");
        RecarregarClientesTabela();
    }
    }//GEN-LAST:event_PesquisarBtnActionPerformed

    private void RecarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecarregarTabelaActionPerformed
        // TODO add your handling code here:
        RecarregarClientesTabela();
    }//GEN-LAST:event_RecarregarTabelaActionPerformed

    private void ExcluirClientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirClientesBtnActionPerformed
        // TODO add your handling code here:
        ClientesModel ListaCliente = new ClientesModel();
        JBDCClientes ClientesJBDC = new JBDCClientes();
        int LinhaSelecionada = TabelaClientes.getSelectedRow();
        DefaultTableModel ModeloTabela = (DefaultTableModel) TabelaClientes.getModel();
        int ClienteId = ClientesJBDC.MostrarListaclientes().get(LinhaSelecionada).getIdcliente();
        String ClienteNome = ClientesJBDC.MostrarListaclientes().get(LinhaSelecionada).getNomecliente();
        String ClienteDocumento = ClientesJBDC.MostrarListaclientes().get(LinhaSelecionada).getDocumento();
        
         String[] options = {"Sim", "Cancelar"};
         int resposta = JOptionPane.showOptionDialog(
            this,
            "Deseja excluir mesmo este Cliente?" + "\n\n"+
            "Id do Cliente: " + ClienteId + "\n" +
            "Nome do Cliente: " + ClienteNome+ "\n" +
            "Documento Cliente: " + ClienteDocumento + "\n\n",
            "Confirmação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            options,
            options[0]);
        if (resposta == 0) {
            ListaCliente.setIdcliente(ClienteId);
            ClientesJBDC.ExcluirCliente(ListaCliente);
        } else {
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }
    }//GEN-LAST:event_ExcluirClientesBtnActionPerformed

    private void EditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarClientesActionPerformed
        // TODO add your handling code here:
        ClientesModel ModelClientes = new ClientesModel();
        JBDCClientes ClientesJBDC = new JBDCClientes();
        int LinhaSelecionada = TabelaClientes.getSelectedRow();
        
        if (LinhaSelecionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente na tabela!");
        return;
        }
        DefaultTableModel ModeloTabela = (DefaultTableModel) TabelaClientes.getModel();
        int ModelIndex = TabelaClientes.convertRowIndexToModel(LinhaSelecionada);
        int ClienteSelecionado = (int) ModeloTabela.getValueAt(ModelIndex, 0); 
        ClientesJBDC.ConsultaCliente(ClienteSelecionado);
        
        EditarClientes EditarImovel = new EditarClientes();
        ShowPanel(EditarImovel); 
         
    }//GEN-LAST:event_EditarClientesActionPerformed

    private void TabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClientesMouseClicked
        // TODO add your handling code here:
        ClientesModel ClientesModel = new ClientesModel();
    }//GEN-LAST:event_TabelaClientesMouseClicked

    private void DetalharClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalharClientesActionPerformed
        // TODO add your handling code here:
        ClientesModel ModelClientes = new ClientesModel();
        JBDCClientes ClientesJBDC = new JBDCClientes();
        int LinhaSelecionada = TabelaClientes.getSelectedRow();
        
        if (LinhaSelecionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecione um cliente na tabela!");
        return;
        }
        DefaultTableModel ModeloTabela = (DefaultTableModel) TabelaClientes.getModel();
        int ModelIndex = TabelaClientes.convertRowIndexToModel(LinhaSelecionada);
        int ClienteSelecionado = (int) ModeloTabela.getValueAt(ModelIndex, 0); 
        ClientesJBDC.ConsultaCliente(ClienteSelecionado);
        
        DetalheCliente DetalharClienteJanela = new DetalheCliente();
        DetalharClienteJanela.setVisible(true);
    }//GEN-LAST:event_DetalharClientesActionPerformed

    private void ShowPanel(JPanel p){
    p.setSize(800,725);
    p.setLocation(0,0);
    
    PainelCentral.removeAll();
    PainelCentral.add(p, BorderLayout.CENTER); 
    PainelCentral.revalidate();
    PainelCentral.repaint();    
     }
    
    public void MostrarClientesTabela(){
        JBDCClientes ListaClietesJBDC = new JBDCClientes();
        ArrayList<ClientesModel> listaClientes =  ListaClietesJBDC.MostrarListaclientes();
        
        
        DefaultTableModel model = (DefaultTableModel)TabelaClientes.getModel();
         model.setRowCount(0);
         model.setColumnCount(6);
        
        Object[] row = new Object[6];
        for(int i = 0;i < listaClientes.size();i++){
            row[0] = listaClientes.get(i).getIdcliente();
            row[1] = listaClientes.get(i).getNomecliente();
            row[2] = listaClientes.get(i).getTelefonecliente();
            row[3] = listaClientes.get(i).getEmail();
            row[4] = listaClientes.get(i).getDocumento();
            row[5] = listaClientes.get(i).getTipoDocumento(); 
            model.addRow(row.clone());

        }
       
    }
    
     public void RecarregarClientesTabela() {
    DefaultTableModel model = (DefaultTableModel) TabelaClientes.getModel();
    model.setRowCount(0);
    model.setColumnCount(6);
    MostrarClientesTabela();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CdClientesBtn;
    private javax.swing.JButton DetalharClientes;
    private javax.swing.JButton EditarClientes;
    private javax.swing.JButton ExcluirClientesBtn;
    private javax.swing.JComboBox<String> FiltroCombo;
    private javax.swing.JLabel FiltroLabel;
    private javax.swing.JPanel PainelCentral;
    private javax.swing.JLabel PesquisaLabel;
    private javax.swing.JTextField PesquisaText;
    private javax.swing.JButton PesquisarBtn;
    private javax.swing.JButton RecarregarTabela;
    private javax.swing.JButton Retornar;
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JLabel TituloLabel2;
    private javax.swing.JLabel TituloLabel3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
