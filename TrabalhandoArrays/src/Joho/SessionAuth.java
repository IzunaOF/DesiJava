/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joho;

public class SessionAuth {
    public Account currentUser;
    public SessionAuth(Account user){
        this.currentUser = user;
    }
    public String getCurrentUser(){
        return this.currentUser.getUserID();
    }
}
