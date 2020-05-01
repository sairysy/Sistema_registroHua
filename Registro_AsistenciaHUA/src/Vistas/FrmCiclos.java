/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import ReglasDeNegocio.Ciclos;
import AccesoADatos.Conexion;
import java.util.Locale;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import reportes.Reportes;
//import javax.swing.table.DefaultTableModel;
//import net.sf.jasperreports.engine.JRException;
//import reportes.Reportes;

public class FrmCiclos extends javax.swing.JFrame {

    /**
     * Creates new form Ciclos
     */
    public FrmCiclos() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar();
    }
  private void limpiarControles() {
        txtCodigo.setText("");
        txtFecha.setDate(null);
        txtTipo.setText("");
        txtNciclos.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblBuscarCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCodigosicoa = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtNciclos = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListaciclos = new javax.swing.JTable();
        txtCodigobuscar = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblCodigosicoa1 = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 452, 881, 36));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 416, -1, -1));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 416, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 881, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 165, 475, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Ciclos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 43, -1, 34));

        lblBuscarCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBuscarCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblBuscarCodigo.setText("Codigo:");
        getContentPane().add(lblBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 88, 60, -1));

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 166, 55, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 84, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Informacion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 125, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigo.setText("Codigo:");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 173, 101, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 102));
        lblNombre.setText("Fecha de inicio:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 206, -1, -1));

        lblCodigosicoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigosicoa.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigosicoa.setText("Estado:");
        getContentPane().add(lblCodigosicoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 249, 100, -1));

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 245, 53, -1));

        txtNciclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNciclosActionPerformed(evt);
            }
        });
        getContentPane().add(txtNciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 292, 53, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 343, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 343, -1, -1));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 343, -1, -1));

        TablaListaciclos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Fecha inicio", "Tipo", "Num ciclos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaListaciclos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(TablaListaciclos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 183, 464, 203));

        txtCodigobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigobuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigobuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 84, 55, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 206, 287, -1));

        lblCodigosicoa1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigosicoa1.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigosicoa1.setText("N° ciclos:");
        getContentPane().add(lblCodigosicoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 296, 100, -1));

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 133, -1, -1));

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

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        Ciclos ciclos = new Ciclos();
        try {
            limpiarControles();
            ciclos = ciclos.ciclos_buscarporid(
                Integer.parseInt(txtCodigobuscar.getText()));
            if (ciclos != null) {
                txtCodigo.setText(Integer.toString(ciclos.getIdciclo()));
                txtFecha.setDate(ciclos.getFechainicio());
                txtTipo.setText(ciclos.getTipo());
                txtNciclos.setText(Integer.toString(ciclos.getNociclos()));
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar !!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().compareTo("Nuevo")==0) {
            limpiarControles();
            btnNuevo.setText("Registrar");
        }else{
            if(btnNuevo.getText().compareTo("Registrar")==0){
                try {
                    Ciclos ciclos = new Ciclos();
                   
                   
                   
                    try {
                        ciclos.setFechainicio(FrmCiclos.FechaDadoString(sdf.format(txtFecha.getDate())));
                        
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "Error en la fecha!!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    ciclos.setTipo(txtTipo.getText());
                    ciclos.setNociclos(Integer.parseInt(txtNciclos.getText()));


                    if(ciclos.ciclos_insertar(ciclos) ){
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
        Ciclos ciclos = new Ciclos();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere eliminar el ciclo?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (ciclos.ciclos_eliminar(Integer.parseInt(txtCodigobuscar.getText())) ) {
                    JOptionPane.showMessageDialog(this,
                        "Ciclo eliminado correctamente!!",
                        "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                   limpiarControles();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el ciclo!!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        llenar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Ciclos ciclos = new Ciclos();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere modificar el ciclo?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                ciclos.setIdciclo(Integer.parseInt(txtCodigo.getText()));
                try {
                    ciclos.setFechainicio(FrmCiclos.FechaDadoString(sdf.format(txtFecha.getDate())));
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error en la fecha!!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
                ciclos.setTipo(txtTipo.getText());
                ciclos.setNociclos(Integer.parseInt(txtNciclos.getText()));
                if(ciclos.ciclos_editar(ciclos) ){
                    JOptionPane.showMessageDialog(this,"Periodo modificado correctamente!!",
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

    private void txtNciclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNciclosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNciclosActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

        try {
            Reportes reporte = new Reportes();
            reporte.ReporteCiclo();
        }catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
        }catch (SQLException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
        }

    }//GEN-LAST:event_btnGenerarReporteActionPerformed
   private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static java.sql.Timestamp FechaDadoString(String fecha) {
        //java.util.Date utilDate = new java.util.Date(fecha); //fecha actual
        long lnMilisegundos = 0;
        try {
            java.util.Date date = sdf.parse(fecha);
            lnMilisegundos = date.getTime();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
        return sqlTimestamp;
        //long lnMilisegundos = utilDate.getTime();
    }   
    
    
    
    public void llenar(){
DefaultTableModel modelo = (DefaultTableModel) TablaListaciclos.getModel();
        ArrayList<Ciclos> lista = new ArrayList<>();
        try {
            Ciclos fcicloss = new Ciclos();
            lista = fcicloss.ciclos_buscartodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",
                JOptionPane.ERROR_MESSAGE);
        }
         int filas=TablaListaciclos.getRowCount()-1;
            for(int i=filas; i>=0; i--){
                modelo.removeRow(modelo.getRowCount()-1);
            } 
        for(Ciclos p : lista){
            modelo.addRow(new Object[]{ p.getIdciclo(),p.getFechainicio(),p.getTipo(),p.getNociclos()});
        }
}        
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
            java.util.logging.Logger.getLogger(FrmCiclos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCiclos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCiclos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCiclos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCiclos().setVisible(true);
            }
        });
        
    }
    
   Ciclos ciclos ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListaciclos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigosicoa;
    private javax.swing.JLabel lblCodigosicoa1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigobuscar;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNciclos;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
