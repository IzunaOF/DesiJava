package Models;

import java.util.UUID;

public class Account {

    private UUID id;
    private Pessoa titular;
    private Integer numeroConta;
    private String tipoConta;
    private String tipoTitular;
    private Double saldo;

    public Account(Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular) {
        this.id = UUID.randomUUID();
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.tipoTitular = tipoTitular;
        this.saldo = 0.0;
    }

    public Account(UUID id, Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, Double saldo) {
        this.id = id;
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.tipoTitular = tipoTitular;
        this.saldo = saldo;
    }

    public UUID getId() {
        return this.id;
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
}
