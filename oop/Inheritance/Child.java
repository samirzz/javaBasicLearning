package oop.Inheritance;

public class Child extends Parent{
    public static void son() {

        System.out.println("This is child");
    }

    public static void main(String[] args) {
//      With creating object
//        Child c1= new Child();
//        c1.father();
//        c1.son();
        //without creating object
        Child.father();
        Child.son();
    }
}
