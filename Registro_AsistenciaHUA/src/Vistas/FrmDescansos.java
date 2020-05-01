/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.Conexion;
import java.sql.Connection;
import java.util.Locale;
import ReglasDeNegocio.Descansos;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel; 
import net.sf.jasperreports.engine.JRException;
import reportes.Reportes;
//////import net.sf.jasperreports.engine.JRException;
//////import reportes.Reportes;

public class FrmDescansos extends javax.swing.JFrame {

    /**
     * Creates new form Descansos
     */
    public FrmDescansos() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar();
       
    }
  private void limpiarControles() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtInicio.setText("");
        txtFin.setText("");
        txtEstado.setText("");
       
        
        
      
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblBuscarCodigo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListarReceso = new javax.swing.JTable();
        txtCodigobuscar = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo1 = new javax.swing.JLabel();
        lblNoH6 = new javax.swing.JLabel();
        lblNoH7 = new javax.swing.JLabel();
        lblNoH8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR);
        jspinerinicio = new javax.swing.JSpinner(sm);
        txtInicio = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        SpinnerDateModel fm =
        new SpinnerDateModel(date,null,null,Calendar.HOUR_OF_DAY);
        spinnerfinal = new javax.swing.JSpinner(fm);
        lblNoH4 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnGenerarReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(821, 840));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 771, -1, -1));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 771, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 810, 18, 0));

        lblBuscarCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBuscarCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblBuscarCodigo.setText("Codigo:");
        getContentPane().add(lblBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 98, 60, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 94, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Informacion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 118, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigo.setText("Codigo:");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 158, 91, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 194, 189, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 452, 89, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 452, 89, -1));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 452, -1, -1));

        TablaListarReceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Hora inicio", "Hora fin", "Estado de pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaListarReceso.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(TablaListarReceso);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 515, 719, 230));

        txtCodigobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigobuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigobuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 94, 55, -1));

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 154, 58, -1));

        lblCodigo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigo1.setText("Nombre:");
        getContentPane().add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 198, 91, -1));

        lblNoH6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH6.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH6.setText("Inicio:");
        getContentPane().add(lblNoH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 278, 49, 30));

        lblNoH7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH7.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH7.setText("HORA-FECHA");
        getContentPane().add(lblNoH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 239, 110, 26));

        lblNoH8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH8.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH8.setText("Fin:");
        getContentPane().add(lblNoH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 326, 49, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 821, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 821, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Recesos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 43, 103, -1));

        //JSpinner.DateEditor de = new JSpinner.DateEditor(jspinerinicio, "HH:mm:ss");
        //jspinerinicio.setEditor(de);
        jspinerinicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ValueSpiner(evt);
            }
        });
        getContentPane().add(jspinerinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 282, 141, -1));

        txtInicio.setEditable(false);
        txtInicio.setEnabled(false);
        txtInicio.setFocusable(false);
        txtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioActionPerformed(evt);
            }
        });
        getContentPane().add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 282, 184, -1));

        txtFin.setEditable(false);
        txtFin.setEnabled(false);
        getContentPane().add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 330, 184, -1));

        spinnerfinal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valueSpinner2(evt);
            }
        });
        getContentPane().add(spinnerfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 330, 141, -1));

        lblNoH4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH4.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH4.setText("Estado:");
        getContentPane().add(lblNoH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 378, 69, 30));
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 382, 41, -1));

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 451, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
Menu obj=new Menu();
        obj.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        Descansos descansos = new Descansos();
        try {
            limpiarControles();
            descansos = descansos.descansos_buscarporid(
                Integer.parseInt(txtCodigobuscar.getText()));
            if (descansos != null) {
                txtCodigo.setText(Integer.toString(descansos.getIddescanso()));
                txtNombre.setText(descansos.getNombdescanso());
                txtInicio.setText(descansos.getHora_inicio());
                txtFin.setText(descansos.getHora_fin());
                txtEstado.setText(descansos.getEstado_cobro());
                
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar !!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().compareTo("Nuevo")==0) {
             limpiarControles();
            btnNuevo.setText("Registrar");
        }else{
            if(btnNuevo.getText().compareTo("Registrar")==0){
                try {
                    Descansos descansos = new Descansos();
             
                    descansos.setNombdescanso(txtNombre.getText());
                    descansos.setHora_inicio(txtInicio.getText());
                    descansos.setHora_fin(txtFin.getText());
                   descansos.setEstado_cobro(txtEstado.getText());
                   
                    
                    if(descansos.descansos_insertar(descansos) ){
                       limpiarControles();
                        JOptionPane.showMessageDialog(this,"Registrado correctamente!!",
                            "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                        btnNuevo.setText("Nuevo");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        llenar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Descansos descansos = new Descansos();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere eliminar ?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (descansos.descansos_eliminar(Integer.parseInt(txtCodigobuscar.getText())) ) {
                    JOptionPane.showMessageDialog(this,
                        "Descansos eliminado correctamente!!",
                        "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                   limpiarControles();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar !!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        llenar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Descansos descansos = new Descansos();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere modificar ?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                    descansos.setIddescanso(Integer.parseInt(txtCodigo.getText()));
                    descansos.setNombdescanso(txtNombre.getText());
                    descansos.setHora_inicio(txtInicio.getText());
                    descansos.setHora_fin(txtFin.getText());
                    descansos.setEstado_cobro(txtEstado.getText());
                   
                    
                 
                if(descansos.descansos_editar(descansos) ){
                    JOptionPane.showMessageDialog(this,"Descansos modificado correctamente!!",
                        "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        llenar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCodigobuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigobuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigobuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioActionPerformed
       
    
    }//GEN-LAST:event_txtInicioActionPerformed

    private void valueSpinner2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valueSpinner2
        // TODO add your handling code here:
        
        String spinner1 ="";
        Date myInt =(Date) spinnerfinal.getValue();
        spinner1 = myInt.toString();
        //spinner =(String) jspinerinicio.getValue();
        
        txtFin.setText(spinner1) ;
    }//GEN-LAST:event_valueSpinner2

    private void ValueSpiner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ValueSpiner
        String spinner ="";
        Date myInt =(Date) jspinerinicio.getValue();
        spinner = myInt.toString();
        //spinner =(String) jspinerinicio.getValue();
        txtInicio.setText(spinner) ;
    }//GEN-LAST:event_ValueSpiner

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

        try {
            Reportes reporte = new Reportes();
            reporte.ReporteDescanasos();
        }catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
        }catch (SQLException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
        }

    }//GEN-LAST:event_btnGenerarReporteActionPerformed
 public void llenar(){
DefaultTableModel modelo = (DefaultTableModel) TablaListarReceso.getModel();
        ArrayList<Descansos> lista = new ArrayList<>();
        try {
            Descansos fdescansos = new Descansos();
            lista = fdescansos.descansos_buscartodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",
                JOptionPane.ERROR_MESSAGE);
        }
         int filas=TablaListarReceso.getRowCount()-1;
            for(int i=filas; i>=0; i--){
                modelo.removeRow(modelo.getRowCount()-1);
            } 
        for(Descansos p : lista){
            modelo.addRow(new Object[]{ p.getIddescanso(),p.getNombdescanso(),p.getHora_inicio(),p.getHora_fin(),p.getEstado_cobro()});
        }}
 
 
    
  //----------------------------------------------------------------------------

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
            java.util.logging.Logger.getLogger(FrmDescansos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDescansos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDescansos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDescansos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDescansos().setVisible(true);
            }
        });
    }
   Descansos descansos ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListarReceso;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jspinerinicio;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblNoH4;
    private javax.swing.JLabel lblNoH6;
    private javax.swing.JLabel lblNoH7;
    private javax.swing.JLabel lblNoH8;
    private javax.swing.JSpinner spinnerfinal;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigobuscar;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
