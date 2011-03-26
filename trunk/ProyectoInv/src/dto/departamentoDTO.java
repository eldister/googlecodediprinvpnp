
package dto;

public class departamentoDTO {
    private String Cod_Dpto;
    private String NombreDpto;

     public departamentoDTO(String Cod_Dpto, String NombreDpto) {
        this.Cod_Dpto = Cod_Dpto;
        this.NombreDpto = NombreDpto;
    }

    public departamentoDTO() {
    }


    public String getCod_Dpto() {
        return Cod_Dpto;
    }

    public void setCod_Dpto(String Cod_Dpto) {
        this.Cod_Dpto = Cod_Dpto;
    }

    public String getNombreDpto() {
        return NombreDpto;
    }

    public void setNombreDpto(String NombreDpto) {
        this.NombreDpto = NombreDpto;
    }
}


  
