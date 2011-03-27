/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author ealfriadezy
 */
public class Tb_Nomuni {
    private String Cod_NomUni;
    private String Desc_Nomuni;

    public Tb_Nomuni() {
    }

    public Tb_Nomuni(String Cod_NomUni, String Desc_Nomuni) {
        this.Cod_NomUni = Cod_NomUni;
        this.Desc_Nomuni = Desc_Nomuni;
    }

    /**
     * @return the Cod_NomUni
     */
    public String getCod_NomUni() {
        return Cod_NomUni;
    }

    /**
     * @param Cod_NomUni the Cod_NomUni to set
     */
    public void setCod_NomUni(String Cod_NomUni) {
        this.Cod_NomUni = Cod_NomUni;
    }

    /**
     * @return the Desc_Nomuni
     */
    public String getDesc_Nomuni() {
        return Desc_Nomuni;
    }

    /**
     * @param Desc_Nomuni the Desc_Nomuni to set
     */
    public void setDesc_Nomuni(String Desc_Nomuni) {
        this.Desc_Nomuni = Desc_Nomuni;
    }    
}
