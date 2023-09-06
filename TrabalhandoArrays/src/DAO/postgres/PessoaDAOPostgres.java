
package DAO.postgres;

import DAO.PessoaDAO;
import Models.Pessoa;
import Models.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class PessoaDAOPostgres implements PessoaDAO{

    private final Connection connection;

    public PessoaDAOPostgres(Connection connection) {
        this.connection = connection;
    }
    
    
    @Override
    public void inserirPessoa(Pessoa pessoa) {
        try {
            String sql =  "INSERT INTO t_pessoa (id, nome, documento, tipo) VALUES(?, ?, ?, CAST(? as tipo_pessoa))";
            
            String tipoPessoa = (pessoa instanceof PessoaJuridica) ? "PJ" : "PF";
            
            PreparedStatement stm = this.connection.prepareStatement(sql);
            stm.setObject(1, pessoa.getId());
            stm.setString(2, pessoa.getNome());
            stm.setString(3, pessoa.getDocumento());
            stm.setString(4, tipoPessoa);
            
            stm.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Pessoa obterPessoaPeloID(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
