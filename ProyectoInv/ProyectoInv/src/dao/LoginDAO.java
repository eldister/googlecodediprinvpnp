package dao;

import conexion.Conexion;
import dto.LoginDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class LoginDAO {

    private Connection conn;
    private Statement st;
    Vector<LoginDTO> vLog = new Vector<LoginDTO>();

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public LoginDTO obtener(int usu) {
        return vLog.elementAt(usu);
    }

    public LoginDTO buscar(String usua, String pass) {
        for (int i = 0; i < vLog.size(); i++) {
            String us = obtener(i).getUsuario();
            String pas = obtener(i).getPassword();
            if (us.equals(usua) && pas.equals(pass) ) {
                return obtener(i);
            }
        }
        return null;
    }

    public Vector<LoginDTO> cargarLogin() throws SQLException {
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT * FROM tb_login");
        vLog = new Vector<LoginDTO>();
        while (rst.next()) {
            vLog.addElement(new LoginDTO(rst.getString(1), rst.getString(2)));
        }
        rst.close();
        cerrarConexion();
        return vLog;
    }

    public LoginDTO validar( String usua, String pasw) throws SQLException {
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT tgra.TPCOR,maspol.MA13 FROM tgra," +
                "maspol,tb_login WHERE maspol.MA76= '" + usua +  "'AND tb_login.Usuario='"+usua+"'" +
                " AND tb_login.Password='" + pasw +
                "' AND tgra.TPCOD=maspol.MA02");
     
        LoginDTO tb = null;
        if (rst.next()) {
            return new LoginDTO(rst.getString(1), rst.getString(2));
        } else {
            return tb;
        }
    }

     public int agregarLogin(LoginDTO login) throws SQLException {
        abrirConexion();
        String SQL = "insert into tb_login values('" + login.getPassword() + "','"
                + login.getUsuario() + "')";
        int iResultado = st.executeUpdate(SQL); 
        vLog = new Vector<LoginDTO>();
        cargarLogin();
        cerrarConexion();
        return iResultado;
    }

    public int actualizarLogin(LoginDTO login) throws SQLException{
        String SQL = "Update tb_login set Password='" +
                login.getPassword()+"' where Usuario='"+login.getUsuario()+"'";

        //  UPDATE tb_login set  Password='Munive' where Usuario='31000670';
        
        abrirConexion();
        int iResultado = st.executeUpdate(SQL); 
        vLog = new Vector<LoginDTO>();
        cargarLogin();
        cerrarConexion();
        return iResultado;
    }
       public LoginDTO buscar1(String usua) throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT tgra.TPCOR,maspol.MA13 FROM tgra,maspol WHERE maspol.MA76= '"+usua+"' " +
                                        "AND tgra.TPCOD=maspol.MA02");
        LoginDTO logi = null;
        if(rst.next()){
            return new LoginDTO(rst.getString(1), rst.getString(2));
        }else{
            return logi;
        }
    }
}
