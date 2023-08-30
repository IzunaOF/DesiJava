/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joho.views;

import Joho.CartItem;
import Joho.CartView;
import Joho.Product;
import Joho.SessionAuth;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StoreFrame extends javax.swing.JFrame {

    private Integer ID_CONTROL = 0;
    private final List<CartItem> cart = new ArrayList();
    private final ArrayList<Product> products;
    private Double total = 0.0;
    private Integer prev = 0;
    private Integer next = 15;
    private int itemsPage = 15;
    private int actualPage = 0;

    public StoreFrame(SessionAuth session, ArrayList<Product> products) {
        this.products = products;
        initComponents();
        this.setLocationRelativeTo(null);
        setActualViewPage(1);
        this.loadCards(false);
        cartOwner.setText(session.currentUser.getOwnerAccount() + "'s Shopcart");
        cartOwnerLabel.setText(session.currentUser.getOwnerAccount() + "'s Shopcart");
    }

    private void setActualViewPage(int value) {
        actualPage += value;
        int totalPages = products.size() / itemsPage + 1;
        actualPage = actualPage < 1 ? 1 : actualPage > totalPages ? totalPages : actualPage;
        String lastString = "/" + totalPages;
        String str = actualPage + lastString;
        page.setText(str);
    }

    private Double getTotalValue() {
        total = 0.0;
        products.forEach((p) -> {
            total += p.getPrice();
        });
        return total;
    }

    private void loadCards(boolean previous) {
        stoque.removeAll();
        stoque.repaint();
        stoque.revalidate();

        int x = 5;
        int y = 5;
        int w = 150;
        int h = 130;

        for (int i = (actualPage - 1) * itemsPage, control = 0; i < this.products.size(); i++, control++) {
            if (control == itemsPage) {
                if (previous) {
                    prev = prev - itemsPage < 0 ? 0 : prev - itemsPage;
                } else {
                    prev = next;
                }
                next = i;
                return;
            }

            ProductCard details = new ProductCard(main, this.products.get(i));
            details.setBounds(x, y, w, h);
            details.addMainFrame(this);

            x += 155;
            if (x > this.container.getSize().width - 150) {
                x = 5;
                y += 135;
            }
//ss
            this.stoque.add(details);
        }
    }

    protected void loadCartView() {
        views.removeAll();
        views.repaint();
        views.revalidate();

        int x = 20;
        int y = 15;
        int w = views.getSize().width;
        int h = 50;

        if (this.cart.isEmpty()) {
            JLabel empty = new JLabel("Você não adicionou nenhum item");
            JButton shopBtn = new JButton("Ir às Compras");

            empty.setBounds(x, y, w, h);
            shopBtn.setBounds(x, y + 50, 200, h - 25);

            views.add(empty);
            views.add(shopBtn);
        } else {

            for (int i = 0; i < this.cart.size(); i++) {
                CartView details = new CartView(this.cart.get(i), this);
                JButton button = new JButton("REMOVE");
                button.setBackground(Color.BLACK);
                button.setForeground(Color.WHITE);
                button.setActionCommand(cart.get(i).getItemID());
                button.addActionListener(ev -> {
                    this.removePorductFromCart(ev.getActionCommand());
                });

                details.setBounds(x, y, w, h);
                button.setBounds(x + w - 125, y + 13, 100, h - 25);

                y += 50;

                views.add(button);
                views.add(details);
            }
        }

    }

    public void addProductToCart(Product product, Integer quantity, String payment) {
        for (int i = 0; i < this.cart.size(); i++) {
            if (cart.get(i).getItemID().equals(product.getID())) {
                cart.get(i).updateQuantity(quantity);
                return;
            }
        }
        cart.add(new CartItem(product, quantity, payment));
        loadCartView();
    }

    public void removePorductFromCart(String id) {
        for (int i = 0; i < this.cart.size(); i++) {
            if (cart.get(i).getItemID().equals(id)) {
                cart.remove(i);
                loadCartView();
                return;
            }
        }

    }

    protected void changePainel(JPanel card, String cardName) {
        CardLayout path = (CardLayout) card.getLayout();
        path.show(card, cardName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        stoque = new javax.swing.JPanel();
        page = new javax.swing.JLabel();
        cartOwner = new javax.swing.JLabel();
        prevPage = new javax.swing.JButton();
        nextPage = new javax.swing.JButton();
        addCartView = new javax.swing.JButton();
        cartView = new javax.swing.JPanel();
        views = new javax.swing.JPanel();
        backPage = new javax.swing.JButton();
        cartOwnerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.CardLayout());

        stoque.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout stoqueLayout = new javax.swing.GroupLayout(stoque);
        stoque.setLayout(stoqueLayout);
        stoqueLayout.setHorizontalGroup(
            stoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        stoqueLayout.setVerticalGroup(
            stoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        page.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        page.setText("page");

        cartOwner.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        cartOwner.setText("cartOwner");

        prevPage.setBackground(new java.awt.Color(0, 102, 102));
        prevPage.setForeground(new java.awt.Color(255, 255, 255));
        prevPage.setText("<<");
        prevPage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 0), new java.awt.Color(204, 153, 0), new java.awt.Color(0, 204, 0), new java.awt.Color(0, 204, 153)));
        prevPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevPageMouseClicked(evt);
            }
        });

        nextPage.setBackground(new java.awt.Color(0, 102, 102));
        nextPage.setForeground(new java.awt.Color(255, 255, 255));
        nextPage.setText(">>");
        nextPage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 0), new java.awt.Color(204, 153, 0), new java.awt.Color(0, 204, 0), new java.awt.Color(0, 204, 153)));
        nextPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPageMouseClicked(evt);
            }
        });

        addCartView.setBackground(new java.awt.Color(0, 102, 102));
        addCartView.setForeground(new java.awt.Color(255, 255, 255));
        addCartView.setText("CartView");
        addCartView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(0, 102, 102), new java.awt.Color(51, 51, 0)));
        addCartView.setPreferredSize(new java.awt.Dimension(80, 30));
        addCartView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartViewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addComponent(cartOwner)
                        .addGap(218, 218, 218)
                        .addComponent(addCartView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addComponent(prevPage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(page)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(stoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartOwner)
                    .addComponent(addCartView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page)
                    .addComponent(prevPage, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        main.add(container, "showcase");

        cartView.setBackground(new java.awt.Color(238, 238, 242));

        views.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout viewsLayout = new javax.swing.GroupLayout(views);
        views.setLayout(viewsLayout);
        viewsLayout.setHorizontalGroup(
            viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        viewsLayout.setVerticalGroup(
            viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        backPage.setBackground(new java.awt.Color(51, 0, 102));
        backPage.setForeground(new java.awt.Color(255, 255, 255));
        backPage.setText("<<");
        backPage.setMargin(new java.awt.Insets(2, 2, 2, 2));
        backPage.setPreferredSize(new java.awt.Dimension(40, 25));
        backPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backPageMouseClicked(evt);
            }
        });
        backPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backPageActionPerformed(evt);
            }
        });

        cartOwnerLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cartOwnerLabel.setText("CartOwner");

        javax.swing.GroupLayout cartViewLayout = new javax.swing.GroupLayout(cartView);
        cartView.setLayout(cartViewLayout);
        cartViewLayout.setHorizontalGroup(
            cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartViewLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(views, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cartViewLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(cartOwnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cartViewLayout.setVerticalGroup(
            cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartViewLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartOwnerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(views, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        main.add(cartView, "cartView");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevPageMouseClicked
        // TODO add your handling code here:
        setActualViewPage(-1);
        loadCards(true);
    }//GEN-LAST:event_prevPageMouseClicked

    private void nextPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageMouseClicked
        // TODO add your handling code here:
        setActualViewPage(1);
        loadCards(false);
    }//GEN-LAST:event_nextPageMouseClicked

    private void addCartViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartViewMouseClicked
        // TODO add your handling code here:
        loadCartView();
        changePainel(main, "cartView");
    }//GEN-LAST:event_addCartViewMouseClicked

    private void backPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPageMouseClicked
        // TODO add your handling code here:
        changePainel(main, "showcase");
    }//GEN-LAST:event_backPageMouseClicked

    private void backPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backPageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartView;
    private javax.swing.JButton backPage;
    private javax.swing.JLabel cartOwner;
    private javax.swing.JLabel cartOwnerLabel;
    private javax.swing.JPanel cartView;
    private javax.swing.JPanel container;
    private javax.swing.JPanel main;
    private javax.swing.JButton nextPage;
    private javax.swing.JLabel page;
    private javax.swing.JButton prevPage;
    private javax.swing.JPanel stoque;
    private javax.swing.JPanel views;
    // End of variables declaration//GEN-END:variables
}
