package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank {
    
    private HashMap<String, Account> banco = new HashMap<>();
    
    public Bank() {
        
    }
    
    public Account findAccountByDocument(String key) {
        return this.banco.get(key);
    }
    
    public Pessoa findTitularByDocument(String key) {
        return this.banco.get(key).getTitular();
    }
    
    public void addNovaConta(String key, Account conta) {
        this.banco.put(key, conta);
    }
    
    public void extrato(String contaID) {
        
    }
    
    public void transferir(Account remetente, Double value, String contaID) {
        if (banco.get(remetente.getNumeroConta()).getSaldo() > value) {
             banco.get(contaID).depositar(remetente.sacar(value));            
        }
    }
}
