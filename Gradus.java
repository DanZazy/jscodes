import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Gradus {
    public static void main (String[] args) throws IOException  {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, enter temperature in Celsius: ");
        
        Float T = Float.parseFloat(input.readLine());

        System.out.println("Calculated temperature in Fahrenheit: " + (T * 9 / 5 + 32));

    }
}
