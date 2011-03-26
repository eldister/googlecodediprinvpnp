package dao;

import conexion.Conexion;
import dto.distritoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class distritoDAO {

    private Connection conn;
    private Statement st;
    Vector<distritoDTO> vDist = new Vector<distritoDTO>();

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public Vector cargarDistrito(String CodDist) throws SQLException {
        abrirConexion();
        ResultSet rs = st.executeQuery("SELECT * FROM tb_distrito WHERE Cod_Prov='"+CodDist+"'");
        while (rs.next()) {
            vDist.addElement(new distritoDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        rs.close();
        cerrarConexion();
        return vDist;
    }

    public distritoDTO obtener(String NombreDIS) throws SQLException {
        abrirConexion();
        ResultSet rs = st.executeQuery("SELECT * FROM tb_distrito WHERE NombreDIS ='" + NombreDIS + "'ORDER BY NombreDIS = '" + NombreDIS + "'ASC");
        distritoDTO dist = null;
        if (rs.next()) {
            return new distritoDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
        } else {
            return dist;
        }
    }
}
