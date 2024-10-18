package panAadharMacherApp;

public class AadharDetails {

    private String name;
    private String fatherName;
    private String address;
    private String aadharNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public AadharDetails(String name, String fatherName, String address) {
        this.aadharNo = aadharNo;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;

    }

    @Override
    public String toString() {
        return "AadharDetails{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", aadharNo='" + aadharNo + '\'' +
                '}';
    }
}
