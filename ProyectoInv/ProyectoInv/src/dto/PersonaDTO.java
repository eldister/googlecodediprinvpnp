package dto;

public class PersonaDTO {

    private String Cod_DocIdent;
    private String Nombre;
    private String ApePaterno;
    private String ApeMaterno;
    private String RazSocial;
    private String Direcc;
    private String Email;
    private String Telef;
    private String Celular;

    public PersonaDTO() {
    }

    public PersonaDTO(String Cod_DocIdent, String Nombre, String ApePaterno, String ApeMaterno, String RazSocial, String Direcc, String Email, String Telef, String Celular) {
        this.Cod_DocIdent = Cod_DocIdent;
        this.Nombre = Nombre;
        this.ApePaterno = ApePaterno;
        this.ApeMaterno = ApeMaterno;
        this.RazSocial = RazSocial;
        this.Direcc = Direcc;
        this.Email = Email;
        this.Telef = Telef;
        this.Celular = Celular;
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

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCod_DocIdent() {
        return Cod_DocIdent;
    }

    public void setCod_DocIdent(String Cod_DocIdent) {
        this.Cod_DocIdent = Cod_DocIdent;
    }

    public String getDirecc() {
        return Direcc;
    }

    public void setDirecc(String Direcc) {
        this.Direcc = Direcc;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRazSocial() {
        return RazSocial;
    }

    public void setRazSocial(String RazSocial) {
        this.RazSocial = RazSocial;
    }

    public String getTelef() {
        return Telef;
    }

    public void setTelef(String Telef) {
        this.Telef = Telef;
    }
}
