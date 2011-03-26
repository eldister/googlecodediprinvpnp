package dto;

public class UsuarioDTO {

    private String Usuario;
    private String Password;
    private String DNI;
    private String Grado;
    private String Nombres;
    private String ApePaterno;
    private String ApeMaterno;
    private GradoDTO TPCOD ;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String Usuario, String Password, String DNI, String Grado, String Nombres, String ApePaterno, String ApeMaterno, GradoDTO TPCOD) {
        this.Usuario = Usuario;
        this.Password = Password;
        this.DNI = DNI;
        this.Grado = Grado;
        this.Nombres = Nombres;
        this.ApePaterno = ApePaterno;
        this.ApeMaterno = ApeMaterno;
        this.TPCOD = TPCOD;
    }

    public String getApeMaterno() {
        return ApeMaterno;
    }

    public void setApeMaterno(String ApeMaterno) {
        this.ApeMaterno = ApeMaterno;
    }

    public String getApePaterno() {
        return ApePaterno;
    }

    public void setApePaterno(String ApePaterno) {
        this.ApePaterno = ApePaterno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public GradoDTO getTPCOD() {
        return TPCOD;
    }

    public void setTPCOD(GradoDTO TPCOD) {
        this.TPCOD = TPCOD;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

   
}
