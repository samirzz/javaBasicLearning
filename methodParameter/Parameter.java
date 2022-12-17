package methodParamater;

public class Parameter {
    static int a = 1;

    public static int num(int a) {
        return a + 1;
    }

    public static void main(String[] args) {
        //call by value
        System.out.println(Parameter.num(3));
        //call by reference
        System.out.println(Parameter.a );
    }
//overloading
    public int num(Parameter p1) {
        p1.a = a + 1;
        return p1.a;
    }

}
