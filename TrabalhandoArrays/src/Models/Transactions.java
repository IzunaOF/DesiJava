/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Transactions {

    private Integer numero;
    private Account conta;
    private Date created_at;
    private TipoOperacao type;
    private Double valor;
    private Double saldoMomento;
 

    public Transactions(Account conta, TipoOperacao type, Double valor) {
        this.conta = conta;
        this.created_at = new Date();
        this.type = type;
        this.valor = valor;
    }

    public Transactions(Integer numero,Account conta,  Date created_at, TipoOperacao type, Double saldo, Double valor) {
        this.numero = numero;
        this.conta = conta;
        this.created_at = created_at;
        this.type = type;
        this.valor = valor;
        this.saldoMomento = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public Account getConta() {
        return conta;
    }

    public Double getValor() {
        return valor;
    }
    
    public Date getCreated_at() {
        return created_at;
    }

    public String getType() {
        if (this.type.compareTo(TipoOperacao.ENTRADA) == 0) {
            return "entrada";
        } else {
            return "saida";
        }
    }
}
