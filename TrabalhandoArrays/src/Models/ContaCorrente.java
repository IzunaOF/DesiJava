
package Models;

import java.util.UUID;

public class ContaCorrente extends Account{

    public ContaCorrente(Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, String senha) {
        super(titular, numeroConta, tipoConta, tipoTitular, senha);
    }

    public ContaCorrente(UUID id, Pessoa titular, Integer numeroConta, String tipoConta, String tipoTitular, Double saldo, String senha) {
        super(id, titular, numeroConta, tipoConta, tipoTitular, saldo,senha);
    }
    
    
    
}
