package oop.encapsulation.laptops;

public class LaptopProgram {
    public static void main(String[] args) {
        laptopIO laptopIO= new laptopIO();
        laptop laptop=laptopIO.readLaptopInfo();
        laptopIO.display(laptop);
    }
}
