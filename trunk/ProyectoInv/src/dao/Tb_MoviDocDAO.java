/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import conexion.Conexion;
import dto.Tb_MoviDocDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Administrador
 */
public class Tb_MoviDocDAO {
    private Connection conn;
    private Statement  st;
    Vector<Tb_MoviDocDTO> vTm = new Vector<Tb_MoviDocDTO>();

    public void abrirConexion() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException{
       st.close();
       conn.close();
    }

    public Vector cargarMoviDoc() throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM Tb_MoviDoc");
        while(rst.next()){
            vTm.addElement(new Tb_MoviDocDTO(rst.getString(1), rst.getString(2)));
        }
        rst.close();
        cerrarConexion();
        return vTm;
    }

    public Tb_MoviDocDTO obtener(String nomMov) throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM Tb_MoviDoc WHERE Des_MovDoc="+nomMov+"");
        Tb_MoviDocDTO tb = null;
        if(rst.next()){
            return new Tb_MoviDocDTO(rst.getString(1),rst.getString(2));
        }else{
            return tb;
        }
    }
}
