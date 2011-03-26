
package dto;

public class GradoDTO {
private String TPCOD;
private String TPCOR;

    public GradoDTO() {
    }

    public GradoDTO(String TPCOD, String TPCOR) {
        this.TPCOD = TPCOD;
        this.TPCOR = TPCOR;
    }

    public String getTPCOD() {
        return TPCOD;
    }

    public void setTPCOD(String TPCOD) {
        this.TPCOD = TPCOD;
    }

    public String getTPCOR() {
        return TPCOR;
    }

    public void setTPCOR(String TPCOR) {
        this.TPCOR = TPCOR;
    }

}
