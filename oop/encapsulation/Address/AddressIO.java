package oop.encapsulation.Address;

import java.util.Scanner;

public class AddressIO {
    Scanner sc = new Scanner(System.in);

    public String readData(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }


    public Address readAddress() {
        String countryName = readData("enter country name");
        String provinceName = readData("enter province name");
        String districtName = readData("enter district name");
        String localBodyName = readData("enter localBody name");
        int wardNumber = Integer.parseInt(readData("enter wardNumber"));
        String addressLine1 = readData("enter addressLine1");
        String addressLine2 = readData("enter addressLine1");
        Address address = new Address(countryName, provinceName,
                districtName, localBodyName,
                wardNumber, addressLine1, addressLine2);

        return address;
    }
    public void display(Address a){
        System.out.println("country="+a.getCountryName());
        System.out.println("province="+a.getProvinceName());
        System.out.println("district="+a.getDistrictName());
        System.out.println("localBody="+a.getLocalBodyName());
        System.out.println("wardNumber="+a.getWardNumber());
        System.out.println("address1="+a.getAddressLine1());
        System.out.println("address2="+a.getAddressLine2());

    }

}
