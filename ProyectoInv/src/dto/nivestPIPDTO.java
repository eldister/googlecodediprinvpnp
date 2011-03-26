package dto;

class nivestPIPDTO {

    private String Cod_EstPIP;
    private String Desc_NivPIP;

    public nivestPIPDTO(String Cod_EstPIP, String Desc_NivPIP) {
        this.Cod_EstPIP = Cod_EstPIP;
        this.Desc_NivPIP = Desc_NivPIP;
    }

    public String getCod_EstPIP() {
        return Cod_EstPIP;
    }

    public void setCod_EstPIP(String Cod_EstPIP) {
        this.Cod_EstPIP = Cod_EstPIP;
    }

    public String getDesc_NivPIP() {
        return Desc_NivPIP;
    }

    public void setDesc_NivPIP(String Desc_NivPIP) {
        this.Desc_NivPIP = Desc_NivPIP;
    }

}
