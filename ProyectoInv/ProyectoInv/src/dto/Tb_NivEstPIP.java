/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author ealfriadezy
 */
public class Tb_NivEstPIP {
    private String Cod_EstPIP;
    private String Desc_NivPIP;

    public Tb_NivEstPIP() {
    }

    public Tb_NivEstPIP(String Cod_EstPIP, String Desc_NivPIP) {
        this.Cod_EstPIP = Cod_EstPIP;
        this.Desc_NivPIP = Desc_NivPIP;
    }

    /**
     * @return the Cod_EstPIP
     */
    public String getCod_EstPIP() {
        return Cod_EstPIP;
    }

    /**
     * @param Cod_EstPIP the Cod_EstPIP to set
     */
    public void setCod_EstPIP(String Cod_EstPIP) {
        this.Cod_EstPIP = Cod_EstPIP;
    }

    /**
     * @return the Desc_NivPIP
     */
    public String getDesc_NivPIP() {
        return Desc_NivPIP;
    }

    /**
     * @param Desc_NivPIP the Desc_NivPIP to set
     */
    public void setDesc_NivPIP(String Desc_NivPIP) {
        this.Desc_NivPIP = Desc_NivPIP;
    }    
}
