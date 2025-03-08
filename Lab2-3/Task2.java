import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        double minY = Double.POSITIVE_INFINITY;
        double xMin = 0;

        for (x = 0; x <= 10; x += 2) {
            double y = Math.pow(x, 5) + a * x + Math.pow(b, 3);

            System.out.println("x: "+x);

            if (y < minY) {
                minY = y;
                xMin = x;
            }
        }

        System.out.println("Мінімальне значення y = " + minY + " при x = " + xMin);

        scanner.close();
    }
}