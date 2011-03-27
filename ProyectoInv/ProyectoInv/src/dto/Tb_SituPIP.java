/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author Eleazar
 */
public class Tb_SituPIP {
    private String Cod_SituPIP;
    private String Des_SituPIP;

    public Tb_SituPIP() {
    }

    public Tb_SituPIP(String Cod_SituPIP, String Des_SituPIP) {
        this.Cod_SituPIP = Cod_SituPIP;
        this.Des_SituPIP = Des_SituPIP;
    }

    /**
     * @return the Cod_SituPIP
     */
    public String getCod_SituPIP() {
        return Cod_SituPIP;
    }

    /**
     * @param Cod_SituPIP the Cod_SituPIP to set
     */
    public void setCod_SituPIP(String Cod_SituPIP) {
        this.Cod_SituPIP = Cod_SituPIP;
    }

    /**
     * @return the Des_SituPIP
     */
    public String getDes_SituPIP() {
        return Des_SituPIP;
    }

    /**
     * @param Des_SituPIP the Des_SituPIP to set
     */
    public void setDes_SituPIP(String Des_SituPIP) {
        this.Des_SituPIP = Des_SituPIP;
    }
}
