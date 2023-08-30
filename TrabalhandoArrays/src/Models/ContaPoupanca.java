
package Models;

import java.util.UUID;

public class ContaPoupanca  extends Account {

    public ContaPoupanca(Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular) {
        super(titular, numeroConta, tipoConta, tipoTitular);
    }

    public ContaPoupanca(UUID id, Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, Double saldo) {
        super(id, titular, numeroConta, tipoConta, tipoTitular, saldo);
    }
    
}
