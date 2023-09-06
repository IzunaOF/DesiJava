
package Models;

import java.util.UUID;

public class ContaPoupanca  extends Account {

    public ContaPoupanca(Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, String senha) {
        super(titular, numeroConta, tipoConta, tipoTitular, senha);
    }

    public ContaPoupanca(UUID id, Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, Double saldo,String senha) {
        super(id, titular, numeroConta, tipoConta, tipoTitular, saldo, senha);
    }
    
}
