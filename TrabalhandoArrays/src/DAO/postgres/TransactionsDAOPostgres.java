
package DAO.postgres;

import DAO.TransactionDAO;
import Models.Transactions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionsDAOPostgres implements TransactionDAO{
    Connection connection;
    public TransactionsDAOPostgres(Connection connection){
        this.connection = connection;
    }
    @Override
    public void createTransaction(Transactions transaction) {
        try{
            String sql =  "INSERT INTO transactions (conta_id, pessoa_id, created_at, tipo_operacao) VALUES(?, ?, ?, CAST(? as enum_tipo_operacao))";
   
            PreparedStatement stm = this.connection.prepareStatement(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return;
        }
    }

    @Override
    public Transactions[] getAccountTransaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
