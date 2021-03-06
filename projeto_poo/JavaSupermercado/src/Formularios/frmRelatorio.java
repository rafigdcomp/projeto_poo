/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Relatorio;
import javax.swing.DefaultListModel;

/**
 *
 * @author Vinicius
 */
public class frmRelatorio extends javax.swing.JInternalFrame {
    
    
    private DefaultListModel lista = new DefaultListModel();
    private Relatorio relatorio;

    /**
     * Creates new form frmRelatorio
     */
    public frmRelatorio() {
        initComponents();
        this.relatorio = new Relatorio();
        listaVendas.setModel(lista);
        atualizar();
    }
    
    private void atualizar() {
        lista.clear();
        for(int i = 0; i < relatorio.getDados().length; i++) {
            if(relatorio.getDados()[i][0] != null) {
                lista.addElement("ID: " + relatorio.getDados()[i][0] + " | Usuario: " + relatorio.getDados()[i][1] + " | Valor dar venda: " + relatorio.getDados()[i][2]);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaVendas = new javax.swing.JList<>();

        listaVendas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaVendas;
    // End of variables declaration//GEN-END:variables
}
