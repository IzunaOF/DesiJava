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

        productName.setText("productName");

        price.setText("price");

        qtd.setText("qtd");

        addCartBtn.setText("ADD");
        addCartBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(productName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(price)
                .addGap(29, 29, 29)
                .addComponent(qtd)
                .addGap(31, 31, 31)
                .addComponent(addCartBtn)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(qtd)
                    .addComponent(addCartBtn)
                    .addComponent(productName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCartBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartBtnMouseClicked
        // TODO add your handling code here:
        mainFrame.addProductToCart(product.getItem(), 1, TOOL_TIP_TEXT_KEY);
        this.loadFields();
    }//GEN-LAST:event_addCartBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartBtn;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel qtd;
    // End of variables declaration//GEN-END:variables
}
