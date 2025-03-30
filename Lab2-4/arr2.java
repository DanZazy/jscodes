import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Введіть кількість елементів: ");
        int n = sc.nextInt();

        System.out.println("Введіть послідовність ненульових цілих чисел: ");

        if (n <= 0) {
            System.out.println("Послідовність має містити хоча б один елемент.");
            return;
        }


        int prev = sc.nextInt();
        int signChanges = 0;


        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();
            if ((prev > 0 && current < 0) || (prev < 0 && current > 0)) {
                signChanges++;
            }
            prev = current;
        }

        System.out.println("Кількість змін знака: " + signChanges);
    }
}

