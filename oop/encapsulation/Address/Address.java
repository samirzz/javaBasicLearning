package oop.encapsulation.Address;

public class Address {
    private String countryName;
    private String provinceName;
    private String districtName;
    private String localBodyName;
    private int wardNumber;
    private String addressLine1;
    private String addressLine2;


    public String getCountryName() {
        return countryName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getLocalBodyName() {
        return localBodyName;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public Address(String countryName, String provinceName, String districtName, String localBodyName, int wardNumber, String addressLine1, String addressLine2) {
        this.countryName = countryName;
        this.provinceName = provinceName;
        this.districtName = districtName;
        this.localBodyName = localBodyName;
        this.wardNumber = wardNumber;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }
}
