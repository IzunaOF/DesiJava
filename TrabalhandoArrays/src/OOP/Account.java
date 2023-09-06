/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardo_santos29
 */
public class Account {

    private String ownerName;
    private String numberAccount;
    private Double balance;

    public Account(String ownerName, String numberAccount) {
        this.ownerName = ownerName;
        this.numberAccount = numberAccount;
        this.balance = 0.0;
    }

    public void init() {

    }

    public String getOwnerAccount() {
        return this.ownerName;
    }

    public String getNumberAccount() {
        return this.numberAccount;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void deposit(Double value) {
        this.setBalance(value);
    }

    public Boolean withdraw(Double value) {
        if (value > this.balance) {
            return false;
        }
        this.setBalance(-value);
        return true;
    }

    protected void setBalance(Double value) {
        this.balance += value;
    }
}
