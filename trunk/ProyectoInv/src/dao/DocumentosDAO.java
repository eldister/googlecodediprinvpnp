package dao;

import conexion.Conexion;
import dto.DocumentoDTO;
import dto.TipDocDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DocumentosDAO {

    private Connection conn;
    private Statement st;
    Vector<DocumentoDTO> vDoc = new Vector<DocumentoDTO>();

    public DocumentosDAO(){
    }

    public void abrirConexion() throws SQLException {
        conn = Conexion.getConnection();
        st = conn.createStatement();
    }

    public void cerrarConexion() throws SQLException {
        st.close();
        conn.close();
    }

    public DocumentoDTO obtener(int docREG) {
        return vDoc.elementAt(docREG);
    }

    public DocumentoDTO buscar(String docREG) {
        for (int i = 0; i<vDoc.size(); i++) {
            String id = obtener(i).getNroRegistro();
            if (id.equals(docREG)) {
                return obtener(i);
            }
        }
        return null;
    }

    public Vector cargarDocumentos() throws SQLException {
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT doc.Cod_RegDoc, doc.Nro_Doc, doc.Siglas, doc.FechReg, doc.Cod_CIP_REGDOC, tb.CTip_Doc, tb.Des_TDoc " +
                                        "FROM documentos doc,tb_tipdoc tb " +
                                        "WHERE doc.CTip_Doc = tb.CTip_Doc");
        while (rst.next()) {
            DocumentoDTO doc = new DocumentoDTO();
            doc.setNroRegistro(rst.getString("doc.Cod_RegDoc"));
            doc.setNro_Doc(rst.getString("doc.Nro_Doc"));
            doc.setSiglas(rst.getString("doc.Siglas"));
            doc.setFechReg(rst.getDate("doc.FechReg"));
            doc.setCod_CIP_REGDOC(rst.getString("doc.Cod_CIP_REGDOC"));
            /**/TipDocDTO tb = new TipDocDTO();
                tb.setCTip_Doc(rst.getString("tb.CTip_Doc"));
                tb.setTDoc(rst.getString("tb.Des_TDoc"));
                doc.setCTip_Doc(tb);
                vDoc.addElement(doc);
        }
        rst.close();
        cerrarConexion();
        return vDoc;
    }

    public int agregarDocumento(DocumentoDTO doc) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "INSERT INTO documentos VALUES('"+doc.getNroRegistro()+
                                                          "','"+doc.getCTip_Doc().getCTip_Doc()+
                                                          "','"+doc.getNro_Doc()+
                                                          "','"+doc.getSiglas()+
                                                          "','"+doc.getFechReg()+
                                                          "','"+doc.getCod_CIP_REGDOC()+"')";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarDocumentos();
        cerrarConexion();
        return iResultado;
    }

    public int eliminarDocumentos(String codDoc) throws SQLException {
        abrirConexion();
        String sentenciaSQL = "DELETE FROM documentos WHERE Cod_RegDoc='"+codDoc+"'";
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarDocumentos();
        cerrarConexion();
        return iResultado;
    }

    public int actualizarDocumento(DocumentoDTO dco) throws SQLException{
        abrirConexion();
        String sentenciaSQL = "UPDATE documentos SET Cod_RegDoc    ='"+dco.getNroRegistro()+"'," +
                                                    "CTip_Doc      ='"+dco.getCTip_Doc().getCTip_Doc()+"'," +
                                                    "Nro_Doc       ='"+dco.getNro_Doc()+"'," +
                                                    "Siglas        ='"+dco.getSiglas()+"'," +
                                                    "FechReg       ='"+dco.getFechReg()+"'," +
                                                    "Cod_CIP_REGDOC='"+dco.getCod_CIP_REGDOC()+"'"+
                              "WHERE Cod_RegDoc='"+dco.getNroRegistro()+"'";
        System.out.println("123 "+sentenciaSQL);
        int iResultado = st.executeUpdate(sentenciaSQL);
        cargarDocumentos();
        cerrarConexion();
        return iResultado;
    }

    public int incrementaREG() throws SQLException{
        abrirConexion();
        ResultSet rst = st.executeQuery("SELECT IF(MAX(Cod_RegDoc) IS NULL,1,MAX(Cod_RegDoc)+1) as nuevo FROM documentos");
        rst.next();
        return rst.getInt("nuevo");
    }
}


// SELECT IF(MAX(Reg_Doc), 1, MAX(Reg_Doc)+1) from documentos