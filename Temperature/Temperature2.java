package classAndObject.nov13;

public class Temperature2 {
    float temperature;

    public Temperature2(float temperature) {
        this.temperature = temperature;
    }
    public void celsiusToFahrenheit(){
      float fahrenheit = (temperature - 32) * 5 / 9;
        System.out.println("fahrenheit ::" + fahrenheit+" "+"F");
    }
    public void fahrenheitToCelsius(){
       float celsius = ((temperature * 9) / 5) + 32;
        System.out.println("celsius :: "+ celsius+"C");

    }
}
