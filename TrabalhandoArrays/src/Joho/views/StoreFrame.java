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

        int x = 50;
        int y = 0;
        int w = 150;
        int h = 150;

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
                x = 50;
                y += 130;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout stoqueLayout = new javax.swing.GroupLayout(stoque);
        stoque.setLayout(stoqueLayout);
        stoqueLayout.setHorizontalGroup(
            stoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        stoqueLayout.setVerticalGroup(
            stoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        page.setText("page");

        cartOwner.setText("cartOwner");

        prevPage.setText("<<");
        prevPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevPageMouseClicked(evt);
            }
        });

        nextPage.setText(">>");
        nextPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPageMouseClicked(evt);
            }
        });

        addCartView.setText("CartView");
        addCartView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartViewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addComponent(prevPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(page)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextPage)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addComponent(cartOwner)
                        .addGap(178, 178, 178)
                        .addComponent(addCartView)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addComponent(stoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartOwner)
                    .addComponent(addCartView))
                .addGap(18, 18, 18)
                .addComponent(stoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page)
                    .addComponent(prevPage)
                    .addComponent(nextPage))
                .addContainerGap())
        );

        main.add(container, "showcase");

        javax.swing.GroupLayout viewsLayout = new javax.swing.GroupLayout(views);
        views.setLayout(viewsLayout);
        viewsLayout.setHorizontalGroup(
            viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        viewsLayout.setVerticalGroup(
            viewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        backPage.setText("<<");
        backPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backPageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cartViewLayout = new javax.swing.GroupLayout(cartView);
        cartView.setLayout(cartViewLayout);
        cartViewLayout.setHorizontalGroup(
            cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartViewLayout.createSequentialGroup()
                .addGroup(cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartViewLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(views, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cartViewLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(backPage)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        cartViewLayout.setVerticalGroup(
            cartViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartViewLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(backPage)
                .addGap(18, 18, 18)
                .addComponent(views, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
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
                .addGap(0, 236, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartView;
    private javax.swing.JButton backPage;
    private javax.swing.JLabel cartOwner;
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
