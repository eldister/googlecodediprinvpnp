
package dao;

import conexion.Conexion;
import dto.CoordinadorDTO;
import dto.GradoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;


public class CoordinadorDAO {
  private Connection conn;
    private Statement st;
    Vector<CoordinadorDTO> vCoord = new Vector<CoordinadorDTO>();

    public CoordinadorDAO() {
    }

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public CoordinadorDTO obtener(int usuaREG) {
        return vCoord.elementAt(usuaREG);
    }

    public CoordinadorDTO buscar(String usuaREG) {
        for (int i = 0; i < vCoord.size(); i++) {
            String id = obtener(i).getCodCoordinador();
            if (id.equals(usuaREG)) {
                return obtener(i);
            }
        }
        return null;
    }

       public CoordinadorDTO validar( String usua) throws SQLException {
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT grad.TPCOR,grad.TPCOD, masp.MA13 " +
                "FROM tgra grad, maspol masp  WHERE masp.MA76= '" + usua +
                "' AND masp.MA02= grad.TPCOD ");

       

        CoordinadorDTO tb = null;
        if (rst.next()) {
            return new CoordinadorDTO(rst.getString(1), rst.getString(2),null);
        } else {
            return tb;
        }
    }


    public Vector cargarCoordinador1() throws SQLException {
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT coor.Cod_CIP, coor.MA13, gra.TPCOR, gra.TPCOD " +
                "FROM tgra gra, coordinador coor WHERE gra.TPCOD=coor.TPCOD");
        while (rst.next()) {
            CoordinadorDTO usua = new CoordinadorDTO();
            usua.setCodCoordinador(rst.getString("coor.Cod_CIP"));
            usua.setNombre(rst.getString("coor.MA13"));
            GradoDTO gra = new GradoDTO();
            gra.setTPCOD(rst.getString("gra.TPCOD"));
            gra.setTPCOR(rst.getString("gra.TPCOR"));
            usua.setTPCOD(gra);
            vCoord.addElement(usua);
        }
        rst.close();
        cerrarConexion();
        return vCoord;
    }

    public int agregarCoordinador1(CoordinadorDTO coord) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "INSERT INTO coordinador VALUES('" + coord.getCodCoordinador() + "','"
                + coord.getTPCOD().getTPCOD() + "','"
                + coord.getNombre() + "')";

        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarCoordinador1();
        cerrarConexion();
        return iResultado;
    }

    public int eliminarCoordinador1(String coordi) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "DELETE FROM coordinador WHERE Cod_CIP='" + coordi + "'";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarCoordinador1();
        cerrarConexion();
        return iResultado;
    }

    public int actualizarCoordinador1(CoordinadorDTO coord) throws SQLException {
        abrirConexion();
        String SQL = "UPDATE coordinador SET Cod_CIP ='" + coord.getCodCoordinador() + "',"
                + "MA98    ='" + coord.getNombre() + "',"
                + "TPCOD   ='" + coord.getTPCOD().getTPCOD()  + "'"
                + "WHERE Cod_CIP='" + coord.getCodCoordinador() + "'";
        int iResultado = st.executeUpdate(SQL);
        cargarCoordinador1();
        cerrarConexion();
        return iResultado;
    }
}
