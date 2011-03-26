package dao;

import conexion.Conexion;
import dto.departamentoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class departamentoDAO {

    private Connection conn;
    private Statement st;
    Vector<departamentoDTO> vDep = new Vector<departamentoDTO>();

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public Vector cargarDepartamento() throws SQLException {
        abrirConexion();
        ResultSet rs = st.executeQuery("SELECT * FROM tb_departamento");
        while (rs.next()) {
            vDep.addElement(new departamentoDTO(rs.getString(1), rs.getString(2)));
        }
        rs.close();
        cerrarConexion();
        return vDep;
    }

    public departamentoDTO obtener(String NombreDpto) throws SQLException {
        abrirConexion();
        ResultSet rs = st.executeQuery("SELECT * FROM tb_departamento wHERE NombreDpto ='"+NombreDpto+"'ORDER BY NombreDpto = '"+NombreDpto+"'ASC");
        departamentoDTO dpto = null;
        if (rs.next()) {
            return new departamentoDTO(rs.getString(1), rs.getString(2));
        } else {
            return dpto;
        }
    }
}
