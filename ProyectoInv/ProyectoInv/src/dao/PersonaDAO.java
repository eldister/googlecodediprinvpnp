package dao;

import conexion.Conexion;
import dto.PersonaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class PersonaDAO {

    private Connection conn;
    private Statement st;
    Vector<PersonaDTO> vPer = new Vector<PersonaDTO>();

    public PersonaDAO() {
    }

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public PersonaDTO obtener(int perREG) {
        return vPer.elementAt(perREG);
    }

    public PersonaDTO buscar(String perREG) {
        for (int i = 0; i < vPer.size(); i++) {
            String id = obtener(i).getCod_DocIdent();
            if (id.equals(perREG)) {
                return obtener(i);
            }
        }
        return null;
    }

   public Vector<PersonaDTO> cargarPersona() throws SQLException {
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM persona");
        vPer = new Vector<PersonaDTO>();
        while (rst.next()) {
            vPer.addElement(new PersonaDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9)));
        }
        rst.close();
        cerrarConexion();
        return vPer;
    }

    public int agregarPersona(PersonaDTO per) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "INSERT INTO persona VALUES('" + per.getCod_DocIdent() + "','"
                + per.getApePaterno() + "','"
                + per.getApeMaterno() + "','"
                + per.getNombre() + "','"
                + per.getRazSocial() + "','"
                + per.getDirecc() + "','"
                + per.getEmail() + "','"
                + per.getTelef() + "','"
                + per.getCelular()+ "')";

        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarPersona();
        cerrarConexion();
        return iResultado;
    }

    public int eliminarPersona(String per) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "DELETE FROM persona WHERE Cod_DocIdent='" + per + "'";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarPersona();
        cerrarConexion();
        return iResultado;
    }

    public int actualizarPersona(PersonaDTO per) throws SQLException {
        abrirConexion();
        String SQL = "UPDATE persona SET Cod_DocIdent ='" + per.getCod_DocIdent() + "',"
                + "ApePaterno='" + per.getApePaterno() + "',"
                + "ApeMaterno='" + per.getApeMaterno() + "',"
                + "Nombre='" + per.getNombre() + "',"
                + "RazSocial='" + per.getRazSocial() + "',"
                + "Direcc='" + per.getDirecc() + "',"                
                + "Email   ='" + per.getDirecc() + "',"
                + "Telef='" +per.getTelef() + "',"
                + "Celular ='" + per.getCelular() + "'"
                + "WHERE Cod_DocIdent='" + per.getCod_DocIdent() + "'";
        int iResultado = st.executeUpdate(SQL);
        cargarPersona();
        cerrarConexion();
        return iResultado;
    }
}
