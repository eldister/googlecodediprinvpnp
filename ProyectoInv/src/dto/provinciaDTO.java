package dto;

public class provinciaDTO {

    private String Cod_Prov;
    private String Cod_Dpto;
    private String NombreProv;

    public provinciaDTO(String Cod_Prov, String Cod_Dpto, String NombreProv) {
        this.Cod_Prov = Cod_Prov;
        this.Cod_Dpto = Cod_Dpto;
        this.NombreProv = NombreProv;
    }

    public provinciaDTO() {
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

    public String getNombreProv() {
        return NombreProv;
    }

    public void setNombreProv(String NombreProv) {
        this.NombreProv = NombreProv;
    }
}
