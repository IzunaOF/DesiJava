package Controllers;

import DAO.postgres.PessoaDAOPostgres;
import Models.Pessoa;
import Models.PessoaFisica;
import Models.PessoaJuridica;
import Util.ConnectionClient;

public class PessoaController {

    public Pessoa criarPessoa(String nomeTitular, String documento, String tipoTitular) {
        Pessoa pessoa = null;
        if (tipoTitular.endsWith("Pessoa Física")) {
            
            pessoa =  new PessoaFisica(nomeTitular, documento);
        }else{
            pessoa =  new PessoaJuridica(nomeTitular, documento);
        }
        
        new PessoaDAOPostgres(ConnectionClient.getConnection()).inserirPessoa(pessoa);
        return pessoa;
    }

    public Pessoa buscarPessoaPorDoumento(String documento) {
        return null;
    }
}
