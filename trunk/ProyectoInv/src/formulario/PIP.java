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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PIP extends javax.swing.JFrame {

    public static String departamento;
    public static String provincia;
    public static String distrito;   
    public static String localidad;
    public static String direccion;
    public static String division;
    public static String comisaria;
    public static String otros;
    public static String nombProy;
    public static String pip;

    public PIP() {
        initComponents();
        this.setDefaultCloseOperation(PIP.DISPOSE_ON_CLOSE);
        btnBuscarPIP.setVisible(false);
        invisible();        
        NoMostrarDatos();
        NoEditable();
        centrar();
        activaBotones(true, false, false, false, true, false, false, false, false);
    }

    public void centrar() {
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize((pantallaTamano.width), (pantallaTamano.height));
        Dimension tamanoPanel = jPanel2.getSize();
        jPanel2.setBounds((pantallaTamano.width - tamanoPanel.width) / 2, (pantallaTamano.height - tamanoPanel.height) / 2, (int) tamanoPanel.getWidth(), (int) tamanoPanel.getHeight());
    }

    private void cargarCombos(){
        cargarComboDepartamento();
        cargarNivCaliPIP();
        cargarNivEstPIP();
        cargarSituacion();
        /********************/
        cargarUniEjePR();
        cargarUniForPR();
        cargarUniForPRF();
        /********************/
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

    private void invisible() {
        txtCodDep.setVisible(false);
        txtCodDist.setVisible(false);
        txtCodProv.setVisible(false);
        txtCodSituPIP.setVisible(false);
        txtUFPRF.setVisible(false);
        txtUFPR.setVisible(false);
        txtUEPR.setVisible(false);
        txtNEs.setVisible(false);
        txtNCa.setVisible(false);
    }

    public void NoEditable() {
        txtCodPIP.setEditable(false);
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
        txtNombDepart.setVisible(true);
        txtNombDist.setVisible(true);
        txtNombProv.setVisible(true);        
        txtNivEstudio.setVisible(true);
        txtNivCali.setVisible(true);
        /************************/
        cboDepar.setVisible(false);
        cboprovin.setVisible(false);
        cbodistri.setVisible(false);
        cboNivCalifi.setVisible(false);
        cboNivEstu.setVisible(false);
        cboSituPIP.setVisible(false);
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
        txtUFPRF.setText(null);
        txtUFPR.setText(null);
        txtUEPR.setText(null);
    }

    public void Editable() {
        txtnombProy.requestFocus();
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
        cboDepar.setVisible(true);
        cboDepar.setSelectedItem(txtNombDepart.getText());
        cboprovin.setVisible(true);
        cboprovin.setSelectedItem(txtNombProv.getText());
        cbodistri.setVisible(true);
        cbodistri.setSelectedItem(txtNombDist.getText());
        cboNivCalifi.setVisible(true);
        cboNivCalifi.setSelectedItem(txtNivCali.getText());
        cboNivEstu.setVisible(true);
        cboNivEstu.setSelectedItem(txtNivEstudio.getText());
        cboSituPIP.setVisible(true);
        cboSituPIP.setSelectedItem(lblSituacion.getText());
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
            upro.cargarUniproyectos();
            if (txtUFPRF.getText().isEmpty()) {                
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
            }else{
                UniproyectosDTO up = new UniproyectosDTO();
                up.setCod_UniPIP(txtUFPRF.getText());
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
                upro.actualizarUNIPRO(up);/*************FINAL******************/
                JOptionPane.showMessageDialog(this,"Datos actualizados satisfactoriamente 1","Exito", 1);
            }
                upro.cargarUniproyectos();
                if (txtUFPR.getText().isEmpty()) {
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
                }else{
                    upro.cargarUniproyectos();
                    UniproyectosDTO up = new UniproyectosDTO();
                    up.setCod_UniPIP(txtUFPR.getText());
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
                    upro.actualizarUNIPRO(up);
                    JOptionPane.showMessageDialog(this,"Datos actualizados satisfactoriamente 2", "Exito", 1);
                }
                    upro.cargarUniproyectos();
                    if (txtUEPR.getText().isEmpty()) {
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
                    }else{
                        upro.cargarUniproyectos();
                        UniproyectosDTO up = new UniproyectosDTO();
                        up.setCod_UniPIP(txtUEPR.getText());
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
                        upro.actualizarUNIPRO(up);
                        JOptionPane.showMessageDialog(this,"Datos actualizados satisfactoriamente 3","Exito", 1);
                    }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

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

    private void cargarUniForPRF() {
        try {
            UniproyectosDAO uFE = new UniproyectosDAO();           
            Vector<UniproyectosDTO> vUni = uFE.ubicar(txtCodPIP.getText(),"1");
            System.out.println("1"+"elio");
            for (int i = 0; i < vUni.size(); i++) {
                txtUFPRF.setText(vUni.elementAt(i).getCod_UniPIP());                
                txtSeUFPIP.setText(vUni.elementAt(i).getSector());
                txtPliUFPIP.setText(vUni.elementAt(i).getPliego());
                txtNomUFPIP.setText(vUni.elementAt(i).getNomUni());
                txtCIPUFPIPprf.setText(vUni.elementAt(i).getCod_CIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void cargarUniForPR() {
        try {
            UniproyectosDAO uFE = new UniproyectosDAO();            
            Vector<UniproyectosDTO> vUni = uFE.ubicar(txtCodPIP.getText(),"2");
            for (int i = 0; i < vUni.size(); i++) {
                txtUFPR.setText(vUni.elementAt(i).getCod_UniPIP());                
                txtCIPUiFPIPpr.setText(vUni.elementAt(i).getCod_CIP());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    private void cargarUniEjePR() {
        try {
            UniproyectosDAO uFE = new UniproyectosDAO();            
            Vector<UniproyectosDTO> vUni = uFE.ubicar(txtCodPIP.getText(),"3");
            for (int i = 0; i < vUni.size(); i++) {
                txtUEPR.setText(vUni.elementAt(i).getCod_UniPIP());
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
        txtUFPRF = new javax.swing.JTextField();
        txtUFPR = new javax.swing.JTextField();
        txtUEPR = new javax.swing.JTextField();
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
        txtCodSituPIP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblSituacion = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        txtlocal = new javax.swing.JTextField();
        cboprovin = new javax.swing.JComboBox();
        cbodistri = new javax.swing.JComboBox();
        txtCodDep = new javax.swing.JTextField();
        txtCodProv = new javax.swing.JTextField();
        txtCodDist = new javax.swing.JTextField();
        cboNivCalifi = new javax.swing.JComboBox();
        cboNivEstu = new javax.swing.JComboBox();
        cboSituPIP = new javax.swing.JComboBox();
        txtNEs = new javax.swing.JTextField();
        txtNCa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblImagenEscudo1 = new javax.swing.JLabel();
        txtCodSnip = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFechSnip = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
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
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel25.setText("Nombre:");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNomUFPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNomUFPIP.setForeground(new java.awt.Color(0, 0, 153));
        jPanel8.add(txtNomUFPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 345, 32));

        txtSeUFPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtSeUFPIP.setForeground(new java.awt.Color(0, 0, 153));
        txtSeUFPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeUFPIPActionPerformed(evt);
            }
        });
        jPanel8.add(txtSeUFPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 345, 31));

        txtPliUFPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtPliUFPIP.setForeground(new java.awt.Color(0, 0, 153));
        txtPliUFPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPliUFPIPActionPerformed(evt);
            }
        });
        jPanel8.add(txtPliUFPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 345, 34));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel29.setText("Pliego:");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel30.setText("Sector:");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel41.setText("Persona ");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel20.setText("Nombre:");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel26.setText("Grado:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        txtGradoUFPRF.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtGradoUFPRF.setForeground(new java.awt.Color(0, 0, 153));
        jPanel8.add(txtGradoUFPRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 92, 30));

        txtNomUFPRF.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNomUFPRF.setForeground(new java.awt.Color(0, 0, 153));
        txtNomUFPRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUFPRFActionPerformed(evt);
            }
        });
        jPanel8.add(txtNomUFPRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 280, 34));

        btnBuscarPRFUF.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnBuscarPRFUF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnBuscarPRFUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPRFUFActionPerformed(evt);
            }
        });
        jPanel8.add(btnBuscarPRFUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 39, 30));

        txtCIPUFPIPprf.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCIPUFPIPprf.setForeground(new java.awt.Color(0, 0, 153));
        jPanel8.add(txtCIPUFPIPprf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 137, 30));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel43.setText("Responsable");
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel44.setText("Formular.");
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel45.setText("Persona ");
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel28.setText("Grado:");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel32.setText("Nombre:");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        txtNomUFPR.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNomUFPR.setForeground(new java.awt.Color(0, 0, 153));
        jPanel8.add(txtNomUFPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 28));

        txtGradoUFPR.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtGradoUFPR.setForeground(new java.awt.Color(0, 0, 153));
        jPanel8.add(txtGradoUFPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 92, 31));

        txtCIPUiFPIPpr.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCIPUiFPIPpr.setForeground(new java.awt.Color(0, 0, 153));
        jPanel8.add(txtCIPUiFPIPpr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 137, 31));

        btnBuscarPRUF.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnBuscarPRUF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar-ayuda-icono-6888-16.png"))); // NOI18N
        btnBuscarPRUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPRUFActionPerformed(evt);
            }
        });
        jPanel8.add(btnBuscarPRUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 38, 30));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel47.setText("Responsable");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel8.add(txtUFPRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 40, -1));
        jPanel8.add(txtUFPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 40, -1));
        jPanel8.add(txtUEPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 40, -1));

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
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("UNIDAD EJECUTORA ", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel23.setText("Otros Imprevistos:");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 124, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setText("Capacitacion:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 86, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel22.setText("Equipamiento:");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 49, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel21.setText("Supervision:");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 124, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel16.setText("Obras Civiles:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 83, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel17.setText("Estudios/Ex. Tec.:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 49, -1, -1));

        txtEstudios.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtEstudios.setForeground(new java.awt.Color(0, 0, 153));
        txtEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstudiosActionPerformed(evt);
            }
        });
        jPanel7.add(txtEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 33, 90, 33));

        txtObras.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtObras.setForeground(new java.awt.Color(0, 0, 153));
        txtObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObrasActionPerformed(evt);
            }
        });
        jPanel7.add(txtObras, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 72, 90, 31));

        txtSuper.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtSuper.setForeground(new java.awt.Color(0, 0, 153));
        txtSuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuperActionPerformed(evt);
            }
        });
        jPanel7.add(txtSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 109, 90, 32));

        txtEquipa.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtEquipa.setForeground(new java.awt.Color(0, 0, 153));
        txtEquipa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipaActionPerformed(evt);
            }
        });
        jPanel7.add(txtEquipa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 90, 33));

        txtCapa.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtCapa.setForeground(new java.awt.Color(0, 0, 153));
        txtCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapaActionPerformed(evt);
            }
        });
        jPanel7.add(txtCapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 90, 31));

        txtOtros.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtOtros.setForeground(new java.awt.Color(0, 0, 153));
        txtOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtrosActionPerformed(evt);
            }
        });
        jPanel7.add(txtOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 90, 32));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel46.setText("Fuente de Financiamiento:");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 158, 184, -1));

        txtFuente.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtFuente.setForeground(new java.awt.Color(0, 0, 153));
        jPanel7.add(txtFuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 90, 28));

        jTabbedPane1.addTab("COMPONENTES", jPanel7);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 520, 306));
        jPanel3.add(txtCodSituPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 63, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("\" SITUACION DEL PIP \"");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 140, -1));

        lblSituacion.setFont(new java.awt.Font("Tahoma", 1, 20));
        jPanel3.add(lblSituacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 120, 130, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel27.setText("Nivel de Calificacion:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel31.setText("Nivel de Estudio:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        txtNivEstudio.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNivEstudio.setForeground(new java.awt.Color(0, 0, 153));
        txtNivEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivEstudioActionPerformed(evt);
            }
        });
        jPanel3.add(txtNivEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 220, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-informe-icono-6797-16.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 135, 30));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sincronizacion-actualiza-la-recarga-icono-4348-16.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 20, 138, 30));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 21, 138, 28));

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3floppy-guardar-el-desmantelamiento-icono-4124-16.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 63, 143, 30));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Warning.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 63, 145, 30));

        btnAsignarTDR.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnAsignarTDR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-de-mi-perfil-icono-3964-16.png"))); // NOI18N
        btnAsignarTDR.setText("ASIGNAR TDR ");
        btnAsignarTDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTDRActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignarTDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 104, 410, 31));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 354, 440, 150));

        txtNivCali.setFont(new java.awt.Font("Tahoma", 1, 13));
        txtNivCali.setForeground(new java.awt.Color(0, 0, 153));
        jPanel3.add(txtNivCali, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 220, 34));

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
        jPanel4.add(txtlocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 330, 32));

        cboprovin.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboprovin.setForeground(new java.awt.Color(0, 0, 153));
        cboprovin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboprovinActionPerformed(evt);
            }
        });
        jPanel4.add(cboprovin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 33));

        cbodistri.setFont(new java.awt.Font("Tahoma", 1, 13));
        cbodistri.setForeground(new java.awt.Color(0, 0, 153));
        cbodistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodistriActionPerformed(evt);
            }
        });
        jPanel4.add(cbodistri, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 33));
        jPanel4.add(txtCodDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 50, 31));
        jPanel4.add(txtCodProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 67, 50, 30));
        jPanel4.add(txtCodDist, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 104, 50, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 190));

        cboNivCalifi.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboNivCalifi.setForeground(new java.awt.Color(0, 0, 153));
        cboNivCalifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivCalifiActionPerformed(evt);
            }
        });
        jPanel3.add(cboNivCalifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 220, 30));

        cboNivEstu.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboNivEstu.setForeground(new java.awt.Color(0, 0, 153));
        cboNivEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNivEstuActionPerformed(evt);
            }
        });
        jPanel3.add(cboNivEstu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 220, 30));

        cboSituPIP.setFont(new java.awt.Font("Tahoma", 1, 13));
        cboSituPIP.setForeground(new java.awt.Color(0, 0, 153));
        cboSituPIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSituPIPActionPerformed(evt);
            }
        });
        jPanel3.add(cboSituPIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 130, 33));
        jPanel3.add(txtNEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, 63, 29));
        jPanel3.add(txtNCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, 63, 29));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1000, 520));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cboDeparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDeparActionPerformed
        try {
            departamentoDAO depa = new departamentoDAO();            
            departamentoDTO departa = depa.obtener(cboDepar.getSelectedItem().toString());
            if (departa != null) {
                txtCodDep.setText(departa.getCod_Dpto());
                txtNombDepart.setText(cboDepar.getSelectedItem().toString());
                cargarComboProvincia();
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
}//GEN-LAST:event_cboDeparActionPerformed

    private void btnAsignarTDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTDRActionPerformed
        departamento = txtNombDepart.getText();
        provincia    = txtNombProv.getText();
        distrito     = txtNombDist.getText();
        localidad    = txtlocal.getText();
        nombProy     = txtnombProy.getText();
        division     = txtDivision.getText();
        direccion    = txtdireccion.getText();
        comisaria    = txtComisaria.getText();
        otros        = txtOtrosUP.getText();
        pip          = txtCodPIP.getText();
        new TDR().setVisible(true);
        this.dispose();
}//GEN-LAST:event_btnAsignarTDRActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        activaBotones(true, false, false, false, true, false, false, false, false);
        Limpiar();        
        NoEditable();       
        lblSituacion.setVisible(false);        
        
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(btnGrabar.isEnabled()){            
            try {
                PipDAO tbpip = new PipDAO();
                tbpip.cargarPIP();                
                if (txtCodPIP.getText().isEmpty()) {
                    txtCodPIP.setText(""+tbpip.incrementaCodigo());
                    PipDTO xpip = new PipDTO();
                    xpip.setCod_PIP(txtCodPIP.getText());
                    xpip.setSNIP(txtCodSnip.getText());
                    xpip.setFechSNIP(Date.valueOf(txtFechSnip.getText()));
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
                                    tnEs.setCod_EstPIP(txtNEs.getText());
                                    xpip.setCod_NivEstPIP(tnEs);
                                        /*******************************/
                                        /*******************************/
                                        Tb_NivCaliPIP tnCa = new Tb_NivCaliPIP();
                                        tnCa.setCod_NivCaliPIP(txtNCa.getText());
                                        xpip.setCod_NivCaliPIP(tnCa);
                                            /*******************************/
                                            /*******************************/
                                            Tb_SituPIP tbs = new Tb_SituPIP();
                                            tbs.setCod_SituPIP(txtCodSituPIP.getText());
                                            xpip.setSituacion(tbs);
                    tbpip.agregarPIP(xpip);/*************FINAL******************/                    
                    System.out.println("Vamos Avanzando");
                    /*************/
                    /*************/
                    grabaUFPRF();
                    /*************/
                    /*************/
                    JOptionPane.showMessageDialog(null,"Registro guardado satisfactoriamente en el Sistema...","Exito", 1);
                    lblSituacion.setVisible(true);
                    NoEditable();
                    activaBotones(true, true, false, true, false, false, false, false, false);
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
                    apip.setDivisionPNP(txtDivision.getText());
                    apip.setComisaria(txtComisaria.getText());
                    apip.setOtrosPNP(txtOtrosUP.getText());
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
                            tnE.setCod_EstPIP(txtNEs.getText());
                            apip.setCod_NivEstPIP(tnE);
                                /*******************************/
                                /*******************************/
                                Tb_NivCaliPIP tnC = new Tb_NivCaliPIP();
                                tnC.setCod_NivCaliPIP(txtNCa.getText());
                                apip.setCod_NivCaliPIP(tnC);
                                    /*******************************/
                                    /*******************************/
                                    Tb_SituPIP tb = new Tb_SituPIP();
                                    tb.setCod_SituPIP(txtCodSituPIP.getText());
                                    apip.setSituacion(tb);
                        tbpip.actualizarPIP(apip);
                        /*************/
                        /*************/
                        grabaUFPRF();
                        /*************/
                        /*************/
                        JOptionPane.showMessageDialog(this,"Datos actualizados satisfactoriamente en el Sistema","Exito", 1);
                        lblSituacion.setVisible(true);
                        NoEditable();
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
        cargarCombos();
        Editable();
        Limpiar();        
}//GEN-LAST:event_btnNuevoActionPerformed

    private void txtNivEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivEstudioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtNivEstudioActionPerformed

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

    private void cboNivCalifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivCalifiActionPerformed
        try {
            Tb_NivCaliPIPDAO nivC = new Tb_NivCaliPIPDAO();
            Tb_NivCaliPIP nCa = nivC.obtner(cboNivCalifi.getSelectedItem().toString());
            if(nCa != null){
                txtNCa.setText(nCa.getCod_NivCaliPIP());/*=====OJO REVISAR====*/
                txtNivCali.setText(cboNivCalifi.getSelectedItem().toString());
                //cargarProvincias();
            }
        } catch (Exception ex) {
            Logger.getLogger(PIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboNivCalifiActionPerformed

    private void cboNivEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNivEstuActionPerformed
         try {
            Tb_NivEstPIPDAO nivEST = new Tb_NivEstPIPDAO();            
            Tb_NivEstPIP nivest = nivEST.obtener(cboNivEstu.getSelectedItem().toString());
            if(nivest != null){
                txtNEs.setText(nivest.getCod_EstPIP());/*=====OJO REVISAR====*/
                txtNivEstudio.setText(cboNivEstu.getSelectedItem().toString());
                //cargarProvincias();
            }
        } catch (Exception ex) {
            Logger.getLogger(PIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboNivEstuActionPerformed

    private void cboSituPIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSituPIPActionPerformed
        try {
            Tb_SituPIPDAO sit = new Tb_SituPIPDAO();            
            Tb_SituPIP t = sit.obtener(cboSituPIP.getSelectedItem().toString());
            if (t != null) {
                txtCodSituPIP.setText(t.getCod_SituPIP());
                lblSituacion.setText(cboSituPIP.getSelectedItem().toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboSituPIPActionPerformed

    private void cboprovinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboprovinActionPerformed
         try {
            provinciaDAO pro = new provinciaDAO();            
            provinciaDTO provincia = pro.obtener(cboprovin.getSelectedItem().toString());
            if(provincia != null){
                txtCodProv.setText(provincia.getCod_Prov());  /*=====OJO REVISAR====*/
                txtNombProv.setText(cboprovin.getSelectedItem().toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(PIP.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarComboDistrito();
    }//GEN-LAST:event_cboprovinActionPerformed

    private void cbodistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodistriActionPerformed
        try {
            distritoDAO distri = new distritoDAO();
            String nomDistri= cbodistri.getSelectedItem().toString();
            distritoDTO distrito = distri.obtener(nomDistri);
            if(distrito != null){
                txtCodDist.setText(distrito.getCod_dist());  /*=====OJO REVISAR====*/
                txtNombDist.setText(cboprovin.getSelectedItem().toString());
            }
        } catch (Exception ex) {
            Logger.getLogger(PIP.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarComboProvincia();
    }//GEN-LAST:event_cbodistriActionPerformed

    private void cargarComboDepartamento() {       
        try {
            departamentoDAO dep = new departamentoDAO();
            Vector<departamentoDTO> vDep;
            vDep = dep.cargarDepartamento();
            for (int i = 0; i < vDep.size(); i++) {
                cboDepar.addItem(vDep.elementAt(i).getNombreDpto());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PIP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarComboProvincia() {
        try {
            provinciaDAO prov = new provinciaDAO();            
            Vector<provinciaDTO> vProv = prov.cargarProvincia(txtCodDep.getText());
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
            Vector<distritoDTO> vDist = dist.cargarDistrito(txtCodProv.getText());
            for (int i = 0; i < vDist.size(); i++) {
                cbodistri.addItem(vDist.elementAt(i).getNombreDIS());
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
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
    private javax.swing.JTextField txtNCa;
    private javax.swing.JTextField txtNEs;
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
