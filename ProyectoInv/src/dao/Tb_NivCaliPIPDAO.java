/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import conexion.Conexion;
import dto.Tb_NivCaliPIP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Tb_NivCaliPIPDAO {
    private Connection conn;
    private Statement  st;
    Vector<Tb_NivCaliPIP> vNcal = new Vector<Tb_NivCaliPIP>();

    public void abrirConexiones() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    public void cerrarConexiones() throws SQLException{
        st.close();
        conn.close();
    }

        public Vector cargarNivCaliPIP() throws SQLException{
        abrirConexiones();
        ResultSet rst = st.executeQuery("SELECT * FROM tb_nivcalipip");
        while(rst.next()){
            vNcal.addElement(new Tb_NivCaliPIP(rst.getString(1), rst.getString(2)));
        }
        rst.close();
        cerrarConexiones();
        return vNcal;
    }

    public Tb_NivCaliPIP obtner(String nombre) throws SQLException{
        abrirConexiones();
        ResultSet rst = st.executeQuery("SELECT * FROM tb_nivcalipip WHERE Desc_NivCaliPIP='"+nombre+"'");
        Tb_NivCaliPIP tb = null;
        if(rst.next()){
            return new Tb_NivCaliPIP(rst.getString(1), rst.getString(2));
        }else{
            return tb;
        }
    }
}
