/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ReglasDeNegocio.Ciclos;
import ReglasDeNegocio.Ciudad;
import ReglasDeNegocio.Codpago;
import ReglasDeNegocio.Detalleciclo;
import ReglasDeNegocio.Horario;
import ReglasDeNegocio.Detalleciclo;
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
//////import net.sf.jasperreports.engine.JRException;
//////import reportes.Reportes;

public class FrmDetalleciclo extends javax.swing.JFrame {

    /**
     * Creates new form Detalleciclo
     */
    public FrmDetalleciclo() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenar();
        cargarPago();
        cargarCiclo();
        cargarHorario();
        
        
    }
  private void limpiarControles() {
        txtCodigo.setText("");
        jComboBoxCiclo.setSelectedIndex(0);
        jComboBoxHorario.setSelectedIndex(0);
        jComboBoxPago.setSelectedIndex(0);
        txtDescripcion.setText("");
        
        
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
        txtDescripcion = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        bntImprimir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListarTurnos = new javax.swing.JTable();
        txtCodigobuscar = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        lblCiudad1 = new javax.swing.JLabel();
        jComboBoxCiclo = new javax.swing.JComboBox<>();
        lblCiudad2 = new javax.swing.JLabel();
        jComboBoxPago = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Detalle ciclo");

        lblBuscarCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBuscarCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblBuscarCodigo.setText("Codigo:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Informacion");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 102));
        lblCodigo.setText("Codigo:");

        lblCiudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(0, 0, 102));
        lblCiudad.setText("Horario");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 102));
        lblNombre.setText("Descripcion:");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 102));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        bntImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntImprimir.setForeground(new java.awt.Color(0, 0, 102));
        bntImprimir.setText("Imprimir");
        bntImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntImprimirActionPerformed(evt);
            }
        });

        TablaListarTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Ciclo", "Horario", "Pago", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaListarTurnos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane3.setViewportView(TablaListarTurnos);

        txtCodigobuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigobuscarActionPerformed(evt);
            }
        });

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jComboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorarioActionPerformed(evt);
            }
        });

        lblCiudad1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCiudad1.setForeground(new java.awt.Color(0, 0, 102));
        lblCiudad1.setText("Ciclo:");

        jComboBoxCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCicloActionPerformed(evt);
            }
        });

        lblCiudad2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCiudad2.setForeground(new java.awt.Color(0, 0, 102));
        lblCiudad2.setText("Pago:");

        jComboBoxPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCiudad1)
                                    .addComponent(lblCiudad))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addComponent(lblCiudad2)
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNombre)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtCodigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnNuevo)
                        .addGap(40, 40, 40)
                        .addComponent(btnEliminar)
                        .addGap(46, 46, 46)
                        .addComponent(btnModificar)
                        .addGap(40, 40, 40)
                        .addComponent(bntImprimir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(btnVolver)
                        .addGap(36, 36, 36)
                        .addComponent(btnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBuscarCodigo)
                        .addComponent(txtCodigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar))
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad1)
                    .addComponent(jComboBoxCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCiudad2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad)
                    .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(bntImprimir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

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

    public void cargarCiclo(){
        jComboBoxCiclo.addItem("");
       ArrayList<Ciclos> list;
       Ciclos ciclos = new Ciclos();
        try {
            list = ciclos.ciclos_buscartodos();
            if(list.size()>0){
                for (int i = 0; i < list.size(); i++) {
                    int id = list.get(i).getIdciclo();
                    Date n1=list.get(i).getFechainicio();
                    String name = list.get(i).getTipo();  
                    int n2 = list.get(i).getNociclos();
                    jComboBoxCiclo.addItem(new Ciclos(id,n1,name,n2));
                }
            }   else{
               
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar ciclos!!",
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
     public void cargarPago(){
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
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        Detalleciclo detalleciclo = new Detalleciclo();
        try {
            limpiarControles();
            detalleciclo = detalleciclo.detalleciclo_buscarporid(
                Integer.parseInt(txtCodigobuscar.getText()));
            if (detalleciclo != null) {
                txtCodigo.setText(Integer.toString(detalleciclo.getId_detalleciclo()));
                txtDescripcion.setText(detalleciclo.getDescripcion());
                
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar !!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().compareTo("Nuevo")==0) {
             limpiarControles();
            btnNuevo.setText("Registrar");
        }else{
            if(btnNuevo.getText().compareTo("Registrar")==0){
                try {
                    Detalleciclo detalleciclo = new Detalleciclo();
                    //FDetalleciclo fdetalleciclo = new FDetalleciclo();
                   // detalleciclo.setIddetalleciclo(Integer.parseInt(txtCodigo.getText()));
                    detalleciclo.setCiclos((Ciclos) jComboBoxCiclo.getSelectedItem());
                    detalleciclo.setHorario((Horario) jComboBoxHorario.getSelectedItem());
                    detalleciclo.setCodpago((Codpago) jComboBoxPago.getSelectedItem());
                    detalleciclo.setDescripcion(txtDescripcion.getText());
                    
                    if(detalleciclo.detalleciclo_insertar(detalleciclo) ){
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
        Detalleciclo detalleciclo = new Detalleciclo();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere eliminar ?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (detalleciclo.detalleciclo_eliminar(Integer.parseInt(txtCodigo.getText()))) {
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
        Detalleciclo detalleciclo = new Detalleciclo();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere modificar el turno?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                    detalleciclo.setId_detalleciclo(Integer.parseInt(txtCodigo.getText()));
                    detalleciclo.setCiclos((Ciclos) jComboBoxCiclo.getSelectedItem());
                    detalleciclo.setHorario((Horario) jComboBoxHorario.getSelectedItem());
                    detalleciclo.setCodpago((Codpago) jComboBoxPago.getSelectedItem());
                    detalleciclo.setDescripcion(txtDescripcion.getText());
                    
                if(detalleciclo.detalleciclo_editar(detalleciclo) ){
                    JOptionPane.showMessageDialog(this,"Detalleciclo modificado correctamente!!",
                        "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        llenar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void bntImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntImprimirActionPerformed

//        try {
//            Reportes reporte = new Reportes();
//            reporte.ReporteDetalleciclo ();
//        }catch (JRException ex) {
//            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
//        }catch (SQLException ex){
//            Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null , ex);
//        }
    }//GEN-LAST:event_bntImprimirActionPerformed

    private void txtCodigobuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigobuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigobuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jComboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorarioActionPerformed
       
    }//GEN-LAST:event_jComboBoxHorarioActionPerformed

    private void jComboBoxCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCicloActionPerformed

    private void jComboBoxPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPagoActionPerformed
 public void llenar(){
DefaultTableModel modelo = (DefaultTableModel) TablaListarTurnos.getModel();
        ArrayList<Detalleciclo> lista = new ArrayList<>();
        try {
            Detalleciclo fdetalleciclo = new Detalleciclo();
            lista = fdetalleciclo.detalleciclo_buscartodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",
                JOptionPane.ERROR_MESSAGE);
        }
         int filas=TablaListarTurnos.getRowCount()-1;
            for(int i=filas; i>=0; i--){
                modelo.removeRow(modelo.getRowCount()-1);
            } 
        for(Detalleciclo p : lista){
            modelo.addRow(new Object[]{ p.getId_detalleciclo(),p.getCiclos(),p.getHorario(),p.getCodpago(),p.getDescripcion()});
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
            java.util.logging.Logger.getLogger(FrmDetalleciclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleciclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleciclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDetalleciclo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmDetalleciclo().setVisible(true);
            }
        });
    }
   Detalleciclo Detallecciclo ;
   Ciclos ciclos;
   Horario horario;
   Codpago codpago;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaListarTurnos;
    private javax.swing.JButton bntImprimir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<Object> jComboBoxCiclo;
    private javax.swing.JComboBox<Object> jComboBoxHorario;
    private javax.swing.JComboBox<Object> jComboBoxPago;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCiudad1;
    private javax.swing.JLabel lblCiudad2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigobuscar;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
