package formulario;

import dao.CoordinadorDAO;
import dto.CoordinadorDTO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TDR extends javax.swing.JFrame {

    public static String DocCIP;

    public TDR() {
        initComponents();
        centrar();
        this.setDefaultCloseOperation(TDR.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        activaBotones(true, true, true, true);
        NoMostrarDatosPIP();        

        txtDocumento1.setEditable(false);
        txtFecha1.setEditable(false);
        txtNro1.setEditable(false);
        txtSiglas1.setEditable(false);
        txtnomProy.setEditable(false);

        txtSiglas1.setText(DocOrigen.siglas);
        txtFecha1.setText(DocOrigen.fecha);
        txtNro1.setText(DocOrigen.numero);
        txtDocumento1.setText(DocOrigen.documentos);
        txtnomProy.setText(PIP.nombProy);

        txtDepartamento.setText(PIP.departamento);
        txtDistrito.setText(PIP.distrito);
        txtProvincia.setText(PIP.provincia);
        txtLocalidad.setText(PIP.localidad);

        txtcomisaria.setText(PIP.comisaria);
        txtdireccion.setText(PIP.direccion);
        txtotros.setText(PIP.otros);
        txtdivision.setText(PIP.division);
    }    

    private void activaBotones(boolean a, boolean b, boolean c, boolean d) {                
        btnGrabar.setEnabled(a);
        btnEditar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnEliminar.setEnabled(d);
    }

    public void centrar() {
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize((pantallaTamano.width), (pantallaTamano.height));
        Dimension tamanoPanel = TDRPanel.getSize();
        TDRPanel.setBounds((pantallaTamano.width-tamanoPanel.width) / 2, (pantallaTamano.height - tamanoPanel.height) / 2, (int) tamanoPanel.getWidth(), (int) tamanoPanel.getHeight());
    }

    private void NoMostrarDatosPIP() {
        txtDepartamento.setEditable(false);
        txtProvincia.setEditable(false);
        txtDistrito.setEditable(false);
        txtLocalidad.setEditable(false);

        txtcomisaria.setEditable(false);
        txtdireccion.setEditable(false);
        txtotros.setEditable(false);
        txtdivision.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TDRPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtnomProy = new javax.swing.JTextField();
        Localizacion = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        Ubicacion = new javax.swing.JPanel();
        txtotros = new javax.swing.JTextField();
        txtcomisaria = new javax.swing.JTextField();
        txtdivision = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Coordinador = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscarCoor = new javax.swing.JButton();
        btnRegCoord = new javax.swing.JButton();
        txtCIP1 = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnPIP = new javax.swing.JButton();
        txtAsigNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSiglas1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNro1 = new javax.swing.JTextField();
        txtDocumento1 = new javax.swing.JTextField();
        txtFecha1 = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnEnviaLog = new javax.swing.JButton();
        jpnDocLog = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnEnviaLog1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblImagenEscudo2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblImagenEscudo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TDRPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS GENERALES", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18), new java.awt.Color(0, 102, 53))); // NOI18N
        TDRPanel.setFont(new java.awt.Font("Arial Narrow", 1, 24));
        TDRPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Nombre del Proyecto:");
        TDRPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 173, -1, 20));

        txtnomProy.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtnomProy.setForeground(new java.awt.Color(0, 0, 153));
        TDRPanel.add(txtnomProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 163, 545, 30));

        Localizacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "UBICAION GEOGRAFICA:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18), new java.awt.Color(0, 102, 53))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Provincia:");

        txtProvincia.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtProvincia.setForeground(new java.awt.Color(0, 0, 153));

        txtDistrito.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtDistrito.setForeground(new java.awt.Color(0, 0, 153));
        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Distrito:");

        txtDepartamento.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtDepartamento.setForeground(new java.awt.Color(0, 0, 153));
        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setText("Departamento:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setText("Localidad:");

        txtLocalidad.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtLocalidad.setForeground(new java.awt.Color(0, 0, 153));
        txtLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LocalizacionLayout = new javax.swing.GroupLayout(Localizacion);
        Localizacion.setLayout(LocalizacionLayout);
        LocalizacionLayout.setHorizontalGroup(
            LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocalizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        LocalizacionLayout.setVerticalGroup(
            LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocalizacionLayout.createSequentialGroup()
                .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LocalizacionLayout.createSequentialGroup()
                        .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(3, 3, 3)
                        .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LocalizacionLayout.createSequentialGroup()
                        .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addGap(3, 3, 3)
                        .addGroup(LocalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TDRPanel.add(Localizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        Ubicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "UBICACION POLICIAL:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18), new java.awt.Color(0, 102, 53))); // NOI18N

        txtotros.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtotros.setForeground(new java.awt.Color(0, 0, 153));

        txtcomisaria.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtcomisaria.setForeground(new java.awt.Color(0, 0, 153));

        txtdivision.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtdivision.setForeground(new java.awt.Color(0, 0, 153));

        txtdireccion.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtdireccion.setForeground(new java.awt.Color(0, 0, 153));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setText("Otros:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel16.setText("Comisaria:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel17.setText("Division:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel19.setText("Direccion / Region:");

        javax.swing.GroupLayout UbicacionLayout = new javax.swing.GroupLayout(Ubicacion);
        Ubicacion.setLayout(UbicacionLayout);
        UbicacionLayout.setHorizontalGroup(
            UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(txtcomisaria, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtotros, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UbicacionLayout.setVerticalGroup(
            UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UbicacionLayout.createSequentialGroup()
                .addGroup(UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UbicacionLayout.createSequentialGroup()
                        .addGroup(UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGroup(UbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UbicacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcomisaria, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                            .addGroup(UbicacionLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtotros, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))))
                    .addGroup(UbicacionLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdivision, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UbicacionLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TDRPanel.add(Ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        Coordinador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "COORDINADOR:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18), new java.awt.Color(0, 102, 53))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel22.setText("CIP:");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtNombre.setForeground(new java.awt.Color(0, 0, 153));

        btnBuscarCoor.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnBuscarCoor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-buscar-ampliar-icono-9630-16.png"))); // NOI18N
        btnBuscarCoor.setText("BUSCAR");
        btnBuscarCoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCoorActionPerformed(evt);
            }
        });

        btnRegCoord.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnRegCoord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-usuario-icono-4000-16.png"))); // NOI18N
        btnRegCoord.setText("REGISTRAR");
        btnRegCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCoordActionPerformed(evt);
            }
        });

        txtCIP1.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtCIP1.setForeground(new java.awt.Color(0, 0, 153));

        txtGrado.setEditable(false);
        txtGrado.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtGrado.setForeground(new java.awt.Color(0, 0, 153));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vacio-icono-8134-16.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CoordinadorLayout = new javax.swing.GroupLayout(Coordinador);
        Coordinador.setLayout(CoordinadorLayout);
        CoordinadorLayout.setHorizontalGroup(
            CoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoordinadorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(jLabel22)
                .addGap(10, 10, 10)
                .addComponent(txtCIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnBuscarCoor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnLimpiar)
                .addGap(9, 9, 9)
                .addComponent(btnRegCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(CoordinadorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CoordinadorLayout.setVerticalGroup(
            CoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoordinadorLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(CoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel22)
                    .addComponent(txtCIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CoordinadorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnBuscarCoor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CoordinadorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CoordinadorLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnRegCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(CoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TDRPanel.add(Coordinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 480, 120));

        btnPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnPIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/la-flecha-verde-de-la-derecha-icono-6651-32.png"))); // NOI18N
        btnPIP.setText("IR AL PIP");
        btnPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIPActionPerformed(evt);
            }
        });
        TDRPanel.add(btnPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 143, 160, 30));

        txtAsigNumero.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtAsigNumero.setForeground(new java.awt.Color(0, 0, 153));
        txtAsigNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsigNumeroActionPerformed(evt);
            }
        });
        TDRPanel.add(txtAsigNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 121, 116, 31));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setText("Nº. TDR:");
        TDRPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 128, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        txtSiglas1.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtSiglas1.setForeground(new java.awt.Color(0, 0, 153));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel18.setText("Siglas:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Documento:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Numero:");

        txtNro1.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtNro1.setForeground(new java.awt.Color(0, 0, 153));
        txtNro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNro1ActionPerformed(evt);
            }
        });

        txtDocumento1.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtDocumento1.setForeground(new java.awt.Color(0, 0, 153));

        txtFecha1.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtFecha1.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtNro1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSiglas1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel18))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSiglas1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(txtFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDocumento1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(txtNro1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        TDRPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 26, -1, -1));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sincronizacion-actualiza-la-recarga-icono-4348-16.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        TDRPanel.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 130, 30));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        TDRPanel.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 130, 30));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Warning.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        TDRPanel.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 130, 30));

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3floppy-guardar-el-desmantelamiento-icono-4124-16.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        TDRPanel.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 130, 30));

        btnEnviaLog.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnEnviaLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/la-flecha-verde-de-la-derecha-icono-6651-32.png"))); // NOI18N
        btnEnviaLog.setText("REGISTRO DE DOCUMENTO PARA DIRLOG - PNP");
        btnEnviaLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviaLogActionPerformed(evt);
            }
        });
        TDRPanel.add(btnEnviaLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 314, 30));

        jpnDocLog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel20.setText("Documento Enviado a Logistica:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel14.setText("Tipo Doc.:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 13));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel26.setText("Nº Doc.:");

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 13));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel27.setText("Fecha:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13));

        javax.swing.GroupLayout jpnDocLogLayout = new javax.swing.GroupLayout(jpnDocLog);
        jpnDocLog.setLayout(jpnDocLogLayout);
        jpnDocLogLayout.setHorizontalGroup(
            jpnDocLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDocLogLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(1, 1, 1)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel26)
                .addGap(2, 2, 2)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel27)
                .addGap(5, 5, 5)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpnDocLogLayout.setVerticalGroup(
            jpnDocLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDocLogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDocLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDocLogLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpnDocLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20)))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnDocLogLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnDocLogLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TDRPanel.add(jpnDocLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        btnEnviaLog1.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnEnviaLog1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info.png"))); // NOI18N
        btnEnviaLog1.setText("ENVIAR A DIRLOG - PNP");
        btnEnviaLog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviaLog1ActionPerformed(evt);
            }
        });
        TDRPanel.add(btnEnviaLog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 314, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel21.setText("SISTEMA Y SUPERVISION ");

        jLabel23.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel23.setText("DE PROYECTOS DE INVERSION");

        lblImagenEscudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblImagenEscudo2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel21))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblImagenEscudo2, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel21)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel24.setText("INFORMACION GENERAL");

        jLabel25.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel25.setText("DEL TERMINO DE REFERENCIA");

        lblImagenEscudo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblImagenEscudo3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel24))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel25)))
                .addGap(176, 176, 176))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenEscudo3, 0, 0, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(TDRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TDRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(366, 366, 366)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtDistritoActionPerformed

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtDepartamentoActionPerformed

    private void txtLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalidadActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtLocalidadActionPerformed

    private void btnBuscarCoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCoorActionPerformed
        if (btnBuscarCoor.isEnabled()) {

            try {
                CoordinadorDAO u = new CoordinadorDAO();
                u.cargarCoordinador1();
                CoordinadorDTO objD = u.buscar(txtCIP1.getText());

                if (objD != null) {

                    txtCIP1.setText(objD.getCodCoordinador());
                    txtGrado.setText(objD.getTPCOD().getTPCOR());
                    txtNombre.setText(objD.getNombre());
                    JOptionPane.showMessageDialog(this, "El Coordinador ya existe", "Mensaje", 2);
                    btnRegCoord.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "El Coordinador No existe, necesita registrarlo", "Mensaje", 2);
                }

            } catch (SQLException f) {
                System.out.println(f.toString());
            }
        }
}//GEN-LAST:event_btnBuscarCoorActionPerformed

    private void btnRegCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCoordActionPerformed
        DocCIP = txtCIP1.getText();
        new DatosCoordinador().setVisible(true);
}//GEN-LAST:event_btnRegCoordActionPerformed

    private void btnPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIPActionPerformed
        new PIP().setVisible(true);
        txtDepartamento.setEditable(false);
        txtProvincia.setEditable(false);
        txtDistrito.setEditable(false);
        txtLocalidad.setEditable(false);
        txtcomisaria.setEditable(false);
        txtdireccion.setEditable(false);
        txtdivision.setEditable(false);
        this.dispose();
}//GEN-LAST:event_btnPIPActionPerformed

    private void txtAsigNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsigNumeroActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtAsigNumeroActionPerformed

    private void txtNro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNro1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtNro1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCIP1.setText("");
        txtGrado.setText("");
        txtNombre.setText("");
        btnRegCoord.setVisible(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEnviaLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviaLogActionPerformed
        dispose();
        new DocGenerados().setVisible(true);
}//GEN-LAST:event_btnEnviaLogActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEnviaLog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviaLog1ActionPerformed
        dispose();
        new OrdenServicioDirlog().setVisible(true);
    }//GEN-LAST:event_btnEnviaLog1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TDR().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Coordinador;
    private javax.swing.JPanel Localizacion;
    private javax.swing.JPanel TDRPanel;
    private javax.swing.JPanel Ubicacion;
    private javax.swing.JButton btnBuscarCoor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviaLog;
    private javax.swing.JButton btnEnviaLog1;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPIP;
    private javax.swing.JButton btnRegCoord;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel jpnDocLog;
    private javax.swing.JLabel lblImagenEscudo2;
    private javax.swing.JLabel lblImagenEscudo3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAsigNumero;
    private javax.swing.JTextField txtCIP1;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDocumento1;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNro1;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtSiglas1;
    private javax.swing.JTextField txtcomisaria;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdivision;
    private javax.swing.JTextField txtnomProy;
    private javax.swing.JTextField txtotros;
    // End of variables declaration//GEN-END:variables
}
