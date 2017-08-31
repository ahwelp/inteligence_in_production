package views;

import classes.Pessoa.Endereco.Cidade;
import classes.Pessoa.Endereco.Endereco;
import classes.Pessoa.Endereco.Enderecos;
import classes.Pessoa.Endereco.Logradouro;
import classes.Pessoa.Pessoa;
import dao.CidadeDAO;
import dao.CombosDAO;
import dao.ContratanteDAO;
import dao.TipoEventoDAO;
import dao.EnderecosDAO;
import dao.LogradouroDAO;
import dao.UsuarioDAO;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import support.ComboItens;
import view.cliente.cliente;
import view.cliente.usuario;
import view.contratado;

public class Endereco_view extends javax.swing.JInternalFrame {

    int codPessoa = 0, codEndereco = 0, codPais = 0, codEstado = 0;
    char tela;

    public Endereco_view(int codPessoa, int codEndereco, char tela) {
        initComponents();
        this.codEndereco = codEndereco;
        this.codPessoa = codPessoa;
        this.tela = tela;

        tfdCodigo.setText(String.valueOf(new EnderecosDAO().pegaProximoCodigo()));

        new CombosDAO().popularCombo("pais", "idpais, nome", cmbPais, "");
        new CombosDAO().popularCombo("logradouro", "idlogradouro, nome", cmbLogradouro, "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tfdCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdCep = new javax.swing.JTextField();
        tfdBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfaComplemento = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        cmbLogradouro = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbTipoEndereco = new javax.swing.JComboBox<>();

        setTitle("Endereço");

        jLabel2.setText("Código");

        tfdCodigo.setEditable(false);

        jLabel1.setText("Rua *");

        jLabel3.setText("Número *");

        jLabel4.setText("CEP");

        jLabel5.setText("Bairro");

        jLabel6.setText("Pais *");

        cmbPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaisItemStateChanged(evt);
            }
        });

        jLabel7.setText("Estado *");

        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });

        jLabel8.setText("Cidade *");

        tfaComplemento.setColumns(20);
        tfaComplemento.setRows(5);
        jScrollPane1.setViewportView(tfaComplemento);

        jLabel9.setText("Complemento");

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

        jLabel10.setText("Logradouro *");

        jLabel11.setText("Tipo de endereço *");

        cmbTipoEndereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "1 - Casa", "2 - Trabalho", "3 - Lazer", "4 - Familiar", "5 - Outro" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipoEndereco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cmbLogradouro, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdNum)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(6, 6, 6)
                                .addComponent(btnSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdCep, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfdBairro))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(tfdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(cmbTipoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        if (!tfdEndereco.getText().trim().isEmpty() && !tfdNum.getText().trim().isEmpty()
                && !cmbLogradouro.getSelectedItem().equals(item) && !cmbPais.getSelectedItem().equals(item)
                && !cmbEstado.getSelectedItem().equals(item) && !cmbCidade.getSelectedItem().equals(item)
                && !cmbTipoEndereco.getSelectedItem().equals(item)) {
            Enderecos ends = new Enderecos();
            ends.setCodigo(Integer.valueOf(tfdCodigo.getText()));
            ends.setEndereco(tfdEndereco.getText());
            ends.setNum(tfdNum.getText());
            ends.setComplemento(tfaComplemento.getText());
            ends.setBairro(tfdBairro.getText());
            ends.setCep(tfdCep.getText());
            ComboItens comboLogradouro = (ComboItens) cmbLogradouro.getSelectedItem();
            ends.setLogradouro((Logradouro) new LogradouroDAO().consultarId(comboLogradouro.getCodigo()));
            ComboItens comboCidade = (ComboItens) cmbCidade.getSelectedItem();
            ends.setCidade((Cidade) new CidadeDAO().consultarId(comboCidade.getCodigo()));

            Endereco_view end = new Endereco_view();
            end.setEndereco(ends);
            end.setTipoEndereco(cmbTipoEndereco.getSelectedItem().toString());

//             U - Usuario
//             C - Cliente -> Empresa 
            if (tela == 'u') {
                end.setPessoa((Pessoa) new UsuarioDAO().consultarId(codPessoa));
            } else {
                end.setPessoa((Pessoa) new ContratanteDAO().consultarId(codPessoa));
            }

            if (new EnderecosDAO().salvar(ends) == null && new TipoEventoDAO().salvar(end) == null) {
                dispose();
                switch (tela) {
                    case 'u':
                        new TipoEventoDAO().popularTabela(usuario.tblEnderecos, codPessoa);
                        break;
                    case 'c':
                        new TipoEventoDAO().popularTabela(cliente.tblEndereco, codPessoa);
                        break;
                    case 'p':
                        new TipoEventoDAO().popularTabela(contratado.tblEndereco, codPessoa);
                        break;
                    default:
                        break;
                }
                JOptionPane.showMessageDialog(null, "Registro gravado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Houve algum problema no seu registro, entre em contato com o suporte!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios devem estar todos preenchidos!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            ComboItens comboEstado = (ComboItens) cmbEstado.getSelectedItem();
            new CombosDAO().popularCombo("cidade", "idcidade, nome", cmbCidade, "estados = " + comboEstado.getCodigo());
        }
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void cmbPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaisItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            ComboItens comboPais = (ComboItens) cmbPais.getSelectedItem();
            new CombosDAO().popularCombo("estados", "idestado, nome", cmbEstado, "pais = " + comboPais.getCodigo());
        }
    }//GEN-LAST:event_cmbPaisItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbLogradouro;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbTipoEndereco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfaComplemento;
    private javax.swing.JTextField tfdBairro;
    private javax.swing.JTextField tfdCep;
    private javax.swing.JTextField tfdCodigo;
    private javax.swing.JTextField tfdEndereco;
    private javax.swing.JTextField tfdNum;
    // End of variables declaration//GEN-END:variables

}
