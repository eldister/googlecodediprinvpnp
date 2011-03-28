/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import conexion.Conexion;
import dto.TdrDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author DIRTEL
 */
public class TdrDAO {
    private Connection conn;
    private Statement  st;
    Vector<TdrDTO> vTdr = new Vector<TdrDTO>();

    public TdrDAO() {
    }

    public void abrirConexion() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException{
        st.close();
        conn.close();
    }

    public TdrDTO obtener(int tdrReg){
        return vTdr.elementAt(tdrReg);
    }

    public TdrDTO buscar(String tdrReg){
        for(int i=0;i<vTdr.size();i++){
            String id=obtener(i).getCod_Tdr();
            if(id.equals(tdrReg)){
                return obtener(i);
            }
        }return null;
    }
}
