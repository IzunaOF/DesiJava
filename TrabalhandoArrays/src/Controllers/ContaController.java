package Controllers;

import DAO.postgres.ContaDAOPostgres;
import static Factory.FactoryDAO.makeContaDAO;
import Models.Pessoa;

import Models.Account;
import Models.ContaCorrente;
import Models.ContaPoupanca;
import Models.ContaSalario;
import Models.Main;
import Models.PessoaFisica;
import Util.ConnectionClient;

public class ContaController {

    private Integer ID_CONTROL = 2;

    private String[] types = {"cs", "cp", "cc"};

    public Account createAccount(Pessoa titular, String tipoConta, String tipoTitular, String senha) {
        Account conta;
        ID_CONTROL++;
        switch (tipoConta) {
            case "cc":
                conta = new ContaCorrente(titular, ID_CONTROL, "cc", tipoTitular, senha);
                break;
            case "cp":
                conta = new ContaPoupanca(titular, ID_CONTROL, "cp", tipoTitular, senha);
                break;
            case "cs":
                conta = new ContaSalario(titular, ID_CONTROL, "cs", tipoTitular, senha);
                break;
            default:
                conta = null;
                break;
        }

        makeContaDAO().inserirConta(conta);

        return null;
    }

    public Account getAccountByDocument(String key) {
        return makeContaDAO().buscarContaPorDocumentoTitular(key);
    }

    public void transferir(Account owner, String destino, Double value) {

    }

    public void depositar(String documento, Double value) {
        Account conta = makeContaDAO().buscarContaPorDocumentoTitular(documento);
        conta.depositar(value);
        makeContaDAO().atualizarSaldo(conta);
    }
    
        public void sacar(String documento, Double value) {
        Account conta = makeContaDAO().buscarContaPorDocumentoTitular(documento);
        conta.sacar(value);
        makeContaDAO().atualizarSaldo(conta);
    }
}
