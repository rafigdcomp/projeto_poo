
package Formularios;

import Classes.DadosDeLogin;

public class frmMenu extends javax.swing.JFrame {

    private static void EXIT_ON_CLOSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private DadosDeLogin classedados;

    public void setDadosDeLogin(DadosDeLogin classedados){
        this.classedados = classedados;
    }

    public frmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Deskpainel = new java.awt.Panel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnarquivos = new javax.swing.JMenu();
        mnarquivosusuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnarquivosclientes = new javax.swing.JMenuItem();
        mnarquivosprodutos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnarquivosaltusuarios = new javax.swing.JMenuItem();
        mnarquivosaltsenha = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnarquivossair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnrelatorios = new javax.swing.JMenu();
        mnrelatoriosvendas = new javax.swing.JMenuItem();
        mnrelatoriosestoques = new javax.swing.JMenuItem();
        mnrelatoriosacusuarios = new javax.swing.JMenuItem();
        mnajuda = new javax.swing.JMenu();
        mnajudaajuda = new javax.swing.JMenuItem();
        mnajudasobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA SUPERMECADO");

        javax.swing.GroupLayout DeskpainelLayout = new javax.swing.GroupLayout(Deskpainel);
        Deskpainel.setLayout(DeskpainelLayout);
        DeskpainelLayout.setHorizontalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        DeskpainelLayout.setVerticalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        mnarquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivo2.png"))); // NOI18N
        mnarquivos.setText("Arquivos");

        mnarquivosusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios1.png"))); // NOI18N
        mnarquivosusuarios.setText("Funcionarios");
        mnarquivosusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosusuariosActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosusuarios);
        mnarquivos.add(jSeparator1);

        mnarquivosclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes4.jpg"))); // NOI18N
        mnarquivosclientes.setText("Clientes");
        mnarquivosclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosclientesActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosclientes);

        mnarquivosprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        mnarquivosprodutos.setText("Produtos");
        mnarquivosprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosprodutosActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosprodutos);
        mnarquivos.add(jSeparator2);

        mnarquivosaltusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario3.png"))); // NOI18N
        mnarquivosaltusuarios.setText("Alterar Usuario");
        mnarquivos.add(mnarquivosaltusuarios);

        mnarquivosaltsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha3.png"))); // NOI18N
        mnarquivosaltsenha.setText("Alterar Senha");
        mnarquivos.add(mnarquivosaltsenha);
        mnarquivos.add(jSeparator3);

        mnarquivossair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair1.jpg"))); // NOI18N
        mnarquivossair.setText("Sair");
        mnarquivossair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivossairActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivossair);

        jMenuBar1.add(mnarquivos);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar4.png"))); // NOI18N
        jMenu1.setText("Tela de Vendas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("jMenuItem2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        mnrelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio1.png"))); // NOI18N
        mnrelatorios.setText("Relatorios");

        mnrelatoriosvendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio3.png"))); // NOI18N
        mnrelatoriosvendas.setText("Rel. Vendas");
        mnrelatorios.add(mnrelatoriosvendas);

        mnrelatoriosestoques.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio2.png"))); // NOI18N
        mnrelatoriosestoques.setText("Rel. Estoques");
        mnrelatorios.add(mnrelatoriosestoques);

        mnrelatoriosacusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio4.jpg"))); // NOI18N
        mnrelatoriosacusuarios.setText("Rel. Ac. Funcionarios");
        mnrelatorios.add(mnrelatoriosacusuarios);

        jMenuBar1.add(mnrelatorios);

        mnajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajuda1.png"))); // NOI18N
        mnajuda.setText("Ajuda");

        mnajudaajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajuda2.png"))); // NOI18N
        mnajudaajuda.setText("Ajuda");
        mnajuda.add(mnajudaajuda);

        mnajudasobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobre-nos1.png"))); // NOI18N
        mnajudasobre.setText("Sobre");
        mnajuda.add(mnajudasobre);

        jMenuBar1.add(mnajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnarquivosusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosusuariosActionPerformed
        //este código é do menu usuário
        frmusuarios fusuario = new frmusuarios();
        fusuario.setDadosDeLogin(classedados);
        Deskpainel.add(fusuario);
        fusuario.setLocationRelativeTo(null);
        fusuario.show();
    }//GEN-LAST:event_mnarquivosusuariosActionPerformed

    private void mnarquivosclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosclientesActionPerformed
        // este codigo é do menu clientes
        frmclientes fcliente = new frmclientes();
        Deskpainel.add(fcliente);
        fcliente.show();
    }//GEN-LAST:event_mnarquivosclientesActionPerformed

    private void mnarquivosprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosprodutosActionPerformed
        // este é o codigo do menu produtos
        frmprodutos fproduto = new frmprodutos();
        Deskpainel.add(fproduto);
        fproduto.show();
    }//GEN-LAST:event_mnarquivosprodutosActionPerformed

    private void mnarquivossairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivossairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnarquivossairActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        //frmprodutos fproduto = new frmprodutos();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.out.print("Ola");
        frmTelaVendas ftelavendas = new frmTelaVendas();
        Deskpainel.add(ftelavendas);
        ftelavendas.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel Deskpainel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu mnajuda;
    private javax.swing.JMenuItem mnajudaajuda;
    private javax.swing.JMenuItem mnajudasobre;
    private javax.swing.JMenu mnarquivos;
    private javax.swing.JMenuItem mnarquivosaltsenha;
    private javax.swing.JMenuItem mnarquivosaltusuarios;
    private javax.swing.JMenuItem mnarquivosclientes;
    private javax.swing.JMenuItem mnarquivosprodutos;
    private javax.swing.JMenuItem mnarquivossair;
    private javax.swing.JMenuItem mnarquivosusuarios;
    private javax.swing.JMenu mnrelatorios;
    private javax.swing.JMenuItem mnrelatoriosacusuarios;
    private javax.swing.JMenuItem mnrelatoriosestoques;
    private javax.swing.JMenuItem mnrelatoriosvendas;
    // End of variables declaration//GEN-END:variables
}
