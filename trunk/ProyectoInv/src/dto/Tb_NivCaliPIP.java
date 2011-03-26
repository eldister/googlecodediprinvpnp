/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author ealfriadezy
 */
public class Tb_NivCaliPIP {
    private String Cod_NivCaliPIP;
    private String Desc_NivCaliPIP;

    public Tb_NivCaliPIP() {
    }

    public Tb_NivCaliPIP(String Cod_NivCaliPIP, String Desc_NivCaliPIP) {
        this.Cod_NivCaliPIP = Cod_NivCaliPIP;
        this.Desc_NivCaliPIP = Desc_NivCaliPIP;
    }

    /**
     * @return the Cod_NivCaliPIP
     */
    public String getCod_NivCaliPIP() {
        return Cod_NivCaliPIP;
    }

    /**
     * @param Cod_NivCaliPIP the Cod_NivCaliPIP to set
     */
    public void setCod_NivCaliPIP(String Cod_NivCaliPIP) {
        this.Cod_NivCaliPIP = Cod_NivCaliPIP;
    }

    /**
     * @return the Desc_NivCaliPIP
     */
    public String getDesc_NivCaliPIP() {
        return Desc_NivCaliPIP;
    }

    /**
     * @param Desc_NivCaliPIP the Desc_NivCaliPIP to set
     */
    public void setDesc_NivCaliPIP(String Desc_NivCaliPIP) {
        this.Desc_NivCaliPIP = Desc_NivCaliPIP;
    }
   
}
