
package Formularios;
import Classes.Usuario;
import Classes.DadosDeLogin;
import javax.swing.JOptionPane;

public class frmusuarios extends javax.swing.JInternalFrame {

private DadosDeLogin classedados;
private int usratual = 0;
private boolean comandonovo = false;

public void setDadosDeLogin(DadosDeLogin classedados){
    this.classedados = classedados;
}

    public frmusuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtcodusuario = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        combousuario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnomeusuario = new javax.swing.JTextField();
        txtmatusuario = new javax.swing.JTextField();
        cmdprimeiro = new javax.swing.JButton();
        cmdanterior = new javax.swing.JButton();
        cmdseguinte = new javax.swing.JButton();
        cmdultimo = new javax.swing.JButton();
        cmdadicionar = new javax.swing.JButton();
        cmdeditar = new javax.swing.JButton();
        cmdsalvar = new javax.swing.JButton();
        cmdpesquisar = new javax.swing.JButton();
        cmddeletar = new javax.swing.JButton();
        txtsenha1usuario = new javax.swing.JPasswordField();
        txtsenha2usuario = new javax.swing.JPasswordField();

        jCheckBox1.setText("jCheckBox1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de usuarios");
        setToolTipText("");
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Cod. do Usuario:");

        txtcodusuario.setEnabled(false);
        jScrollPane1.setViewportView(txtcodusuario);

        jLabel2.setText("Função:");

        combousuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a função", "1-Operador de Caixa", "2-Gerente" }));
        combousuario.setEnabled(false);

        jLabel3.setText("Nome:");

        jLabel4.setText("Matrícula");

        jLabel5.setText("Senha:");

        jLabel6.setText("Confirmar senha:");

        txtnomeusuario.setEnabled(false);

        txtmatusuario.setEnabled(false);

        cmdprimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        cmdprimeiro.setToolTipText("Primeiro");

        cmdanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        cmdanterior.setToolTipText("Anterior");

        cmdseguinte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        cmdseguinte.setToolTipText("Seguinte");

        cmdultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.png"))); // NOI18N
        cmdultimo.setToolTipText("Ultimo");

        cmdadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar1.jpg"))); // NOI18N
        cmdadicionar.setToolTipText("Adicionar");
        cmdadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdadicionarActionPerformed(evt);
            }
        });

        cmdeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar1.jpg"))); // NOI18N
        cmdeditar.setToolTipText("Editar");
        cmdeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeditarActionPerformed(evt);
            }
        });

        cmdsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar2.png"))); // NOI18N
        cmdsalvar.setToolTipText("Salvar");
        cmdsalvar.setEnabled(false);
        cmdsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsalvarActionPerformed(evt);
            }
        });

        cmdpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar2.jpg"))); // NOI18N
        cmdpesquisar.setToolTipText("Pesquisar");

        cmddeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deletar1.jpg"))); // NOI18N
        cmddeletar.setToolTipText("Deletar");
        cmddeletar.setEnabled(false);
        cmddeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeletarActionPerformed(evt);
            }
        });

        txtsenha1usuario.setText("jPasswordField1");

        txtsenha2usuario.setText("jPasswordField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdseguinte, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmddeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addComponent(txtnomeusuario))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtsenha1usuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmatusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtsenha2usuario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmatusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsenha1usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsenha2usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdeditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdprimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdanterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdseguinte)
                    .addComponent(cmdadicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdsalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdpesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmddeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdadicionarActionPerformed
        //Código do botão adicionar
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdseguinte.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdadicionar.setEnabled(false);
        cmdeditar.setEnabled(false);
        cmddeletar.setEnabled(true);
        cmdsalvar.setEnabled(true);
        cmdpesquisar.setEnabled(false);
        
        txtcodusuario.setEnabled(true);
        txtnomeusuario.setEnabled(true);
        txtmatusuario.setEnabled(true);
        txtsenha1usuario.setEnabled(true);
        txtsenha2usuario.setEnabled(true);
        combousuario.setEnabled(true);
        
        txtcodusuario.setText("");
        txtnomeusuario.setText("");
        txtmatusuario.setText("");
        txtsenha1usuario.setText("");
        txtsenha2usuario.setText("");
        combousuario.setSelectedIndex(0);
        
        comandonovo = true;
        
        txtcodusuario.requestFocusInWindow();
        
    }//GEN-LAST:event_cmdadicionarActionPerformed

    private void cmdsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsalvarActionPerformed
       // Validando os campos
       if(txtcodusuario.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane, "POR FAVOR, INSIRA UM CÓDIGO PARA FAZER CADASTRO");
           txtcodusuario.requestFocusInWindow();
           return;
       }
       if(combousuario.getSelectedIndex()==0){
           JOptionPane.showMessageDialog(rootPane, "POR FAVOR, SELECIONE UMA FUNÇÃ0 PARA FAZER CADASTRO");
           combousuario.requestFocusInWindow();
           return;
       }
       if(txtnomeusuario.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane, "POR FAVOR, INSIRA UM NOME PARA FAZER CADASTRO");
           txtnomeusuario.requestFocusInWindow();
           return;
       }
       if(txtmatusuario.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane, "POR FAVOR, INSIRA A MATRÍCULA PARA FAZER CADASTRO");
           txtmatusuario.requestFocusInWindow();
           return;
       }
       
       String senha1=new String(txtsenha1usuario.getPassword());
       String senha2=new String(txtsenha2usuario.getPassword());
       
       if(senha1.equals("")){
           JOptionPane.showMessageDialog(rootPane, "POR FAVOR, INSIRA UMA SENHA PARA FAZER CADASTRO");
           txtsenha1usuario.requestFocusInWindow();
           return;
       }
      
       if(senha2.equals("")){
           JOptionPane.showMessageDialog(rootPane, "POR FAVOR, CONFIRME A SENHA PARA FAZER CADASTRO");
           txtsenha2usuario.requestFocusInWindow();
           return;
       }
  
       if(!senha1.equals(senha2)){
           JOptionPane.showMessageDialog(rootPane, "AS SENHAS SÃO DIFERENTES");
           txtsenha1usuario.requestFocusInWindow();
           return;
       }
       int posicao = classedados.verUsuario(txtnomeusuario.getText());
       if(posicao != -1){
           JOptionPane.showMessageDialog(rootPane,"USUARIO JÁ EXISTE!");
           txtnomeusuario.requestFocusInWindow();
           return;
       } else {
           if(posicao == -1){
               JOptionPane.showMessageDialog(rootPane,"USUARIO NÃO EXISTE NO CADASTRO");
               txtnomeusuario.requestFocusInWindow();
               return;
           }
       }
       Usuario maisUsrs = new Usuario(txtcodusuario.getText(),(String)combousuario.getSelectedItem(),txtnomeusuario.getText(),txtmatusuario.getText(),senha1, senha2);
       String mensg = classedados.CadastraUsuarios(maisUsrs);
       JOptionPane.showMessageDialog(rootPane, mensg);
       
       
       
        // Código do botão Salvar:
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdseguinte.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdeditar.setEnabled(true);
        cmddeletar.setEnabled(false);
        cmdsalvar.setEnabled(false);
        cmdpesquisar.setEnabled(true);
        
        txtcodusuario.setEnabled(false);
        txtnomeusuario.setEnabled(false);
        txtmatusuario.setEnabled(false);
        txtsenha1usuario.setEnabled(false);
        txtsenha2usuario.setEnabled(false);
        combousuario.setEnabled(false);
    }//GEN-LAST:event_cmdsalvarActionPerformed

    private void cmddeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeletarActionPerformed
        // Codigo do botão Deletar:
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdseguinte.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdeditar.setEnabled(true);
        cmddeletar.setEnabled(false);
        cmdsalvar.setEnabled(false);
        cmdpesquisar.setEnabled(true);
        
        txtcodusuario.setEnabled(false);
        txtnomeusuario.setEnabled(false);
        txtmatusuario.setEnabled(false);
        txtsenha1usuario.setEnabled(false);
        txtsenha2usuario.setEnabled(false);
        combousuario.setEnabled(false);
    }//GEN-LAST:event_cmddeletarActionPerformed

    private void cmdeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeditarActionPerformed
        // Código do botão editar:
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdseguinte.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdadicionar.setEnabled(false);
        cmdeditar.setEnabled(false);
        cmddeletar.setEnabled(true);
        cmdsalvar.setEnabled(true);
        cmdpesquisar.setEnabled(false);
        
        
        txtnomeusuario.setEnabled(true);
        txtmatusuario.setEnabled(true);
        txtsenha1usuario.setEnabled(true);
        txtsenha2usuario.setEnabled(true);
        combousuario.setEnabled(true);
        
        comandonovo = false;
        
        txtnomeusuario.requestFocusInWindow();
    }//GEN-LAST:event_cmdeditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtcodusuario.setText(classedados.getUsuarios()[usratual].getCodusuario());
        txtnomeusuario.setText(classedados.getUsuarios()[usratual].getNomeusuario());
        txtmatusuario.setText(classedados.getUsuarios()[usratual].getMatusuario());
        txtsenha1usuario.setText(classedados.getUsuarios()[usratual].getSenha1usuario());
        txtsenha2usuario.setText(classedados.getUsuarios()[usratual].getSenha1usuario());
        combousuario.setSelectedItem(classedados.getUsuarios()[usratual].getCombousuario());
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdadicionar;
    private javax.swing.JButton cmdanterior;
    private javax.swing.JButton cmddeletar;
    private javax.swing.JButton cmdeditar;
    private javax.swing.JButton cmdpesquisar;
    private javax.swing.JButton cmdprimeiro;
    private javax.swing.JButton cmdsalvar;
    private javax.swing.JButton cmdseguinte;
    private javax.swing.JButton cmdultimo;
    private javax.swing.JComboBox<String> combousuario;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtcodusuario;
    private javax.swing.JTextField txtmatusuario;
    private javax.swing.JTextField txtnomeusuario;
    private javax.swing.JPasswordField txtsenha1usuario;
    private javax.swing.JPasswordField txtsenha2usuario;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
