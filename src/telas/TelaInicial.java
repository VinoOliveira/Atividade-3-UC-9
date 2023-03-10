
package telas;

import atividade.pkg3.uc9.Consulta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaInicial extends javax.swing.JFrame {

    private final String[] tableColumns = {"Paciente", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta Realizada"};
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    public List<Consulta> pacientesList = new ArrayList<>();

    
    public TelaInicial() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        btnNovaConsulta = new javax.swing.JButton();
        btnExcluirConsulta = new javax.swing.JButton();
        btnFinalizarConsulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblPacientes.setBackground(new java.awt.Color(255, 255, 255));
        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Pacientes", "CPF", "Telefone", "Data", "Já era paciente?", "Consulta realizada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        btnNovaConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnNovaConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovaConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnNovaConsulta.setText("Nova consulta");
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });

        btnExcluirConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluirConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirConsulta.setText("Excluir consulta");
        btnExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirConsultaActionPerformed(evt);
            }
        });

        btnFinalizarConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnFinalizarConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFinalizarConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnFinalizarConsulta.setText("Finalizar consulta");
        btnFinalizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarConsultaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Boas vindas ao sistema de agendamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.mostrarTela(this);
    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void btnExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirConsultaActionPerformed
        excluirPaciente(posicaoPaciente());
    }//GEN-LAST:event_btnExcluirConsultaActionPerformed

    private void btnFinalizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarConsultaActionPerformed
        TelaFinalizarConsulta telaFinalizarConsulta = new TelaFinalizarConsulta();
        
        String consultaFinalizada = pacientesList.get(posicaoPaciente()).getConsultaFinalizada().toString();
        
        if (consultaFinalizada == "Sim") {
            telaFinalizarConsulta.mostrarTela(this);
            telaFinalizarConsulta.marcarCheckBox();
            telaFinalizarConsulta.desabilitarCheckBox();
            telaFinalizarConsulta.esconderBotaoFinalizar();
        }else{
            telaFinalizarConsulta.mostrarTela(this);
        }
    }//GEN-LAST:event_btnFinalizarConsultaActionPerformed

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
            @Override
            public void run() {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirConsulta;
    private javax.swing.JButton btnFinalizarConsulta;
    private javax.swing.JButton btnNovaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblPacientes;
    // End of variables declaration//GEN-END:variables

    public void atualizarTabela() {
        if (!pacientesList.isEmpty()) {
            Consulta paciente;
            tableModel = new DefaultTableModel(tableColumns, 0);

            for (int i = 0; i < pacientesList.size(); i++) {
                paciente = pacientesList.get(i);
                String[] rowData = {paciente.getNomePaciente(), paciente.getCpfPaciente(), paciente.getTelefonePaciente(), paciente.getDataConsulta(), paciente.getJaEraPaciente(), paciente.getConsultaFinalizada()};
                tableModel.addRow(rowData);

            }
            tblPacientes.setModel(tableModel);
        } else {
            tableModel = new DefaultTableModel(tableColumns, 0);
            tblPacientes.setModel(tableModel);
        }
    }

    public int posicaoPaciente() {
        int posicao = tblPacientes.getSelectedRow();
        if (posicao == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um Paciente");
        }
        return posicao;
    }

    public void excluirPaciente(int posicao) {
        if (posicao == 0) {
            String[] options = {"Sim", "Não"};
            int deletar = JOptionPane.showOptionDialog(
                    rootPane,
                    "Tem certeza que deseja excluir?",
                    "Exclusão de pacientes",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );
            if (deletar == 0) {
                pacientesList.remove(posicao);
                atualizarTabela();
            } else {
                tblPacientes.clearSelection();
            }
        }
    }
}
