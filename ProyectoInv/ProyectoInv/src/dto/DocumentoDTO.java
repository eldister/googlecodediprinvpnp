
package dto;

import java.sql.Date;

public class DocumentoDTO {
    private String NroRegistro;
    private TipDocDTO CTip_Doc ;
    private String Nro_Doc;
    private String Siglas;
    private Date FechReg;


    public DocumentoDTO() {
    }

    public DocumentoDTO(String NroRegistro, TipDocDTO CTip_Doc, String Nro_Doc, String Siglas, Date FechReg) {
        this.NroRegistro = NroRegistro;
        this.CTip_Doc = CTip_Doc;
        this.Nro_Doc = Nro_Doc;
        this.Siglas = Siglas;
        this.FechReg = FechReg;
    }

    public String getNroRegistro() {
        return NroRegistro;
    }

    public void setNroRegistro(String NroRegistro) {
        this.NroRegistro = NroRegistro;
    }

    public TipDocDTO getCTip_Doc() {
        return CTip_Doc;
    }

    public void setCTip_Doc(TipDocDTO CTip_Doc) {
        this.CTip_Doc = CTip_Doc;
    }

    public String getNro_Doc() {
        return Nro_Doc;
    }

    public void setNro_Doc(String Nro_Doc) {
        this.Nro_Doc = Nro_Doc;
    }

    public String getSiglas() {
        return Siglas;
    }

    public void setSiglas(String Siglas) {
        this.Siglas = Siglas;
    }

    public Date getFechReg() {
        return FechReg;
    }

    public void setFechReg(Date FechReg) {
        this.FechReg = FechReg;
    }


}
