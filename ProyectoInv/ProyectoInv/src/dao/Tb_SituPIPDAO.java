
package dao;

import conexion.Conexion;
import dto.Tb_SituPIP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Tb_SituPIPDAO {
    private Connection conn;
    private Statement  st;
    Vector<Tb_SituPIP> vSitu = new Vector<Tb_SituPIP>();

    public void abrirConexion() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException{
       st.close();
       conn.close();
    }

    public Vector cargarSituacionPIP() throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM tb_SituPIP");
        while(rst.next()){
            vSitu.addElement(new Tb_SituPIP(rst.getString(1), rst.getString(2)));
        }
        rst.close();
        cerrarConexion();
        return vSitu;
    }

    public Tb_SituPIP obtener(String desSitu) throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM tb_SituPIP WHERE Des_SitPIP = '"+desSitu+"'");
        Tb_SituPIP tb = null;
        if(rst.next()){
            return new Tb_SituPIP(rst.getString(1), rst.getString(2));
        }else{
            return tb;
        }
    }
}
