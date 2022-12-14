package classAndObject.nov13;

import java.util.Scanner;

public class TemperatureProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter temperature");
        float temp = scanner.nextFloat();
        Temperature2 tp = new Temperature2(temp);
        while (true){
            System.out.println("enter 1 for celsius");
            System.out.println("enter 2 for fahrenheit");
            System.out.println("enter 3 for exit ");
          int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    tp.fahrenheitToCelsius();
                    break;
                case 2:
                    tp.celsiusToFahrenheit();
                    break;
                case 3:
                    System.exit(0);

                default:
                    System.out.println("invalid !!");

            }
        }
    }
}
