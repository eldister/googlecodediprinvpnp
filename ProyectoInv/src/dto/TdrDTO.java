/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;


/**
 *
 * @author DIRTEL
 */
public class TdrDTO {
    private String Cod_Tdr;
    private DocumentoDTO Cod_RegDoc;    /**TABLA RELACIONADA**/
    private PipDTO Cod_Pip;             /**TABLA RELACIONADA**/
    private String Cod_CIP_Coor;        /**TABLA RELACIONADA**/
    private String Cod_Cip_Usu;         /**TABLA RELACIONADA**/

    public TdrDTO() {
    }

    public TdrDTO(String Cod_Tdr, DocumentoDTO Cod_RegDoc, PipDTO Cod_Pip, String Cod_CIP_Coor, String Cod_Cip_Usu) {
        this.Cod_Tdr = Cod_Tdr;
        this.Cod_RegDoc = Cod_RegDoc;
        this.Cod_Pip = Cod_Pip;
        this.Cod_CIP_Coor = Cod_CIP_Coor;
        this.Cod_Cip_Usu = Cod_Cip_Usu;
    }

    /**
     * @return the Cod_Tdr
     */
    public String getCod_Tdr() {
        return Cod_Tdr;
    }

    /**
     * @param Cod_Tdr the Cod_Tdr to set
     */
    public void setCod_Tdr(String Cod_Tdr) {
        this.Cod_Tdr = Cod_Tdr;
    }

    /**
     * @return the Cod_RegDoc
     */
    public DocumentoDTO getCod_RegDoc() {
        return Cod_RegDoc;
    }

    /**
     * @param Cod_RegDoc the Cod_RegDoc to set
     */
    public void setCod_RegDoc(DocumentoDTO Cod_RegDoc) {
        this.Cod_RegDoc = Cod_RegDoc;
    }

    /**
     * @return the Cod_Pip
     */
    public PipDTO getCod_Pip() {
        return Cod_Pip;
    }

    /**
     * @param Cod_Pip the Cod_Pip to set
     */
    public void setCod_Pip(PipDTO Cod_Pip) {
        this.Cod_Pip = Cod_Pip;
    }

    /**
     * @return the Cod_CIP_Coor
     */
    public String getCod_CIP_Coor() {
        return Cod_CIP_Coor;
    }

    /**
     * @param Cod_CIP_Coor the Cod_CIP_Coor to set
     */
    public void setCod_CIP_Coor(String Cod_CIP_Coor) {
        this.Cod_CIP_Coor = Cod_CIP_Coor;
    }

    /**
     * @return the Cod_Cip_Usu
     */
    public String getCod_Cip_Usu() {
        return Cod_Cip_Usu;
    }

    /**
     * @param Cod_Cip_Usu the Cod_Cip_Usu to set
     */
    public void setCod_Cip_Usu(String Cod_Cip_Usu) {
        this.Cod_Cip_Usu = Cod_Cip_Usu;
    }
}
