package oop.Inheritance;

import java.util.Scanner;

public class Square extends Rectangle{


    public Square(float length,float breadth) {
        super(length, breadth);
    }

    public float squareArea(){
        return length*length;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter length");
        int length= (int) scanner.nextFloat();
        System.out.println("enter length");
        int breadth= (int) scanner.nextFloat();
        Square sq= new Square(length,breadth);
        System.out.println("the area is = " +sq.rectArea());
        System.out.println("the perimeter is = "+sq.rectPerimeter());
        System.out.println("the square is = "+sq.squareArea());
    }



}
