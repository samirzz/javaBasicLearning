package learningregex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String email = "";
        String password = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your email");
        email = scanner.nextLine();

        String regexp = "^[a-zA-Z0-9.]+@+[a-z]+\\.[a-zA-z]{2,6}$";
        String regexpPassword="^[[a-z]+[A-z]+[0-9][@$#]]{8,16}$";
        Pattern compile = Pattern.compile(regexp);
        if (compile.matcher(email).matches()) {
            System.out.println("enter password");
            password = scanner.nextLine();
            if (password.matches(regexpPassword)) {
                System.out.println("Logged in successfully");
            } else {
                System.out.println("Password incorrect!! Try again ");
            }

        } else {
            System.out.println("not valid email");
        }


    }


}
