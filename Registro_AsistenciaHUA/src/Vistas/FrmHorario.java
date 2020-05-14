/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import AccesoADatos.Conexion;
import java.sql.Connection;
import java.util.Locale;
import ReglasDeNegocio.Horario;
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

public class FrmHorario extends javax.swing.JFrame {

    /**
     * Creates new form Horario
     */
    public FrmHorario() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar();
        Activar();
        Activarm();
        Activars();
    }
  private void limpiarControles() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtInicio.setText("");
        txtFin.setText("");
        txtIngresot.setText("");
        txtSalidatardia.setText("");
        txtRetardo.setText("");
        txtsaltemprano.setText("");
        
        
      
        
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
        TablaListarHorario = new javax.swing.JTable();
        txtCodigobuscar = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jRadioSalidat = new javax.swing.JRadioButton();
        lblCodigo1 = new javax.swing.JLabel();
        jPanelHora = new javax.swing.JPanel();
        lblNoH4 = new javax.swing.JLabel();
        lblNoH5 = new javax.swing.JLabel();
        txtIngresot = new javax.swing.JTextField();
        txtSalidatardia = new javax.swing.JTextField();
        lblNoH6 = new javax.swing.JLabel();
        lblNoH7 = new javax.swing.JLabel();
        lblNoH8 = new javax.swing.JLabel();
        jPanelRetardo = new javax.swing.JPanel();
        lblNoH11 = new javax.swing.JLabel();
        txtRetardo = new javax.swing.JTextField();
        jPanelSalidaT = new javax.swing.JPanel();
        lblNoH13 = new javax.swing.JLabel();
        txtsaltemprano = new javax.swing.JTextField();
        jRadioretardo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadio_Hora = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JButton();
        txtInicio = new javax.swing.JFormattedTextField();
        txtFin = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 772, -1, -1));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 772, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 803, 216, 0));

        lblBuscarCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBuscarCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblBuscarCodigo.setText("Codigo:");
        getContentPane().add(lblBuscarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 59, 60, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 55, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Informacion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 94, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigo.setText("Codigo:");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 141, 91, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 197, 189, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 519, 89, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 519, 89, -1));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 519, -1, -1));

        TablaListarHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Hora inicio", "Hora fin", "Ingreso Temprano", "Salida tardia", "Retardo", "Salida temprano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaListarHorario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(TablaListarHorario);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 575, 917, 179));

        txtCodigobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigobuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigobuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 55, 55, -1));

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 137, 58, -1));

        jRadioSalidat.setText("Activar");
        jRadioSalidat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSalidatActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioSalidat, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 211, -1, -1));

        lblCodigo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigo1.setText("Nombre:");
        getContentPane().add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 201, 91, -1));

        lblNoH4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH4.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH4.setText("Ingreso temprano:");

        lblNoH5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH5.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH5.setText("Salida tardia:");

        javax.swing.GroupLayout jPanelHoraLayout = new javax.swing.GroupLayout(jPanelHora);
        jPanelHora.setLayout(jPanelHoraLayout);
        jPanelHoraLayout.setHorizontalGroup(
            jPanelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHoraLayout.createSequentialGroup()
                        .addComponent(lblNoH5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(txtSalidatardia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHoraLayout.createSequentialGroup()
                        .addComponent(lblNoH4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIngresot, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHoraLayout.setVerticalGroup(
            jPanelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoH4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIngresot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoH5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalidatardia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 407, -1, -1));

        lblNoH6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH6.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH6.setText("Inicio:");
        getContentPane().add(lblNoH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 281, 92, 30));

        lblNoH7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH7.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH7.setText("HORA(HH:MM:SS)");
        getContentPane().add(lblNoH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 110, 26));

        lblNoH8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH8.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH8.setText("Fin:");
        getContentPane().add(lblNoH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 327, 92, 30));

        lblNoH11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH11.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH11.setText("Contar retardo:");

        javax.swing.GroupLayout jPanelRetardoLayout = new javax.swing.GroupLayout(jPanelRetardo);
        jPanelRetardo.setLayout(jPanelRetardoLayout);
        jPanelRetardoLayout.setHorizontalGroup(
            jPanelRetardoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRetardoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNoH11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRetardo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelRetardoLayout.setVerticalGroup(
            jPanelRetardoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRetardoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelRetardoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoH11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetardo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelRetardo, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 149, -1, -1));

        lblNoH13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoH13.setForeground(new java.awt.Color(0, 0, 102));
        lblNoH13.setText("contar salida temprano:");

        javax.swing.GroupLayout jPanelSalidaTLayout = new javax.swing.GroupLayout(jPanelSalidaT);
        jPanelSalidaT.setLayout(jPanelSalidaTLayout);
        jPanelSalidaTLayout.setHorizontalGroup(
            jPanelSalidaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalidaTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNoH13)
                .addGap(18, 18, 18)
                .addComponent(txtsaltemprano, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelSalidaTLayout.setVerticalGroup(
            jPanelSalidaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalidaTLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelSalidaTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoH13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsaltemprano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSalidaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 239, -1, -1));

        jRadioretardo.setText("Activar");
        jRadioretardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioretardoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioretardo, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 121, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1018, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 1018, 30));

        jRadio_Hora.setText("Activar");
        jRadio_Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_HoraActionPerformed(evt);
            }
        });
        getContentPane().add(jRadio_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 364, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Horario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 47, 103, -1));

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 518, -1, -1));

        try {
            txtInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 70, -1));

        try {
            txtFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinActionPerformed(evt);
            }
        });
        getContentPane().add(txtFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, -1));

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
        
        Horario horario = new Horario();
        try {
            limpiarControles();
            horario = horario.horario_buscarporid(
                Integer.parseInt(txtCodigobuscar.getText()));
            if (horario != null) {
                txtCodigo.setText(Integer.toString(horario.getIdhorario()));
                txtNombre.setText(horario.getNombre());
                txtInicio.setText(horario.getHora_inicio());
                txtFin.setText(horario.getHora_final());
                txtIngresot.setText(Integer.toString(horario.getIngreso_temprano()));
                txtSalidatardia.setText(Integer.toString(horario.getSalida_tardia()));
                txtRetardo.setText(Integer.toString(horario.getMinutos_contar()));
                txtsaltemprano.setText(Integer.toString(horario.getMin_sal_temprano()));
                
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
             txtCodigobuscar.setText("");
            btnNuevo.setText("Registrar");
        }else{
            if(btnNuevo.getText().compareTo("Registrar")==0){
                try {
                    Horario horario = new Horario();
                    
                    horario.setNombre(txtNombre.getText());
                    horario.setHora_inicio(txtInicio.getText());
                    horario.setHora_final(txtFin.getText());
                   horario.setIngreso_temprano(Integer.parseInt(txtIngresot.getText()));
                   horario.setSalida_tardia(Integer.parseInt(txtSalidatardia.getText()));
                   horario.setMinutos_contar(Integer.parseInt(txtRetardo.getText()));
                   horario.setMin_sal_temprano(Integer.parseInt(txtsaltemprano.getText()));
                    
                    
                    if(horario.horario_insertar(horario) ){
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
        Horario horario = new Horario();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere eliminar ?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (horario.horario_eliminar(Integer.parseInt(txtCodigobuscar.getText())) ) {
                    JOptionPane.showMessageDialog(this,
                        "Horario eliminado correctamente!!",
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
        Horario horario = new Horario();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere modificar la horario?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                    horario.setIdhorario(Integer.parseInt(txtCodigo.getText()));
                    horario.setNombre(txtNombre.getText());
                    horario.setHora_inicio(txtInicio.getText());
                    horario.setHora_final(txtFin.getText());
//                    txtInicio.setText(horario.getHora_inicio());
//                   txtFin.setText(horario.getHora_final());
                   horario.setIngreso_temprano(Integer.parseInt(txtIngresot.getText()));
                   horario.setSalida_tardia(Integer.parseInt(txtSalidatardia.getText()));
                   horario.setMinutos_contar(Integer.parseInt(txtRetardo.getText()));
                   horario.setMin_sal_temprano(Integer.parseInt(txtsaltemprano.getText()));
                    
                 
                if(horario.horario_editar(horario) ){
                    JOptionPane.showMessageDialog(this,"Horario modificado correctamente!!",
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

    private void jRadio_HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_HoraActionPerformed
        // TODO add your handling code here:
        Activar();
    }//GEN-LAST:event_jRadio_HoraActionPerformed

    private void jRadioretardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioretardoActionPerformed
        // TODO add your handling code here:
        Activarm();
    }//GEN-LAST:event_jRadioretardoActionPerformed

    private void jRadioSalidatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSalidatActionPerformed
        // TODO add your handling code here:
        Activars();
    }//GEN-LAST:event_jRadioSalidatActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

        try {
            Reportes reporte = new Reportes();
            reporte.ReporteHorario();
        }catch (JRException ex) {
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
        }catch (SQLException ex){
            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
        }

    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void txtFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinActionPerformed
 public void llenar(){
DefaultTableModel modelo = (DefaultTableModel) TablaListarHorario.getModel();
        ArrayList<Horario> lista = new ArrayList<>();
        try {
            Horario fhorario = new Horario();
            lista = fhorario.horario_buscartodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",
                JOptionPane.ERROR_MESSAGE);
        }
         int filas=TablaListarHorario.getRowCount()-1;
            for(int i=filas; i>=0; i--){
                modelo.removeRow(modelo.getRowCount()-1);
            } 
        for(Horario p : lista){
            modelo.addRow(new Object[]{ p.getIdhorario(),p.getNombre(),p.getHora_inicio(),p.getHora_final(),p.getIngreso_temprano(),p.getSalida_tardia(),p.getMinutos_contar(),p.getMin_sal_temprano()});
        }}
 
  public void bloquear(){
  for(Component b: jPanelHora.getComponents()){
  b.setEnabled(false);}
  }
  public void desbloquear(){
  for(Component b: jPanelHora.getComponents()){
  b.setEnabled(true);}
  }
  
  public void Activar() {
  if(jRadio_Hora.isSelected()){
      desbloquear();
  }else {
  bloquear();
  }
  }
     //----------------------------------------------------------------------
  
  
  public void bloquearm(){
  for(Component b: jPanelRetardo.getComponents()){
  b.setEnabled(false);}
  }
  public void desbloquearm(){
  for(Component b: jPanelRetardo.getComponents()){
  b.setEnabled(true);}
  }
  
  public void Activarm() {
  if(jRadioretardo.isSelected()){
      desbloquearm();
  }else {
  bloquearm();
  }
  }
  
  
  //----------------------------------------------------------------------------
  public void bloquears(){
  for(Component b: jPanelSalidaT.getComponents()){
  b.setEnabled(false);}
  }
  public void desbloquears(){
  for(Component b: jPanelSalidaT.getComponents()){
  b.setEnabled(true);}
  }
  
  public void Activars() {
  if(jRadioSalidat.isSelected()){
      desbloquears();
  }else {
  bloquears();
  }
  }
  
  
    
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
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHorario().setVisible(true);
            }
        });
    }
   Horario horario ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListarHorario;
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
    private javax.swing.JPanel jPanelHora;
    private javax.swing.JPanel jPanelRetardo;
    private javax.swing.JPanel jPanelSalidaT;
    private javax.swing.JRadioButton jRadioSalidat;
    private javax.swing.JRadioButton jRadio_Hora;
    private javax.swing.JRadioButton jRadioretardo;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblNoH11;
    private javax.swing.JLabel lblNoH13;
    private javax.swing.JLabel lblNoH4;
    private javax.swing.JLabel lblNoH5;
    private javax.swing.JLabel lblNoH6;
    private javax.swing.JLabel lblNoH7;
    private javax.swing.JLabel lblNoH8;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigobuscar;
    private javax.swing.JFormattedTextField txtFin;
    private javax.swing.JTextField txtIngresot;
    private javax.swing.JFormattedTextField txtInicio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRetardo;
    private javax.swing.JTextField txtSalidatardia;
    private javax.swing.JTextField txtsaltemprano;
    // End of variables declaration//GEN-END:variables
}
