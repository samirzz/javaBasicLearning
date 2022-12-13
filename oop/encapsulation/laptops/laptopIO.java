package oop.encapsulation.laptops;

import java.util.Scanner;

public class laptopIO {
    Scanner scanner = new Scanner(System.in);

    public String readData(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    public laptop readLaptopInfo() {
        String brand = readData("enter brand");
        String color = readData("enter color");
        int size = Integer.parseInt(readData("enter size"));
        String companyName = readData("enter companyName");
        laptop laptop= new laptop (brand,color,size,companyName);
        return laptop;
    }


    public void display(laptop laptop) {
        System.out.println("details");
        System.out.println("brand ="+laptop.getBrand());
        System.out.println("color ="+laptop.getColor());
        System.out.println("size ="+laptop.getSize()+"inch");
        System.out.println("companyName ="+laptop.getCompanyName());
    }
}
