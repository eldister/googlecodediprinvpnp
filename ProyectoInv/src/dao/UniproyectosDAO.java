package dao;

import conexion.Conexion;
import dto.PipDTO;
import dto.Tb_NomuniII;
import dto.UniproyectosDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class UniproyectosDAO {

    private Connection conn;
    private Statement st;
    Vector<UniproyectosDTO> vUni = new Vector<UniproyectosDTO>();

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

    public UniproyectosDTO obtner(int regPIP) {
        return vUni.elementAt(regPIP);
    }

    public UniproyectosDTO buscar(String regPip) {
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
            UniproyectosDTO uni = new UniproyectosDTO();
            uni.setCod_UniPIP(rst.getString("u.Cod_UniPIP"));
            //*************************************\\
            //*************************************\\
            PipDTO pi = new PipDTO();
            pi.setCod_PIP(rst.getString("u.Cod_PIP"));
            uni.setCod_PIP(pi);
            uni.setCod_CIP(rst.getString("u.Cod_CIP"));
                //*************************************\\
                //*************************************\\
                Tb_NomuniII tnuni = new Tb_NomuniII();
                tnuni.setCod_NomUniPer(rst.getString("t.Cod_NomUniPer"));
                tnuni.setDesc_NomUniPer("t.Des_NomUniPer");
                uni.setCod_NomUni(tnuni);
            uni.setSector(rst.getString("u.Sector"));
            uni.setPliego(rst.getString("u.Pliego"));
            uni.setNomUni(rst.getString("u.Nombre_Unidad"));
            vUni.addElement(uni);/****FINAL****/
        }
        rst.close();
        cerrarConexiones();
        return vUni;
    }

    public Vector ubicar(String codPIP, String codUNI) throws SQLException {
        abrirConexiones();
        ResultSet rst = st.executeQuery("SELECT uniproyectos.Cod_PIP,uniproyectos.Cod_CIP,tb_nomuniii.Cod_NomUniPer,tb_nomuniii.Des_NomUniPer,uniproyectos.Sector,uniproyectos.Pliego,uniproyectos.Nombre_Unidad "
                                      + "FROM uniproyectos ,pip ,tb_nomuniii "
                                      + "WHERE pip.Cod_PIP = '"+codPIP+"' "
                                      + "AND uniproyectos.Cod_NomUni = tb_nomuniii.Cod_NomUniPer "
                                      + "AND uniproyectos.Cod_PIP = '"+codPIP+"' "
                                      + "AND uniproyectos.Cod_NomUni= '"+codUNI+"' ");
        while (rst.next()) {
            UniproyectosDTO uni = new UniproyectosDTO();
            //*************************************\\
            //*************************************\\
            PipDTO pi = new PipDTO();
            pi.setCod_PIP(rst.getString("uniproyectos.Cod_PIP"));
            uni.setCod_PIP(pi);
            uni.setCod_CIP(rst.getString("uniproyectos.Cod_CIP"));
                    //*************************************\\
                    //*************************************\\
                    Tb_NomuniII tnuni = new Tb_NomuniII();
                    tnuni.setCod_NomUniPer(rst.getString("tb_nomuniii.Cod_NomUniPer"));
                    tnuni.setDesc_NomUniPer("tb_nomuniii.Des_NomUniPer");
                    uni.setCod_NomUni(tnuni);
            uni.setSector(rst.getString("uniproyectos.Sector"));
            uni.setPliego(rst.getString("uniproyectos.Pliego"));
            uni.setNomUni(rst.getString("uniproyectos.Nombre_Unidad"));
            vUni.addElement(uni);/****FINAL****/
        }
        rst.close();
        cerrarConexiones();
        return vUni;
    }

    public int agregarUNIPRO(UniproyectosDTO uni) throws SQLException {
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

    public int actualizarUNIPRO(UniproyectosDTO actUNIPRO) throws SQLException{
        abrirConexiones();
        String sentenciaSQL = "UPDATE uniproyectos SET Cod_UniPIP   ='"+actUNIPRO.getCod_UniPIP()+"'," +
                                                      "Cod_CIP      ='"+actUNIPRO.getCod_CIP()+"'," +
                                                      "Cod_NomUni   ='"+actUNIPRO.getCod_NomUni().getCod_NomUniPer()+"'," +
                                                      "Sector       ='"+actUNIPRO.getSector()+"'," +
                                                      "Pliego       ='"+actUNIPRO.getPliego()+"'," +
                                                      "Nombre_Unidad='"+actUNIPRO.getNomUni()+"'," +
                                                      "Cod_PIP      ='"+actUNIPRO.getCod_PIP()+"'"+
                              "WHERE Cod_UniPIP='"+actUNIPRO.getCod_UniPIP()+"'";
        System.out.println("Datos guardados con satisfaccion");
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarUniproyectos();
        cerrarConexiones();
        return iResultado;
    }

    public int incrementaUNIPRO()throws SQLException{
        abrirConexiones();
        ResultSet rst = st.executeQuery("SELECT IF(MAX(Cod_UniPIP) IS NULL,1,MAX(Cod_UniPIP)+1) AS nuevo FROM uniproyectos");
        rst.next();
        return rst.getInt("nuevo");
    }
}
