/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author ealfriadezy
 */
public class Tb_NomuniII {
    private String Cod_NomUniPer;
    private String Desc_NomUniPer;

    public Tb_NomuniII() {
    }

    public Tb_NomuniII(String Cod_NomUniPer, String Desc_NomUniPer) {
        this.Cod_NomUniPer = Cod_NomUniPer;
        this.Desc_NomUniPer = Desc_NomUniPer;
    }

    /**
     * @return the Cod_NomUniPer
     */
    public String getCod_NomUniPer() {
        return Cod_NomUniPer;
    }

    /**
     * @param Cod_NomUniPer the Cod_NomUniPer to set
     */
    public void setCod_NomUniPer(String Cod_NomUniPer) {
        this.Cod_NomUniPer = Cod_NomUniPer;
    }

    /**
     * @return the Desc_NomUniPer
     */
    public String getDesc_NomUniPer() {
        return Desc_NomUniPer;
    }

    /**
     * @param Desc_NomUniPer the Desc_NomUniPer to set
     */
    public void setDesc_NomUniPer(String Desc_NomUniPer) {
        this.Desc_NomUniPer = Desc_NomUniPer;
    }    
}
