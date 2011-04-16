/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author Administrador
 */
public class Tb_TipDocDTO {
    private String CTip_Doc;
    private String Des_TDoc;

    public Tb_TipDocDTO() {
    }

    public Tb_TipDocDTO(String CTip_Doc, String Des_TDoc) {
        this.CTip_Doc = CTip_Doc;
        this.Des_TDoc = Des_TDoc;
    }

    /**
     * @return the CTip_Doc
     */
    public String getCTip_Doc() {
        return CTip_Doc;
    }

    /**
     * @param CTip_Doc the CTip_Doc to set
     */
    public void setCTip_Doc(String CTip_Doc) {
        this.CTip_Doc = CTip_Doc;
    }

    /**
     * @return the Des_TDoc
     */
    public String getDes_TDoc() {
        return Des_TDoc;
    }

    /**
     * @param Des_TDoc the Des_TDoc to set
     */
    public void setDes_TDoc(String Des_TDoc) {
        this.Des_TDoc = Des_TDoc;
    }
}
