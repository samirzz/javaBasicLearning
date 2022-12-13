package oop;

import java.util.Scanner;

public class EncapsulationProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("enter address");
        sc.nextLine();
        String address = sc.nextLine();
        Encapsulation En = new Encapsulation();
        En.setAddress(address);
        En.setName(name);
        En.setAge(age);
        System.out.println(En.getName());
        System.out.println(En.getAge());
        System.out.println(En.getAddress());

    }
}
