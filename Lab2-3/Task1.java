import java.util.Scanner;
import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter c value (negative): \n");

        System.out.print("Enter c value (negative): ");

        double c = sc.nextDouble();
        
        sc.close();

        if (c >= 0) {
            System.out.println("Error: c must be negative.");
            return;
        }
        
        double ha = 0.25 * Math.abs(c);
        double a;


        for (a = c; a < 0; a += ha) {
            double d = Math.pow(Math.sin(a), 2);
            
            if (d > 0) { 
                double y = a / Math.log(d);
                System.out.println("a: " + a + ", y: " + y);
            } else {
                System.out.println("Error: d value is zero or negative.");

            }
        }


        for (a = c; a < 0; a += ha) { // Рухаємося до 0

            double denominator = Math.pow(Math.sin(a), 2);
            
            if (denominator > 0) { 
                double y = a / Math.log(denominator);
                System.out.println("a: " + a + ", y: " + y);
            } else {
                System.out.println("Error: Denominator is zero or negative.");

            }

            if (a + ha >= 0) break;

        }
        sc.close();
    }
}
 

