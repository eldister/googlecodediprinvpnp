package formulario;

import dao.LoginDAO;
import dao.PipDAO;
import dao.Tb_NivCaliPIPDAO;
import dao.Tb_NivEstPIPDAO;
import dao.Tb_SituPIPDAO;
import dao.UniproyectosDAO;
import dao.departamentoDAO;
import dao.distritoDAO;
import dao.provinciaDAO;
import dto.LoginDTO;
import dto.PipDTO;
import dto.Tb_NivCaliPIP;
import dto.Tb_NivEstPIP;
import dto.Tb_NomuniII;
import dto.Tb_SituPIP;
import dto.UniproyectosDTO;
import dto.departamentoDTO;
import dto.distritoDTO;
import dto.provinciaDTO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

public class PIP extends javax.swing.JFrame {

    public static String departamento;
    public static String distrito;
    public static String provincia;
    public static String localidad;
    public static String comisaria;
    public static String division;
    public static String otros;
    public static String direccion;
    public static String nombProy;

    public PIP() {
        initComponents();
        this.setDefaultCloseOperation(PIP.DISPOSE_ON_CLOSE);
        cargarComboDepartamento();
        Invisible();
        NoMostrarDatos();
        cargarSituacion();
        //cargarUNIPIP();
        cargarUniEjePR();
        cargarUniForPR();
        cargarUniForPRF();
        cargarNivCaliPIP();
        cargarNivEstPIP();
        activaBotones(true, false, false, false, true, false, false, false, false);        
        NoEditable();
        centrar();
    }

    public void centrar() {
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize((pantallaTamano.width), (pantallaTamano.height));
        Dimension tamanoPanel = jPanel2.getSize();
        jPanel2.setBounds((pantallaTamano.width - tamanoPanel.width) / 2, (pantallaTamano.height - tamanoPanel.height) / 2, (int) tamanoPanel.getWidth(), (int) tamanoPanel.getHeight());
    }

    private void activaBotones(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h, boolean i) {
        btnBuscarPIP.setEnabled(a);
        btnEliminar.setEnabled(b);
        btnGrabar.setEnabled(c);
        btnEditar.setEnabled(d);
        btnNuevo.setEnabled(e);
        btnCancelar.setEnabled(f);
        btnBuscarPRFUF.setEnabled(g);
        btnBuscarPRUF.setEnabled(h);
        btnBuscarPRUE.setEnabled(i);

    }

    private void NoMostrarDatos() {
        txtCodPIP.setEditable(false);
        txtGradoUFPRF.setEditable(false);
        txtNomUFPRF.setEditable(false);
        txtGradoUFPR.setEditable(false);
        txtNomUFPR.setEditable(false);
        txtGrado.setEditable(false);
        txtNombreUE.setEditable(false);        
        txtNombDepart.setEditable(false);
        txtNombDist.setEditable(false);
        txtNombProv.setEditable(false);        
        txtCIPUFPIPprf.setEditable(false);
        txtCIPUiFPIPpr.setEditable(false);
    }

    private void Invisible() {
        txtCodDep.setVisible(false);
        txtCodDist.setVisible(false);
        txtCodProv.setVisible(false);
        txtNombDepart.setVisible(false);
        txtNombDist.setVisible(false);
        txtNombProv.setVisible(false);
        txtCodNE.setVisible(false);
        txtCodNC.setVisible(false);
        txtNivEstudio.setVisible(false);
        txtNivCali.setVisible(false);
        txtCodSituPIP.setVisible(false);        
    }

    public void NoEditable() {
        txtOtrosUP.setEditable(false);
        txtnombProy.setEditable(false);
        txtlocal.setEditable(false);
        txtDivision.setEditable(false);
        txtComisaria.setEditable(false);
        txtdireccion.setEditable(false);
        txtSuper.setEditable(false);
        txtSecUEPIP.setEditable(false);
        txtCIPUEPIP.setEditable(false);
        txtCIPUFPIPprf.setEditable(false);
        txtCapa.setEditable(false);
        txtEquipa.setEditable(false);
        txtEstudios.setEditable(false);
        txtFechSnip.setEditable(false);
        txtFuente.setEditable(false);
        txtGrado.setEditable(false);
        txtGradoUFPR.setEditable(false);
        txtNivCali.setEditable(false);
        txtCodSnip.setEditable(false);
        txtNivEstudio.setEditable(false);
        txtSeUFPIP.setEditable(false);
        txtPliUFPIP.setEditable(false);
        txtNomUEPIP.setEditable(false);
        txtNomUFPIP.setEditable(false);
        txtPliUEPIP.setEditable(false);
        txtObras.setEditable(false);
        txtOtros.setEditable(false);
        txtCodPIP.setEditable(false);
        cboDepar.setEnabled(false);
        cboNivCalifi.setEnabled(false);
        cboNivEstu.setEnabled(false);
        cboSituPIP.setEnabled(false);
        cbodistri.setEnabled(false);
        cboprovin.setEnabled(false);
    }

    public void Limpiar() {
        txtCodPIP.setText(null);
        txtCodSnip.setText(null);
        txtOtrosUP.setText(null);
        txtnombProy.setText(null);
        txtlocal.setText(null);
        txtDivision.setText(null);
        txtComisaria.setText(null);
        txtdireccion.setText(null);
        txtCIPUiFPIPpr.setText(null);
        txtSuper.setText(null);
        txtSecUEPIP.setText(null);
        txtCIPUEPIP.setText(null);
        txtCIPUFPIPprf.setText(null);
        txtCapa.setText(null);
        txtEquipa.setText(null);
        txtEstudios.setText(null);
        txtFechSnip.setText(null);
        txtFuente.setText(null);
        txtGrado.setText(null);
        txtGradoUFPR.setText(null);
        txtNivCali.setText(null);
        txtCodSnip.setText(null);
        txtNivEstudio.setText(null);
        txtSeUFPIP.setText(null);
        txtPliUFPIP.setText(null);
        txtNomUEPIP.setText(null);
        txtNomUFPIP.setText(null);
        txtPliUEPIP.setText(null);
        txtObras.setText(null);
        txtOtros.setText(null);
        txtNombDepart.setText(null);
        txtNombreUE.setText(null);
        txtNombDist.setText(null);
        txtNombProv.setText(null);
        txtGradoUFPRF.setText(null);
        txtNomUFPRF.setText(null);
        txtGradoUFPR.setText(null);
        txtNomUFPR.setText(null);
    }

    public void Editable() {
        txtOtrosUP.setEditable(true);
        txtnombProy.setEditable(true);
        txtlocal.setEditable(true);
        txtDivision.setEditable(true);
        txtComisaria.setEditable(true);
        txtdireccion.setEditable(true);
        txtSuper.setEditable(true);
        txtSecUEPIP.setEditable(true);
        txtCapa.setEditable(true);
        txtEquipa.setEditable(true);
        txtEstudios.setEditable(true);
        txtFechSnip.setEditable(true);
        txtFuente.setEditable(true);
        txtNivCali.setEditable(true);
        txtCodSnip.setEditable(true);
        txtNivEstudio.setEditable(true);
        txtSeUFPIP.setEditable(true);
        txtPliUFPIP.setEditable(true);
        txtNomUEPIP.setEditable(true);
        txtNomUFPIP.setEditable(true);
        txtPliUEPIP.setEditable(true);
        txtObras.setEditable(true);
        txtOtros.setEditable(true);
        txtCodPIP.setEditable(true);
        cboDepar.setEnabled(true);
        cbodistri.setEnabled(true);
        cboprovin.setEnabled(true);
        cboNivCalifi.setEnabled(true);
        cboNivEstu.setEnabled(true);
        cboSituPIP.setEnabled(true);
        cboDepar.setVisible(true);
        cbodistri.setVisible(true);
        cboprovin.setVisible(true);
        cboNivCalifi.setVisible(true);
        cboNivEstu.setVisible(true);
        cboSituPIP.setVisible(true);
        txtNombDepart.setVisible(false);
        txtNombDist.setVisible(false);
        txtNombProv.setVisible(false);
        txtNivCali.setVisible(false);
        txtNivEstudio.setVisible(false);
        lblSituacion.setVisible(false);
    }

    private void comboPrimer(){
        cboDepar.setSelectedIndex(0);
        cboprovin.setSelectedIndex(0);
        cbodistri.setSelectedIndex(0);
        cboSituPIP.setSelectedIndex(0);
        cboNivEstu.setSelectedIndex(0);
        cboNivCalifi.setSelectedIndex(0);
    }

    private void buscarCIP_UFPRF() {
        try {
            String xx = txtCIPUFPIPprf.getText();
            LoginDAO x1 = new LoginDAO();
            x1.cargarLogin();
            LoginDTO obX1 = x1.buscar1(xx);
            if (obX1 != null) {
                txtGradoUFPRF.setText(obX1.getUsuario());
                txtNomUFPRF.setText(obX1.getPassword());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void buscarCIP_UFPR() {
        try {
            String xy = txtCIPUiFPIPpr.getText();
            LoginDAO x2 = new LoginDAO();
            x2.cargarLogin();
            LoginDTO obY2 = x2.buscar1(xy);
            if (obY2 != null) {
                txtGradoUFPR.setText(obY2.getUsuario());
                txtNomUFPR.setText(obY2.getPassword());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void buscarCIP_UEPR() {
        try {
            String xZ = txtCIPUEPIP.getText();
            LoginDAO x3 = new LoginDAO();
            x3.cargarLogin();
            LoginDTO obZ3 = x3.buscar1(xZ);
            if (obZ3 != null) {
                txtGrado.setText(obZ3.getUsuario());
                txtNombreUE.setText(obZ3.getPassword());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void grabaUFPRF() {
        try {
            UniproyectosDAO upro = new UniproyectosDAO();                       
            if (txtCIPUFPIPprf.getText()!= null) {
                upro.cargarUniproyectos();
                txtUFPRF.setText(""+upro.incrementaUNIPRO());
                UniproyectosDTO up = new UniproyectosDTO();
                up.setCod_UniPIP(""+upro.incrementaUNIPRO());
                up.setCod_CIP(txtCIPUFPIPprf.getText());
                    /*******************************/
                    /*******************************/
                    Tb_NomuniII tn = new Tb_NomuniII();
                    tn.setCod_NomUniPer("1");
                    up.setCod_NomUni(tn);
                up.setSector(txtSeUFPIP.getText());
                up.setPliego(txtPliUFPIP.getText());
                up.setNomUni(txtNomUFPIP.getText());
                        /*******************************/
                        /*******************************/
                        PipDTO p = new PipDTO();
                        p.setCod_PIP(txtCodPIP.getText());
                        up.setCod_PIP(p);
                upro.agregarUNIPRO(up);/*************FINAL******************/
                JOptionPane.showMessageDialog(this,"Datos guardados satisfactoriamente 1","Exito", 1);
            }
                if (txtCIPUiFPIPpr.getText()!= null) {
                    upro.cargarUniproyectos();
                    txtUFPR.setText(""+upro.incrementaUNIPRO());
                    UniproyectosDTO up = new UniproyectosDTO();
                    up.setCod_UniPIP(""+upro.incrementaUNIPRO());
                    up.setCod_CIP(txtCIPUiFPIPpr.getText());
                        /*******************************/
                        /*******************************/
                        Tb_NomuniII tn = new Tb_NomuniII();
                        tn.setCod_NomUniPer("2");
                        up.setCod_NomUni(tn);
                    up.setSector(txtSeUFPIP.getText());
                    up.setPliego(txtPliUFPIP.getText());
                    up.setNomUni(txtNomUFPIP.getText());
                            /*******************************/
                            /*******************************/
                            PipDTO p = new PipDTO();
                            p.setCod_PIP(txtCodPIP.getText());
                            up.setCod_PIP(p);
                    upro.agregarUNIPRO(up);
                    JOptionPane.showMessageDialog(this,"Datos guardados satisfactoriamente 2", "Exito", 1);
                }
                    if (txtCIPUEPIP.getText() != null) {
                        upro.cargarUniproyectos();
                        txtUEPR.setText(""+upro.incrementaUNIPRO());
                        UniproyectosDTO up = new UniproyectosDTO();
                        up.setCod_UniPIP(""+upro.incrementaUNIPRO());
                        up.setCod_CIP(txtCIPUEPIP.getText());
                            /*******************************/
                            /*******************************/
                            Tb_NomuniII tn = new Tb_NomuniII();
                            tn.setCod_NomUniPer("3");
                            up.setCod_NomUni(tn);
                        up.setSector(txtSecUEPIP.getText());
                        up.setPliego(txtPliUEPIP.getText());
                        up.setNomUni(txtNomUEPIP.getText());
                                /*******************************/
                                /*******************************/
                                PipDTO p = new PipDTO();
                                p.setCod_PIP(txtCodPIP.getText());
                                up.setCod_PIP(p);
                        upro.agregarUNIPRO(up);
                        JOptionPane.showMessageDialog(this,"Datos guardados satisfactoriamente 3","Exito", 1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
//bien

    private void cargarSituacion() {
        try {
            Tb_SituPIPDAO tb_si = new Tb_SituPIPDAO();
            Vector<Tb_SituPIP> vSi = tb_si.cargarSituacionPIP();
            for (int i = 0; i < vSi.size(); i++) {
                cboSituPIP.addItem(vSi.elementAt(i).getDes_SituPIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
//bien

    /*private void cargarUNIPIP() {
        try {
            UniproyectosDAO uni = new UniproyectosDAO();
            Vector<UniproyectosDTO> vU = uni.cargarUniproyectos();
            for (int i = 0; i < vU.size(); i++) {
                txtPruebaNRO1.setText(vU.lastElement().getCod_UniPIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }*/

    //bien
    private void cargarUniForPRF() {
        try {
            UniproyectosDAO uFE = new UniproyectosDAO();
            String pi = txtCodPIP.getText();
            String ww = "1";
            System.out.println("" + ww);
            Vector<UniproyectosDTO> vUni = uFE.ubicar(pi, ww);
            for (int i = 0; i < vUni.size(); i++) {
                txtSeUFPIP.setText(vUni.elementAt(i).getSector());
                txtPliUFPIP.setText(vUni.elementAt(i).getPliego());
                txtNomUFPIP.setText(vUni.elementAt(i).getNomUni());
                txtCIPUFPIPprf.setText(vUni.elementAt(i).getCod_CIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
//bien

    private void cargarUniForPR() {
        try {
            UniproyectosDAO uFE = new UniproyectosDAO();
            String pi = txtCodPIP.getText();
            String ww = "2";
            System.out.println("" + ww);
            Vector<UniproyectosDTO> vUni = uFE.ubicar(pi, ww);
            for (int i = 0; i < vUni.size(); i++) {
                txtCIPUiFPIPpr.setText(vUni.elementAt(i).getCod_CIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
//bien

    private void cargarUniEjePR() {
        try {
            UniproyectosDAO uFE = new UniproyectosDAO();
            String pi = txtCodPIP.getText();
            String ww = "3";
            System.out.println("" + ww);
            Vector<UniproyectosDTO> vUni = uFE.ubicar(pi, ww);
            for (int i = 0; i < vUni.size(); i++) {
                txtSecUEPIP.setText(vUni.elementAt(i).getSector());
                txtPliUEPIP.setText(vUni.elementAt(i).getPliego());
                txtNomUEPIP.setText(vUni.elementAt(i).getNomUni());
                txtCIPUEPIP.setText(vUni.elementAt(i).getCod_CIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtDivision = new javax.swing.JTextField();
        txtComisaria = new javax.swing.JTextField();
        txtOtrosUP = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtNomUFPIP = new javax.swing.JTextField();
        txtSeUFPIP = new javax.swing.JTextField();
        txtPliUFPIP = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtGradoUFPRF = new javax.swing.JTextField();
        txtNomUFPRF = new javax.swing.JTextField();
        btnBuscarPRFUF = new javax.swing.JButton();
        txtCIPUFPIPprf = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtNomUFPR = new javax.swing.JTextField();
        txtGradoUFPR = new javax.swing.JTextField();
        txtCIPUiFPIPpr = new javax.swing.JTextField();
        btnBuscarPRUF = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtNombreUE = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtSecUEPIP = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtNomUEPIP = new javax.swing.JTextField();
        txtPliUEPIP = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        btnBuscarPRUE = new javax.swing.JButton();
        txtCIPUEPIP = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEstudios = new javax.swing.JTextField();
        txtObras = new javax.swing.JTextField();
        txtSuper = new javax.swing.JTextField();
        txtEquipa = new javax.swing.JTextField();
        txtCapa = new javax.swing.JTextField();
        txtOtros = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtFuente = new javax.swing.JTextField();
        cboSituPIP = new javax.swing.JComboBox();
        txtCodSituPIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblSituacion = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cboNivEstu = new javax.swing.JComboBox();
        cboNivCalifi = new javax.swing.JComboBox();
        txtCodNE = new javax.swing.JTextField();
        txtCodNC = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtNivEstudio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAsignarTDR = new javax.swing.JButton();
        txtNivCali = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombDepart = new javax.swing.JTextField();
        txtNombProv = new javax.swing.JTextField();
        txtNombDist = new javax.swing.JTextField();
        cboDepar = new javax.swing.JComboBox();
        cboprovin = new javax.swing.JComboBox();
        cbodistri = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtlocal = new javax.swing.JTextField();
        txtUFPR = new javax.swing.JTextField();
        txtUEPR = new javax.swing.JTextField();
        txtUFPRF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblImagenEscudo1 = new javax.swing.JLabel();
        txtCodSnip = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFechSnip = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtCodDist = new javax.swing.JTextField();
        txtCodProv = new javax.swing.JTextField();
        txtCodDep = new javax.swing.JTextField();
        txtnombProy = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodPIP = new javax.swing.JTextField();
        btnBuscarPIP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18), new java.awt.Color(0, 102, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "UBICACION POLICIAL:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18), new java.awt.Color(0, 102, 51))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 102, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setText("Direccion: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setText("Division:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setText("Comisaria:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setText("Otros:");

        txtdireccion.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtdireccion.setForeground(new java.awt.Color(0, 0, 153));
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        txtDivision.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtDivision.setForeground(new java.awt.Color(0, 0, 153));
        txtDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivisionActionPerformed(evt);
            }
        });

        txtComisaria.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtComisaria.setForeground(new java.awt.Color(0, 0, 153));
        txtComisaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComisariaActionPerformed(evt);
            }
        });

        txtOtrosUP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtOtrosUP.setForeground(new java.awt.Color(0, 0, 153));
        txtOtrosUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtrosUPActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel34.setText("Region:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel13)))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOtrosUP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComisaria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel34))
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(txtDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addComponent(txtComisaria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel13))
                    .addComponent(txtOtrosUP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 5, 320, 190));

        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 13));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel25.setText("Nombre:");

        txtNomUFPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNomUFPIP.setForeground(new java.awt.Color(0, 0, 153));

        txtSeUFPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtSeUFPIP.setForeground(new java.awt.Color(0, 0, 153));
        txtSeUFPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeUFPIPActionPerformed(evt);
            }
        });

        txtPliUFPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtPliUFPIP.setForeground(new java.awt.Color(0, 0, 153));
        txtPliUFPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPliUFPIPActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel29.setText("Pliego:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel30.setText("Sector:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel41.setText("Persona ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel20.setText("Nombre:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel26.setText("Grado:");

        txtGradoUFPRF.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtGradoUFPRF.setForeground(new java.awt.Color(0, 0, 153));

        txtNomUFPRF.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNomUFPRF.setForeground(new java.awt.Color(0, 0, 153));
        txtNomUFPRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUFPRFActionPerformed(evt);
            }
        });

        btnBuscarPRFUF.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnBuscarPRFUF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnBuscarPRFUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPRFUFActionPerformed(evt);
            }
        });

        txtCIPUFPIPprf.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCIPUFPIPprf.setForeground(new java.awt.Color(0, 0, 153));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel43.setText("Responsable");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel44.setText("Formular.");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel45.setText("Persona ");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel28.setText("Grado:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel32.setText("Nombre:");

        txtNomUFPR.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNomUFPR.setForeground(new java.awt.Color(0, 0, 153));

        txtGradoUFPR.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtGradoUFPR.setForeground(new java.awt.Color(0, 0, 153));

        txtCIPUiFPIPpr.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCIPUiFPIPpr.setForeground(new java.awt.Color(0, 0, 153));

        btnBuscarPRUF.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnBuscarPRUF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-ayuda-icono-6888-16.png"))); // NOI18N
        btnBuscarPRUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPRUFActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel47.setText("Responsable");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtGradoUFPR, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCIPUiFPIPpr, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarPRUF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNomUFPR, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomUFPRF, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtGradoUFPRF, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCIPUFPIPprf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarPRFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(400, 400, 400))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(427, 427, 427))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(421, 421, 421))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(400, 400, 400))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(427, 427, 427))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(txtNomUFPIP, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(txtSeUFPIP, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(txtPliUFPIP, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addGap(44, 44, 44))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(txtSeUFPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtPliUFPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel25))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtNomUFPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel26))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGradoUFPRF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCIPUFPIPprf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarPRFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(txtNomUFPRF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGradoUFPR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCIPUiFPIPpr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel28))
                            .addComponent(btnBuscarPRUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(txtNomUFPR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UNIDAD FORMULADORA ", jPanel8);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 11));

        txtNombreUE.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNombreUE.setForeground(new java.awt.Color(0, 0, 153));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel36.setText("Responsable:");

        txtSecUEPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtSecUEPIP.setForeground(new java.awt.Color(0, 0, 153));
        txtSecUEPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecUEPIPActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel38.setText("Sector:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel39.setText("Pliego:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel40.setText("Nombre:");

        txtNomUEPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNomUEPIP.setForeground(new java.awt.Color(0, 0, 153));

        txtPliUEPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtPliUEPIP.setForeground(new java.awt.Color(0, 0, 153));
        txtPliUEPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPliUEPIPActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel37.setText("Persona ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel19.setText("Grado:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel33.setText("Nombre:");

        txtGrado.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtGrado.setForeground(new java.awt.Color(0, 0, 153));

        btnBuscarPRUE.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnBuscarPRUE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-buscar-ampliar-icono-9630-16.png"))); // NOI18N
        btnBuscarPRUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPRUEActionPerformed(evt);
            }
        });

        txtCIPUEPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCIPUEPIP.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreUE, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCIPUEPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarPRUE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSecUEPIP, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                    .addComponent(txtPliUEPIP, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                    .addComponent(txtNomUEPIP, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(425, 425, 425))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(txtSecUEPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtPliUEPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel40))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtNomUEPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarPRUE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCIPUEPIP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33)
                            .addComponent(txtNombreUE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UNIDAD EJECUTORA ", jPanel6);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel23.setText("Otros Imprevistos:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setText("Capacitacion:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel22.setText("Equipamiento:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel21.setText("Supervision:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel16.setText("Obras Civiles:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel17.setText("Estudios/Ex. Tec.:");

        txtEstudios.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtEstudios.setForeground(new java.awt.Color(0, 0, 153));
        txtEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstudiosActionPerformed(evt);
            }
        });

        txtObras.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtObras.setForeground(new java.awt.Color(0, 0, 153));
        txtObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObrasActionPerformed(evt);
            }
        });

        txtSuper.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtSuper.setForeground(new java.awt.Color(0, 0, 153));
        txtSuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuperActionPerformed(evt);
            }
        });

        txtEquipa.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtEquipa.setForeground(new java.awt.Color(0, 0, 153));
        txtEquipa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipaActionPerformed(evt);
            }
        });

        txtCapa.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCapa.setForeground(new java.awt.Color(0, 0, 153));
        txtCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapaActionPerformed(evt);
            }
        });

        txtOtros.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtOtros.setForeground(new java.awt.Color(0, 0, 153));
        txtOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtrosActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel46.setText("Fuente de Financiamiento:");

        txtFuente.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtFuente.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSuper, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(txtEstudios, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(txtObras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFuente, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(txtCapa, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(txtOtros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(txtEquipa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEquipa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22))
                            .addComponent(txtEstudios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel16))
                        .addComponent(txtObras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(txtCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(txtFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        jTabbedPane1.addTab("COMPONENTES", jPanel7);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 520, 306));

        cboSituPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboSituPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSituPIPActionPerformed(evt);
            }
        });
        jPanel3.add(cboSituPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 119, 130, 32));
        jPanel3.add(txtCodSituPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 63, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("\" SITUACION DEL PIP \"");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 140, -1));

        lblSituacion.setFont(new java.awt.Font("Tahoma", 1, 20));
        jPanel3.add(lblSituacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 151, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel27.setText("Nivel de Calificacion:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        cboNivEstu.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboNivEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivEstuActionPerformed(evt);
            }
        });
        jPanel3.add(cboNivEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 227, 172, 32));

        cboNivCalifi.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboNivCalifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivCalifiActionPerformed(evt);
            }
        });
        jPanel3.add(cboNivCalifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 267, 172, 34));
        jPanel3.add(txtCodNE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 228, -1, 33));
        jPanel3.add(txtCodNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 268, -1, 34));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel31.setText("Nivel de Estudio:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        txtNivEstudio.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNivEstudio.setForeground(new java.awt.Color(0, 0, 153));
        txtNivEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivEstudioActionPerformed(evt);
            }
        });
        jPanel3.add(txtNivEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 174, 32));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-informe-icono-6797-16.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sincronizacion-actualiza-la-recarga-icono-4348-16.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3floppy-guardar-el-desmantelamiento-icono-4124-16.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Warning.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAsignarTDR.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnAsignarTDR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-de-mi-perfil-icono-3964-16.png"))); // NOI18N
        btnAsignarTDR.setText("ASIGNAR TDR ");
        btnAsignarTDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTDRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAsignarTDR, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAsignarTDR, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 354, -1, -1));

        txtNivCali.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNivCali.setForeground(new java.awt.Color(0, 0, 153));
        jPanel3.add(txtNivCali, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 174, 34));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "UBICACION GEOGRAFICA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18), new java.awt.Color(0, 102, 51))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 102, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Departamento:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 42, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("Provincia:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("Distrito:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 118, -1, -1));

        txtNombDepart.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNombDepart.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.add(txtNombDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 160, 33));

        txtNombProv.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNombProv.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.add(txtNombProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 32));

        txtNombDist.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNombDist.setForeground(new java.awt.Color(0, 0, 153));
        jPanel4.add(txtNombDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 32));

        cboDepar.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboDepar.setForeground(new java.awt.Color(0, 0, 153));
        cboDepar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDeparActionPerformed(evt);
            }
        });
        jPanel4.add(cboDepar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 160, 33));

        cboprovin.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboprovin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboprovinActionPerformed(evt);
            }
        });
        jPanel4.add(cboprovin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 32));

        cbodistri.setFont(new java.awt.Font("Tahoma", 1, 13));
        cbodistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodistriActionPerformed(evt);
            }
        });
        jPanel4.add(cbodistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Localidad:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 161, -1, -1));

        txtlocal.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtlocal.setForeground(new java.awt.Color(0, 0, 153));
        txtlocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlocalActionPerformed(evt);
            }
        });
        jPanel4.add(txtlocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 146, 330, 32));
        jPanel4.add(txtUFPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 40, -1));
        jPanel4.add(txtUEPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 40, -1));
        jPanel4.add(txtUFPRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 40, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 5, 470, 190));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 211, 1030, 530));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel14.setText("Codigo SNIP:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 36));
        jLabel9.setText("REGISTRO DE PROYECTOS DE INVERSION");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 620, 51));

        lblImagenEscudo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img.jpg"))); // NOI18N
        jPanel9.add(lblImagenEscudo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 2, 100, 100));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 808, 110));

        txtCodSnip.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCodSnip.setForeground(new java.awt.Color(0, 0, 153));
        txtCodSnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodSnipActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodSnip, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 132, 31));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel18.setText("Nom. Proyecto:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 110, -1));

        txtFechSnip.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtFechSnip.setForeground(new java.awt.Color(0, 0, 153));
        txtFechSnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechSnipActionPerformed(evt);
            }
        });
        jPanel2.add(txtFechSnip, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 128, 31));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel24.setText("Fecha del SNIP:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));
        jPanel2.add(txtCodDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 97, -1, 34));
        jPanel2.add(txtCodProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 49, -1, 37));
        jPanel2.add(txtCodDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 12, -1, 31));

        txtnombProy.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtnombProy.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.add(txtnombProy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 446, 29));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Codigo del:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        txtCodPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCodPIP.setForeground(new java.awt.Color(0, 0, 153));
        txtCodPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPIPActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 86, 31));

        btnBuscarPIP.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnBuscarPIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        btnBuscarPIP.setText("Buscar Proyecto de Inversion");
        btnBuscarPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPIPActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Proyecto de Inversion:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(572, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPIPActionPerformed
        try {            
            PipDAO pd = new PipDAO();
            pd.cargarPIP();
            PipDTO objPIP = pd.buscar(JOptionPane.showInputDialog(null, "Ingrese Codigo del PIP a buscar....", "Buscar Codigo del PIP", JOptionPane.QUESTION_MESSAGE));
            if (objPIP != null) {
                activaBotones(true, true, false, true, true, false, false, false, false);
                txtCodPIP.setText(objPIP.getCod_PIP());
                txtCodSnip.setText(objPIP.getSNIP());
                txtFechSnip.setText(objPIP.getFechSNIP().toString());
                txtnombProy.setText(objPIP.getNom_Proinv());
                txtNombDepart.setText(objPIP.getCod_Dpto().getNombreDpto());
                txtNombProv.setText(objPIP.getCod_Prov().getNombreProv());
                txtNombDist.setText(objPIP.getCod_Dist().getNombreDIS());
                txtlocal.setText(objPIP.getLocaliPNP());
                txtdireccion.setText(objPIP.getDireccPNP());
                txtDivision.setText(objPIP.getDivisionPNP());
                txtComisaria.setText(objPIP.getComisaria());
                txtOtrosUP.setText(objPIP.getOtrosPNP());
                txtEstudios.setText(objPIP.getEst_ExpTec().toString());
                txtObras.setText(objPIP.getObra_Civ().toString());
                txtSuper.setText(objPIP.getSupervision().toString());
                txtEquipa.setText(objPIP.getEquipamiento().toString());
                txtCapa.setText(objPIP.getCapacitacion().toString());
                txtOtros.setText(objPIP.getOtros_Imp().toString());
                txtFuente.setText(objPIP.getFuente_Fina().toString());
                lblSituacion.setText(objPIP.getSituacion().getDes_SituPIP());
                txtNivEstudio.setText(objPIP.getCod_NivEstPIP().getDesc_NivPIP());
                txtNivCali.setText(objPIP.getCod_NivCaliPIP().getDesc_NivCaliPIP());
                cboSituPIP.setVisible(false);
                cboNivEstu.setVisible(false);
                cboNivCalifi.setVisible(false);
                cboDepar.setVisible(false);
                cbodistri.setVisible(false);
                cboprovin.setVisible(false);
                txtNivEstudio.setVisible(true);
                txtNivCali.setVisible(true);
                txtNivEstudio.setEditable(true);
                txtNivCali.setEditable(true);
                txtNombDepart.setVisible(true);
                txtNombDist.setVisible(true);
                txtNombProv.setVisible(true);
                lblSituacion.setVisible(true);
                //cargarUNIPIP();
                cargarUniEjePR();
                cargarUniForPRF();
                cargarUniForPR();
                buscarCIP_UEPR();
                buscarCIP_UFPR();
                buscarCIP_UFPRF();
            }else{
                JOptionPane.showMessageDialog(this, "Debera de ingresar un Codigo del PIP que exista en el Sistema...", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }        
}//GEN-LAST:event_btnBuscarPIPActionPerformed

    private void txtCodPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPIPActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtCodPIPActionPerformed

    private void txtFechSnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechSnipActionPerformed
        txtnombProy.requestFocus();
}//GEN-LAST:event_txtFechSnipActionPerformed

    private void txtCodSnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodSnipActionPerformed
        txtFechSnip.requestFocus();
}//GEN-LAST:event_txtCodSnipActionPerformed

    private void txtlocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlocalActionPerformed
        txtdireccion.requestFocus();
}//GEN-LAST:event_txtlocalActionPerformed

    private void cbodistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodistriActionPerformed
        try {
            distritoDAO distr = new distritoDAO();
            String NombreDIS = cbodistri.getSelectedItem().toString();
            distritoDTO dist = distr.obtener(NombreDIS);
            if (dist != null) {
                txtCodDist.setText(dist.getCod_dist());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_cbodistriActionPerformed

    private void cboprovinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboprovinActionPerformed
        try {
            provinciaDAO provin = new provinciaDAO();
            String NombreProv = cboprovin.getSelectedItem().toString();
            provinciaDTO prov = provin.obtener(NombreProv);
            if (prov != null) {
                txtCodProv.setText(prov.getCod_Prov());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        cargarComboDistrito();
}//GEN-LAST:event_cboprovinActionPerformed

    private void cboDeparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDeparActionPerformed
        try {
            departamentoDAO depa = new departamentoDAO();
            String nomDepa = cboDepar.getSelectedItem().toString();
            departamentoDTO departa = depa.obtener(nomDepa);
            if (departa != null) {
                txtCodDep.setText(departa.getCod_Dpto());
                cargarComboProvincia();
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_cboDeparActionPerformed

    private void btnAsignarTDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTDRActionPerformed
        departamento = txtNombDepart.getText();
        provincia = txtNombProv.getText();
        distrito = txtNombDist.getText();
        localidad = txtlocal.getText();
        nombProy = txtnombProy.getText();
        division = txtDivision.getText();
        direccion = txtdireccion.getText();
        comisaria = txtComisaria.getText();
        otros = txtOtrosUP.getText();
        new TDR().setVisible(true);
        this.dispose();
}//GEN-LAST:event_btnAsignarTDRActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        activaBotones(true, false, false, false, true, false, false, false, false);
        Limpiar();
        comboPrimer();
        NoEditable();       
        lblSituacion.setVisible(false);        
        cboSituPIP.setVisible(true);
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(btnGrabar.isEnabled()){
            //activaBotones(true, false, false, false, true, false, false, false, false);
            try {
                PipDAO tbpip = new PipDAO();
                tbpip.cargarPIP();                
                if (txtCodPIP.getText().isEmpty()) {
                    txtCodPIP.setText(""+tbpip.incrementaCodigo());
                    PipDTO xpip = new PipDTO();
                    xpip.setCod_PIP(txtCodPIP.getText());
                    xpip.setSNIP(txtCodSnip.getText());
                    xpip.setFechSNIP(Date.valueOf("0000-00-00"));
                    xpip.setNom_Proinv(txtnombProy.getText());
                        /*******************************/
                        /*******************************/
                        departamentoDTO tde = new departamentoDTO();
                        tde.setCod_Dpto(txtCodDep.getText());
                        xpip.setCod_Dpto(tde);
                            /*******************************/
                            /*******************************/
                            provinciaDTO tpro = new provinciaDTO();
                            tpro.setCod_Prov(txtCodProv.getText());
                            xpip.setCod_Prov(tpro);
                                /*******************************/
                                /*******************************/
                                distritoDTO tdis = new distritoDTO();
                                tdis.setCod_dist(txtCodDist.getText());
                                xpip.setCod_Dist(tdis);
                                    /*******************************/
                                    /*******************************/
                    xpip.setLocaliPNP(txtlocal.getText());
                    xpip.setDireccPNP(txtdireccion.getText());
                    xpip.setDivisionPNP(txtDivision.getText());
                    xpip.setComisaria(txtComisaria.getText());
                    xpip.setOtrosPNP(txtOtrosUP.getText());
                    xpip.setEst_ExpTec(Double.parseDouble(txtEstudios.getText()));
                    xpip.setObra_Civ(Double.parseDouble(txtObras.getText()));
                    xpip.setSupervision(Double.parseDouble(txtSuper.getText()));
                    xpip.setEquipamiento(Double.parseDouble(txtEquipa.getText()));
                    xpip.setCapacitacion(Double.parseDouble(txtCapa.getText()));
                    xpip.setOtros_Imp(Double.parseDouble(txtOtros.getText()));
                    xpip.setFuente_Fina(Double.parseDouble(txtFuente.getText()));
                                    /*******************************/
                                    /*******************************/
                                    Tb_NivEstPIP tnEs = new Tb_NivEstPIP();
                                    tnEs.setCod_EstPIP(txtCodNE.getText());
                                    xpip.setCod_NivEstPIP(tnEs);
                                        /*******************************/
                                        /*******************************/
                                        Tb_NivCaliPIP tnCa = new Tb_NivCaliPIP();
                                        tnCa.setCod_NivCaliPIP(txtCodNC.getText());
                                        xpip.setCod_NivCaliPIP(tnCa);
                                            /*******************************/
                                            /*******************************/
                                            Tb_SituPIP tbs = new Tb_SituPIP();
                                            tbs.setCod_SituPIP(txtCodSituPIP.getText());
                                            xpip.setSituacion(tbs);
                    tbpip.agregarPIP(xpip);/*************FINAL******************/
                    activaBotones(true, false, false, false, true, false, false, false, false);
                    System.out.println("Hasta aca guarda la tabla PIP");
                    /*************/
                    grabaUFPRF();
                    /*************/
                    JOptionPane.showMessageDialog(null,"Registro guardado satisfactoriamente en el Sistema...","Exito", 1);
                    lblSituacion.setVisible(true);
                } else {
                    PipDTO apip = new PipDTO();
                    apip.setCod_PIP(txtCodPIP.getText());
                    apip.setSNIP(txtCodSnip.getText());
                    apip.setFechSNIP(Date.valueOf(txtFechSnip.getText()));
                    apip.setNom_Proinv(txtnombProy.getText());
                        /*******************************/
                        /*******************************/
                        departamentoDTO td = new departamentoDTO();
                        td.setCod_Dpto(txtCodDep.getText());
                        apip.setCod_Dpto(td);
                            /*******************************/
                            /*******************************/
                            provinciaDTO tpr = new provinciaDTO();
                            tpr.setCod_Prov(txtCodProv.getText());
                            apip.setCod_Prov(tpr);
                                /*******************************/
                                /*******************************/
                            distritoDTO tdi = new distritoDTO();
                            tdi.setCod_dist(txtCodDist.getText());
                            apip.setCod_Dist(tdi);
                    apip.setLocaliPNP(txtlocal.getText());
                    apip.setDireccPNP(txtdireccion.getText());
                    apip.setEst_ExpTec(Double.parseDouble(txtEstudios.getText()));
                    apip.setObra_Civ(Double.parseDouble(txtObras.getText()));
                    apip.setSupervision(Double.parseDouble(txtSuper.getText()));
                    apip.setEquipamiento(Double.parseDouble(txtEquipa.getText()));
                    apip.setCapacitacion(Double.parseDouble(txtCapa.getText()));
                    apip.setOtros_Imp(Double.parseDouble(txtOtros.getText()));
                    apip.setFuente_Fina(Double.parseDouble(txtFuente.getText()));
                            /*******************************/
                            /*******************************/
                            Tb_NivEstPIP tnE = new Tb_NivEstPIP();
                            tnE.setCod_EstPIP(txtCodNE.getText());
                            apip.setCod_NivEstPIP(tnE);
                                /*******************************/
                                /*******************************/
                                Tb_NivCaliPIP tnC = new Tb_NivCaliPIP();
                                tnC.setCod_NivCaliPIP(txtCodNC.getText());
                                apip.setCod_NivCaliPIP(tnC);
                                    /*******************************/
                                    /*******************************/
                                    Tb_SituPIP tb = new Tb_SituPIP();
                                    tb.setCod_SituPIP(txtCodSituPIP.getText());
                                    apip.setSituacion(tb);
                        tbpip.actualizarPIP(apip);
                        /*************/
                        grabaUFPRF();
                        /*************/
                        JOptionPane.showMessageDialog(this,
                        "Datos actualizados satisfactoriamente",
                        "Exito", 1);
                        lblSituacion.setVisible(true);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

}//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(btnEliminar.isEnabled()){
            try{
                int n = JOptionPane.showConfirmDialog(this,"¿Esta seguro que desea borrar estos datos?","Mensaje",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if (n == 0) {
                    PipDAO empr = new PipDAO();
                    empr.cargarPIP();
                    empr.eliminarPIP(txtCodPIP.getText());                    
                    JOptionPane.showMessageDialog(this, "Los Datos se Eliminaron Satisfactoriamente","Mensaje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se Eliminaron los Datos...", "Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch(SQLException f) {
                System.out.println(f.toString());
            }
            Limpiar();
        }
}//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        activaBotones(false, false, true, false, false, true, true, true, true);
        cboDepar.setSelectedItem(txtNombDepart.getText());
        cboprovin.setSelectedItem(txtNombProv.getText());
        cbodistri.setSelectedItem(txtNombDist.getText());
        cboSituPIP.setSelectedItem(lblSituacion.getText());
        cboNivEstu.setSelectedItem(txtNivEstudio.getText());
        cboNivCalifi.setSelectedItem(txtNivCali.getText());
        btnBuscarPRUF.setEnabled(true);
        btnBuscarPRUE.setEnabled(true);
        btnBuscarPRFUF.setEnabled(true);

        txtCIPUFPIPprf.setEditable(false);
        txtCIPUiFPIPpr.setEditable(false);
        txtCIPUEPIP.setEditable(false);
        Editable();        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        activaBotones(false, false, true, false, false, true, true, true, true);
        Editable();
        Limpiar();
        txtnombProy.requestFocus();
}//GEN-LAST:event_btnNuevoActionPerformed

    private void txtNivEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivEstudioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtNivEstudioActionPerformed

    private void cboNivCalifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivCalifiActionPerformed
        try {
            Tb_NivCaliPIPDAO nivCAL = new Tb_NivCaliPIPDAO();
            String nomnivCAL = cboNivCalifi.getSelectedItem().toString();
            Tb_NivCaliPIP nC = nivCAL.obtner(nomnivCAL);
            if (nC != null) {
                txtCodNC.setText(nC.getCod_NivCaliPIP());
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_cboNivCalifiActionPerformed

    private void cboNivEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivEstuActionPerformed
        try {
            Tb_NivEstPIPDAO nivEST = new Tb_NivEstPIPDAO();
            String nomEst = cboNivEstu.getSelectedItem().toString();
            Tb_NivEstPIP nivest = nivEST.obtener(nomEst);
            if (nivest != null) {
                txtCodNE.setText(nivest.getCod_EstPIP());
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_cboNivEstuActionPerformed

    private void cboSituPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSituPIPActionPerformed
        try {
            Tb_SituPIPDAO sit = new Tb_SituPIPDAO();
            String desSi = cboSituPIP.getSelectedItem().toString();
            Tb_SituPIP t = sit.obtener(desSi);
            if (t != null) {
                txtCodSituPIP.setText(t.getCod_SituPIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_cboSituPIPActionPerformed

    private void txtOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtrosActionPerformed
        txtFuente.requestFocus();
}//GEN-LAST:event_txtOtrosActionPerformed

    private void txtCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapaActionPerformed
        txtSuper.requestFocus();
}//GEN-LAST:event_txtCapaActionPerformed

    private void txtEquipaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipaActionPerformed
        txtObras.requestFocus();
}//GEN-LAST:event_txtEquipaActionPerformed

    private void txtSuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuperActionPerformed
        txtOtros.requestFocus();
}//GEN-LAST:event_txtSuperActionPerformed

    private void txtObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObrasActionPerformed
        txtCapa.requestFocus();
}//GEN-LAST:event_txtObrasActionPerformed

    private void txtEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstudiosActionPerformed
        txtEquipa.requestFocus();
}//GEN-LAST:event_txtEstudiosActionPerformed

    private void btnBuscarPRUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPRUEActionPerformed
        try {
            String bus = JOptionPane.showInputDialog(null, "Ingrese Numero de CIP a buscar...", "Buscar Numero de CIP", JOptionPane.INFORMATION_MESSAGE);
            LoginDAO dc = new LoginDAO();
            dc.cargarLogin();
            LoginDTO objDoc = dc.buscar1(bus);
            if (objDoc != null) {
                txtCIPUEPIP.setText(bus);
                txtGrado.setText(objDoc.getUsuario());
                txtNombreUE.setText(objDoc.getPassword());
                JOptionPane.showMessageDialog(this, "Exito, CIP encontrado satisfactoriamente",
                        "Felicitaciones", 1);
            } else {
                JOptionPane.showMessageDialog(this, "El CIP no existe, verifique...",
                        "Error", 2);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_btnBuscarPRUEActionPerformed

    private void txtPliUEPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPliUEPIPActionPerformed
        txtNomUEPIP.requestFocus();
}//GEN-LAST:event_txtPliUEPIPActionPerformed

    private void txtSecUEPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecUEPIPActionPerformed
        txtPliUEPIP.requestFocus();
}//GEN-LAST:event_txtSecUEPIPActionPerformed

    private void btnBuscarPRUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPRUFActionPerformed
        try {
            String bus = JOptionPane.showInputDialog(null, "Ingrese Numero de CIP a buscar....", "Buscar Numero de CIP", JOptionPane.INFORMATION_MESSAGE);
            LoginDAO dc = new LoginDAO();
            dc.cargarLogin();
            LoginDTO objDoc = dc.buscar1(bus);
            if (objDoc != null) {
                txtCIPUiFPIPpr.setText(bus);
                txtGradoUFPR.setText(objDoc.getUsuario());
                txtNomUFPR.setText(objDoc.getPassword());
                JOptionPane.showMessageDialog(this, "Exito, CIP encontrado satisfactoriamente",
                        "Felicitaciones", 1);


            } else {
                JOptionPane.showMessageDialog(this, "El CIP no existe, verifique...",
                        "Error", 2);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_btnBuscarPRUFActionPerformed

    private void btnBuscarPRFUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPRFUFActionPerformed
        try {
            String bus = JOptionPane.showInputDialog(null, "Ingrese Numero de CIP a buscar....", "Buscar Numero de CIP", JOptionPane.INFORMATION_MESSAGE);
            LoginDAO dc = new LoginDAO();
            dc.cargarLogin();
            LoginDTO objDoc = dc.buscar1(bus);
            if (objDoc != null) {
                txtCIPUFPIPprf.setText(bus);
                txtGradoUFPRF.setText(objDoc.getUsuario());
                txtNomUFPRF.setText(objDoc.getPassword());
                JOptionPane.showMessageDialog(this, "Exito, CIP encontrado satisfactoriamente",
                        "Felicitaciones", 1);
            } else {
                JOptionPane.showMessageDialog(this, "El CIP no existe, verifique...",
                        "Error", 2);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_btnBuscarPRFUFActionPerformed

    private void txtNomUFPRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomUFPRFActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtNomUFPRFActionPerformed

    private void txtPliUFPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPliUFPIPActionPerformed
        txtNomUFPIP.requestFocus();
}//GEN-LAST:event_txtPliUFPIPActionPerformed

    private void txtSeUFPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeUFPIPActionPerformed
        txtPliUFPIP.requestFocus();
}//GEN-LAST:event_txtSeUFPIPActionPerformed

    private void txtComisariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComisariaActionPerformed
        txtOtrosUP.requestFocus();
}//GEN-LAST:event_txtComisariaActionPerformed

    private void txtDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivisionActionPerformed
        txtComisaria.requestFocus();
}//GEN-LAST:event_txtDivisionActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        txtDivision.requestFocus();
}//GEN-LAST:event_txtdireccionActionPerformed

    private void txtOtrosUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtrosUPActionPerformed
        txtSeUFPIP.requestFocus();
}//GEN-LAST:event_txtOtrosUPActionPerformed

    private void cargarComboDepartamento() {
        try {
            departamentoDAO dep = new departamentoDAO();
            Vector<departamentoDTO> vDep;
            vDep = dep.cargarDepartamento();
            for (int i = 0; i < vDep.size(); i++) {
                cboDepar.addItem(vDep.elementAt(i).getNombreDpto());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void cargarComboProvincia() {
        try {
            provinciaDAO prov = new provinciaDAO();
            String tprov = txtCodDep.getText();

            Vector<provinciaDTO> vProv = prov.cargarProvincia(tprov);
            for (int i = 0; i < vProv.size(); i++) {
                cboprovin.addItem(vProv.elementAt(i).getNombreProv());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void cargarComboDistrito() {
        try {
            distritoDAO dist = new distritoDAO();
            String tdist = txtCodProv.getText();
            Vector<distritoDTO> vDist = dist.cargarDistrito(tdist);
            for (int i = 0; i < vDist.size(); i++) {
                cbodistri.addItem(vDist.elementAt(i).getNombreDIS());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
//bien

    private void cargarNivEstPIP() {
        try {
            Tb_NivEstPIPDAO tb_Niv = new Tb_NivEstPIPDAO();
            Vector<Tb_NivEstPIP> vEst = tb_Niv.cargarNivEstPIP();
            for (int i = 0; i < vEst.size(); i++) {
                cboNivEstu.addItem(vEst.elementAt(i).getDesc_NivPIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
//bien

    private void cargarNivCaliPIP() {
        try {
            Tb_NivCaliPIPDAO tb_NivCali = new Tb_NivCaliPIPDAO();
            Vector<Tb_NivCaliPIP> vCal = tb_NivCali.cargarNivCaliPIP();
            for (int i = 0; i < vCal.size(); i++) {
                cboNivCalifi.addItem(vCal.elementAt(i).getDesc_NivCaliPIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PIP().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarTDR;
    private javax.swing.JButton btnBuscarPIP;
    private javax.swing.JButton btnBuscarPRFUF;
    private javax.swing.JButton btnBuscarPRUE;
    private javax.swing.JButton btnBuscarPRUF;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboDepar;
    private javax.swing.JComboBox cboNivCalifi;
    private javax.swing.JComboBox cboNivEstu;
    private javax.swing.JComboBox cboSituPIP;
    private javax.swing.JComboBox cbodistri;
    private javax.swing.JComboBox cboprovin;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblImagenEscudo1;
    private javax.swing.JLabel lblSituacion;
    private javax.swing.JTextField txtCIPUEPIP;
    private javax.swing.JTextField txtCIPUFPIPprf;
    private javax.swing.JTextField txtCIPUiFPIPpr;
    private javax.swing.JTextField txtCapa;
    private javax.swing.JTextField txtCodDep;
    private javax.swing.JTextField txtCodDist;
    private javax.swing.JTextField txtCodNC;
    private javax.swing.JTextField txtCodNE;
    private javax.swing.JTextField txtCodPIP;
    private javax.swing.JTextField txtCodProv;
    private javax.swing.JTextField txtCodSituPIP;
    private javax.swing.JTextField txtCodSnip;
    private javax.swing.JTextField txtComisaria;
    private javax.swing.JTextField txtDivision;
    private javax.swing.JTextField txtEquipa;
    private javax.swing.JTextField txtEstudios;
    private javax.swing.JTextField txtFechSnip;
    private javax.swing.JTextField txtFuente;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtGradoUFPR;
    private javax.swing.JTextField txtGradoUFPRF;
    private javax.swing.JTextField txtNivCali;
    private javax.swing.JTextField txtNivEstudio;
    private javax.swing.JTextField txtNomUEPIP;
    private javax.swing.JTextField txtNomUFPIP;
    private javax.swing.JTextField txtNomUFPR;
    private javax.swing.JTextField txtNomUFPRF;
    private javax.swing.JTextField txtNombDepart;
    private javax.swing.JTextField txtNombDist;
    private javax.swing.JTextField txtNombProv;
    private javax.swing.JTextField txtNombreUE;
    private javax.swing.JTextField txtObras;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txtOtrosUP;
    private javax.swing.JTextField txtPliUEPIP;
    private javax.swing.JTextField txtPliUFPIP;
    private javax.swing.JTextField txtSeUFPIP;
    private javax.swing.JTextField txtSecUEPIP;
    private javax.swing.JTextField txtSuper;
    private javax.swing.JTextField txtUEPR;
    private javax.swing.JTextField txtUFPR;
    private javax.swing.JTextField txtUFPRF;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtlocal;
    private javax.swing.JTextField txtnombProy;
    // End of variables declaration//GEN-END:variables
}
