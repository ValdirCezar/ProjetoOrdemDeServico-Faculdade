package ordemdeservico.faculdade.telas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valdir Cezar
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    private int id = 1;

    /**
     * Creates new form TelasUsuario
     */
    public TelaUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPerfil = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblId = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cmbPerfil = new javax.swing.JComboBox();
        txtSenha = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gerenciamento de Usuários");
        setPreferredSize(new java.awt.Dimension(754, 622));

        lblPerfil.setText("Perfil");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "LOGIN", "SENHA", "PERFIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        lblId.setText("ID");

        lblLogin.setText("Login");

        lblNome.setText("Nome");

        txtId.setEnabled(false);

        lblSenha.setText("Senha");

        btnBuscar.setText("Buscar Usuários");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Padrão", "Admin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLogin)
                                    .addComponent(lblNome)
                                    .addComponent(lblSenha)
                                    .addComponent(lblPerfil))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblId)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (adicionar_usuario()) {
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        remover_usuario();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar_usuario();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        preencher_campos_txt();
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar_usuarios();
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox cmbPerfil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

    // Método para validar se todos os campos estão preenchidos
    private boolean verifica_campos() {
        if (this.txtNome.getText().isEmpty() || this.txtLogin.getText().isEmpty() || this.txtSenha.getText().isEmpty()) {
            // Se algum campo estiver vazio retorna true
            return true;
        } else {
            return false;
        }
    }

    // Método para gerar um ID para o usuário automaticamente
    private void gerar_id_usuario() {
        // A função abaixo irá acessar o arquivo de usuarios e analisar o ultimo
        // ID criado e o maior ID no sistema, então irá atribuir um valor a mais
        // a variável local "id" criada acima
        try {
            BufferedReader bread = new BufferedReader(new FileReader("usuario.txt"));
            String linha;
            String[] vet = null;

            while ((linha = bread.readLine()) != null) {
                vet = linha.split(",");
                // Convertendo o id do arquivo para inteiro
                int aux = Integer.parseInt(vet[0]);
                if (aux > id) {
                    id = aux;
                }
            }
            // Incrementando + 1 para o id
            id += 1;
            bread.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    // Método que irá verificar se o usuário já está cadastrado
    // no sistema para que o mesmo login não seja adicionado 2 vezes
    private boolean verifica_disp_login() {
        boolean aux = false;
        try {
            BufferedReader bread = new BufferedReader(new FileReader("usuario.txt"));
            String linha;
            String[] vet = null;
            while ((linha = bread.readLine()) != null) {
                vet = linha.split(",");
                // Caso o login que o usuário esteja inserindo já exista
                // o mesmo retorna true
                if (vet[2].equals(this.txtLogin.getText())) {
                    aux = true;
                }
            }
            bread.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return aux;
    }

    // Método que irá apenas limpar os campos Texto
    private void limpa_txt() {
        this.txtNome.setText(null);
        this.txtLogin.setText(null);
        this.txtSenha.setText(null);
        this.txtId.setText(null);
    }

    // Função irá pegar as informações da linha selecionada na 
    // tabela e irá inseri-las nos campos txt
    private void preencher_campos_txt() {
        int set = this.tblUsuarios.getSelectedRow();
        this.txtId.setText(this.tblUsuarios.getModel().getValueAt(set, 0).toString());
        this.txtNome.setText(this.tblUsuarios.getModel().getValueAt(set, 1).toString());
        this.txtLogin.setText(this.tblUsuarios.getModel().getValueAt(set, 2).toString());
        this.txtSenha.setText(this.tblUsuarios.getModel().getValueAt(set, 3).toString());
        this.cmbPerfil.setToolTipText(this.tblUsuarios.getModel().getValueAt(set, 4).toString());
    }

    // Método adiconar um novo usuário no sistema
    private boolean adicionar_usuario() {
        boolean aux = false;
        // Caso algum campo esteja vazio o mesmo será informado
        boolean verificaCampos = verifica_campos();
        if (verificaCampos) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            // Caso o login já exista o mesmo será informado
            boolean verDispLogin = verifica_disp_login();
            if (verDispLogin) {
                JOptionPane.showMessageDialog(null, "Login indisponível!");
                this.txtLogin.setText(null);
            } else {
                gerar_id_usuario();
                this.txtId.setText(Integer.toString(this.id));
                // Se atender as condições acima adicionaremos o mesmo
                try {
                    // Variável que irá receber o perfil selecionado no comboBox
                    String perfil = null;
                    if (this.cmbPerfil.getSelectedIndex() == 0) {
                        perfil = "padrao";
                    } else {
                        perfil = "admin";
                    }

                    BufferedWriter bw = new BufferedWriter(new FileWriter("usuario.txt", true));
                    bw.write(this.txtId.getText() + "," + this.txtNome.getText().toLowerCase() + "," + this.txtLogin.getText().toLowerCase()
                            + "," + this.txtSenha.getText() + "," + perfil);
                    bw.newLine();
                    bw.close();
                    limpa_txt();
                    aux = true;
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }
        return aux;
    }

    // Função que irá povoar a tabela com os usuários do sistema
    private void buscar_usuarios() {
        DefaultTableModel model = (DefaultTableModel) this.tblUsuarios.getModel();
        model.setNumRows(0);
        try {
            BufferedReader br = new BufferedReader(new FileReader("usuario.txt"));
            String linha;
            String[] vet = null;
            while ((linha = br.readLine()) != null) {
                vet = linha.split(",");
                model.addRow(new String[]{vet[0], vet[1], vet[2], vet[3], vet[4]});
            }
            br.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    // Função criada para realizar a edição do usuário
    private void editar_usuario() {
        boolean aux = false;
        try {
            // Primeiro verificamos a existência do login informado para edição
            BufferedReader br = new BufferedReader(new FileReader("usuario.txt"));
            String linha;
            String[] vet = null;
            while ((linha = br.readLine()) != null) {
                vet = linha.split(",");
                // Se o login existe
                if (vet[2].equals(this.txtLogin.getText())) {
                    // aux = true e id = id do login informado
                    aux = true;
                    this.id = Integer.parseInt(vet[0]);
                }
            }
            br.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        if (aux) {
            TelaEditarUsuario editarUsuario = new TelaEditarUsuario();
            editarUsuario.recebe_id(this.id, this.txtNome.getText(), this.txtLogin.getText(), this.txtSenha.getText());
            editarUsuario.setVisible(true);
        } else {
            buscar_usuarios();
            JOptionPane.showMessageDialog(null, "Login não encontrado!\nSelecione um login válidao na tabela abaixo");
        }

    }
    
    // Método Remover usuário
    private void remover_usuario() {
        int aux = 0;
        // Validando se o cliente possui ordens de serviço abertas em seu nome
        if (this.txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente da tabela abaixo para deletar");
            buscar_usuarios();
        } else {
            int opc;
            opc = JOptionPane.showConfirmDialog(null, "Deseja deletar o usuário?", "Atenção!", JOptionPane.YES_NO_OPTION);
            if (opc == JOptionPane.YES_OPTION) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("os.txt"));
                    String linha;
                    String[] vet = null;
                    while ((linha = br.readLine()) != null) {
                        vet = linha.split(",");
                        if (vet[2].equals(this.txtId.getText())) {
                            aux++;
                        }
                    }
                    br.close();

                    if (aux > 0) {
                        JOptionPane.showMessageDialog(null, "Usuário não pode ser deletado!\nO mesmo está relacionado a ordens de serviço no sistema");
                    } else {
                        BufferedReader br2 = new BufferedReader(new FileReader("usuario.txt"));
                        ArrayList<String> array = new ArrayList<>();
                        String linha2;
                        String[] vet2 = null;
                        while ((linha2 = br2.readLine()) != null) {
                            vet2 = linha2.split(",");
                            if (!vet2[0].equals(this.txtId.getText())) {
                                array.add(linha2);
                            }
                        }
                        br.close();
                        // Limpando o arquivo
                        FileWriter fw = new FileWriter("usuario.txt");
                        fw.close();

                        FileWriter fw1 = new FileWriter("usuario.txt", true);
                        for (int i = 0; i < array.size(); i++) {
                            fw1.write(array.get(i) + "\n");
                        }
                        fw1.close();
                        JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
