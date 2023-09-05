/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ContaController;
import Models.Account;

import javax.swing.JOptionPane;

public class ClienteView extends javax.swing.JFrame {

    ContaController contaController = new ContaController();
    Account conta = null;

    public ClienteView() {
        initComponents();

        solicitaDocumento();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoDepositar = new javax.swing.JButton();
        botaoSacar = new javax.swing.JButton();
        botaoTransferir = new javax.swing.JButton();
        botaoExtrato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroContaView = new javax.swing.JLabel();
        titularContaView = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoDepositar.setText("DEPOSITAR");
        botaoDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDepositarActionPerformed(evt);
            }
        });

        botaoSacar.setText("SACAR");

        botaoTransferir.setText("TRANSFERIR");
        botaoTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTransferirActionPerformed(evt);
            }
        });

        botaoExtrato.setText("EXTRATO");

        jLabel1.setText("Nº :");

        jLabel2.setText("Titular : ");

        numeroContaView.setText("000000");

        titularContaView.setText("titular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titularContaView))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroContaView))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(botaoDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(botaoSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroContaView))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(titularContaView))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDepositar)
                    .addComponent(botaoTransferir))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSacar)
                    .addComponent(botaoExtrato))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void solicitaDocumento() {
        boolean ehValida = false;
        do {
            String doc = JOptionPane.showInputDialog("informe seu documento");
            conta = contaController.getAccountByDocument(doc);

            if (conta != null) {
                do {
                    String senha = JOptionPane.showInputDialog("Informe sua senha");
                    ehValida = conta.validaSenha(senha);
                } while (ehValida == false);

            }
        } while (conta == null);

    }
    private void botaoTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTransferirActionPerformed

    }//GEN-LAST:event_botaoTransferirActionPerformed

    private void botaoDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDepositarActionPerformed

    }//GEN-LAST:event_botaoDepositarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDepositar;
    private javax.swing.JButton botaoExtrato;
    private javax.swing.JButton botaoSacar;
    private javax.swing.JButton botaoTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel numeroContaView;
    private javax.swing.JLabel titularContaView;
    // End of variables declaration//GEN-END:variables
}
