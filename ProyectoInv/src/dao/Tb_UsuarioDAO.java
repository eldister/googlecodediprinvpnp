package dao;

import conexion.Conexion;
import dto.Tb_UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Tb_UsuarioDAO {

    private Connection conn;
    private Statement st;
    Vector<Tb_UsuarioDTO> vUsua = new Vector<Tb_UsuarioDTO>();

    public Tb_UsuarioDAO() {
    }

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public Tb_UsuarioDTO obtener(int usuaREG) {
        return vUsua.elementAt(usuaREG);
    }

    public Tb_UsuarioDTO buscarCIP(String cip) {
        for (int i = 0; i < vUsua.size(); i++) {
            String id = obtener(i).getCip_Usuario();
            if (id.equals(cip)) {
                return obtener(i);
            }
        }
        return null;
    }

    public Tb_UsuarioDTO buscarValidacion(String cip,String clave){
        for(int i=0;i<vUsua.size();i++){
            if((obtener(i).getCip_Usuario().equals(cip))&&(obtener(i).getPassword().equals(clave))){
                return obtener(i);
            }
        }return null;
    }

    public Vector cargarUsuario_X_Maspol() throws SQLException {
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT maspol.MA76,maspol.MA98,tgra.TPCOD,tgra.TPCOR,maspol.MA13" +
                                        "FROM tgra,maspol " +
                                        "WHERE tgra.TPCOD = maspol.MA02");
        while (rst.next()) {
            Tb_UsuarioDTO usua = new Tb_UsuarioDTO();
            usua.setCod_ID_Usu(rst.getString(" maspol.MA76"));
            usua.setCip_Usuario(rst.getString(" usua.MA98"));
            usua.setMA13(rst.getString("tgra.TPCOD"));
            usua.setTPCOR(rst.getString("tgra.TPCOR"));
            usua.setPassword(rst.getString("maspol.MA13"));
            vUsua.addElement(usua);
        }
        rst.close();
        cerrarConexion();
        return vUsua;
    }

    public Vector cargarUsuario() throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM tb_usuario");
        while(rst.next()){
            Tb_UsuarioDTO tbu = new Tb_UsuarioDTO();
            tbu.setCod_ID_Usu(rst.getString(1));
            tbu.setCip_Usuario(rst.getString(2));
            tbu.setMA98(rst.getString(3));                        
            tbu.setTPCOR(rst.getString(4));
            tbu.setMA13(rst.getString(5));
            tbu.setPassword(rst.getString(6));
            vUsua.addElement(tbu);
        }
        rst.close();
        cerrarConexion();
        return vUsua;
    }

    public int agregarUsuario(Tb_UsuarioDTO usua) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "INSERT INTO tb_usuario VALUES('"+usua.getCod_ID_Usu()+"','"
                                                               +usua.getCip_Usuario()+"','"
                                                               +usua.getMA98()+"','"                                                               
                                                               +usua.getMA13() +"','"
                                                               +usua.getTPCOR() +"','"
                                                               +usua.getPassword() +"')";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarUsuario();
        cerrarConexion();
        return iResultado;
    }

    public int eliminarUusuario(String usuar) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "DELETE FROM tb_usuario WHERE Cod_Usuario='"+usuar+"'";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarUsuario();
        cerrarConexion();
        return iResultado;
    }

    public int actualizarDocumento(Tb_UsuarioDTO usu) throws SQLException {
        abrirConexion();
        String SQL = "UPDATE tb_usuario SET Cod_ID_Usu  ='"+usu.getCip_Usuario()+"',"
                                          +"Cip_Usuario ='"+usu.getCip_Usuario()+"',"
                                          +"MA98        ='"+usu.getMA98()+"',"
                                          +"MA76        ='"+usu.getMA13()+"',"
                                          +"TPCOD       ='"+usu.getTPCOR()+"',"
                                          +"Password    ='"+usu.getPassword()+"'"
                    +"WHERE Cip_Usuario='" +usu.getCip_Usuario()+"'";
        int iResultado = st.executeUpdate(SQL);
        cargarUsuario();
        cerrarConexion();
        return iResultado;
    }
}
