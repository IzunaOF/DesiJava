
package DAO;
import Models.Transactions;

public interface TransactionDAO {
    public void createTransaction(Transactions transaction);
    public Transactions[] getAccountTransaction();
}
