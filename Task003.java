import java.util.Scanner;


public class Task003 {
    public static void main(String[] args) {
        System.out.print("Type a temperature in Celcius to convert to Fahrenheit: ");
        
        Scanner input = new Scanner(System.in);
        double celciusTemperature = input.nextDouble();
        double fahrenheitTemperature =  ((celciusTemperature*1.8)+32);
        input.close();

        System.out.println(String.format(
            """
            Celcius temperature: %.1f
            Farenheit temperature : %.1f    
            """
        .formatted(celciusTemperature, fahrenheitTemperature)));
        
        input.close();
    }
}
