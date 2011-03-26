package dao;

import conexion.Conexion;
import dto.PipDTO;
import dto.Tb_NomuniII;
import dto.Uniproyectos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class UniproyectosDAO {

    private Connection conn;
    private Statement st;
    Vector<Uniproyectos> vUni = new Vector<Uniproyectos>();

    public UniproyectosDAO() {
    }

    public void abrirConexiones() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexiones() throws SQLException {
        st.close();
        conn.close();
    }

    public Uniproyectos obtner(int regPIP) {
        return vUni.elementAt(regPIP);
    }

    public Uniproyectos buscar(String regPip) {
        for (int i = 0; i < vUni.size(); i++) {
            String id = obtner(i).getCod_UniPIP();
            if (id.equals(regPip)) {
                return obtner(i);
            }
        }
        return null;
    }

    public Vector cargarUniproyectos() throws SQLException {
        abrirConexiones();
        ResultSet rst = st.executeQuery("SELECT	u.Cod_UniPIP,u.Cod_PIP,u.Cod_CIP,t.Cod_NomUniPer,t.Des_NomUniPer,u.Sector,u.Pliego,u.Nombre_Unidad "
                + "FROM uniproyectos u,pip p,tb_nomuniii t "
                + "WHERE p.Cod_PIP = u.Cod_PIP "
                + "AND u.Cod_NomUni = t.Cod_NomUniPer");
        while (rst.next()) {
            Uniproyectos uni = new Uniproyectos();
            uni.setCod_UniPIP(rst.getString("u.Cod_UniPIP"));
            PipDTO pi = new PipDTO();
            pi.setCod_PIP(rst.getString("u.Cod_PIP"));
            uni.setCod_PIP(pi);
            uni.setCod_CIP(rst.getString("u.Cod_CIP"));
            Tb_NomuniII tnuni = new Tb_NomuniII();
            tnuni.setCod_NomUniPer(rst.getString("t.Cod_NomUniPer"));
            tnuni.setDesc_NomUniPer("t.Des_NomUniPer");
            uni.setCod_NomUni(tnuni);
            uni.setSector(rst.getString("u.Sector"));
            uni.setPliego(rst.getString("u.Pliego"));
            uni.setNomUni(rst.getString("u.Nombre_Unidad"));
            vUni.addElement(uni);
        }
        rst.close();
        cerrarConexiones();
        return vUni;
    }

    public Vector ubicar(String reg, String ni) throws SQLException {
        abrirConexiones();
        ResultSet rst = st.executeQuery("SELECT uniproyectos.Cod_PIP,uniproyectos.Cod_CIP,tb_nomuniii.Cod_NomUniPer,tb_nomuniii.Des_NomUniPer,uniproyectos.Sector,uniproyectos.Pliego,uniproyectos.Nombre_Unidad "
                + "FROM uniproyectos ,pip ,tb_nomuniii "
                + "WHERE pip.Cod_PIP = '" + reg + "' "
                + "AND uniproyectos.Cod_NomUni = tb_nomuniii.Cod_NomUniPer "
                + "AND uniproyectos.Cod_PIP = '" + reg + "' "
                + "AND uniproyectos.Cod_NomUni= '" + ni + "' ");
        while (rst.next()) {
            Uniproyectos uni = new Uniproyectos();
            PipDTO pi = new PipDTO();
            pi.setCod_PIP(rst.getString("uniproyectos.Cod_PIP"));
            uni.setCod_PIP(pi);
            uni.setCod_CIP(rst.getString("uniproyectos.Cod_CIP"));
            Tb_NomuniII tnuni = new Tb_NomuniII();
            tnuni.setCod_NomUniPer(rst.getString("tb_nomuniii.Cod_NomUniPer"));
            tnuni.setDesc_NomUniPer("tb_nomuniii.Des_NomUniPer");
            uni.setCod_NomUni(tnuni);
            uni.setSector(rst.getString("uniproyectos.Sector"));
            uni.setPliego(rst.getString("uniproyectos.Pliego"));
            uni.setNomUni(rst.getString("uniproyectos.Nombre_Unidad"));
            vUni.addElement(uni);
        }
        rst.close();
        cerrarConexiones();
        return vUni;
    }

    public int agregarUNIPRO(Uniproyectos uni) throws SQLException {
        abrirConexiones();
        String sentenciaSQL = "INSERT INTO uniproyectos VALUES('" + uni.getCod_UniPIP()
                + "','" + uni.getCod_CIP()
                + "','" + uni.getCod_NomUni().getCod_NomUniPer()
                + "','" + uni.getSector()
                + "','" + uni.getPliego()
                + "','" + uni.getNomUni()
                + "','" + uni.getCod_PIP().getCod_PIP() + "')";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarUniproyectos();
        cerrarConexiones();
        return iResultado;
    }
}
