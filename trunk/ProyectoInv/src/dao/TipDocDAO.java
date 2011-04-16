package dao;

import conexion.Conexion;
import dto.TipDocDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class TipDocDAO {
    private Connection conn;
    private Statement  st;
    Vector<TipDocDTO> vTipo = new Vector<TipDocDTO>();

    public void abrirConexion() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException{
        st.close();
        conn.close();
    }

    public Vector cargarTipDoc() throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM Tb_TipDoc");        
        while(rst.next()){
            vTipo.addElement(new TipDocDTO(rst.getString(1), rst.getString(2)));
        }
        rst.close();
        cerrarConexion();
        return vTipo;
    }

    public TipDocDTO obtener(String nomDoc) throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM Tb_TipDoc WHERE Des_TDoc="+nomDoc+"");
        TipDocDTO tdoc = null;
        if(rst.next()){
            return new TipDocDTO(rst.getString(1), rst.getString(2));
        }else{
            return tdoc;
        }
    }
}
