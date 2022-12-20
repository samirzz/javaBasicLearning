package oop.InheritanceSurName;

public class Child extends Father {
    String name ="Samir";
    public void childInfo(){
        System.out.println("Full name :: "+name+" "+super.surname);
    }

    public static void main(String[] args) {
        Child cd = new Child();
        cd.grandfatherInfo();
        cd.fatherInfo();
        cd.childInfo();

    }
}
