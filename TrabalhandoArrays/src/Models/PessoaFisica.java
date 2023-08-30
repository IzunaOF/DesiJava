package Models;

import java.util.UUID;

public class PessoaFisica extends Pessoa {

    public PessoaFisica(String nome, String documento) {
        super(nome, documento);
    
    }
    
     public PessoaFisica(UUID id, String nome, String documento) {
        super(id, nome, documento);
    
    }
}
