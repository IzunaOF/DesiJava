
package Models;

import java.util.UUID;

public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(String nome, String documento) {
        super(nome, documento);
    }

    public PessoaJuridica(UUID id, String nome, String documento) {
        super(id, nome, documento);
    }
    
    

}
