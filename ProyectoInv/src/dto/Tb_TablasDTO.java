/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author Administrador
 */
public class Tb_TablasDTO {
    private String Cod_CodTabla;
    private String Desc_CodTabla;

    public Tb_TablasDTO() {
    }

    public Tb_TablasDTO(String Cod_CodTabla, String Desc_CodTabla) {
        this.Cod_CodTabla = Cod_CodTabla;
        this.Desc_CodTabla = Desc_CodTabla;
    }

    /**
     * @return the Cod_CodTabla
     */
    public String getCod_CodTabla() {
        return Cod_CodTabla;
    }

    /**
     * @param Cod_CodTabla the Cod_CodTabla to set
     */
    public void setCod_CodTabla(String Cod_CodTabla) {
        this.Cod_CodTabla = Cod_CodTabla;
    }

    /**
     * @return the Desc_CodTabla
     */
    public String getDesc_CodTabla() {
        return Desc_CodTabla;
    }

    /**
     * @param Desc_CodTabla the Desc_CodTabla to set
     */
    public void setDesc_CodTabla(String Desc_CodTabla) {
        this.Desc_CodTabla = Desc_CodTabla;
    }
}
