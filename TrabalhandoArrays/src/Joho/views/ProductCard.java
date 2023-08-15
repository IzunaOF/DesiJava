/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joho.views;

import javax.swing.JPanel;
import Joho.Product;
import Joho.views.StoreFrame;
import java.awt.CardLayout;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class ProductCard extends javax.swing.JPanel {

    private JPanel cardLayout;
    private Product product;
    private StoreFrame mainFrame;

    public ProductCard(JPanel cardLayout, Product product) {
        initComponents();
        this.cardLayout = cardLayout;
        this.product = product;

        this.productNameLabel.setText(product.getName());
        this.priceLabel.setText(String.format("%1s%1s", "R$", String.valueOf(product.getPrice())));

        this.productDetailsButton.setName(product.getDescription());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productNameLabel = new javax.swing.JLabel();
        productDetailsButton = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();

        productNameLabel.setText("productNameLabel");

        productDetailsButton.setText("Details");
        productDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDetailsButtonMouseClicked(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        priceLabel.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(productDetailsButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(productNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productDetailsButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDetailsButtonMouseClicked
        // TODO add your handling code here:
        this.changePainel(cardLayout, "productView");
        JFrame view = new ProductView(cardLayout, product, mainFrame);
        view.setLocationRelativeTo(cardLayout);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    }//GEN-LAST:event_productDetailsButtonMouseClicked

    public void addMainFrame(StoreFrame frame) {
        mainFrame = frame;
    }

    protected void changePainel(JPanel card, String cardName) {
        CardLayout path = (CardLayout) card.getLayout();
        path.show(card, cardName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton productDetailsButton;
    private javax.swing.JLabel productNameLabel;
    // End of variables declaration//GEN-END:variables
}
