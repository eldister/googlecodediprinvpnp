package dto;

public class LoginDTO {

    private String Usuario;
    private String Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public LoginDTO(String Usuario, String Password) {

        this.Usuario = Usuario;
        this.Password = Password;
    }
}
