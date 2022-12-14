package FiboSeries;

import java.util.Scanner;

public class Term {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (fibo(n - 1) + fibo(n - 2));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term ");
        int n = sc.nextInt();
        String termNotation;
        if (n % 10 == 1) termNotation = "st";
        else if (n % 10 == 2) termNotation = "nd";
        else if (n % 10 == 3) termNotation = "rd";
        else termNotation = "th";


        System.out.println("the " + n + termNotation + " term is :: " + fibo(n));
    }
}