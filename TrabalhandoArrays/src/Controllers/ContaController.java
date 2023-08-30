package Controllers;

import DAO.postgres.ContaDAOPostgres;
import Models.Pessoa;

import Models.Account;
import Models.ContaCorrente;
import Models.ContaPoupanca;
import Models.ContaSalario;
import Models.Main;
import Models.PessoaFisica;
import Util.ConnectionClient;

public class ContaController {
    private Integer ID_CONTROL = 0;

    private String[] types = {"cs", "cp", "cc"};

    public Account createAccount(Pessoa titular, String tipoConta, String tipoTitular) {
        Account conta;
        ID_CONTROL++;
        switch (tipoConta) {
            case "cc":
                conta = new ContaCorrente(titular,ID_CONTROL , "cc", tipoTitular);
                break;
            case "cp":
                conta = new ContaPoupanca(titular, ID_CONTROL, "cp", tipoTitular);
                break;
            case "cs":
                conta = new ContaSalario(titular, ID_CONTROL, "cs", tipoTitular);
                break;
            default:
                conta = null;
                break;
        }

         new ContaDAOPostgres(ConnectionClient.getConnection()).inserirConta(conta);
        
        
        return null;
    }

    public Account getAccountByDocument(String key) {
        return new ContaDAOPostgres((ConnectionClient.getConnection())).buscarContaPorDocumentoTitular(key);
    }

    public void transferir(Account owner, String destino, Double value) {
        
    }
    
    public void depositar(String documento, Double value){
        ContaDAOPostgres pg =  new ContaDAOPostgres(ConnectionClient.getConnection());
        Account conta = pg.buscarContaPorDocumentoTitular(documento);
        conta.depositar(value);
        pg.atualizarSaldo(conta);
    }
}
