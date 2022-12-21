package oop.InheritanceSurName;

import java.util.Scanner;

public class GrandFather {
    String surname = "Bhandari";

    public void grandfatherInfo() {
        System.out.println("enter Grandfather name");
       Scanner scanner= new Scanner(System.in);
       String str= scanner.nextLine();
        System.out.println("Grandfather name :: " + str + " " + surname);
    }

}
