
package Models;

import java.util.UUID;

public class ContaSalario  extends Account {

    public ContaSalario(Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, String senha) {
        super(titular, numeroConta, tipoConta, tipoTitular, senha);
    }

    public ContaSalario(UUID id, Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, Double saldo,String senha) {
        super(id, titular, numeroConta, tipoConta, tipoTitular, saldo, senha);
    }
    
    
}
