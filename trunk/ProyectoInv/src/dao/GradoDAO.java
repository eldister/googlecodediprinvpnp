package dao;

import conexion.Conexion;
import dto.GradoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class GradoDAO {
  private Connection conn;
    private Statement  st;
    Vector<GradoDTO> vGra = new Vector<GradoDTO>();

    public void abrirConexion() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException{
        st.close();
        conn.close();
    }

    public Vector cargarGrado() throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM tgra");
        while(rst.next()){
            vGra.addElement(new GradoDTO(rst.getString(1),rst.getString(2)));
        }
        rst.close();
        cerrarConexion();
        return vGra;
    }

    public GradoDTO obtener(String nomGra) throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM tgra WHERE TPCOR='"+nomGra+"'");
        GradoDTO tdoc = null;
        if(rst.next()){
            return new GradoDTO(rst.getString(1),rst.getString(2));
        }else{
            return tdoc;
        }
    }
}
