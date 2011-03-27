

package dto;


public class TipDocDTO {
    private String CTip_Doc;
    private String TDoc;

    public TipDocDTO() {
    }

    public TipDocDTO(String CTip_Doc, String TDoc) {
        this.CTip_Doc = CTip_Doc;
        this.TDoc = TDoc;
    }

    /**
     * @return the CTip_Doc
     */
    public String getCTip_Doc() {
        return CTip_Doc;
    }

    /**
     * @param CTip_Doc the CTip_Doc to set
     */
    public void setCTip_Doc(String CTip_Doc) {
        this.CTip_Doc = CTip_Doc;
    }

    /**
     * @return the TDoc
     */
    public String getTDoc() {
        return TDoc;
    }

    /**
     * @param TDoc the TDoc to set
     */
    public void setTDoc(String TDoc) {
        this.TDoc = TDoc;
    }    
}
