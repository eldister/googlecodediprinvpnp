
package dao;

import conexion.Conexion;
import dto.Tb_NivEstPIP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Tb_NivEstPIPDAO {
    private Connection conn;
    private Statement  st;
    Vector<Tb_NivEstPIP> vNest = new Vector<Tb_NivEstPIP>();

    public void abrirConexiones() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    public void cerrarConexiones() throws SQLException{
        st.close();
        conn.close();
    }

        public Vector cargarNivEstPIP() throws SQLException{
        abrirConexiones();
        ResultSet rst = st.executeQuery("SELECT * FROM tb_nivestpip");
        while(rst.next()){
            vNest.addElement(new Tb_NivEstPIP(rst.getString(1), rst.getString(2)));
        }
        rst.close();
        cerrarConexiones();
        return vNest;
    }

    public Tb_NivEstPIP obtener(String nombre) throws SQLException{
        abrirConexiones();
        ResultSet rst = st.executeQuery("SELECT * FROM tb_nivestpip WHERE Desc_NivEstPIP='"+nombre+"'");
        Tb_NivEstPIP tb = null;
        if(rst.next()){
            return new Tb_NivEstPIP(rst.getString(1), rst.getString(2));
        }else{
            return tb;
        }
    }
}
