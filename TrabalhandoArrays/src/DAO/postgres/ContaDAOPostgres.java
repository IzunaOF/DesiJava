package DAO.postgres;

import DAO.ContaDAO;
import Models.Account;
import Models.ContaCorrente;
import Models.ContaPoupanca;
import Models.ContaSalario;
import Models.PessoaFisica;
import Models.Pessoa;
import Models.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class ContaDAOPostgres implements ContaDAO {

    private final Connection connection;

    public ContaDAOPostgres(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void inserirConta(Account conta) {

        try {
            String sql = "INSERT INTO t_conta (id, numero, saldo, tipo, pessoa_id, senha) VALUES (?,?,?,CAST(? as tipo_conta) ,?, ?) ";

            String tipoConta = (conta instanceof ContaCorrente) ? "corrente" : (conta instanceof ContaPoupanca) ? "poupanca" : "salario";

            PreparedStatement stm = this.connection.prepareStatement(sql);

            stm.setObject(1, conta.getId());
            stm.setInt(2, conta.getNumeroConta());
            stm.setDouble(3, conta.getSaldo());
            stm.setString(4, tipoConta);
            stm.setObject(5, conta.getTitular().getId());
            stm.setString(6, conta.getSenha());

            stm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public Account buscarContaPorDocumentoTitular(String documento) {
        try {
            String sql = "SELECT c.id, c.numero, c.saldo, c.tipo, c.pessoa_id, c.senha,  p.nome, p.tipo as pessoa_tipo FROM t_conta as c JOIN t_pessoa as p ON c.pessoa_id = p.id WHERE p.documento =  ?";
            PreparedStatement stm = this.connection.prepareStatement(sql);

            stm.setString(1, "1234567898");
            ResultSet resp = stm.executeQuery();

            if (resp.next()) {
                UUID id = resp.getObject("pessoa_id", UUID.class);
                String nome = resp.getString("nome");
                String tipo = resp.getString("pessoa_tipo");

                Pessoa pessoa;

                if (tipo.equals("PF")) {
                    pessoa = new PessoaFisica(id, nome, documento);
                } else {
                    pessoa = new PessoaJuridica(id, nome, documento);
                }

                UUID idConta = resp.getObject("id", UUID.class);
                Integer numero = resp.getInt("numero");
                Double saldo = resp.getDouble("saldo");
                String tipoConta = resp.getString("tipo");
                String senha = resp.getString("senha");

                switch (tipoConta) {
                    case "corrente":
                        return new ContaCorrente(idConta, pessoa, numero, tipoConta, tipo, saldo, senha);
                    case "salario":
                        return new ContaSalario(idConta, pessoa, numero, tipoConta, tipo, saldo, senha);
                    default:
                        return new ContaPoupanca(idConta, pessoa, numero, tipoConta, tipo, saldo, senha);
                }
            } 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

    @Override
    public void atualizarSaldo(Account conta) {
        try {
            String sql = "UPDATE t_conta SET saldo = ? WHERE id = ?";
            
            PreparedStatement stm = this.connection.prepareStatement(sql);

            stm.setDouble(1, conta.getSaldo());
            stm.setObject(2, conta.getId());
            stm.executeUpdate();
            
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
