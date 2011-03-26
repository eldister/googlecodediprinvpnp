/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import conexion.Conexion;
import dto.PipDTO;
import dto.Tb_NivCaliPIP;
import dto.Tb_NivEstPIP;
import dto.Tb_SituPIP;
import dto.departamentoDTO;
import dto.distritoDTO;
import dto.provinciaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

    public class PipDAO {
    public int actual;
    private Connection conn;
    private Statement  st;
    Vector<PipDTO> vPip = new Vector<PipDTO>();

    public PipDAO() {
    }

    public void abrirConexiones() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    public void CerrarConexiones() throws SQLException{
        st.close();
        conn.close();
    }

    public PipDTO obtener(int pipID){
        return vPip.elementAt(pipID);
    }

    public PipDTO buscar(String pipID){
        for(int i=0;i<vPip.size();i++){
            String id=obtener(i).getCod_PIP();
            if(id.equals(pipID)){
                return obtener(i);
            }
        }return null;
    }

    public Vector cargarPIP() throws SQLException{
      abrirConexiones();
      ResultSet rst = st.executeQuery("SELECT pip.Cod_PIP, pip.SNIP, pip.FechSNIP, pip.Nom_ProInv, pip.LocaliPNP, pip.DireccPNP, " +
                                              "pip.DivisionPNP,pip.Comisaria, pip.OtrosPNP,pip.Est_ExpTec,pip.Obra_Civ,pip.Supervision,pip.Equipamiento,pip.Capacitacion, " +
                                              "pip.Otros_Imp, pip.Fuente_Fina, " +
                                              "tb_situpip.Cod_SitPIP, tb_situpip.Des_SitPIP, " +
                                              "tb_nivestpip.Cod_EstPIP, tb_nivestpip.Desc_NivEstPIP, " +
                                              "tb_nivcalipip.Cod_NivCaliPIP, tb_nivcalipip.Desc_NivCaliPIP, " +
                                              "tb_departamento.Cod_Dpto, tb_departamento.NombreDpto, " +
                                              "tb_provincia.Cod_Prov, tb_provincia.NombreProv, " +
                                              "tb_distrito.Cod_Dist, tb_distrito.NombreDIS " +
                                        "FROM pip, tb_situpip, tb_nivestpip, tb_nivcalipip, tb_departamento, tb_provincia, tb_distrito " +
                                        "WHERE pip.Cod_Dpto = tb_departamento.Cod_Dpto " +
                                        "AND   pip.Situacion = tb_situpip.Cod_SitPIP " +
                                        "AND   pip.Cod_Prov = tb_provincia.Cod_Prov " +
                                        "AND   pip.Cod_Dist = tb_distrito.Cod_Dist " +
                                        "AND   pip.Cod_NivEstPIP = tb_nivestpip.Cod_EstPIP " +
                                        "AND   PIP.Cod_NivCaliPIP= tb_nivcalipip.Cod_NivCaliPIP ");
        while(rst.next()){
            PipDTO pip = new PipDTO();
            pip.setCod_PIP(rst.getString("pip.Cod_PIP"));
            pip.setSNIP(rst.getString("pip.SNIP"));
            pip.setFechSNIP(rst.getDate("pip.FechSNIP"));
            pip.setNom_Proinv(rst.getString("pip.Nom_ProInv"));
            pip.setLocaliPNP(rst.getString("pip.LocaliPNP"));
            pip.setDireccPNP(rst.getString("pip.DireccPNP"));
            pip.setDivisionPNP(rst.getString("pip.DivisionPNP"));
            pip.setComisaria(rst.getString("pip.Comisaria"));
            pip.setOtrosPNP(rst.getString("pip.OtrosPNP"));
            pip.setEst_ExpTec(rst.getDouble("pip.Est_ExpTec"));
            pip.setObra_Civ(rst.getDouble("pip.Obra_Civ"));
            pip.setSupervision(rst.getDouble("pip.Supervision"));
            pip.setEquipamiento(rst.getDouble("pip.Equipamiento"));
            pip.setCapacitacion(rst.getDouble("pip.Capacitacion"));
            pip.setOtros_Imp(rst.getDouble("pip.Otros_Imp"));
            pip.setFuente_Fina(rst.getDouble("pip.Fuente_Fina"));            
            //*************************************\\
            //*************************************\\
                Tb_NivEstPIP tbNE = new Tb_NivEstPIP();
                tbNE.setCod_EstPIP(rst.getString("tb_nivestpip.Cod_EstPIP"));
                tbNE.setDesc_NivPIP(rst.getString("tb_nivestpip.Desc_NivEstPIP"));
                pip.setCod_NivEstPIP(tbNE);//---ESTO ES---\\
                //*************************************\\
                //*************************************\\
                    Tb_NivCaliPIP tbNC = new Tb_NivCaliPIP();
                    tbNC.setCod_NivCaliPIP(rst.getString("tb_nivcalipip.Cod_NivCaliPIP"));
                    tbNC.setDesc_NivCaliPIP(rst.getString("tb_nivcalipip.Desc_NivCaliPIP"));
                    pip.setCod_NivCaliPIP(tbNC);//---ESTO ES---\\
                    //*************************************\\
                    //*************************************\\
                        departamentoDTO tbDep = new departamentoDTO();
                        tbDep.setCod_Dpto(rst.getString("tb_departamento.Cod_Dpto"));
                        tbDep.setNombreDpto(rst.getString("tb_departamento.NombreDpto"));
                        pip.setCod_Dpto(tbDep);//---ESTO ES---\\
                        //*************************************\\
                        //*************************************\\
                            provinciaDTO tbPro = new provinciaDTO();
                            tbPro.setCod_Prov(rst.getString("tb_provincia.Cod_Prov"));
                            tbPro.setNombreProv(rst.getString("tb_provincia.NombreProv"));
                            pip.setCod_Prov(tbPro);//---ESTO ES---\\
                            System.out.println("123 "+tbPro);
                                //*************************************\\
                                //*************************************\\
                                distritoDTO tbDis = new distritoDTO();
                                tbDis.setCod_dist(rst.getString("tb_distrito.Cod_Dist"));
                                tbDis.setNombreDIS(rst.getString("tb_distrito.NombreDIS"));
                                pip.setCod_Dist(tbDis);//---ESTO ES---\\
                                //*************************************\\
                                //*************************************\\
                                    Tb_SituPIP tbsitu = new Tb_SituPIP();
                                    tbsitu.setCod_SituPIP(rst.getString("tb_situpip.Cod_SitPIP"));
                                    tbsitu.setDes_SituPIP(rst.getString("tb_situpip.Des_SitPIP"));
                                    pip.setSituacion(tbsitu);
                                    vPip.addElement(pip);//---FINALLLLLLLLLL---\\
        }
        rst.close();
        CerrarConexiones();
        return vPip;
    }

    public int agregarPIP(PipDTO pip) throws SQLException{
        abrirConexiones();
        String sentenciaSQL = "INSERT INTO pip VALUES('"+pip.getCod_PIP()+
                                                   "','"+pip.getSNIP()+
                                                   "','"+pip.getFechSNIP()+
                                                   "','"+pip.getNom_Proinv()+
                                                   "','"+pip.getCod_Dpto().getCod_Dpto()+
                                                   "','"+pip.getCod_Prov().getCod_Prov()+
                                                   "','"+pip.getCod_Dist().getCod_dist()+
                                                   "','"+pip.getLocaliPNP()+
                                                   "','"+pip.getDireccPNP()+
                                                   "','"+pip.getDivisionPNP()+
                                                   "','"+pip.getComisaria()+
                                                   "','"+pip.getOtrosPNP()+
                                                   "','"+pip.getEst_ExpTec()+
                                                   "','"+pip.getObra_Civ()+
                                                   "','"+pip.getSupervision()+
                                                   "','"+pip.getEquipamiento()+
                                                   "','"+pip.getCapacitacion()+
                                                   "','"+pip.getOtros_Imp()+
                                                   "','"+pip.getFuente_Fina()+
                                                   "','"+pip.getCod_NivEstPIP().getCod_EstPIP()+
                                                   "','"+pip.getCod_NivCaliPIP().getCod_NivCaliPIP()+
                                                   "','"+pip.getSituacion().getCod_SituPIP()+"')";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarPIP();
        CerrarConexiones();
        return iResultado;
    }

    public int actualizarPIP(PipDTO pp) throws SQLException{
        abrirConexiones();
        String sentenciaSQL = "UPDATE pip SET Cod_PIP        ='"+pp.getCod_PIP()+"'," +
                                             "SNIP           ='"+pp.getSNIP()+"'," +
                                             "FechSNIP       ='"+pp.getFechSNIP()+"'," +
                                             "Nom_ProInv     ='"+pp.getNom_Proinv()+"', " +
                                             "Cod_Dpto       ='"+pp.getCod_Dpto().getCod_Dpto()+"'," +
                                             "Cod_Prov       ='"+pp.getCod_Prov().getCod_Prov()+"'," +
                                             "Cod_Dist       ='"+pp.getCod_Dist().getCod_dist()+"'," +
                                             "LocaliPNP      ='"+pp.getLocaliPNP()+"'," +
                                             "DireccPNP      ='"+pp.getDireccPNP()+"', " +
                                             "DivisionPNP    ='"+pp.getDivisionPNP()+"', " +
                                             "Comisaria      ='"+pp.getComisaria()+"', " +
                                             "OtrosPNP       ='"+pp.getOtrosPNP()+"', " +
                                             "Est_ExpTec     ='"+pp.getEst_ExpTec()+"'," +
                                             "Obra_Civ       ='"+pp.getObra_Civ()+"'," +
                                             "Supervision    ='"+pp.getSupervision()+"'," +
                                             "Equipamiento   ='"+pp.getEquipamiento()+"'," +
                                             "Capacitacion   ='"+pp.getCapacitacion()+"'," +
                                             "Otros_Imp      ='"+pp.getOtros_Imp()+"'," +
                                             "Fuente_Fina    ='"+pp.getFuente_Fina()+"'," +
                                             "Cod_NivEstPIP  ='"+pp.getCod_NivEstPIP().getCod_EstPIP()+"'," +
                                             "Cod_NivCaliPIP ='"+pp.getCod_NivCaliPIP().getCod_NivCaliPIP()+"'," +
                                             "Situacion      ='"+pp.getSituacion().getCod_SituPIP()+"'" +
                              "WHERE Cod_PIP ='"+pp.getCod_PIP()+"'";

        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarPIP();
        CerrarConexiones();
        return iResultado;
    }
}
