package Views;

import classes.Pessoa.Contato.Contato;
import classes.Pessoa.Contato.Contatos;
import classes.Pessoa.Pessoa;
import classes.Tipos;
import dao.CombosDAO;
import dao.ContatoDAO;
import dao.ContatosDAO;
import dao.ContratanteDAO;
import dao.TipoContatoDAO;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import support.ComboItens;
import view.cliente.cliente;
import view.cliente.usuario;
import view.contratado;

public class Contato extends javax.swing.JInternalFrame {

    ContatosDAO contDAO = new ContatosDAO();
    private int codPessoa = 0, codContato = 0;
    private char tela = 'x';

    public Contato(int codPessoa, int codContato, char tela) {
        initComponents();
        this.codContato = codContato;
        this.codPessoa = codPessoa;
        this.tela = tela;
        new CombosDAO().popularCombo("tipoContato", "idtipoContato, titulo", cmbTipo, "");
        tfdCodigo.setText(String.valueOf(contDAO.pegaProximoCodigo()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTipo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tfdCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfdContato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();

        setTitle("Contato");

        jLabel11.setText("Tipo de contato *");

        tfdCodigo.setEditable(false);

        jLabel2.setText("Código");

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

        jLabel12.setText("Contato *");

        jLabel13.setText("Descrição");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipo, 0, 346, Short.MAX_VALUE)
                    .addComponent(tfdContato)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(6, 6, 6)
                                .addComponent(btnSair))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ComboItens item = new ComboItens();
        item.setCodigo(0);
        item.setDescricao("Selecione uma opção");

        if (!tfdContato.getText().trim().isEmpty() && !cmbTipo.getSelectedItem().equals(item)) {

            Contatos contacts = new Contatos();
            contacts.setCodigo(Integer.valueOf(tfdCodigo.getText()));
            contacts.setContato(tfdContato.getText());
            contacts.setDescricao(tfdContato.getText());

            Contato contact = new Contato();
            ComboItens comboTipo = (ComboItens) cmbTipo.getSelectedItem();
            contact.setTipoContato((Tipos) new TipoContatoDAO().consultarId(comboTipo.getCodigo()));
            contact.setContato(contacts);

            if (tela == 'u') {
                contact.setPessoa((Pessoa) new UsuarioDAO().consultarId(codPessoa));
            } else {
                contact.setPessoa((Pessoa) new ContratanteDAO().consultarId(codPessoa));
            }

            if (new ContatosDAO().salvar(contacts) == null && new ContatoDAO().salvar(contact) == null) {
                switch (tela) {
                    case 'c':
                        new ContatoDAO().popularTabela(cliente.tblContato, codPessoa);
                        break;
                    case 'u':
                        new ContatoDAO().popularTabela(usuario.tblContatos, codPessoa);
                        break;
                    case 'p':
                        new ContatoDAO().popularTabela(contratado.tblContato, codPessoa);
                        break;
                    default:
                        System.out.println("Houve algum problema 'tela = contatos.java'!");
                        break;
                }
                JOptionPane.showMessageDialog(null, "Sucesso no registro!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Houve algum erro no cadastro!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios devem estar todos preenchidos!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfdCodigo;
    private javax.swing.JTextField tfdContato;
    private javax.swing.JTextArea txaDescricao;
    // End of variables declaration//GEN-END:variables
}
