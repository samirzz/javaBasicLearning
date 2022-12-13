package oop.Inheritance;

public class square1 extends Rectangle1 {
    public void print()
    {
        System.out.println("Square is rectangle");
    }
    public void RectanglePrint(){
        super.print();
    }
    public void ShapePrint(){
        super.print();
    }

    public static void main(String[] args) {
        square1 square1= new square1();
        square1.print();
        square1.RectanglePrint();

    }
}
