package dto;

public class UnidadFormuladoraDTO {
String persRespon;
String sector;
String pliego;
String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersRespon() {
        return persRespon;
    }

    public void setPersRespon(String persRespon) {
        this.persRespon = persRespon;
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
