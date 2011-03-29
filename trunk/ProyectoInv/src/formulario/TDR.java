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

        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
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
        btnCancelar1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEnviaLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/papel-de-las-noticias-icono-4922-32.png"))); // NOI18N
        jLabel14.setText("INFORMACION GENERAL TDR / DIVPRINV");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TDRPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS GENERALES", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18))); // NOI18N
        TDRPanel.setFont(new java.awt.Font("Arial Narrow", 1, 24));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("Nombre del Proyecto:");

        txtnomProy.setFont(new java.awt.Font("Tahoma", 1, 14));

        Localizacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "LOCALIZACION GEOGRAFICA DEL TDR:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel7.setText("Provincia:");

        txtProvincia.setFont(new java.awt.Font("Tahoma", 1, 14));

        txtDistrito.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setText("Distrito:");

        txtDepartamento.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setText("Departamento:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setText("Localidad:");

        txtLocalidad.setFont(new java.awt.Font("Tahoma", 1, 14));
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

        Ubicacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "UBICACION POLICIAL:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18))); // NOI18N

        txtotros.setFont(new java.awt.Font("Tahoma", 1, 14));

        txtcomisaria.setFont(new java.awt.Font("Tahoma", 1, 14));

        txtdivision.setFont(new java.awt.Font("Tahoma", 1, 14));

        txtdireccion.setFont(new java.awt.Font("Tahoma", 1, 14));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel15.setText("Otros:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel16.setText("Comisaria:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel17.setText("Division:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14));
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

        Coordinador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "COORDINADOR:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel22.setText("CIP:");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14));

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

        txtCIP1.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtGrado.setEditable(false);
        txtGrado.setFont(new java.awt.Font("Tahoma", 1, 14));

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

        btnPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnPIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/la-flecha-verde-de-la-derecha-icono-6651-32.png"))); // NOI18N
        btnPIP.setText("IR AL PIP");
        btnPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIPActionPerformed(evt);
            }
        });

        txtAsigNumero.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtAsigNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsigNumeroActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("Nº. TDR:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        txtSiglas1.setFont(new java.awt.Font("Tahoma", 1, 14));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel18.setText("Siglas:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Documento:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Numero:");

        txtNro1.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtNro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNro1ActionPerformed(evt);
            }
        });

        txtDocumento1.setFont(new java.awt.Font("Tahoma", 1, 14));

        txtFecha1.setFont(new java.awt.Font("Tahoma", 1, 14));

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

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sincronizacion-actualiza-la-recarga-icono-4348-16.png"))); // NOI18N
        btnEditar.setText("MODIFICAR");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");

        btnCancelar1.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Warning.png"))); // NOI18N
        btnCancelar1.setText("CANCELAR");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3floppy-guardar-el-desmantelamiento-icono-4124-16.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEnviaLog.setFont(new java.awt.Font("Tahoma", 1, 13));
        btnEnviaLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/la-flecha-verde-de-la-derecha-icono-6651-32.png"))); // NOI18N
        btnEnviaLog.setText("ENVIAR LOGISTICA");
        btnEnviaLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviaLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TDRPanelLayout = new javax.swing.GroupLayout(TDRPanel);
        TDRPanel.setLayout(TDRPanelLayout);
        TDRPanelLayout.setHorizontalGroup(
            TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TDRPanelLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(TDRPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAsigNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnomProy, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183)
                .addComponent(btnPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(TDRPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Localizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(TDRPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(TDRPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Coordinador, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TDRPanelLayout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TDRPanelLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEnviaLog, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        TDRPanelLayout.setVerticalGroup(
            TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TDRPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TDRPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel11)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TDRPanelLayout.createSequentialGroup()
                        .addComponent(txtAsigNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtnomProy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TDRPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Localizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Coordinador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TDRPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(TDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnEnviaLog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TDRPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(TDRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed

}//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEnviaLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviaLogActionPerformed

}//GEN-LAST:event_btnEnviaLogActionPerformed

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
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviaLog;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
