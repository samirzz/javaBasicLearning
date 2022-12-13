package oop.Calculator;

import java.util.Scanner;

public class UserInput {
    Scanner sc= new Scanner(System.in);
    public float readData(float msg){
        System.out.println(msg);
        return sc.nextInt();
    }
}
