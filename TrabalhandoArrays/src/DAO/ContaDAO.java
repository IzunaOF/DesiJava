
package DAO;

import Models.Account;

public interface ContaDAO {
    public void inserirConta(Account conta);
    public Account buscarContaPorDocumentoTitular(String documento);
    public void atualizarSaldo(Account conta, Double value);
}
