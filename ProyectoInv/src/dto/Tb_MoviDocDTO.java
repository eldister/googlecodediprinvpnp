/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author Administrador
 */
public class Tb_MoviDocDTO {
    private String Cod_MovDoc;
    private String Desc_MovDoc;

    public Tb_MoviDocDTO() {
    }

    public Tb_MoviDocDTO(String Cod_MovDoc, String Desc_MovDoc) {
        this.Cod_MovDoc = Cod_MovDoc;
        this.Desc_MovDoc = Desc_MovDoc;
    }

    /**
     * @return the Cod_MovDoc
     */
    public String getCod_MovDoc() {
        return Cod_MovDoc;
    }

    /**
     * @param Cod_MovDoc the Cod_MovDoc to set
     */
    public void setCod_MovDoc(String Cod_MovDoc) {
        this.Cod_MovDoc = Cod_MovDoc;
    }

    /**
     * @return the Desc_MovDoc
     */
    public String getDesc_MovDoc() {
        return Desc_MovDoc;
    }

    /**
     * @param Desc_MovDoc the Desc_MovDoc to set
     */
    public void setDesc_MovDoc(String Desc_MovDoc) {
        this.Desc_MovDoc = Desc_MovDoc;
    }
}
