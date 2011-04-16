/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

import java.sql.Date;

/**
 *
 * @author DIRTEL
 */
public class DocGeneradosDTO {
    private String CodRegDoc;
    private int Cod_Varios;
    private Tb_TablasDTO Cod_CodTabla;  /**TABLA RELACIONADA**/
    private Tb_TipDocDTO CTip_Doc;      /**TABLA RELACIONADA**/
    private String Nro_Doc;
    private String Siglas;
    private Date FechReg;
    private Tb_MoviDocDTO Cod_MovDoc;   /**TABLA RELACIONADA**/
    private Tb_UsuarioDTO Cod_ID_Usu;    /**TABLA RELACIONADA**/

    public DocGeneradosDTO() {
    }

    public DocGeneradosDTO(String CodRegDoc, int Cod_Varios, Tb_TablasDTO Cod_CodTabla, Tb_TipDocDTO CTip_Doc, String Nro_Doc, String Siglas, Date FechReg, Tb_MoviDocDTO Cod_MovDoc, Tb_UsuarioDTO Cod_ID_Usu) {
        this.CodRegDoc = CodRegDoc;
        this.Cod_Varios = Cod_Varios;
        this.Cod_CodTabla = Cod_CodTabla;
        this.CTip_Doc = CTip_Doc;
        this.Nro_Doc = Nro_Doc;
        this.Siglas = Siglas;
        this.FechReg = FechReg;
        this.Cod_MovDoc = Cod_MovDoc;
        this.Cod_ID_Usu = Cod_ID_Usu;
    }

    /**
     * @return the CodRegDoc
     */
    public String getCodRegDoc() {
        return CodRegDoc;
    }

    /**
     * @param CodRegDoc the CodRegDoc to set
     */
    public void setCodRegDoc(String CodRegDoc) {
        this.CodRegDoc = CodRegDoc;
    }

    /**
     * @return the Cod_Varios
     */
    public int getCod_Varios() {
        return Cod_Varios;
    }

    /**
     * @param Cod_Varios the Cod_Varios to set
     */
    public void setCod_Varios(int Cod_Varios) {
        this.Cod_Varios = Cod_Varios;
    }

    /**
     * @return the Cod_CodTabla
     */
    public Tb_TablasDTO getCod_CodTabla() {
        return Cod_CodTabla;
    }

    /**
     * @param Cod_CodTabla the Cod_CodTabla to set
     */
    public void setCod_CodTabla(Tb_TablasDTO Cod_CodTabla) {
        this.Cod_CodTabla = Cod_CodTabla;
    }

    /**
     * @return the CTip_Doc
     */
    public Tb_TipDocDTO getCTip_Doc() {
        return CTip_Doc;
    }

    /**
     * @param CTip_Doc the CTip_Doc to set
     */
    public void setCTip_Doc(Tb_TipDocDTO CTip_Doc) {
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
     * @return the Cod_MovDoc
     */
    public Tb_MoviDocDTO getCod_MovDoc() {
        return Cod_MovDoc;
    }

    /**
     * @param Cod_MovDoc the Cod_MovDoc to set
     */
    public void setCod_MovDoc(Tb_MoviDocDTO Cod_MovDoc) {
        this.Cod_MovDoc = Cod_MovDoc;
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
