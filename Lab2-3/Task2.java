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

        // Початкові значення
        double minY = Double.POSITIVE_INFINITY; // Ініціалізація мінімального значення
        double xMin = 0; // Значення x, при якому досягається мінімум

        // Інтервал [0, 10] з кроком h = 2
        for (x = 0; x <= 10; x += 2) {
            // Обчислення значення функції y = x^5 + a*x + b^3
            double y = Math.pow(x, 5) + a * x + Math.pow(b, 3);

            System.out.println("x: "+x);

            // Оновлення мінімального значення, якщо знайдено менше
            if (y < minY) {
                minY = y;
                xMin = x;
            }
        }

        // Виведення результату
        System.out.println("Мінімальне значення y = " + minY + " при x = " + xMin);

        scanner.close();
    }
}