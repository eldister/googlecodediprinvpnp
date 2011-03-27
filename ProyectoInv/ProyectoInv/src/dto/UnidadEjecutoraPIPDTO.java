package dto;

public class UnidadEjecutoraPIPDTO {
String persResp;
String sector;
String pliego;
String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersResp() {
        return persResp;
    }

    public void setPersResp(String persResp) {
        this.persResp = persResp;
    }

    public String getPliego() {
        return pliego;
    }

    public void setPliego(String pliego) {
        this.pliego = pliego;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
