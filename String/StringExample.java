package String;

public class StringExample {
    public static void main(String[] args) {
        String name="string";
        System.out.println(name.concat("is equal"));
        name.concat("is not equal");
        System.out.println(name);
        String newName=name.concat("is same");
        System.out.println(newName);
    }

}
