package dao;

import conexion.Conexion;
import dto.provinciaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class provinciaDAO {

    private Connection conn;
    private Statement st;
    Vector<provinciaDTO> vProv = new Vector<provinciaDTO>();

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public Vector cargarProvincia(String codProv) throws SQLException {
        abrirConexion();
        ResultSet rs = st.executeQuery("SELECT * FROM tb_provincia WHERE Cod_Dpto='"+codProv+"'");
        while (rs.next()) {
            vProv.addElement(new provinciaDTO(rs.getString(1), rs.getString(2),rs.getString(3)));
        }
        rs.close();
        cerrarConexion();
        return vProv;
    }

    public provinciaDTO obtener(String NombreProv) throws SQLException {
        abrirConexion();

     ResultSet rs = st.executeQuery("SELECT * FROM tb_provincia WHERE NombreProv='"+NombreProv+"'");

        provinciaDTO prov = null;
        if (rs.next()) {
            return new provinciaDTO(rs.getString(1), rs.getString(2),rs.getString(3));
        } else {
            return prov;
        }
    }
}
