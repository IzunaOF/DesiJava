
package Models;

import java.util.UUID;

public class ContaCorrente extends Account{

    public ContaCorrente(Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular) {
        super(titular, numeroConta, tipoConta, tipoTitular);
    }

    public ContaCorrente(UUID id, Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, Double saldo) {
        super(id, titular, numeroConta, tipoConta, tipoTitular, saldo);
    }
    
    
    
}
