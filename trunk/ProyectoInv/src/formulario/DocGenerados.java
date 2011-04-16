package formulario;

import dao.DocumentosDAO;
import dao.TipDocDAO;
import dto.DocumentoDTO;
import dto.Tb_TablasDTO;
import dto.Tb_UsuarioDTO;
import dto.TipDocDTO;
import fondo.Principal;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

public class DocGenerados extends javax.swing.JFrame {

    public static String DocOrig;
    public static String documentos;
    public static String siglas;
    public static String numero;
    public static String fecha;
    int f;

    public DocGenerados() {
        initComponents();
        lblImagenEscudo1.setIcon(new ImageIcon(getClass().getResource("/imagenes/img.jpg")));
        this.setDefaultCloseOperation(DocOrigen.DISPOSE_ON_CLOSE);
        DocOrigen.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin");
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("c:\\fondo.jpg"));
        NoMostrarDatos();
        cargarComboTipoDoc();
        activaBotones(true, true, false, true, true, false);
        tabla.setVisible(false);
        txtCIP.setText(Principal.CIP);
        txtCIP.setVisible(false);
        centrar();        
        ultimoRegistro();
    }

     public void centrar() {
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize((pantallaTamano.width), (pantallaTamano.height));
        Dimension tamanoPanel = DocOrigenPanel.getSize();
        DocOrigenPanel.setBounds((pantallaTamano.width-tamanoPanel.width) / 2, (pantallaTamano.height - tamanoPanel.height) / 2, (int) tamanoPanel.getWidth(), (int) tamanoPanel.getHeight());
    }

    public void activaBotones(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
        btnBuscar.setEnabled(a);
        /*btnEliminar.setEnabled(b);
        btnGuardar.setEnabled(c);
        btnModificar.setEnabled(d);
        btnNuevo.setEnabled(e);
        btnCancelar.setEnabled(f);*/
    }

    public void LimpiaCajas() {
        txtCodTipDoc.setText(null);
        txtFecha.setText(null);
        txtNroRegistro.setText(null);
        txtSiglas.setText(null);
        txtNroDoc.setText(null);
    }

    private void cargarComboTipoDoc() {        
        try {
            TipDocDAO tdd = new TipDocDAO();
            Vector<TipDocDTO> vTipo;
            vTipo = tdd.cargarTipDoc();
            for (int i = 0; i < vTipo.size(); i++) {
                cbotipdoc.addItem(vTipo.elementAt(i).getTDoc());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DocGenerados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*private void cargarVariasTablas(){
        Tb_TablasDAO tb = new Tb_TablasDAO();
        Vector<Tb_TablasDTO> vTb;
       
    }*/

    public void NoMostrarDatos() {
        txtCodTipDoc.setEditable(false);
        txtFecha.setEditable(false);
        txtSiglas.setEditable(false);
        txtNroDoc.setEditable(false);
        cbotipdoc.setEnabled(false);        
        txtNroRegistro.setEditable(false);
    }

    public void MostrarDatos() {
        txtCodTipDoc.setEditable(true);
        txtFecha.setEditable(true);
        txtNroDoc.setEditable(true);
        txtSiglas.setEditable(true);
        cbotipdoc.setEnabled(true);
    }

    private void ultimoRegistro(){
        try {
            DocumentosDAO buscado = new DocumentosDAO();
            buscado.cargarDocumentos();
            int xx = buscado.incrementaREG();
            int yy = xx - 1;            
            DocumentoDTO objEnc = buscado.buscar(""+yy);
                txtNroRegistro.setText(objEnc.getNroRegistro());
                txtCodTipDoc.setText(objEnc.getCTip_Doc().getTDoc());                
                txtNroDoc.setText(objEnc.getNro_Doc());
                txtSiglas.setText(objEnc.getSiglas());
                txtFecha.setText(objEnc.getFechReg().toString());
        } catch (SQLException ex) {
            Logger.getLogger(DocOrigen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblImagenEscudo1 = new javax.swing.JLabel();
        DocOrigenPanel = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtSiglas = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCodTipDoc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbotipdoc = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtNroDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNroRegistro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAsignarTDR = new javax.swing.JButton();
        btnMostrarLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtMoviDoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodTabla = new javax.swing.JTextField();
        txtCodVarios = new javax.swing.JTextField();
        cboVarios = new javax.swing.JComboBox();
        cboTramite = new javax.swing.JComboBox();
        txtCIP = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel3.setText("SISTEMA Y SUPERVISION ");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel4.setText("DE PROYECTOS DE INVERSION");

        lblImagenEscudo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblImagenEscudo1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblImagenEscudo1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DocOrigenPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DOCUMENTO DE ORIGEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        DocOrigenPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda-de-archivos-de-documentos-de-zoom-icono-4140-16.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 31));

        txtSiglas.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtSiglas.setForeground(new java.awt.Color(0, 0, 153));
        txtSiglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiglasActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(txtSiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 112, 31));

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtFecha.setForeground(new java.awt.Color(0, 0, 153));
        DocOrigenPanel.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 112, 31));

        txtCodTipDoc.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCodTipDoc.setForeground(new java.awt.Color(0, 0, 153));
        DocOrigenPanel.add(txtCodTipDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 112, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setText("Siglas:");
        DocOrigenPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 169, 50, -1));

        cbotipdoc.setFont(new java.awt.Font("Tahoma", 1, 13));
        cbotipdoc.setForeground(new java.awt.Color(0, 0, 153));
        cbotipdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipdocActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(cbotipdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 112, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel17.setText("Nro. de Doc.:");
        DocOrigenPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 76, -1, 27));

        txtNroDoc.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNroDoc.setForeground(new java.awt.Color(0, 0, 153));
        txtNroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroDocActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(txtNroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Tipo de Doc.:");
        DocOrigenPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 121, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Nro. de Registro:");
        DocOrigenPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 48, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Fecha:");
        DocOrigenPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, 50, -1));

        txtNroRegistro.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNroRegistro.setForeground(new java.awt.Color(0, 0, 153));
        txtNroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroRegistroActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(txtNroRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, 31));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setText("AAAA-MM-DD");
        DocOrigenPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 90, 20));

        btnAsignarTDR.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnAsignarTDR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Bar Chart.png"))); // NOI18N
        btnAsignarTDR.setText("REGRESAR AL TERMINO DE REFERENCIA");
        btnAsignarTDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTDRActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(btnAsignarTDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 361, 36));

        btnMostrarLista.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnMostrarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        btnMostrarLista.setText("MOSTRAR LISTA");
        btnMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(btnMostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 33, 253, 32));

        tabla.setFont(new java.awt.Font("Tahoma", 1, 13));
        tabla.setForeground(new java.awt.Color(0, 0, 153));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NRO. DE REGISTRO", "NRO. DE DOCUMENTO", "TIPO DE DOCUMENTO", "SIGLAS", "FECHA"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        DocOrigenPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 610, 202));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3floppy-guardar-el-desmantelamiento-icono-4124-16.png"))); // NOI18N
        btnGuardar.setText("GRABAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sincronizacion-actualiza-la-recarga-icono-4348-16.png"))); // NOI18N
        btnModificar.setText("EDITAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deletered-icono-4373-16.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-de-mi-perfil-icono-3964-16.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivos-icono-9268-16.png"))); // NOI18N
        btnNuevo.setText(" NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        DocOrigenPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 740, 50));

        txtMoviDoc.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtMoviDoc.setForeground(new java.awt.Color(0, 0, 153));
        DocOrigenPanel.add(txtMoviDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 112, 31));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Origen de Documento:");
        DocOrigenPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, -1));

        txtCodTabla.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCodTabla.setForeground(new java.awt.Color(0, 0, 153));
        DocOrigenPanel.add(txtCodTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 112, 31));

        txtCodVarios.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCodVarios.setForeground(new java.awt.Color(0, 0, 153));
        DocOrigenPanel.add(txtCodVarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 112, 31));

        DocOrigenPanel.add(cboVarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 90, 30));

        DocOrigenPanel.add(cboTramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 90, 30));

        jMenuBar1.setBackground(new java.awt.Color(51, 204, 255));
        jMenuBar1.setForeground(new java.awt.Color(1, 1, 1));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 18));

        jMenu1.setBackground(new java.awt.Color(51, 204, 255));
        jMenu1.setText("MENU PRINCIPAL");
        jMenu1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16));

        jMenu17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventana.png"))); // NOI18N
        jMenu17.setText("MODULO DE FORMULACION");
        jMenu17.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu1.add(jMenu17);

        jMenu18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventana.png"))); // NOI18N
        jMenu18.setText("MODULO DE SEGUIMIENTO");
        jMenu18.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu1.add(jMenu18);

        jMenu19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventana.png"))); // NOI18N
        jMenu19.setText("MODULO DE MANTENIMIENTO");
        jMenu19.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jMenu20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario-gray-icono-8922-16.png"))); // NOI18N
        jMenu20.setText("Consultor");
        jMenu20.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jMenu28.setText("Registrar Consultor");
        jMenu28.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu20.add(jMenu28);

        jMenu19.add(jMenu20);

        jMenu21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red-de-usuario-icono-5874-16.png"))); // NOI18N
        jMenu21.setText("Coordinador");
        jMenu21.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jMenu27.setText("Registrar Coordinador");
        jMenu27.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu21.add(jMenu27);

        jMenu19.add(jMenu21);

        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario-icono-6969-16.png"))); // NOI18N
        jMenu16.setText("Usuario");
        jMenu16.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jMenu25.setText("Cambiar de Contraseña");
        jMenu25.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu25MouseClicked(evt);
            }
        });
        jMenu16.add(jMenu25);

        jMenu26.setText("Registrar Usuario");
        jMenu26.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu26MouseClicked(evt);
            }
        });
        jMenu16.add(jMenu26);

        jMenu19.add(jMenu16);

        jMenu1.add(jMenu19);

        jMenuBar1.add(jMenu1);

        jMenu9.setBackground(new java.awt.Color(51, 204, 255));
        jMenu9.setText("MODULO DE FORMULACION");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 0, 16));

        jMenu23.setText("Documento de Origen");
        jMenu23.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu23MouseClicked(evt);
            }
        });
        jMenu9.add(jMenu23);

        jMenu22.setText("TDR");
        jMenu22.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu22MouseClicked(evt);
            }
        });
        jMenu9.add(jMenu22);

        jMenu24.setText("PIP");
        jMenu24.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu24MouseClicked(evt);
            }
        });
        jMenu9.add(jMenu24);

        jMenuBar1.add(jMenu9);

        jMenu10.setBackground(new java.awt.Color(51, 204, 255));
        jMenu10.setText("MODULO DE SEGUIMIENTO");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 0, 16));
        jMenuBar1.add(jMenu10);

        jMenu2.setBackground(new java.awt.Color(51, 204, 255));
        jMenu2.setText("MODULO DE MANTENIMIENTO");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 16));
        jMenu2.setHideActionText(true);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario-gray-icono-8922-16.png"))); // NOI18N
        jMenu13.setText("Consultor");
        jMenu13.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jMenu14.setText("Registrar Consultor");
        jMenu14.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu13.add(jMenu14);

        jMenu2.add(jMenu13);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red-de-usuario-icono-5874-16.png"))); // NOI18N
        jMenu12.setText("Coordinador");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jMenu15.setText("Registrar Coordinador");
        jMenu15.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenu12.add(jMenu15);

        jMenu2.add(jMenu12);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario-icono-6969-16.png"))); // NOI18N
        jMenu11.setText("Usuario");
        jMenu11.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jMenu3.setText("Cambiar de Contraseña");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu11.add(jMenu3);

        jMenu8.setText("Registrar Usuario");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu11.add(jMenu8);

        jMenu2.add(jMenu11);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txtCIP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(DocOrigenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtCIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DocOrigenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (btnBuscar.isEnabled()) {
            activaBotones(true, true, false, true, true, false);
            try {
                String bus = JOptionPane.showInputDialog(null,"Ingrese Registro a buscar....","Buscar Registro", JOptionPane.QUESTION_MESSAGE);
                DocumentosDAO tip = new DocumentosDAO();
                tip.cargarDocumentos();
                DocumentoDTO objDoc = tip.buscar(bus);                
                if (objDoc != null) {
                    txtNroRegistro.setText(objDoc.getNroRegistro());                    
                    txtNroDoc.setText(objDoc.getNro_Doc());
                    txtCodTipDoc.setText(objDoc.getCTip_Doc().getTDoc());
                    txtSiglas.setText(objDoc.getSiglas());
                    txtFecha.setText(objDoc.getFechReg().toString());
                    cbotipdoc.setVisible(false);
                    txtFecha.setVisible(true);                    
                } else {
                    JOptionPane.showMessageDialog(this,"No se encuentra el registro","Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    ultimoRegistro();
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
        NoMostrarDatos();
        txtCodTipDoc.setEditable(false);
        txtCodTipDoc.setVisible(true);
}//GEN-LAST:event_btnBuscarActionPerformed

    private void txtSiglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiglasActionPerformed
        txtFecha.requestFocus();
}//GEN-LAST:event_txtSiglasActionPerformed

    private void txtNroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroDocActionPerformed
        txtCodTipDoc.requestFocus();
}//GEN-LAST:event_txtNroDocActionPerformed

    private void txtNroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroRegistroActionPerformed
        txtNroDoc.requestFocus();
}//GEN-LAST:event_txtNroRegistroActionPerformed

    private void btnAsignarTDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTDRActionPerformed
        DocOrig = txtNroRegistro.getText();
        siglas = txtSiglas.getText();
        numero = txtNroDoc.getText();
        fecha = txtFecha.getText();
        documentos = txtCodTipDoc.getText();
        dispose();
        new TDR().setVisible(true);
}//GEN-LAST:event_btnAsignarTDRActionPerformed

    private void cbotipdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipdocActionPerformed
        try {
            TipDocDAO tip = new TipDocDAO();
            String nomDoc = cbotipdoc.getSelectedItem().toString();
            TipDocDTO tdoc = tip.obtener(nomDoc);
            if (tdoc != null) {
                txtCodTipDoc.setText(tdoc.getCTip_Doc());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_cbotipdocActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new CambiarPassword().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked
    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        new Registrarse().setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void btnMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaActionPerformed
        try {
            tabla.setVisible(true);
            DefaultTableModel model = new DefaultTableModel();
            String titulo[] = {"NRO. DE REGISTRO", "NRO. DE DOCUMENTO", "TIPO DE DOCUMENTO", "SIGLAS", "FECHA"};
            model.setColumnIdentifiers(titulo);
            tabla.setModel(model);
            String datos[] = new String[5];

            f = model.getRowCount();
            if (f > 0) {
                model.removeRow(0);
            }

            DocumentosDAO tip = new DocumentosDAO();
            Vector<DocumentoDTO> vDocu = tip.cargarDocumentos();
            for (int i = 0; i <= f; i++) {
                datos[0] = vDocu.lastElement().getNroRegistro();
                datos[1] = vDocu.lastElement().getNro_Doc();
                datos[2] = vDocu.lastElement().getCTip_Doc().getTDoc();
                datos[3] = vDocu.lastElement().getSiglas();
                datos[4] = vDocu.lastElement().getFechReg().toString();
                model.addRow(datos);
            }
        } catch (SQLException f) {
            System.out.println(f.toString());
        }
    }//GEN-LAST:event_btnMostrarListaActionPerformed

    private void jMenu25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu25MouseClicked
        new CambiarPassword().setVisible(true);
    }//GEN-LAST:event_jMenu25MouseClicked

    private void jMenu26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu26MouseClicked
        new Registrarse().setVisible(true);
    }//GEN-LAST:event_jMenu26MouseClicked

    private void jMenu23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu23MouseClicked
        new DocOrigen().setVisible(true);
    }//GEN-LAST:event_jMenu23MouseClicked

    private void jMenu22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu22MouseClicked
        new TDR().setVisible(true);
    }//GEN-LAST:event_jMenu22MouseClicked

    private void jMenu24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu24MouseClicked
        new PIP().setVisible(true);
    }//GEN-LAST:event_jMenu24MouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        new Persona().setVisible(true);
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        new DatosCoordinador().setVisible(true);
    }//GEN-LAST:event_jMenu15MouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (btnGuardar.isEnabled()) {
            try {
                DocumentosDAO tbtipo = new DocumentosDAO();
                tbtipo.cargarDocumentos();
                if (txtNroRegistro.getText().isEmpty()){
                    txtNroRegistro.setText(""+tbtipo.incrementaREG());
                    DocumentoDTO xdoc = new DocumentoDTO();
                    xdoc.setNroRegistro(txtNroRegistro.getText());
                    xdoc.setNro_Doc(txtNroDoc.getText());
                    xdoc.setSiglas(txtSiglas.getText());
                    xdoc.setFechReg(Date.valueOf(txtFecha.getText()));
                    /*******************************/
                    /*******************************/
                    Tb_UsuarioDTO tbu = new Tb_UsuarioDTO();
                    tbu.setCod_ID_Usu(Principal.nroREG);
                    xdoc.setCod_ID_Usu(tbu);
                    /*******************************/
                    /*******************************/
                    TipDocDTO tidoc = new TipDocDTO();
                    tidoc.setCTip_Doc(txtCodTipDoc.getText());
                    xdoc.setCTip_Doc(tidoc);
                    tbtipo.agregarDocumento(xdoc);
                    JOptionPane.showMessageDialog(this,"Datos guardados satisfactoriamente en el Sistema...","Mensaje", 1);
                    ultimoRegistro();
                    activaBotones(true, true, false, true, true, false);
                } else{
                    DocumentoDTO xdoc = new DocumentoDTO();
                    xdoc.setNroRegistro(txtNroRegistro.getText());
                    xdoc.setNro_Doc(txtNroDoc.getText());
                    xdoc.setSiglas(txtSiglas.getText());
                    xdoc.setFechReg(Date.valueOf(txtFecha.getText()));
                    /**/Tb_UsuarioDTO tbu = new Tb_UsuarioDTO();
                    tbu.setCod_ID_Usu(Principal.nroREG);
                    xdoc.setCod_ID_Usu(tbu);
                    /**//**/TipDocDTO tid = new TipDocDTO();
                    tid.setCTip_Doc(txtCodTipDoc.getText());
                    xdoc.setCTip_Doc(tid);
                    tbtipo.actualizarDocumento(xdoc);
                    JOptionPane.showMessageDialog(this,"Se actualizo registro de datos","Mensaje", 1);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
}//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (btnModificar.isEnabled()) {
            activaBotones(false, false, true, false, false, true);
            MostrarDatos();
            txtNroDoc.requestFocus();
            txtCodTipDoc.setVisible(false);
            cbotipdoc.setVisible(true);
            cbotipdoc.setSelectedItem(txtCodTipDoc.getText());
        }
}//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            DocumentosDAO tip = new DocumentosDAO();
            tip.cargarDocumentos();
            DocumentoDTO objE = tip.buscar(txtNroRegistro.getText());
            int n = JOptionPane.showConfirmDialog(this,"¿Esta seguro que desea borrar estos datos?","Mensaje",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if (n == 0) {
                if (objE != null) {
                    tip.eliminarDocumentos(txtNroRegistro.getText());
                }
                JOptionPane.showMessageDialog(this, "Los Datos se Eliminaron Satisfactoriamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
                ultimoRegistro();
            } else {
                JOptionPane.showMessageDialog(this, "No se Eliminaron los Datos...","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException f) {
            System.out.println(f.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (btnCancelar.isEnabled()) {
            activaBotones(true, true, false, true, true, false);
            LimpiaCajas();
            cbotipdoc.setVisible(false);
            txtCodTipDoc.setVisible(true);
            ultimoRegistro();
        }
        NoMostrarDatos();
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.isEnabled()) {
            activaBotones(false, false, true, false, false, true);
            MostrarDatos();
            LimpiaCajas();
            txtNroDoc.requestFocus();
            cbotipdoc.setVisible(true);
            cbotipdoc.setSelectedIndex(0);
            txtCodTipDoc.setVisible(false);
        }
}//GEN-LAST:event_btnNuevoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DocOrigen().setVisible(true);
            }
        });


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DocOrigenPanel;
    private javax.swing.JButton btnAsignarTDR;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarLista;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboTramite;
    private javax.swing.JComboBox cboVarios;
    private javax.swing.JComboBox cbotipdoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenEscudo1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCIP;
    private javax.swing.JTextField txtCodTabla;
    private javax.swing.JTextField txtCodTipDoc;
    private javax.swing.JTextField txtCodVarios;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMoviDoc;
    private javax.swing.JTextField txtNroDoc;
    private javax.swing.JTextField txtNroRegistro;
    private javax.swing.JTextField txtSiglas;
    // End of variables declaration//GEN-END:variables
}
