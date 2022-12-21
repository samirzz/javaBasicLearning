package oop.InheritanceSurName;

import java.util.Scanner;

public class Father extends GrandFather{

    public void fatherInfo(){
        System.out.println("Enter father name");
        Scanner scanner= new Scanner(System.in);
        String str= scanner.nextLine();
        System.out.println("Father name :: "+str+" "+super.surname);
    }


}
