import java.util.Scanner;
import java.lang.Math;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y, b;
        double maxY, maxX;


        System.out.print("Enter b value: \n");

        System.out.print("Enter b value: ");

        b = sc.nextDouble();

        x = 0;
        maxY = Math.pow(x, 5) + b * x + Math.pow(b, 3);
        maxX = x;

        for (x = 2; x <= 10; x += 2) { 
            y = Math.pow(x, 5) + b * x + Math.pow(b, 3);

            if (y > maxY) { 
                maxY = y;
                maxX = x;
            }


            System.out.println("\n x: " + x + "; b: " + b + "; y: " + y);

            System.out.println("x: " + x + "; b: " + b + "; y: " + y);

        }

        System.out.println("Максимальне значення y: " + maxY + " при x = " + maxX);

        sc.close();
    }
}
