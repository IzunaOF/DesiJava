package Controllers;

import static Factory.FactoryDAO.makeTransactionDAO;
import Models.Pessoa;
import Models.Account;
import Models.TipoOperacao;
import Models.Transactions;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class TransactionsController {
    public static ArrayList<Transactions> transactions = new ArrayList<>();
    
    public Transactions createTransaction(Account conta, TipoOperacao type, Double valor) {
        Transactions transaction = null;
        switch (type) {
            case ENTRADA:
                new ContaController().depositar(conta.getTitular().getDocumento(), valor);
                transaction = new Transactions(conta, type, valor);
                makeTransactionDAO().insertTransaction(transaction);
                return transaction;
            case SAIDA:
                new ContaController().sacar(conta.getTitular().getDocumento(), valor);
                transaction = new Transactions(conta, type, valor);
                makeTransactionDAO().insertTransaction(transaction);
                return transaction;
            default:
                return null;
        }
    }
    
    public List<Transactions> pegarOperacoes(String documento){
        return makeTransactionDAO().getAccountTransaction(documento);
    }

    public void fazerDeposito(String documento, Double value) {

    }
}
