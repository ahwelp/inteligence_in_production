package views;

import Entitys.Pessoa;
import Entitys.PossuiContato;
import Entitys.PossuiEndereco;
import dao.ContatoDAO;
import dao.EnderecosDAO;
import dao.GenericoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.Formatacao;
import utils.Support;
import static views.JanelaPrincipal.jDesktopPane;

public class Pessoa_view extends javax.swing.JInternalFrame {

    Pessoa pe = new Pessoa();

    public Pessoa_view() {
        initComponents();
        Formatacao.reformatarCpf(ftfCpf);
        Formatacao.reformatarData(ftfNascimento);
        resetField();
    }

    public void resetField() {
        tfdCodigo.setText(String.valueOf(new GenericoDAO<Pessoa>(pe).ProximoCodigo()));
        tfdNome.setText("");
        tfdApelido.setText("");
        tfdRG.setText("");
        ftfCpf.setText("");
        ftfNascimento.setText("");
        tfdExpedidor.setText("");
        rbtM.setSelected(true);

        new EnderecosDAO(new PossuiEndereco()).PopulaTabela(tblEnderecos);
        new ContatoDAO(new PossuiContato()).PopulaTabela(tblContatos);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btnGrupo = new javax.swing.ButtonGroup();
        lblNome1 = new javax.swing.JLabel();
        tfdCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        lblApelido = new javax.swing.JLabel();
        tfdApelido = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        ftfCpf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdRG = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        ftfNascimento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdExpedidor = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        rbtF = new javax.swing.JRadioButton();
        rbtM = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContatos = new javax.swing.JTable();
        btnAdicionaContato = new javax.swing.JButton();
        btnRemoveContato = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEnderecos = new javax.swing.JTable();
        btnRemoveEndereco = new javax.swing.JButton();
        btnAdicionaEndereco = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setTitle("Pessoa");
        setToolTipText("");

        lblNome1.setText("Código");

        tfdCodigo.setEnabled(false);

        lblNome.setText("Nome *");

        lblApelido.setText("Apelido");

        lblCPF.setText("CPF");

        jLabel1.setText("RG");

        lblNascimento.setText("Data de nascimento *");

        jLabel5.setText("Orgão expedidor");

        lblGenero.setText("Gênero");

        btnGrupo.add(rbtF);
        rbtF.setText("F - Feminino");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btnGrupo, org.jdesktop.beansbinding.ELProperty.create("F"), rbtF, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        btnGrupo.add(rbtM);
        rbtM.setSelected(true);
        rbtM.setText("M - Masculino");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btnGrupo, org.jdesktop.beansbinding.ELProperty.create("F"), rbtM, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        jLabel3.setText("Contato");

        tblContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblContatos);

        btnAdicionaContato.setText("Adicionar");
        btnAdicionaContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaContatoActionPerformed(evt);
            }
        });

        btnRemoveContato.setText("Remover");
        btnRemoveContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveContatoActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço");

        tblEnderecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblEnderecos);

        btnRemoveEndereco.setText("Remover");
        btnRemoveEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEnderecoActionPerformed(evt);
            }
        });

        btnAdicionaEndereco.setText("Adicionar");
        btnAdicionaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaEnderecoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("Fechar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCPF)
                            .addComponent(lblNascimento)
                            .addComponent(lblGenero)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ftfCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfdCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                            .addComponent(ftfNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfdNome, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblApelido)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(tfdRG, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfdApelido, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfdExpedidor, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtF)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtM))))
                            .addComponent(lblNome1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSair)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionaContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoveContato)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionaEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoveEndereco)
                                .addGap(0, 117, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap())
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApelido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNascimento)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfdExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtF)
                    .addComponent(rbtM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionaContato)
                    .addComponent(btnRemoveContato)
                    .addComponent(btnAdicionaEndereco)
                    .addComponent(btnRemoveEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEnderecoActionPerformed
        if (tblEnderecos.getSelectedRow() != -1) {

        } else {
            JOptionPane.showMessageDialog(null, "Uma linha da tabela deve estar selecionada para efetuar a ação!");
        }
    }//GEN-LAST:event_btnRemoveEnderecoActionPerformed

    private void btnRemoveContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveContatoActionPerformed
        JOptionPane.showInternalConfirmDialog(this, "Deseja remover este contato?",
                "O endereço selecionado será definitivamente removido.",
                JOptionPane.WARNING_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_btnRemoveContatoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!tfdCodigo.getText().trim().isEmpty() && !tfdNome.getText().trim().isEmpty()
                && !Formatacao.removerFormatacao(ftfNascimento.getText()).trim().isEmpty()) {

            try {
                pe.setNome(tfdNome.getText());
                pe.setApelido(tfdApelido.getText());
                pe.setCpf(Formatacao.removerFormatacao(ftfCpf.getText()));
                pe.setRg(tfdRG.getText());
                pe.setNascimento(Formatacao.formataDataSql(ftfNascimento.getText()));
                pe.setOrgexp(tfdExpedidor.getText());
                pe.setGenero((rbtM.isSelected()) ? "M" : "F");

                JOptionPane.showMessageDialog(null, new GenericoDAO<Pessoa>(pe).gravar());

                resetField();
            } catch (Exception ex) {
                Logger.getLogger(Pessoa_view.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios devem estar todos preenchidos!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAdicionaContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaContatoActionPerformed
        Contato_view conv = new Contato_view();
        Support.centralizar(jDesktopPane.add(conv));
        conv.setVisible(true);
    }//GEN-LAST:event_btnAdicionaContatoActionPerformed

    private void btnAdicionaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaEnderecoActionPerformed
        Endereco_view endv = new Endereco_view();
        Support.centralizar(jDesktopPane.add(endv));
        endv.setVisible(true);
    }//GEN-LAST:event_btnAdicionaEnderecoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaContato;
    private javax.swing.JButton btnAdicionaEndereco;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnRemoveContato;
    private javax.swing.JButton btnRemoveEndereco;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JFormattedTextField ftfNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JRadioButton rbtF;
    private javax.swing.JRadioButton rbtM;
    public static javax.swing.JTable tblContatos;
    public static javax.swing.JTable tblEnderecos;
    private javax.swing.JTextField tfdApelido;
    private javax.swing.JTextField tfdCodigo;
    private javax.swing.JTextField tfdExpedidor;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdRG;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
