/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joho;

import Joho.views.StoreFrame;

/**
 *
 * @author leonardo_santos29
 */
public class CartView extends javax.swing.JPanel {

    private final CartItem product;
    private StoreFrame mainFrame;

    public CartView(CartItem product, StoreFrame mainFrame) {
        super();
        initComponents();
        this.product = product;
        this.mainFrame = mainFrame;
        loadFields();
    }

    /**
     *
     */
    public void loadFields() {
        this.productName.setText(product.getItem().getName());
        this.price.setText(String.valueOf(product.getItem().getPrice() * product.getQuantity()));
        this.qtd.setText(String.valueOf(product.getQuantity()));
    }

    public void addMainFrame(StoreFrame frame) {
        mainFrame = frame;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productName = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        qtd = new javax.swing.JLabel();
        addCartBtn = new javax.swing.JButton();
        addCartBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        productName.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        productName.setText("productName");

        price.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        price.setText("price");

        qtd.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        qtd.setText("qtd");

        addCartBtn.setBackground(new java.awt.Color(0, 255, 0));
        addCartBtn.setText("+");
        addCartBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addCartBtn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        addCartBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartBtnMouseClicked(evt);
            }
        });

        addCartBtn1.setBackground(new java.awt.Color(255, 100, 50));
        addCartBtn1.setText("-");
        addCartBtn1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        addCartBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartBtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(price)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(qtd)
                .addGap(25, 25, 25)
                .addComponent(addCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCartBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(price)
                        .addComponent(qtd)
                        .addComponent(addCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addCartBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCartBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartBtnMouseClicked
        // TODO add your handling code here:
        mainFrame.addProductToCart(product.getItem(), 1, TOOL_TIP_TEXT_KEY);
        this.loadFields();
    }//GEN-LAST:event_addCartBtnMouseClicked

    private void addCartBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addCartBtn1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartBtn;
    private javax.swing.JButton addCartBtn1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel qtd;
    // End of variables declaration//GEN-END:variables
}
