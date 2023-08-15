
package Joho;

public class CartItem {

    private Product cartProduct = null;
    private Integer quantity = 0;
    private String payment = "creadit";

    public CartItem(Product products, Integer quantity, String payment) {
        cartProduct = products;
        this.quantity = quantity;
        this.payment = payment;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getItem() {
        return cartProduct;
    }

    public String getItemID() {
        return cartProduct.getID();
    }

    public void updateQuantity(Integer value) {
        quantity += value;
        if (quantity < 1) {
            quantity = 1;
        }
    }
}
