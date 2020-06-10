package ordemdeservico.faculdade.telas;

/**
 *
 * @author Valdir Cezar
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        itemMenuUsuarios = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        itemMenuClientes = new javax.swing.JMenuItem();
        menuOs = new javax.swing.JMenu();
        itemMenuOs = new javax.swing.JMenuItem();
        itemMenuOpcoes = new javax.swing.JMenu();
        itemMenuSobre = new javax.swing.JMenuItem();
        itemMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        menuUsuarios.setText("Usuários");
        menuUsuarios.setEnabled(false);
        menuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuariosActionPerformed(evt);
            }
        });

        itemMenuUsuarios.setText("Gerênciar Usuários");
        itemMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemMenuUsuarios);

        jMenuBar1.add(menuUsuarios);

        menuClientes.setText("Clientes");

        itemMenuClientes.setText("Gerênciar Clientes");
        itemMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuClientesActionPerformed(evt);
            }
        });
        menuClientes.add(itemMenuClientes);

        jMenuBar1.add(menuClientes);

        menuOs.setText("OS");

        itemMenuOs.setText("Gerênciar Ordens de Serviço");
        menuOs.add(itemMenuOs);

        jMenuBar1.add(menuOs);

        itemMenuOpcoes.setText("Opções");

        itemMenuSobre.setText("Sobre");
        itemMenuOpcoes.add(itemMenuSobre);

        itemMenuSair.setText("Sair");
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        itemMenuOpcoes.add(itemMenuSair);

        jMenuBar1.add(itemMenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuUsuariosActionPerformed
        gerenciar_usuario();
    }//GEN-LAST:event_itemMenuUsuariosActionPerformed

    private void menuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuariosActionPerformed

    }//GEN-LAST:event_menuUsuariosActionPerformed

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed
    }//GEN-LAST:event_itemMenuSairActionPerformed

    private void itemMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuClientesActionPerformed
        gerenciar_cliente();
    }//GEN-LAST:event_itemMenuClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem itemMenuClientes;
    private javax.swing.JMenu itemMenuOpcoes;
    private javax.swing.JMenuItem itemMenuOs;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JMenuItem itemMenuSobre;
    private javax.swing.JMenuItem itemMenuUsuarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuOs;
    public static javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables

    // Método para criar uma nova tela de gerenciamento de usuários
    private void gerenciar_usuario() {
        TelaUsuario telaUsu = new TelaUsuario();
        telaUsu.setVisible(true);
        desktop.add(telaUsu);
    }

    // Método para criar uma nova tela de gerenciamento de clientes
    private void gerenciar_cliente() {
        TelaCliente telaCli = new TelaCliente();
        telaCli.setVisible(true);
        desktop.add(telaCli);
    }
}
