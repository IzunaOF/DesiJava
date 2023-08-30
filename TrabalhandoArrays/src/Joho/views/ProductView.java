/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joho.views;

import javax.swing.JPanel;
import Joho.Product;
import java.awt.CardLayout;

public class ProductView extends javax.swing.JFrame {

    private final Product product;
    private final StoreFrame mainFrame;

    public ProductView(JPanel cardLayout, Product product, StoreFrame mainFrame) {
        initComponents();
        this.product = product;
        this.mainFrame = mainFrame;
        this.loadFields();
    }

    private void loadFields() {
        this.viewProductDescription.setText(product.getDescription());
        this.viewProductName.setText(product.getName());
        this.viewProductPrice.setText(String.valueOf(product.getPrice()));
    }

    protected void changePainel(JPanel card, String cardName) {
        CardLayout path = (CardLayout) card.getLayout();
        path.show(card, cardName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lastPageButton = new javax.swing.JButton();
        addMessage = new javax.swing.JLabel();
        viewProductDescription = new javax.swing.JLabel();
        viewProductName = new javax.swing.JLabel();
        viewProductPrice = new javax.swing.JLabel();
        addCart = new javax.swing.JButton();
        buyAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        lastPageButton.setBackground(new java.awt.Color(51, 0, 51));
        lastPageButton.setForeground(new java.awt.Color(255, 255, 255));
        lastPageButton.setText("X");
        lastPageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 0, 51), new java.awt.Color(153, 0, 153), new java.awt.Color(255, 0, 204), new java.awt.Color(204, 0, 153)));
        lastPageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastPageButtonMouseClicked(evt);
            }
        });

        viewProductDescription.setText("viewProductDescription");

        viewProductName.setText("viewProductName");

        viewProductPrice.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        viewProductPrice.setForeground(new java.awt.Color(102, 51, 0));
        viewProductPrice.setText("R$ 00");

        addCart.setBackground(new java.awt.Color(255, 255, 255));
        addCart.setText("ADD ");
        addCart.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        addCart.setMargin(new java.awt.Insets(5, 5, 5, 5));
        addCart.setMaximumSize(new java.awt.Dimension(70, 35));
        addCart.setMinimumSize(new java.awt.Dimension(70, 35));
        addCart.setPreferredSize(new java.awt.Dimension(70, 35));
        addCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartMouseClicked(evt);
            }
        });

        buyAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buyAmount.setText("1");

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Quantidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(addCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMessage)
                    .addComponent(viewProductDescription)
                    .addComponent(viewProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewProductName))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(viewProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewProductDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(buyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMessage)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartMouseClicked
        // TODO add your handling code here:
        mainFrame.addProductToCart(product, Integer.valueOf(buyAmount.getText()), "credit");
        addMessage.setText("Adicionado com sucesso");
    }//GEN-LAST:event_addCartMouseClicked

    private void lastPageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastPageButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lastPageButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCart;
    private javax.swing.JLabel addMessage;
    private javax.swing.JTextField buyAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lastPageButton;
    private javax.swing.JLabel viewProductDescription;
    private javax.swing.JLabel viewProductName;
    private javax.swing.JLabel viewProductPrice;
    // End of variables declaration//GEN-END:variables
}
