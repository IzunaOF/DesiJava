
package DAO;
import Models.Transactions;
import java.util.List;

public interface TransactionDAO {
    public void insertTransaction(Transactions transaction );
    public List<Transactions> getAccountTransaction(String documento);
}
