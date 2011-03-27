package dto;

class nivcaliPIPDTO {

    private String Cod_NivCaliPIP;
    private String Desc_NivCaliPIP;

    public nivcaliPIPDTO(String Cod_NivCaliPIP, String Desc_NivCaliPIP) {
        this.Cod_NivCaliPIP = Cod_NivCaliPIP;
        this.Desc_NivCaliPIP = Desc_NivCaliPIP;
    }

    public String getCod_NivCaliPIP() {
        return Cod_NivCaliPIP;
    }

    public void setCod_NivCaliPIP(String Cod_NivCaliPIP) {
        this.Cod_NivCaliPIP = Cod_NivCaliPIP;
    }

    public String getDesc_NivCaliPIP() {
        return Desc_NivCaliPIP;
    }

    public void setDesc_NivCaliPIP(String Desc_NivCaliPIP) {
        this.Desc_NivCaliPIP = Desc_NivCaliPIP;
    }
}
