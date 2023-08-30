
package Models;

import java.util.UUID;

public class ContaSalario  extends Account {

    public ContaSalario(Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular) {
        super(titular, numeroConta, tipoConta, tipoTitular);
    }

    public ContaSalario(UUID id, Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, Double saldo) {
        super(id, titular, numeroConta, tipoConta, tipoTitular, saldo);
    }
    
    
}
