
package dto;

import java.util.Date;

public class ProyectoInvDTO {
Integer codSnip;
Date fecha;
String nomProy;

    public Integer getCodSnip() {
        return codSnip;
    }

    public void setCodSnip(Integer codSnip) {
        this.codSnip = codSnip;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNomProy() {
        return nomProy;
    }

    public void setNomProy(String nomProy) {
        this.nomProy = nomProy;
    }
}
