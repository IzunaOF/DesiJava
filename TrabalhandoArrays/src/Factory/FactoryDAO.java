package Factory;

import DAO.ContaDAO;
import DAO.PessoaDAO;
import DAO.TransactionDAO;
import DAO.postgres.ContaDAOPostgres;
import DAO.postgres.PessoaDAOPostgres;
import DAO.postgres.TransactionsDAOPostgres;
import java.sql.Connection;
import Util.ConnectionClient;

public class FactoryDAO {

    public static ContaDAO makeContaDAO() {
        Connection connection = ConnectionClient.getConnection();
        ContaDAOPostgres contaDAO = new ContaDAOPostgres(connection);

        return contaDAO;
    }

    public static PessoaDAO makePessoaDAO() {
        Connection connection = ConnectionClient.getConnection();
        PessoaDAOPostgres pessoaDAO = new PessoaDAOPostgres(connection);

        return pessoaDAO;
    }

    public static TransactionDAO makeTransactionDAO() {
        Connection connection = ConnectionClient.getConnection();
        TransactionsDAOPostgres transactionDAO = new TransactionsDAOPostgres(connection);

        return transactionDAO;
    }

}
