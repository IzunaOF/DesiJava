/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;
import java.util.UUID;

public class Transactions {

    private Integer numero;
    private UUID conta_id;
    private UUID pessoa_id;
    private String created_at;
    private TipoOperacao type;
    private Double saldo;

    public Transactions(Integer numero, UUID conta_id, UUID pessoa_id, TipoOperacao type, Double saldo) {
        this.numero = numero;
        this.conta_id = conta_id;
        this.pessoa_id = pessoa_id;
        this.created_at = new Date().toLocaleString();
        this.type = type;
        this.saldo = saldo;
    }

    public Transactions(Integer numero, UUID conta_id, UUID pessoa_id, String created_at, TipoOperacao type, Double saldo) {
        this.numero = numero;
        this.conta_id = conta_id;
        this.pessoa_id = pessoa_id;
        this.created_at = created_at;
        this.type = type;
        this.saldo = saldo;
    }
}
