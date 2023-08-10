package OOP;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Application {

    private List<Account> accountList;
    private Account session;

    public void init() {
        this.accountList = new ArrayList<>();
        int entryAnswer = 0;
        boolean hasSession = false;
        do {

            entryAnswer = Integer.valueOf(JOptionPane.showInputDialog("1 - Entrar com uma conta existente"
                    + "\n2 - Criar nova Conta"
                    + "\n3 - Encerrar Aplicativo", " ").replace(" ", "0"));

            if (entryAnswer == 1) {
                String ownerNumberAccount = getUserAnswers("Numero da Conta");
                hasSession = this.findUserSession(ownerNumberAccount);
            } else if (entryAnswer == 2) {
                this.createNewAccount();
            }

            if ((entryAnswer > 0 && entryAnswer < 3) && hasSession) {
                this.run();
            }

        } while (entryAnswer != 3);

        this.exitMessage();

    }

    public void run() {
        int ans = 0;
        Double value = 0.0;
        do {
            ans = Integer.valueOf(this.showMenu());

            if (ans == 6) {
                this.exitMessage();
            } else {
                switch (ans) {
                    case 1:
                        this.createNewAccount();
                        break;
                    case 2:
                        value = Double.parseDouble(this.getUserAnswers("Valor para depósito: "));
                        this.session.deposit(value);
                        break;
                    case 3:
                        value = Double.parseDouble(this.getUserAnswers("Valor para Saque: "));
                        this.session.withdraw(value);
                        break;
                    case 4:
                        this.showUserAccount();
                        break;
                    case 5:
                        int isToRemove = JOptionPane.showConfirmDialog(null, "Encerrar conta de usuário: " + this.session.getOwnerAccount());
                        if (isToRemove == 1) {
                            this.accountList.remove(session);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                        break;
                }
            }
        } while (ans != 6);

    }

    private void showUserAccount() {
        String account = "Nome Usuário: " + session.getOwnerAccount() + "\nNúmero da Conta: " + this.session.getNumberAccount() + "\nSaldo em Conta: " + this.session.getBalance();
        JOptionPane.showMessageDialog(null, account);
    }

    private Boolean findUserSession(String ownerNumberAccount) {
        for (int i = 0; i < accountList.size(); i++) {
            Account user = accountList.get(i);
            if (user.getNumberAccount().equals(ownerNumberAccount)) {
                this.session = user;
                return true;
            }

        }
        this.errorMessage("Conta Não Econtrada");
        return false;
    }

    private void createNewAccount() {
        String ownerName = getUserAnswers("Nome do Usuário");
        String numberAccount = String.valueOf(Math.floor(Math.random() * 10000)).replace(".", accountList.size() + "");

        accountList.add(new Account(ownerName, numberAccount));

        JOptionPane.showMessageDialog(null,
                "Contra Criada com Sucesso!"
                + "\n\nUsuário " + ownerName + " Criado"
                + "\n Número da Conta:\n' " + numberAccount + " '"
                + "\n Atenção guarde seu número de conta");
    }

    public void searchByName(String searchLine) {
        accountList.forEach(acc -> {
            acc.getOwnerAccount().equals(searchLine);
        });
    }

    private String getUserAnswers(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    private String showMenu() {
        return JOptionPane.showInputDialog(null, "1 - Criar Nova Conta"
                + "\n2 - Depositar"
                + "\n3 - Sacar"
                + "\n4 - Ver Conta"
                + "\n5 - Remover Conta"
                + "\n6 - Encerrar Sistema"
                + "\n\nEscolha uma das opções do menu", " ").replace(" ", "0");
    }

    private void errorMessage(String error) {
        JOptionPane.showMessageDialog(null, error);
    }

    private void exitMessage() {
        JOptionPane.showMessageDialog(null, "Encerrando aplicativo...");
    }
}
