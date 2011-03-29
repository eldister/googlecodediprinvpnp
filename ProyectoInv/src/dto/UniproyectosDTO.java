
package dto;


public class UniproyectosDTO {
    private String Cod_UniPIP;
    private String Cod_CIP;
    private Tb_NomuniII Cod_NomUni; /**TABLA RELACIONADA**/
    private String Sector;
    private String Pliego;
    private String NomUni;
    private PipDTO Cod_PIP;         /**TABLA RELACIONADA**/

    public UniproyectosDTO() {
    }

    public UniproyectosDTO(String Cod_UniPIP, String Cod_CIP, Tb_NomuniII Cod_NomUni, String Sector, String Pliego, String NomUni, PipDTO Cod_PIP) {
        this.Cod_UniPIP = Cod_UniPIP;
        this.Cod_CIP = Cod_CIP;
        this.Cod_NomUni = Cod_NomUni;
        this.Sector = Sector;
        this.Pliego = Pliego;
        this.NomUni = NomUni;
        this.Cod_PIP = Cod_PIP;
    }

    public String getCod_UniPIP() {
        return Cod_UniPIP;
    }

    public void setCod_UniPIP(String Cod_UniPIP) {
        this.Cod_UniPIP = Cod_UniPIP;
    }

    public String getCod_CIP() {
        return Cod_CIP;
    }

    public void setCod_CIP(String Cod_CIP) {
        this.Cod_CIP = Cod_CIP;
    }

    public Tb_NomuniII getCod_NomUni() {
        return Cod_NomUni;
    }

    public void setCod_NomUni(Tb_NomuniII Cod_NomUni) {
        this.Cod_NomUni = Cod_NomUni;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    public String getPliego() {
        return Pliego;
    }

    public void setPliego(String Pliego) {
        this.Pliego = Pliego;
    }

    public String getNomUni() {
        return NomUni;
    }

    public void setNomUni(String NomUni) {
        this.NomUni = NomUni;
    }

    public PipDTO getCod_PIP() {
        return Cod_PIP;
    }

    public void setCod_PIP(PipDTO Cod_PIP) {
        this.Cod_PIP = Cod_PIP;
    }   
}
