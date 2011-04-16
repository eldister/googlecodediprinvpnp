package formulario;

import dao.Tb_UsuarioDAO;
import dto.Tb_UsuarioDTO;
import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Usuario extends javax.swing.JFrame {

    public Usuario() {
        initComponents();
        //    this.centrar();
        this.setDefaultCloseOperation(Usuario.DISPOSE_ON_CLOSE);
        this.setSize(1000, 410);
        this.setLocation(200, 100);
        NoMostrarDatos();
        activaBotones(true, true, false, false);
        centrar();

    }

    public void activaBotones(boolean a, boolean b, boolean c, boolean d) {
        btnBuscar.setEnabled(a);
        btnNuevo.setEnabled(b);
        btnBorrar.setEnabled(c);
        btnActualizar.setEnabled(d);

    }

    private void centrar() {
        Dimension pantalla = this.getToolkit().getScreenSize();
        this.setLocation(pantalla.width / 2 - this.getWidth() / 2, pantalla.height / 2 - this.getHeight() / 2);
    }

    private void NoMostrarDatos() {
        txtnombres.setEditable(false);
        txtnuevcontra.setEditable(false);
        txtGrado.setEditable(false);
        txtdni.setEditable(false);
        fechaalta.setEnabled(false);
        fechamodif.setEnabled(false);
        CboEstado.setEnabled(false);
        CboNivel.setEnabled(false);
        txtFechAlta.setVisible(false);
        txtFechaModif.setVisible(false);
        txtEstado.setVisible(false);
        txtNivel.setVisible(false);

    }

    private void MostrarDatos() {
        txtnombres.setEditable(true);
        txtnuevcontra.setEditable(true);
        txtdni.setEditable(true);
        fechaalta.setEnabled(true);
        fechamodif.setEnabled(true);
        CboEstado.setEnabled(true);
        CboNivel.setEnabled(true);
        txtGrado.setVisible(true);
        txtFechAlta.setVisible(true);
        txtFechaModif.setVisible(true);
        txtEstado.setVisible(true);
        txtNivel.setVisible(true);

    }

    public void limpiaDatos() {
        txtNombUsuario.setText("");
        txtnombres.setText("");
        txtdni.setText("");
        txtnuevcontra.setText("");
        txtGrado.setText("");
    }

    public void NOesconderDatos() {
        txtFechaModif.setVisible(false);
        txtFechAlta.setVisible(false);
        txtEstado.setVisible(false);
        txtNivel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombUsuario = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fechamodif = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelNuevContra = new javax.swing.JLabel();
        CboEstado = new javax.swing.JComboBox();
        CboNivel = new javax.swing.JComboBox();
        txtnuevcontra = new javax.swing.JTextField();
        txtFechAlta = new javax.swing.JTextField();
        txtFechaModif = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        txtNivel = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        fechaalta = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("DNI:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Nombres y Apellidos:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel7.setText("Grado:");

        txtNombUsuario.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtNombUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombUsuarioActionPerformed(evt);
            }
        });

        txtdni.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });

        txtnombres.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel8.setText("Fecha Alta:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setText("Fecha de Modificacion:");

        fechamodif.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setText("Nivel:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("Estado:");

        labelNuevContra.setFont(new java.awt.Font("Tahoma", 0, 14));
        labelNuevContra.setText("Nueva Contraseña:");

        CboEstado.setFont(new java.awt.Font("Tahoma", 0, 14));
        CboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        CboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboEstadoActionPerformed(evt);
            }
        });

        CboNivel.setFont(new java.awt.Font("Tahoma", 0, 14));
        CboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Administrador" }));
        CboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboNivelActionPerformed(evt);
            }
        });

        txtnuevcontra.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtnuevcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnuevcontraActionPerformed(evt);
            }
        });

        txtFechAlta.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtFechaModif.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtGrado.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtNivel.setFont(new java.awt.Font("Tahoma", 0, 14));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-usuario-icono-4000-16.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-usuario-icono-7266-16.png"))); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-usuario-icono-9786-16.png"))); // NOI18N
        btnActualizar.setText("EDITAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        fechaalta.setFont(new java.awt.Font("Tahoma", 0, 14));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-buscar-ampliar-icono-9630-16.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fechaalta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechamodif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaModif, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombUsuario)
                                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNuevContra)
                        .addGap(14, 14, 14)
                        .addComponent(txtnuevcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1))
                            .addComponent(txtNombUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtGrado)
                            .addComponent(jLabel2)
                            .addComponent(txtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(fechaalta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtFechaModif, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fechamodif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFechAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CboEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnuevcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNuevContra))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        activaBotones(true, true, false, false);
        limpiaDatos();
        NoMostrarDatos();
}//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombUsuarioActionPerformed
        txtdni.requestFocus();
    }//GEN-LAST:event_txtNombUsuarioActionPerformed

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed
    }//GEN-LAST:event_txtdniActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed

    }//GEN-LAST:event_txtnombresActionPerformed

    private void CboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboEstadoActionPerformed
    }//GEN-LAST:event_CboEstadoActionPerformed

    private void txtnuevcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnuevcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnuevcontraActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (btnBuscar.isEnabled()) {
            this.activaBotones(false, false, true, true);
            try {
                Tb_UsuarioDAO u = new Tb_UsuarioDAO();
                u.cargarUsuario();
                Tb_UsuarioDTO objD = u.buscarCIP(txtNombUsuario.getText());

                if (objD != null) {                    
                    txtdni.setText(objD.getMA98());
                    txtGrado.setText(objD.getTPCOR());
                    txtnombres.setText(objD.getMA13());
                    txtnuevcontra.setText(objD.getPassword());
                    MostrarDatos();
                    if (txtNombUsuario.getText() == null) {
                        txtnuevcontra.setText(objD.getPassword());
                    } else {
                        txtnuevcontra.setVisible(false);
                        labelNuevContra.setVisible(false);
                        CboEstado.setVisible(false);
                        CboNivel.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario ya existe", "Mensaje", 2);
                }

            } catch (SQLException f) {
                System.out.println(f.toString());
            }
        }
        NoMostrarDatos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void CboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboNivelActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_CboNivelActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.isEnabled()) {
            limpiaDatos();
            this.activaBotones(false, false, true, false);
            try {
                Tb_UsuarioDAO u = new Tb_UsuarioDAO();
                u.cargarUsuario_X_Maspol();
                Tb_UsuarioDTO objD = u.buscarCIP(txtNombUsuario.getText());
                if (objD != null) {
                    txtdni.setText(objD.getCod_ID_Usu());
                    txtGrado.setText(objD.getMA13());
                    txtnombres.setText(objD.getMA98());
                    NoMostrarDatos();
                } else {
                    CboEstado.setVisible(true);
                    CboNivel.setVisible(true);
                    fechaalta.setVisible(true);
                    fechamodif.setVisible(true);
                    txtnuevcontra.setVisible(true);
                    labelNuevContra.setVisible(true);
                    txtGrado.setVisible(false);
                    txtEstado.setVisible(false);
                    txtNivel.setVisible(false);
                    txtFechAlta.setVisible(false);
                    txtFechaModif.setVisible(false);
                    MostrarDatos();
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        this.activaBotones(false, true, true, false);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       /* if (btnActualizar.isEnabled()) {
            this.activaBotones(false, false, true, false);
            try {
                UsuarioDAO u = new UsuarioDAO();
                u.cargarUsuario();
                UsuarioDTO objD = u.buscar(txtNombUsuario.getText());
                if (objD != null) {

                    txtNombUsuario.setEditable(false);
                    txtdni.setEditable(true);
                    txtnombres.setEditable(true);
                    txtnuevcontra.setEditable(true);

                    fechaalta.setVisible(true);
                    fechaalta.setEnabled(true);
                    txtFechAlta.setVisible(false);
                    fechamodif.setVisible(true);
                    fechamodif.setEnabled(true);
                    txtFechaModif.setVisible(false);
                    txtGrado.setVisible(false);
                    CboNivel.setVisible(true);
                    CboNivel.setEnabled(true);
                    txtNivel.setVisible(false);
                    CboEstado.setVisible(true);
                    CboEstado.setEnabled(true);
                    txtEstado.setVisible(false);
                }
            } catch (SQLException f) {
                System.out.println(f.toString());
                MostrarDatos();
            }
        }*/
    }//GEN-LAST:event_btnActualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CboEstado;
    private javax.swing.JComboBox CboNivel;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNuevo;
    private com.toedter.calendar.JDateChooser fechaalta;
    private com.toedter.calendar.JDateChooser fechamodif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelNuevContra;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechAlta;
    private javax.swing.JTextField txtFechaModif;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtNombUsuario;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnuevcontra;
    // End of variables declaration//GEN-END:variables
}
