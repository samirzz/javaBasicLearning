package oop;

import java.util.Scanner;

public class UserIo {
    Scanner sc = new Scanner(System.in);
    public String readData(String msg) {
        System.out.println(msg);
        return  sc.nextLine();
    }


}
