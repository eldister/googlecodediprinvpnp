/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import conexion.Conexion;
import dto.DocGeneradosDTO;
import dto.Tb_MoviDocDTO;
import dto.Tb_TablasDTO;
import dto.Tb_TipDocDTO;
import dto.Tb_UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Administrador
 */
public class DocGeneradosDAO {
    private Connection conn;
    private Statement st;
    private Vector<DocGeneradosDTO> vDocG = new Vector<DocGeneradosDTO>();

    public DocGeneradosDAO() {
    }

    public void abrirConexion() throws SQLException{
        conn = Conexion.getConnection();
        st   = conn.createStatement();
    }

    private void cerrarConexion() throws SQLException{
        st.close();
        conn.close();
    }

    public DocGeneradosDTO obtener(int docRegGene){
        return vDocG.elementAt(docRegGene);
    }

    public DocGeneradosDTO buscar(String docRegGene){
        for(int i=0;i<vDocG.size();i++){
            if(obtener(i).getCodRegDoc().equals(docRegGene)){
                return obtener(i);
            }
        }
        return null;
    }
    
    public Vector cargarDocumentosGenerados() throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT dg.Cod_RegDoc, dg.Cod_Varios, ttb.Cod_CodTabla, ttb.Des_CodTabla, " +
                                                "tti.CTip_Doc, tti.Des_TDoc, dg.Nro_Doc, dg.Siglas, dg.FechReg, " +
                                                "tbm.Cod_MovDoc, tbm.Des_MovDoc, tbu.Cod_ID_Usu, tbu.Cip_Usuario " +
                                        "FROM docgenerados dg, tb_tablas ttb, tb_tipdoc tti, tb_usuario tbu, tb_movidoc tbm " +
                                        "WHERE dg.Cod_CodTabla = ttb.Cod_CodTabla " +
                                        "AND dg.CTip_Doc = tti.CTip_Doc " +
                                        "AND dg.Cod_ID_Usu = tbu.Cod_ID_Usu " +
                                        "AND dg.Cod_MovDoc = tbm.Cod_MovDoc ");
        while(rst.next()){
            DocGeneradosDTO dcg = new DocGeneradosDTO();
            dcg.setCodRegDoc(rst.getString("dg.Cod_RegDoc"));
            dcg.setCod_Varios(rst.getInt("dg.Cod_Varios"));
            /**/Tb_TablasDTO ttb = new Tb_TablasDTO();
                ttb.setCod_CodTabla(rst.getString("ttb.Cod_CodTabla"));
                ttb.setDesc_CodTabla(rst.getString("ttb.Des_CodTabla"));
                dcg.setCod_CodTabla(ttb);
            /**//**/Tb_TipDocDTO tti = new Tb_TipDocDTO();
                    tti.setCTip_Doc("tti.CTip_Doc");
                    tti.setDes_TDoc("tti.Des_TDoc");
                    dcg.setCTip_Doc(tti);
            dcg.setNro_Doc(rst.getString("dg.Nro_Doc"));
            dcg.setSiglas(rst.getString("dg.Siglas"));
            dcg.setFechReg(rst.getDate("dg.FechReg"));
            /**/Tb_MoviDocDTO tbm = new Tb_MoviDocDTO();
                tbm.setCod_MovDoc(rst.getString("tbm.Cod_MovDoc"));
                tbm.setDesc_MovDoc(rst.getString("tbm.Des_MovDoc"));
           /**//**/Tb_UsuarioDTO tbu = new Tb_UsuarioDTO();
                   tbu.setCod_ID_Usu(rst.getString("tbu.Cod_ID_Usu"));
                   tbu.setCip_Usuario(rst.getString("tbu.Cip_Usuario"));
                   dcg.setCod_ID_Usu(tbu);
                   vDocG.addElement(dcg);
        }
        rst.close();
        cerrarConexion();
        return vDocG;
    }

    public int agregarDocumentoGenerado(DocGeneradosDTO dg) throws SQLException{
        abrirConexion();
        String sentenciaSQL = "INSERT INTO docgenerados VALUES('"+dg.getCodRegDoc()+
                                                            "','"+dg.getCod_Varios()+
                                                            "','"+dg.getCod_CodTabla().getCod_CodTabla()+
                                                            "','"+dg.getCTip_Doc().getCTip_Doc()+
                                                            "','"+dg.getNro_Doc()+
                                                            "','"+dg.getSiglas()+
                                                            "','"+dg.getFechReg()+
                                                            "','"+dg.getCod_MovDoc().getCod_MovDoc()+
                                                            "','"+dg.getCod_ID_Usu().getCod_ID_Usu()+"')";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarDocumentosGenerados();
        cerrarConexion();
        return iResultado;
    }

    public int eliminarDocumentosGenerados(String codDocReg) throws SQLException{
        abrirConexion();
        String sentenciaSQL = "DELETE FROM docgenerados WHERE Cod_RegDoc='"+codDocReg+"'";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarDocumentosGenerados();
        cerrarConexion();
        return iResultado;
    }

    public int actualizardocumentoGenerado(DocGeneradosDTO dto) throws SQLException{
        abrirConexion();
        String sentenciaSQL = "UPDATE docgenerados SET CodRegDoc    ='"+dto.getCodRegDoc()+
                                                      "Cod_Varios   ='"+dto.getCod_Varios()+
                                                      "Cod_CodTabla ='"+dto.getCod_CodTabla().getCod_CodTabla()+
                                                      "CTip_Doc     ='"+dto.getCTip_Doc().getCTip_Doc()+
                                                      "Nro_Doc      ='"+dto.getNro_Doc()+
                                                      "Siglas       ='"+dto.getSiglas()+
                                                      "FechReg      ='"+dto.getFechReg()+
                                                      "Cod_MovDoc   ='"+dto.getCod_MovDoc().getCod_MovDoc()+
                                                      "Cod_ID_Usu   ='"+dto.getCod_ID_Usu().getCod_ID_Usu()+
                               "WHERE CodRegDoc='"+dto.getCodRegDoc()+"'";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarDocumentosGenerados();
        cerrarConexion();
        return iResultado;
    }

    public int incrementarDocReg() throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT IF(MAX(Cod_RegDoc) IS NULL,1,MAX(Cod_RegDoc)+1) as nuevo FROM docgenerados");
        rst.next();
        return rst.getInt("nuevo");
    }
}
