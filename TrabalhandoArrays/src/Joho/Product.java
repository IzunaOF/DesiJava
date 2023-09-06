/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Joho;

public class Product {

    private final String ID;
    private String NAME;
    private Double PRICE;
    private String DESCRIPTION;
    private String TYPE;

    public Product(String id, String name, Double price, String description, String type) {
        this.ID = id;
        this.NAME = name;
        this.PRICE = price;
        this.DESCRIPTION = description;
        this.TYPE = type;
    }

    public void updateName(String newName) {
        String formatted = newName.substring(0, 1).toUpperCase().concat(newName.substring(1));
        this.NAME = formatted;
    }

    public Boolean updatePrice(Double newPrice) {
        if (newPrice <= 0) {
            return false;
        }
        this.PRICE = newPrice;
        return true;
    }

    public void updateDescription(String newDescription) {
        this.DESCRIPTION = newDescription;
    }

    public void updateType(String newType) {
        this.TYPE = newType;
    }

    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.NAME;
    }

    public Double getPrice() {
        return this.PRICE;
    }

    public String getType() {
        return this.TYPE;
    }

    public String getDescription() {
        return this.DESCRIPTION;
    }
}