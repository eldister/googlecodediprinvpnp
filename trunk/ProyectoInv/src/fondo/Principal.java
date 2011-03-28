package fondo;

import dao.LoginDAO;
import dto.LoginDTO;
import formulario.DocOrigen;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.button.StandardButtonShaper;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

public class Principal extends javax.swing.JFrame {

    public static String nombusuario;
    public static String password;
    public static String CIP;

    public Principal() {
        initComponents();
        setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin");
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("c:\\fondo.jpg"));
        this.btnaceptar.putClientProperty(SubstanceLookAndFeel.BUTTON_SHAPER_PROPERTY, new StandardButtonShaper());
        centrar();
    }

    public void centrar() {
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize((pantallaTamano.width), (pantallaTamano.height));
        Dimension tamanoPanel = jPanel1.getSize();
        jPanel1.setBounds((pantallaTamano.width-tamanoPanel.width) / 2, (pantallaTamano.height - tamanoPanel.height) / 2, (int) tamanoPanel.getWidth(), (int) tamanoPanel.getHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblImagenEscudo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnaceptar = new javax.swing.JButton();
        Cargando = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

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

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 10, 760, 100);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 300, 87, 23);

        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario);
        txtusuario.setBounds(320, 290, 230, 30);

        txtcontraseña.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtcontraseña);
        txtcontraseña.setBounds(320, 340, 230, 32);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 18));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 340, 97, 41);

        btnaceptar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnaceptar.setText("Iniciar Sesion");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnaceptar);
        btnaceptar.setBounds(300, 420, 190, 40);
        jPanel1.add(Cargando);
        Cargando.setBounds(380, 460, 40, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mininter.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 110, 700, 520);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 820, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        txtcontraseña.requestFocus();
}//GEN-LAST:event_txtusuarioActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed

        if ((txtusuario.getText().isEmpty()) || (txtcontraseña.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y contraseña");
        } else {
            try {
                LoginDAO log = new LoginDAO();
                log.cargarLogin();
                Cargando.setIcon(new ImageIcon(getClass().getResource("/imagenes/loading2.gif")));
                Cargando.setVisible(true);
                btnaceptar.setVisible(false);
                LoginDTO objE = log.validar(txtusuario.getText(), txtcontraseña.getText());
                if (objE != null) {

                    JOptionPane.showMessageDialog(this,
                            "Bienvenido " + objE.getUsuario() + "  " + objE.getPassword(),
                            "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    btnaceptar.setVisible(false);
                    Cargando.setVisible(true);
                    new DocOrigen().setVisible(true);
                    this.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Sus datos son incorrectos, Revisalo ");
                    txtcontraseña.setText("");
                    btnaceptar.setVisible(true);
                    Cargando.setVisible(false);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
        nombusuario = txtusuario.getText();
        password = txtcontraseña.getText();
        CIP=txtusuario.getText();
}//GEN-LAST:event_btnaceptarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargando;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblImagenEscudo1;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
