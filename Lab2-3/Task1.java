import java.util.Scanner;
import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть значення c: ");
        double c = sc.nextDouble();

        double h_a = 0.25 * c; // Крок зміни a

        // Перебір значень a від c до 0 із кроком h_a
        for (double a = c; a >= 0; a += h_a) {
            double sinSquared = Math.pow(Math.sin(a), 2);
            
            if (sinSquared > 0) { // Перевірка, щоб не було log(0) або log(від'ємного числа)
                double y = a / Math.log(sinSquared);
                System.out.println("a: " + a + ", y: " + y);
            } else {
                System.out.println("a: " + a + " - некоректне значення log, пропуск...");
            }
        }

        sc.close(); // Закриваємо сканер
    }
}
