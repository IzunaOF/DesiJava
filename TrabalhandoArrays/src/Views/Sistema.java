/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Account;
import Models.Bank;
import javax.swing.JOptionPane;

public class Sistema extends javax.swing.JFrame {

    public Bank banco = new Bank();

    public Sistema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoGerenteEscolha = new javax.swing.JButton();
        botaoClienteEscolha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoGerenteEscolha.setText("GERENTE");
        botaoGerenteEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenteEscolhaActionPerformed(evt);
            }
        });

        botaoClienteEscolha.setText("CLIENTE");
        botaoClienteEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteEscolhaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("SELECIONE TIPO DE USUÁRIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoClienteEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoGerenteEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(botaoGerenteEscolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoClienteEscolha)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGerenteEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenteEscolhaActionPerformed
        this.dispose();
        new GerenteView().setVisible(true);
    }//GEN-LAST:event_botaoGerenteEscolhaActionPerformed

    private void botaoClienteEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteEscolhaActionPerformed
        this.dispose();
        String key = JOptionPane.showInputDialog("Digite sua conta");
        Account conta = new Controllers.ContaController().getAccountByDocument(key);

        if (conta != null) {
            new ClienteView().setVisible(true);
        }
    }//GEN-LAST:event_botaoClienteEscolhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoClienteEscolha;
    private javax.swing.JButton botaoGerenteEscolha;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
