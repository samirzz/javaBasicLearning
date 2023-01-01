package learningregex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter you email");
        String email = scanner.nextLine();
        String regexp = "^[a-zA-Z0-9.]+@+[a-z]+\\.[a-zA-z]{2,6}$";
        String regexpPassword = "^[[a-z]+[A-z]+[0-9][@$#]]{8,16}$";
        Pattern compile = Pattern.compile(regexp);
        if (compile.matcher(email).matches()) {
            System.out.println("enter password");
            String password = scanner.nextLine();
            if (password.matches(regexpPassword)) {
                System.out.println("*****logged in***");
            } else {
                System.out.println("please enter valid password");
            }

        } else {
            System.out.println("please enter valid email");
        }
    }
}

