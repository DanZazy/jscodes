import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть кількість елементів: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Кількість повинна бути більше нуля.");
            sc.close();
            return;
        }

        int[] mass = new int[n];
        Integer prevSign = null;
        int signChangeCount = 0;

        // Заповнення масиву значеннями, введеними користувачем
        for (int i = 0; i < n; i++) {
            System.out.print("Введіть елемент " + (i + 1) + ": ");
            mass[i] = sc.nextInt();

            int currentSign = Integer.compare(mass[i], 0);

            if (prevSign != null && currentSign != 0 && currentSign != prevSign) {
                signChangeCount++; // фіксуємо зміну знаку
            }
            

            if (currentSign != 0) {
                prevSign = currentSign; // оновлюємо знак, якщо число не нуль
            }
        }

        // Виведення елементів масиву
        System.out.println("\n Елементи масиву:");
        for (int i = 0; i < n; i++) {
            System.out.println("Елемент " + (i + 1) + ": " + mass[i]);
        }

        // Виведення кількості змін знаку
        System.out.println("\n Кількість змін знаку: " + signChangeCount);

        sc.close();
    }
}

