/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.Conexion;
import java.sql.Connection;
import java.util.Locale;
import ReglasDeNegocio.Ciudad;
import ReglasDeNegocio.Codpago;
import ReglasDeNegocio.Horario;
import ReglasDeNegocio.Turnos;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import reportes.Reportes;
//////import net.sf.jasperreports.engine.JRException;
//////import reportes.Reportes;

public class FrmTurnos extends javax.swing.JFrame {

    /**
     * Creates new form Turnos
     */
    public FrmTurnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar();
        cargarCodpago();
        cargarHorario();
        
        
    }
  private void limpiarControles() {
        txtCodigo.setText("");
        jComboBoxPago.setSelectedIndex(0);
        jComboBoxHorario.setSelectedIndex(0);
        txtNombre.setText("");
        txtInicio.setText("");
        txtFin.setText("");
        
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
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListarTurnos = new javax.swing.JTable();
        txtCodigobuscar = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        lblCiudad1 = new javax.swing.JLabel();
        jComboBoxPago = new javax.swing.JComboBox<>();
        lblNoH6 = new javax.swing.JLabel();
        lblNoH7 = new javax.swing.JLabel();
        lblNoH8 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR);
        jspinerinicio = new javax.swing.JSpinner(sm);
        SpinnerDateModel fm =
        new SpinnerDateModel(date,null,null,Calendar.HOUR_OF_DAY);
        spinnerfinal = new javax.swing.JSpinner(fm);
        btnGenerarReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 778, 1024, 30));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 748, -1, -1));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 748, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 217, 875, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Turnos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        lblBuscarCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBuscarCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblBuscarCodigo.setText("Codigo:");
        getContentPane().add(lblBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 132, 60, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 128, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Informacion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 165, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigo.setText("Codigo:");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 228, 78, -1));

        lblCiudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(0, 0, 102));
        lblCiudad.setText("Horario:");
        getContentPane().add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 324, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 102));
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 368, 66, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 364, 250, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 429, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 429, -1, -1));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 429, -1, -1));

        TablaListarTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Pago", "Horario", "Nombre", "Inicio", "Fin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaListarTurnos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(TablaListarTurnos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 486, 955, 249));

        txtCodigobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigobuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigobuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 128, 55, -1));

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 224, 58, -1));

        jComboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 320, 124, -1));

        lblCiudad1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCiudad1.setForeground(new java.awt.Color(0, 0, 102));
        lblCiudad1.setText("Pago:");
        getContentPane().add(lblCiudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 276, -1, -1));

        jComboBoxPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPagoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 272, 124, -1));

        lblNoH6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH6.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH6.setText("Inicio:");
        getContentPane().add(lblNoH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 268, 52, 30));

        lblNoH7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH7.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH7.setText("HORA-FECHA");
        getContentPane().add(lblNoH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 224, 110, 26));

        lblNoH8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH8.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH8.setText("Fin:");
        getContentPane().add(lblNoH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 316, 36, 30));

        txtInicio.setEditable(false);
        txtInicio.setEnabled(false);
        txtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioActionPerformed(evt);
            }
        });
        getContentPane().add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 272, 185, -1));

        txtFin.setEditable(false);
        txtFin.setEnabled(false);
        getContentPane().add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 320, 185, -1));

        //JSpinner.DateEditor de = new JSpinner.DateEditor(jspinerinicio, "HH:mm:ss");
        //jspinerinicio.setEditor(de);
        jspinerinicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jspinerinicioValueSpiner(evt);
            }
        });
        getContentPane().add(jspinerinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 272, 173, -1));

        spinnerfinal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerfinalvalueSpinner2(evt);
            }
        });
        getContentPane().add(spinnerfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 320, 173, -1));

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 428, -1, -1));

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

    public void cargarCodpago(){
        jComboBoxPago.addItem("");
       ArrayList<Codpago> list;
       Codpago codpago = new Codpago();
        try {
            list = codpago.codigopago_buscartodos();
            if(list.size()>0){
                for (int i = 0; i < list.size(); i++) {
                    int id = list.get(i).getIdcodpago();
                    String name = list.get(i).getCodpagonombre();                    
                    jComboBoxPago.addItem(new Codpago(id,name));
                }
            }   else{
               
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar pagos!!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargarHorario(){
        jComboBoxHorario.addItem("");
       ArrayList<Horario> list;
       Horario horario = new Horario();
        try {
            list = horario.horario_buscartodos();
            if(list.size()>0){
                for (int i = 0; i < list.size(); i++) {
                    int id = list.get(i).getIdhorario();
                    String name = list.get(i).getNombre();
                    String n1 = list.get(i).getHora_inicio();
                    String n2 = list.get(i).getHora_final();
                    int n3 = list.get(i).getIngreso_temprano();
                    int n4 = list.get(i).getSalida_tardia();
                    int n5 = list.get(i).getMinutos_contar();
                    int n6 = list.get(i).getMin_sal_temprano();
                    jComboBoxHorario.addItem(new Horario (id,name,n1,n2,n3,n4,n5,n6));
                }
            }   else{
               
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar horarios!!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        Turnos turnos = new Turnos();
        try {
            limpiarControles();
            turnos = turnos.turnos_buscarporid(
                Integer.parseInt(txtCodigobuscar.getText()));
            if (turnos != null) {
                txtCodigo.setText(Integer.toString(turnos.getIdturno()));
                txtNombre.setText(turnos.getNombreturno());
                txtInicio.setText(turnos.getHora_entrada());
                txtFin.setText(turnos.getHora_salida());
               
                
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
                    Turnos turnos = new Turnos();
                    //FTurnos fturnos = new FTurnos();
                   // turnos.setIdturnos(Integer.parseInt(txtCodigo.getText()));
                    turnos.setCodpago((Codpago) jComboBoxPago.getSelectedItem());
                    turnos.setHorario((Horario) jComboBoxHorario.getSelectedItem());
                    turnos.setNombreturno(txtNombre.getText());
                    turnos.setHora_entrada(txtInicio.getText());
                    turnos.setHora_salida(txtFin.getText());
                    if(turnos.turnos_insertar(turnos) ){
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
        Turnos turnos = new Turnos();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere eliminar ?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (turnos.turnos_eliminar(Integer.parseInt(txtCodigo.getText()))) {
                    JOptionPane.showMessageDialog(this,
                        "Turno eliminado correctamente!!",
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
        Turnos turnos = new Turnos();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere modificar el turno?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                    turnos.setIdturno(Integer.parseInt(txtCodigo.getText()));
                    turnos.setCodpago((Codpago) jComboBoxPago.getSelectedItem());
                    turnos.setHorario((Horario) jComboBoxHorario.getSelectedItem());
                    turnos.setNombreturno(txtNombre.getText());
                    turnos.setHora_entrada(txtInicio.getText());
                    turnos.setHora_salida(txtFin.getText());
                if(turnos.turnos_editar(turnos) ){
                    JOptionPane.showMessageDialog(this,"Turnos modificado correctamente!!",
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

    private void jComboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorarioActionPerformed
       
    }//GEN-LAST:event_jComboBoxHorarioActionPerformed

    private void jComboBoxPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPagoActionPerformed

    private void txtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioActionPerformed

    }//GEN-LAST:event_txtInicioActionPerformed

    private void jspinerinicioValueSpiner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jspinerinicioValueSpiner
        String spinner ="";
        Date myInt =(Date) jspinerinicio.getValue();
        spinner = myInt.toString();
        //spinner =(String) jspinerinicio.getValue();
        txtInicio.setText(spinner) ;
    }//GEN-LAST:event_jspinerinicioValueSpiner

    private void spinnerfinalvalueSpinner2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerfinalvalueSpinner2
        // TODO add your handling code here:

        String spinner1 ="";
        Date myInt =(Date) spinnerfinal.getValue();
        spinner1 = myInt.toString();
        //spinner =(String) jspinerinicio.getValue();

        txtFin.setText(spinner1) ;
    }//GEN-LAST:event_spinnerfinalvalueSpinner2

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

        try {
            Reportes reporte = new Reportes();
            reporte.ReporteTurno();
        }catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
        }catch (SQLException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
        }

    }//GEN-LAST:event_btnGenerarReporteActionPerformed
 public void llenar(){
DefaultTableModel modelo = (DefaultTableModel) TablaListarTurnos.getModel();
        ArrayList<Turnos> lista = new ArrayList<>();
        try {
            Turnos fturnos = new Turnos();
            lista = fturnos.turnos_buscartodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",
                JOptionPane.ERROR_MESSAGE);
        }
         int filas=TablaListarTurnos.getRowCount()-1;
            for(int i=filas; i>=0; i--){
                modelo.removeRow(modelo.getRowCount()-1);
            } 
        for(Turnos p : lista){
            modelo.addRow(new Object[]{ p.getIdturno(),p.getCodpago(),p.getHorario(),p.getNombreturno(),p.getHora_entrada(),p.getHora_salida()});
        }}
                    
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
            java.util.logging.Logger.getLogger(FrmTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmTurnos().setVisible(true);
            }
        });
    }
   Turnos turnos ;
   Ciudad ciudad;
   Horario horario;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListarTurnos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Object> jComboBoxHorario;
    private javax.swing.JComboBox<Object> jComboBoxPago;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jspinerinicio;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCiudad1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNoH6;
    private javax.swing.JLabel lblNoH7;
    private javax.swing.JLabel lblNoH8;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JSpinner spinnerfinal;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigobuscar;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
