package Views;

import Controllers.ContaController;
import Controllers.PessoaController;
import Models.Account;
import Models.Main;
import Models.Pessoa;
import javax.swing.JOptionPane;

public class GerenteView extends javax.swing.JFrame {
    
    private final PessoaController pController;
    private final ContaController accController;

    public GerenteView() {
        initComponents();
        this.pController = new PessoaController();
        this.accController = new ContaController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoConta = new javax.swing.ButtonGroup();
        botaoCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomeTitular = new javax.swing.JTextField();
        cpf_cnpj = new javax.swing.JTextField();
        ContaCorrente = new javax.swing.JRadioButton();
        contaPoupanca = new javax.swing.JRadioButton();
        contaSalario = new javax.swing.JRadioButton();
        tipoTitular = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoCriarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoCliente.setText("Cliente");
        botaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Gerente");

        cpf_cnpj.setPreferredSize(new java.awt.Dimension(60, 20));

        tipoConta.add(ContaCorrente);
        ContaCorrente.setText("Conta Corrente");
        ContaCorrente.setActionCommand("cc");

        tipoConta.add(contaPoupanca);
        contaPoupanca.setText("Conta Poupança");
        contaPoupanca.setActionCommand("cp");

        tipoConta.add(contaSalario);
        contaSalario.setText("Conta Salário");
        contaSalario.setActionCommand("cs");

        tipoTitular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica" }));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nome Titular");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("CPF/CNPJ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Tipo Titular");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Tipo Conta");

        botaoCriarConta.setText("CRIAR CONTA");
        botaoCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoCliente)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoCriarConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeTitular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(contaPoupanca)
                                    .addComponent(contaSalario)
                                    .addComponent(ContaCorrente)
                                    .addComponent(cpf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tipoTitular, 0, 137, Short.MAX_VALUE)))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCliente)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContaCorrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contaSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contaPoupanca)
                .addGap(18, 18, 18)
                .addComponent(botaoCriarConta, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteActionPerformed
        this.dispose();
        new ClienteView().setVisible(true);
    }//GEN-LAST:event_botaoClienteActionPerformed

    private void botaoCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarContaActionPerformed
        String nome = this.nomeTitular.getText();
        String cpfcnpj = this.cpf_cnpj.getText();
        String tpTitular = (String) this.tipoTitular.getSelectedItem();
        String tpConta = this.tipoConta.getSelection().getActionCommand();

        Pessoa titular = pController.criarPessoa(nome, cpfcnpj, tpTitular);
        Account account = accController.createAccount(titular, tpConta, tpTitular);
        
        Main.banco.addNovaConta("0001", account);
       
        this.nomeTitular.setText("");
        this.cpf_cnpj.setText("");
    }//GEN-LAST:event_botaoCriarContaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ContaCorrente;
    private javax.swing.JButton botaoCliente;
    private javax.swing.JButton botaoCriarConta;
    private javax.swing.JRadioButton contaPoupanca;
    private javax.swing.JRadioButton contaSalario;
    private javax.swing.JTextField cpf_cnpj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeTitular;
    private javax.swing.ButtonGroup tipoConta;
    private javax.swing.JComboBox<String> tipoTitular;
    // End of variables declaration//GEN-END:variables
}
