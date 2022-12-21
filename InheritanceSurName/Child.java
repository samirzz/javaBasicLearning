package oop.InheritanceSurName;

import java.util.Scanner;

public class Child extends Father {

    public void childInfo(){
        System.out.println("enter child name");
        Scanner scanner= new Scanner(System.in);
        String str= scanner.nextLine();
        System.out.println("child name :: "+str+" "+super.surname);
    }

    public static void main(String[] args) {
        Child cd = new Child();
        cd.grandfatherInfo();
        cd.fatherInfo();
        cd.childInfo();

    }
}
