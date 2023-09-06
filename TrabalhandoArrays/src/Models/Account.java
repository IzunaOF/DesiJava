package Models;

import java.util.UUID;
import org.mindrot.jbcrypt.BCrypt;

public class Account {

    private UUID id;
    private Pessoa titular;
    private Integer numeroConta;
    private String tipoConta;
    private String tipoTitular;
    private Double saldo;
    private String senha;

    public Account(Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, String senha) {
        this.id = UUID.randomUUID();
        this.senha = BCrypt.hashpw(senha, BCrypt.gensalt());
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.tipoTitular = tipoTitular;
        this.saldo = 0.0;
    }

    public Account(UUID id, Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, Double saldo, String senha) {
        this.id = id;
        this.senha = senha;
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.tipoTitular = tipoTitular;
        this.saldo = saldo;
    }

    public UUID getId() {
        return this.id;
    }
    
    public String getSenha(){
        return this.senha;
    }

    public String getNomeTitular() {
        return titular.getNome();
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getTipoTitular() {
        return tipoTitular;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void depositar(Double value) {
        if (value < 0) {
            return;
        }

        this.saldo += value;
    }

    public Double sacar(Double value) {
        if (value > saldo) {
            return value;
        }
        return this.saldo -= value;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public boolean validaSenha(String senha){
        return BCrypt.checkpw(senha, this.senha);
    }
}
