
package dto;

import java.sql.Date;

public class DocumentoDTO {
    private String NroRegistro;
    private TipDocDTO CTip_Doc ;        /**TABLA RELACIONADA**/
    private String Nro_Doc;
    private String Siglas;
    private Date FechReg;
    private Tb_UsuarioDTO Cod_ID_Usu;     /**TABLA RELACIONADA**/

    public DocumentoDTO() {
    }

    public DocumentoDTO(String NroRegistro, TipDocDTO CTip_Doc, String Nro_Doc, String Siglas, Date FechReg, Tb_UsuarioDTO Cod_ID_Usu) {
        this.NroRegistro = NroRegistro;
        this.CTip_Doc = CTip_Doc;
        this.Nro_Doc = Nro_Doc;
        this.Siglas = Siglas;
        this.FechReg = FechReg;
        this.Cod_ID_Usu = Cod_ID_Usu;
    }

    /**
     * @return the NroRegistro
     */
    public String getNroRegistro() {
        return NroRegistro;
    }

    /**
     * @param NroRegistro the NroRegistro to set
     */
    public void setNroRegistro(String NroRegistro) {
        this.NroRegistro = NroRegistro;
    }

    /**
     * @return the CTip_Doc
     */
    public TipDocDTO getCTip_Doc() {
        return CTip_Doc;
    }

    /**
     * @param CTip_Doc the CTip_Doc to set
     */
    public void setCTip_Doc(TipDocDTO CTip_Doc) {
        this.CTip_Doc = CTip_Doc;
    }

    /**
     * @return the Nro_Doc
     */
    public String getNro_Doc() {
        return Nro_Doc;
    }

    /**
     * @param Nro_Doc the Nro_Doc to set
     */
    public void setNro_Doc(String Nro_Doc) {
        this.Nro_Doc = Nro_Doc;
    }

    /**
     * @return the Siglas
     */
    public String getSiglas() {
        return Siglas;
    }

    /**
     * @param Siglas the Siglas to set
     */
    public void setSiglas(String Siglas) {
        this.Siglas = Siglas;
    }

    /**
     * @return the FechReg
     */
    public Date getFechReg() {
        return FechReg;
    }

    /**
     * @param FechReg the FechReg to set
     */
    public void setFechReg(Date FechReg) {
        this.FechReg = FechReg;
    }

    /**
     * @return the Cod_ID_Usu
     */
    public Tb_UsuarioDTO getCod_ID_Usu() {
        return Cod_ID_Usu;
    }

    /**
     * @param Cod_ID_Usu the Cod_ID_Usu to set
     */
    public void setCod_ID_Usu(Tb_UsuarioDTO Cod_ID_Usu) {
        this.Cod_ID_Usu = Cod_ID_Usu;
    }
}
