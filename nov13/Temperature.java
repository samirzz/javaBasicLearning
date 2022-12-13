package classAndObject.nov13;

import java.util.Scanner;

public class Temperature {

    float celsius;
    float fahrenheit;

    public Temperature(float celsius, float fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose 1 for celsius");
        System.out.println("choose 2 for fahrenheit");
        float n = scanner.nextFloat();

        switch ((int) n) {
            case 1:
                System.out.println("enter the celsius scale ");
                float inputCelsius = scanner.nextFloat();
                Temperature t = new Temperature(inputCelsius,0.0f);
                t.celsiusToFahrenheit();
                System.out.println("celsius to fahrenheit is :: " + t.fahrenheit);
                break;
            case 2:
                System.out.println("enter the fahrenheit scale ");
                float inputFahrenheit = scanner.nextFloat();
                Temperature t1 = new Temperature(0.0f,inputFahrenheit);
                t1.fahrenheitToCelsius();
                System.out.println("fahrenheit to celsius is :: " + t1.celsius);
                break;
            default:
                System.out.println();
        }

    }

    public void celsiusToFahrenheit() {
//        fahrenheit= this.fahrenheit;
//        celsius=this.celsius;
        fahrenheit = ((celsius * 9) / 5) + 32;

    }

    public void fahrenheitToCelsius() {

       celsius = (fahrenheit - 32) * 5 / 9;

    }
}
