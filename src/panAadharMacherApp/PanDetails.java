package panAadharMacherApp;

public class PanDetails {
    private String panNumber;
    private String aadharNumber;
    private String bankDetails;
    private String investments;

    public String getPanNumber() {
        return panNumber; 
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }


    @Override
    public String toString() {
        return "PanDetails{" +
                "panNumber='" + panNumber + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investments='" + investments + '\'' +
                '}';
    }

    public PanDetails(String panNumber, String aadharNumber, String bankDetails, String investments) {
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.bankDetails = bankDetails;
        this.investments = investments;
    }
}
