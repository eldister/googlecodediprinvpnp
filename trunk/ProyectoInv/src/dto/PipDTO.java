
package dto;

import java.sql.Date;


public class PipDTO {
    private String Cod_PIP;
    private String SNIP;
    private Date FechSNIP;
    private String Nom_Proinv;
    private departamentoDTO Cod_Dpto;
    private provinciaDTO Cod_Prov;
    private distritoDTO Cod_Dist;
    private String LocaliPNP;
    private String DireccPNP;
    private String DivisionPNP;
    private String Comisaria;
    private String OtrosPNP;
    private Double Est_ExpTec;
    private Double Obra_Civ;
    private Double Supervision;
    private Double Equipamiento;
    private Double Capacitacion;
    private Double Otros_Imp;
    private Double Fuente_Fina;
    private Tb_NivEstPIP Cod_NivEstPIP;  
    private Tb_NivCaliPIP Cod_NivCaliPIP;
    private Tb_SituPIP Situacion;        

    public PipDTO() {
    }

    public PipDTO(String Cod_PIP, String SNIP, Date FechSNIP, String Nom_Proinv, departamentoDTO Cod_Dpto, provinciaDTO Cod_Prov, distritoDTO Cod_Dist, String LocaliPNP, String UbicaPNP, String DireccPNP, String DivisionPNP, String Comisaria, String OtrosPNP, Double Est_ExpTec, Double Obra_Civ, Double Supervision, Double Equipamiento, Double Capacitacion, Double Otros_Imp, Double Fuente_Fina, Tb_NivEstPIP Cod_NivEstPIP, Tb_NivCaliPIP Cod_NivCaliPIP, Tb_SituPIP Situacion) {
        this.Cod_PIP = Cod_PIP;
        this.SNIP = SNIP;
        this.FechSNIP = FechSNIP;
        this.Nom_Proinv = Nom_Proinv;
        this.Cod_Dpto = Cod_Dpto;
        this.Cod_Prov = Cod_Prov;
        this.Cod_Dist = Cod_Dist;
        this.LocaliPNP = LocaliPNP;
        this.DireccPNP = DireccPNP;
        this.DivisionPNP = DivisionPNP;
        this.Comisaria = Comisaria;
        this.OtrosPNP = OtrosPNP;
        this.Est_ExpTec = Est_ExpTec;
        this.Obra_Civ = Obra_Civ;
        this.Supervision = Supervision;
        this.Equipamiento = Equipamiento;
        this.Capacitacion = Capacitacion;
        this.Otros_Imp = Otros_Imp;
        this.Fuente_Fina = Fuente_Fina;
        this.Cod_NivEstPIP = Cod_NivEstPIP;
        this.Cod_NivCaliPIP = Cod_NivCaliPIP;
        this.Situacion = Situacion;
    }

    public Double getCapacitacion() {
        return Capacitacion;
    }

    public void setCapacitacion(Double Capacitacion) {
        this.Capacitacion = Capacitacion;
    }

    public distritoDTO getCod_Dist() {
        return Cod_Dist;
    }

    public void setCod_Dist(distritoDTO Cod_Dist) {
        this.Cod_Dist = Cod_Dist;
    }

    public departamentoDTO getCod_Dpto() {
        return Cod_Dpto;
    }

    public void setCod_Dpto(departamentoDTO Cod_Dpto) {
        this.Cod_Dpto = Cod_Dpto;
    }

    public Tb_NivCaliPIP getCod_NivCaliPIP() {
        return Cod_NivCaliPIP;
    }

    public void setCod_NivCaliPIP(Tb_NivCaliPIP Cod_NivCaliPIP) {
        this.Cod_NivCaliPIP = Cod_NivCaliPIP;
    }

    public Tb_NivEstPIP getCod_NivEstPIP() {
        return Cod_NivEstPIP;
    }

    public void setCod_NivEstPIP(Tb_NivEstPIP Cod_NivEstPIP) {
        this.Cod_NivEstPIP = Cod_NivEstPIP;
    }

    public String getCod_PIP() {
        return Cod_PIP;
    }

    public void setCod_PIP(String Cod_PIP) {
        this.Cod_PIP = Cod_PIP;
    }

    public provinciaDTO getCod_Prov() {
        return Cod_Prov;
    }

    public void setCod_Prov(provinciaDTO Cod_Prov) {
        this.Cod_Prov = Cod_Prov;
    }

    public String getComisaria() {
        return Comisaria;
    }

    public void setComisaria(String Comisaria) {
        this.Comisaria = Comisaria;
    }

    public String getDireccPNP() {
        return DireccPNP;
    }

    public void setDireccPNP(String DireccPNP) {
        this.DireccPNP = DireccPNP;
    }

    public String getDivisionPNP() {
        return DivisionPNP;
    }

    public void setDivisionPNP(String DivisionPNP) {
        this.DivisionPNP = DivisionPNP;
    }

    public Double getEquipamiento() {
        return Equipamiento;
    }

    public void setEquipamiento(Double Equipamiento) {
        this.Equipamiento = Equipamiento;
    }

    public Double getEst_ExpTec() {
        return Est_ExpTec;
    }

    public void setEst_ExpTec(Double Est_ExpTec) {
        this.Est_ExpTec = Est_ExpTec;
    }

    public Date getFechSNIP() {
        return FechSNIP;
    }

    public void setFechSNIP(Date FechSNIP) {
        this.FechSNIP = FechSNIP;
    }

    public Double getFuente_Fina() {
        return Fuente_Fina;
    }

    public void setFuente_Fina(Double Fuente_Fina) {
        this.Fuente_Fina = Fuente_Fina;
    }

    public String getLocaliPNP() {
        return LocaliPNP;
    }

    public void setLocaliPNP(String LocaliPNP) {
        this.LocaliPNP = LocaliPNP;
    }

    public String getNom_Proinv() {
        return Nom_Proinv;
    }

    public void setNom_Proinv(String Nom_Proinv) {
        this.Nom_Proinv = Nom_Proinv;
    }

    public Double getObra_Civ() {
        return Obra_Civ;
    }

    public void setObra_Civ(Double Obra_Civ) {
        this.Obra_Civ = Obra_Civ;
    }

    public String getOtrosPNP() {
        return OtrosPNP;
    }

    public void setOtrosPNP(String OtrosPNP) {
        this.OtrosPNP = OtrosPNP;
    }

    public Double getOtros_Imp() {
        return Otros_Imp;
    }

    public void setOtros_Imp(Double Otros_Imp) {
        this.Otros_Imp = Otros_Imp;
    }

    public String getSNIP() {
        return SNIP;
    }

    public void setSNIP(String SNIP) {
        this.SNIP = SNIP;
    }

    public Tb_SituPIP getSituacion() {
        return Situacion;
    }

    public void setSituacion(Tb_SituPIP Situacion) {
        this.Situacion = Situacion;
    }

    public Double getSupervision() {
        return Supervision;
    }

    public void setSupervision(Double Supervision) {
        this.Supervision = Supervision;
    }

}
