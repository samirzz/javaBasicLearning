package oop.Inheritance;

public class Rectangle {
    protected float length;
    protected float breadth;
public float rectArea(){
   // float area= length*breadth;
    return length*breadth;
}
public float rectPerimeter(){
    return 2*(length+breadth);
}

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}
