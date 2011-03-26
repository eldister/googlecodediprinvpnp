package dao;

import conexion.Conexion;
import dto.GradoDTO;
import dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class UsuarioDAO {

    private Connection conn;
    private Statement st;
    Vector<UsuarioDTO> vUsua = new Vector<UsuarioDTO>();

    public UsuarioDAO() {
    }

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public UsuarioDTO obtener(int usuaREG) {
        return vUsua.elementAt(usuaREG);
    }

    public UsuarioDTO buscar(String usuaREG) {
        for (int i = 0; i < vUsua.size(); i++) {
            String id = obtener(i).getUsuario();
            if (id.equals(usuaREG)) {
                return obtener(i);
            }
        }
        return null;
    }

    public Vector cargarUsuario() throws SQLException {
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT usua.Usuario,usua.MA98, usua.MA76, usua.MA02, usua.MA13, "
                + "usua.Password, gra.TPCOR, gra.TPCOD FROM tgra gra, tb_usuario usua WHERE usua.TPCOD=gra.TPCOD");
        while (rst.next()) {

            UsuarioDTO usua = new UsuarioDTO();

            usua.setUsuario(rst.getString("usua.Usuario"));
            usua.setDNI(rst.getString("usua.MA98"));
            usua.setNombres(rst.getString("usua.MA13"));
            usua.setPassword(rst.getString("usua.Password"));

            GradoDTO gra = new GradoDTO();
            
            gra.setTPCOD(rst.getString("gra.TPCOD"));
            gra.setTPCOR(rst.getString("gra.TPCOR"));

            usua.setTPCOD(gra);
            vUsua.addElement(usua);
        }
        rst.close();
        cerrarConexion();
        return vUsua;
    }

    public int agregarUsuario(UsuarioDTO usua) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "INSERT INTO tb_usuario VALUES('" + usua.getUsuario() + "','"
                + usua.getTPCOD().getTPCOD() + "','"
                + usua.getDNI() + "','"
                + usua.getNombres() + "','"
                + usua.getPassword() + "')";

        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarUsuario();
        cerrarConexion();
        return iResultado;
    }

    public int eliminarUusuario(String usuar) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "DELETE FROM documentos WHERE Usuario='" + usuar + "'";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarUsuario();
        cerrarConexion();
        return iResultado;
    }

    public int actualizarDocumento(UsuarioDTO usu) throws SQLException {
        abrirConexion();
        String SQL = "UPDATE tb_usuario SET Usuario ='" + usu.getUsuario() + "',"
                + "TPCOD   ='" + usu.getTPCOD().getTPCOD() + "',"
                + "MA98    ='" + usu.getDNI() + "',"
                + "MA02    ='" + usu.getGrado() + "',"
                + "MA13    ='" + usu.getNombres() + "',"
                + "Password    ='" + usu.getPassword() + "'"
                + "WHERE Usuario='" +usu.getUsuario() + "'";
        int iResultado = st.executeUpdate(SQL);
        cargarUsuario();
        cerrarConexion();
        return iResultado;
    }
}
