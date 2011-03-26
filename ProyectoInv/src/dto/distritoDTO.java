package dto;

public class distritoDTO {

    private String Cod_dist;
    private String Cod_Prov;
    private String Cod_Dpto;
    private String NombreDIS;

    public distritoDTO(String Cod_dist, String Cod_Prov, String Cod_Dpto, String NombreDIS) {
        this.Cod_dist = Cod_dist;
        this.Cod_Prov = Cod_Prov;
        this.Cod_Dpto = Cod_Dpto;
        this.NombreDIS = NombreDIS;
    }

    public distritoDTO() {
    }

    public String getCod_Dpto() {
        return Cod_Dpto;
    }

    public void setCod_Dpto(String Cod_Dpto) {
        this.Cod_Dpto = Cod_Dpto;
    }

    public String getCod_Prov() {
        return Cod_Prov;
    }

    public void setCod_Prov(String Cod_Prov) {
        this.Cod_Prov = Cod_Prov;
    }

    public String getCod_dist() {
        return Cod_dist;
    }

    public void setCod_dist(String Cod_dist) {
        this.Cod_dist = Cod_dist;
    }

    public String getNombreDIS() {
        return NombreDIS;
    }

    public void setNombreDIS(String NombreDIS) {
        this.NombreDIS = NombreDIS;
    }
}
