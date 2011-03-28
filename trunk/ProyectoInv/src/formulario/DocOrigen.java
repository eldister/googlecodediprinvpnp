package formulario;

import dao.DocumentosDAO;
import dao.TipDocDAO;
import dto.DocumentoDTO;
import dto.TipDocDTO;
import fondo.Principal;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
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

public class DocOrigen extends javax.swing.JFrame {

    private GraphicsDevice gd = null;
    public static String DocOrig;
    public static String documentos;
    public static String siglas;
    public static String numero;
    public static String fecha;
    int f;

    public DocOrigen() {
        initComponents();
        lblImagenEscudo1.setIcon(new ImageIcon(getClass().getResource("/imagenes/img.jpg")));
        this.setDefaultCloseOperation(DocOrigen.DISPOSE_ON_CLOSE);
        DocOrigen.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin");
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("c:\\fondo.jpg"));
        PantallaCompleta();
        NoMostrarDatos();
        cargarComboTipoDoc();
        activaBotones(true, true, false, true, true, false);
        tabla.setVisible(false);
        ultimoRegistro();
        txtCIP.setText(Principal.nombusuario);        
    }

    public void activaBotones(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
        btnBuscar.setEnabled(a);
        btnEliminar.setEnabled(b);
        btnGuardar.setEnabled(c);
        btnModificar.setEnabled(d);
        btnNuevo.setEnabled(e);
        btnCancelar.setEnabled(f);
    }

    public void LimpiaCajas() {
        txtCodTipDoc.setText(null);
        txtFecha.setText(null);
        txtNroRegistro.setText(null);
        txtSiglas.setText(null);
        txtNroDoc.setText(null);
    }

    public void PantallaCompleta() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        gd = ge.getDefaultScreenDevice();
        if (!gd.isFullScreenSupported()) {
            System.out.println("WARNING: No hay soporte.\n");
        } else {
            System.out.println("INFO: Detectado soporte\n");
        }
        try {
            gd.setFullScreenWindow(this);
        } catch (Exception e) {
            System.out.println("ERROR CRITICO: " + e.getMessage());
        }
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
            System.out.println(ex.toString());
        }
    }

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
        jPanel5 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNroRegistro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAsignarTDR = new javax.swing.JButton();
        btnMostrarLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel3.setText("SISTEMA Y SUPERVISION ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(249, 2, 378, 42);

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel4.setText("DE PROYECTOS DE INVERSION");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(214, 50, 476, 51);
        jPanel3.add(lblImagenEscudo1);
        lblImagenEscudo1.setBounds(0, 0, 120, 100);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 760, 100));

        DocOrigenPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DOCUMENTO DE ORIGEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        DocOrigenPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-buscar-ampliar-icono-9630-16.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 33, 110, 31));

        txtSiglas.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtSiglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiglasActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(txtSiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 159, 107, 31));

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 14));
        DocOrigenPanel.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 201, 110, 31));

        txtCodTipDoc.setFont(new java.awt.Font("Tahoma", 0, 14));
        DocOrigenPanel.add(txtCodTipDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel15.setText("Siglas:");
        DocOrigenPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, 40, -1));

        cbotipdoc.setFont(new java.awt.Font("Tahoma", 0, 14));
        cbotipdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipdocActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(cbotipdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel17.setText("Nro. de Doc.:");
        DocOrigenPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 27));

        txtNroDoc.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtNroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroDocActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(txtNroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 75, 107, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Tipo de Doc.:");
        DocOrigenPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Nro. de Registro:");
        DocOrigenPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 47, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3floppy-guardar-el-desmantelamiento-icono-4124-16.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel5.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 140, 30));

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sincronizacion-actualiza-la-recarga-icono-4348-16.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel5.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, 30));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deletered-icono-4373-16.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 140, 30));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-de-mi-perfil-icono-3964-16.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 140, 30));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/manila-nuevo-icono-3676-16.png"))); // NOI18N
        btnNuevo.setText(" NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 118, 30));

        DocOrigenPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 740, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("Fecha:");
        DocOrigenPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 215, 50, -1));

        txtNroRegistro.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtNroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroRegistroActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(txtNroRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 33, 107, 31));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setText("AAAA-MM-DD");
        DocOrigenPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        btnAsignarTDR.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnAsignarTDR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        btnAsignarTDR.setText("ASIGNAR TERMINO DE REFERENCIA");
        btnAsignarTDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTDRActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(btnAsignarTDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 361, 36));

        btnMostrarLista.setFont(new java.awt.Font("Tahoma", 0, 14));
        btnMostrarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        btnMostrarLista.setText("MOSTRAR LISTA");
        btnMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaActionPerformed(evt);
            }
        });
        DocOrigenPanel.add(btnMostrarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 37, 253, 32));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 13));
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

        DocOrigenPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 80, 642, 202));

        getContentPane().add(DocOrigenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 1020, 460));
        getContentPane().add(txtCIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, -1));

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuBar1.setForeground(new java.awt.Color(1, 1, 1));
        jMenuBar1.setFont(new java.awt.Font("Tahoma", 0, 18));

        jMenu1.setBackground(new java.awt.Color(153, 153, 255));
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

        jMenu9.setBackground(new java.awt.Color(153, 153, 255));
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

        jMenu10.setBackground(new java.awt.Color(153, 153, 255));
        jMenu10.setText("MODULO DE SEGUIMIENTO");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 0, 16));
        jMenuBar1.add(jMenu10);

        jMenu2.setBackground(new java.awt.Color(153, 153, 255));
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (btnBuscar.isEnabled()) {
            activaBotones(true, true, false, true, true, false);
            try {
                String bus = JOptionPane.showInputDialog(null, "Ingrese Registro a buscar....","Buscar Registro", JOptionPane.INFORMATION_MESSAGE);                
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
                    MostrarDatos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se encuentra el registro",
                            "Mensaje", JOptionPane.INFORMATION_MESSAGE);
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (btnGuardar.isEnabled()) {
            activaBotones(true, false, false, false, true, false);
            try {
                DocumentosDAO tbtipo = new DocumentosDAO();
                tbtipo.cargarDocumentos();
                DocumentoDTO dto = tbtipo.buscar(""+tbtipo.incrementaREG());
                if (dto != null){
                    txtNroRegistro.setText(""+tbtipo.incrementaREG());
                    DocumentoDTO xdoc = new DocumentoDTO();
                    xdoc.setNroRegistro(txtNroRegistro.getText());
                    xdoc.setNro_Doc(txtNroDoc.getText());
                    xdoc.setSiglas(txtSiglas.getText());
                    xdoc.setFechReg(Date.valueOf(txtFecha.getText()));
                    xdoc.setCod_CIP_REGDOC(txtCIP.getText());
                    /**/TipDocDTO tidoc = new TipDocDTO();
                        tidoc.setCTip_Doc(txtCodTipDoc.getText());
                        xdoc.setCTip_Doc(tidoc);
                        tbtipo.agregarDocumento(xdoc);
                        JOptionPane.showMessageDialog(this,"Datos guardados satisfactoriamente", "Mensaje", 1);
                        ultimoRegistro();
                } else{
                    DocumentoDTO xdoc = new DocumentoDTO();
                    xdoc.setNroRegistro(txtNroRegistro.getText());
                    xdoc.setNro_Doc(txtNroDoc.getText());
                    xdoc.setSiglas(txtSiglas.getText());
                    xdoc.setFechReg(Date.valueOf(txtFecha.getText()));
                    xdoc.setCod_CIP_REGDOC(txtCIP.getText());
                    /**/TipDocDTO tid = new TipDocDTO();
                        tid.setCTip_Doc(txtCodTipDoc.getText());                    
                        xdoc.setCTip_Doc(tid);
                        tbtipo.actualizarDocumento(xdoc);
                        JOptionPane.showMessageDialog(this, "Se actualizo registro de datos", "Mensaje", 1);
                    }                
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
        //LimpiaCajas();
        //NoMostrarDatos();
        //txtCodTipDoc.setVisible(true);
}//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (btnModificar.isEnabled()) {
            activaBotones(true, false, true, false, false, true);
        }
        MostrarDatos();
        txtNroDoc.requestFocus();
        txtCodTipDoc.setVisible(false);
        cbotipdoc.setVisible(true);
        cbotipdoc.setSelectedItem(txtCodTipDoc.getText());
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
                JOptionPane.showMessageDialog(this, "No se Eliminaron los Datos...", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
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
    private void txtNroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroRegistroActionPerformed
        txtNroDoc.requestFocus();
}//GEN-LAST:event_txtNroRegistroActionPerformed

    private void btnAsignarTDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTDRActionPerformed
        DocOrig = txtNroRegistro.getText();
        siglas = txtSiglas.getText();
        numero = txtNroDoc.getText();
        fecha = txtFecha.getText();
        documentos = txtCodTipDoc.getText();


        new TDR().setVisible(true);
        dispose();

}//GEN-LAST:event_btnAsignarTDRActionPerformed

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
            DocumentoDTO objE = tip.buscar(txtNroRegistro.getText());

            for (int i = 0; i <= f; i++) {
                datos[0] = vDocu.firstElement().getNroRegistro();
                datos[1] = vDocu.firstElement().getNro_Doc();
                datos[2] = vDocu.firstElement().getCTip_Doc().getTDoc();
                datos[3] = vDocu.firstElement().getSiglas();
                datos[4] = vDocu.firstElement().getFechReg().toString();
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
    private javax.swing.JComboBox cbotipdoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField txtCodTipDoc;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNroDoc;
    private javax.swing.JTextField txtNroRegistro;
    private javax.swing.JTextField txtSiglas;
    // End of variables declaration//GEN-END:variables
}
