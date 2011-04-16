/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author Administrador
 */
public class Tb_UsuarioDTO {
    private String Cod_ID_Usu;
    private String Cip_Usuario;
    private String MA98;
    private String TPCOR;
    private String MA13;
    private String Password;

    public Tb_UsuarioDTO() {
    }

    public Tb_UsuarioDTO(String Cod_ID_Usu, String Cip_Usuario, String MA98, String TPCOR, String MA13, String Password) {
        this.Cod_ID_Usu = Cod_ID_Usu;
        this.Cip_Usuario = Cip_Usuario;
        this.MA98 = MA98;
        this.TPCOR = TPCOR;
        this.MA13 = MA13;
        this.Password = Password;
    }

    /**
     * @return the Cod_ID_Usu
     */
    public String getCod_ID_Usu() {
        return Cod_ID_Usu;
    }

    /**
     * @param Cod_ID_Usu the Cod_ID_Usu to set
     */
    public void setCod_ID_Usu(String Cod_ID_Usu) {
        this.Cod_ID_Usu = Cod_ID_Usu;
    }

    /**
     * @return the Cip_Usuario
     */
    public String getCip_Usuario() {
        return Cip_Usuario;
    }

    /**
     * @param Cip_Usuario the Cip_Usuario to set
     */
    public void setCip_Usuario(String Cip_Usuario) {
        this.Cip_Usuario = Cip_Usuario;
    }

    /**
     * @return the MA98
     */
    public String getMA98() {
        return MA98;
    }

    /**
     * @param MA98 the MA98 to set
     */
    public void setMA98(String MA98) {
        this.MA98 = MA98;
    }

    /**
     * @return the TPCOR
     */
    public String getTPCOR() {
        return TPCOR;
    }

    /**
     * @param TPCOR the TPCOR to set
     */
    public void setTPCOR(String TPCOR) {
        this.TPCOR = TPCOR;
    }

    /**
     * @return the MA13
     */
    public String getMA13() {
        return MA13;
    }

    /**
     * @param MA13 the MA13 to set
     */
    public void setMA13(String MA13) {
        this.MA13 = MA13;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
}
