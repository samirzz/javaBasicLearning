package oop.encapsulation.Address;

public class AddressProgram {
    public static void main(String[] args) {
        AddressIO addressIO = new AddressIO();
        Address address = addressIO.readAddress();
        addressIO.display(address);
    }
}
