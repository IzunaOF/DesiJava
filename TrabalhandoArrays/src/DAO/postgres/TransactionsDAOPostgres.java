package DAO.postgres;

import DAO.TransactionDAO;
import Models.Transactions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import static Factory.FactoryDAO.makeContaDAO;
import static Controllers.TransactionsController.transactions;
import Models.Account;
import Models.TipoOperacao;
import Models.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransactionsDAOPostgres implements TransactionDAO {

    Connection connection;

    public TransactionsDAOPostgres(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertTransaction(Transactions transaction) {
        try {

            String sql = "INSERT INTO transactions (conta_id, created_at, tipo_operacao, saldo_conta, valor) VALUES(?, ?, CAST(? as enum_tipo_operacao), ?, ?)";

            PreparedStatement stm = this.connection.prepareStatement(sql);

            stm.setObject(1, transaction.getConta().getId());
            stm.setDate(2, new Date(transaction.getCreated_at().getTime()));
            stm.setString(3, transaction.getType());
            stm.setDouble(4, transaction.getConta().getSaldo());
            stm.setDouble(5, transaction.getValor());

            stm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    @Override
    public List<Transactions> getAccountTransaction(String documento) {
        
        try {

            Account conta = makeContaDAO().buscarContaPorDocumentoTitular(documento);

            String sql2 = "SELECT t.id, t.conta_id, t.created_at, t.tipo_operacao, t.saldo_conta, t.valor"
                    + " FROM transactions as t WHERE conta_id = ?";

            String sql = "SELECT t.id, t.created_at, t.tipo_operacao,t.saldo_conta, t.valor,  "
                    + "c.id, c.numero, c.saldo, c.tipo, c.pessoa_id, c.senha"
                    + ",  p.nome, p.tipo as pessoa_tipo"
                    + " FROM transactions AS t  JOIN t_conta as c ON t.conta_id = c.id JOIN t_pessoa as p ON c.pessoa_id = p.id"
                    + " WHERE c.numero = ?";

            PreparedStatement stm = this.connection.prepareStatement(sql2);

            stm.setObject(1, conta.getId());

            ResultSet resp = stm.executeQuery();
            
            while(resp.next()){
                Integer numero = resp.getInt("id");
                Date created_at = resp.getDate("created_at");
                Double valor = resp.getDouble("valor");
                Double saldo = resp.getDouble("saldo_conta");
                String tipo = resp.getString("tipo_operacao");

                Transactions response = new Transactions(numero, conta, created_at, tipo.equals("saida") ? TipoOperacao.SAIDA : TipoOperacao.ENTRADA, saldo, valor);
                transactions.add(response);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

}
