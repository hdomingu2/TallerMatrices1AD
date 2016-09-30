/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hdomingu2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroFilas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroColumnas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Operaciones Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("No. De Filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtNumeroFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFilasKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, -1));

        jLabel5.setText("No. De Columnas:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        txtNumeroColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroColumnasKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 40, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cmdManual.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        cmdOperacion.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel2.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        cmdLimpiar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        cmdAutomatico.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 450, 80));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaInicial.setEnabled(false);
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, 230));

        cmbOperaciones.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diagonal Secundaria", "Triangular Superior", "Triangular Inferior", "Transpuesta", "Letra A", "Letra Z", "Letra T", "Letra V", "Letra E", "Letra F", "Letra P", "Letra I", "Letra N", "Letra Y", "Letra X" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaResultado.setEnabled(false);
        jScrollPane3.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 290, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(789, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        DefaultTableModel tm, tm2;

        nf = Integer.parseInt(txtNumeroFilas.getText());
        nc = Integer.parseInt(txtNumeroColumnas.getText());

        tm = (DefaultTableModel) tblTablaInicial.getModel();
        tm2 = (DefaultTableModel) tblTablaResultado.getModel();

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);

        JButton botonesH[] = {cmdManual, cmdAutomatico, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        double n;
        int sw, res, nc, nf;
        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaResultado.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;
                        } else {
                            sw = 0;
                        }

                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int nc, nf, op;
        op = cmbOperaciones.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultado);
        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaResultado.getRowCount();
        switch (op) {
            case 0:
                if (nf != nc) {
                    Helper.mensaje(this, "Las Filas y Las Columnas Tienen Que Tener La Misma Cantidad", 2);
                } else {
                    Helper.diagonalSecundaria(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 1:
                if (nf != nc) {
                    Helper.mensaje(this, "Las Filas y Las Columnas Tienen Que Tener La Misma Cantidad", 2);
                } else {
                    Helper.triangularSuperior(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 2:
                if (nf != nc) {
                    Helper.mensaje(this, "Las Filas y Las Columnas Tienen Que Tener La Misma Cantidad", 2);
                } else {
                    Helper.triangularInferior(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 3:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 2);
                }else{ 
                Helper.transpuesta(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 4:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 2);
                }else{ 
                Helper.letraA(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 5:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 3);
                }else{ 
                Helper.letraZ(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 6:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 3);
                }else{ 
                Helper.letraT(tblTablaInicial, tblTablaResultado);
                break;
                }
            case 7:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 3);
                }else{ 
                Helper.letraV(tblTablaInicial, tblTablaResultado);
                break;
                }
            case 8:
                Helper.letraE(tblTablaInicial, tblTablaResultado);
                break;
            case 9:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 3);
                }else{ 
                Helper.letraF(tblTablaInicial, tblTablaResultado);
                break;
                }
            case 10:
                Helper.letraP(tblTablaInicial, tblTablaResultado);
                break;
            case 11:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 3);
                }else{ 
                Helper.letraI(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 12:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 3);
                }else{ 
                Helper.letraN(tblTablaInicial, tblTablaResultado);
                break;
                }
            case 13:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 3);
                }else{ 
                Helper.letraY(tblTablaInicial, tblTablaResultado);
                }
                break;
            case 14:
                if (nc % 2 == 0){
                Helper.mensaje(this, "EL Numero De Filas Y Columnas Debe Ser Un Numero Impar", 3);
                }else{ 
                Helper.letraX(tblTablaInicial, tblTablaResultado);
                break;
                }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumeroFilas.setText("");
        txtNumeroColumnas.setText("");
        txtNumeroFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatico, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
        int nf, nc, n;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void txtNumeroFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFilasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroFilasKeyTyped

    private void txtNumeroColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroColumnasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroColumnasKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
