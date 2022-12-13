package oop.encapsulation.laptops;

public class laptop {
   private String brand;
   private String color;
   private int size;
   private String companyName;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getCompanyName() {
        return companyName;
    }

    public laptop(String brand, String color, int size, String companyName) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.companyName = companyName;
    }
    public void display(laptop lp){
        System.out.println("brand = "+lp.getBrand());
        System.out.println("color = "+lp.getColor());
        System.out.println("size =  "+lp.getSize());
        System.out.println("company name ="+lp.getCompanyName());


    }
}
