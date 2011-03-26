package dto;

public class CoordinadorDTO {

    private String CodCoordinador;
    private String Nombre;
    private GradoDTO TPCOD;

    public CoordinadorDTO() {
    }

    public CoordinadorDTO(String CodCoordinador, String Nombre, GradoDTO TPCOD) {
        this.CodCoordinador = CodCoordinador;
        this.Nombre = Nombre;
        this.TPCOD = TPCOD;
    }

    public String getCodCoordinador() {
        return CodCoordinador;
    }

    public void setCodCoordinador(String CodCoordinador) {
        this.CodCoordinador = CodCoordinador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public GradoDTO getTPCOD() {
        return TPCOD;
    }

    public void setTPCOD(GradoDTO TPCOD) {
        this.TPCOD = TPCOD;
    }

}
