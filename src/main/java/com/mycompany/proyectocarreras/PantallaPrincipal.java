/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocarreras;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico_
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
        DefaultTableModel dtm1 = new DefaultTableModel();
        DefaultTableModel dtm2 = new DefaultTableModel(); 
    public PantallaPrincipal() {
        initComponents();
        inicializarTablaCarreras();
       inicializarTablaCorredores();
     
    }
        private void inicializarTablaCorredores(){
    
      
        dtm1.setColumnIdentifiers(new String[]{"Nombre","DNI","Fecha Nacimiento","Dirección","Teléfono"});
        jTableCorredores.setAutoCreateRowSorter(true);
        jTableCorredores.setModel(dtm1);
        
    }
        private void inicializarTablaCarreras(){
    
     
        dtm2.setColumnIdentifiers(new String[]{"Nombre","Fecha Carrera","Lugar","nº Máximo Corredores"});
         jTableCarreras.setAutoCreateRowSorter(true);
        jTableCarreras.setModel(dtm2);
        
    }
               
    
    
    public void anadirCorredor(Corredor corredor){
    
        DefaultTableModel dtm = (DefaultTableModel)jTableCorredores.getModel();
        dtm.addRow(corredor.toArrayString());
    }
     public void anadirCarrera(Carrera carrera){
    
        DefaultTableModel dtm = (DefaultTableModel)jTableCarreras.getModel();
        dtm.addRow(carrera.toArrayString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAlta = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAltaCarrera = new javax.swing.JButton();
        jButtonBajaCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAlta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAlta.setText("ALTA");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonBaja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBaja.setText("BAJA");
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCorredores);

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCarreras);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CARRERAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CORREDORES");

        jButtonAltaCarrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAltaCarrera.setText("ALTA");
        jButtonAltaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaCarreraActionPerformed(evt);
            }
        });

        jButtonBajaCarrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBajaCarrera.setText("BAJA");
        jButtonBajaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonAltaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBajaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonAltaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBajaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
             DialogoAltaCorredores dialogoAltaCorredores = new DialogoAltaCorredores(this,true);
      dialogoAltaCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
     
        int getSelectedRowForDeletion = jTableCorredores.getSelectedRow();

            dtm1.removeRow(getSelectedRowForDeletion);
         
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jButtonAltaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaCarreraActionPerformed
    DialogoAltaCarreras dialogoAltaCarreras = new DialogoAltaCarreras(this,true);
      dialogoAltaCarreras.setVisible(true);
    }//GEN-LAST:event_jButtonAltaCarreraActionPerformed

    private void jButtonBajaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaCarreraActionPerformed
         int getSelectedRowForDeletion = jTableCarreras.getSelectedRow();

         dtm2.removeRow(getSelectedRowForDeletion);
    }//GEN-LAST:event_jButtonBajaCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonAltaCarrera;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonBajaCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarreras;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
