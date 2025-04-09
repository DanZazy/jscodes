import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Arrays2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input N: ");
        int n = sc.nextInt();

        System.out.print("Input M: ");
        int m = sc.nextInt();

        int[][] Z = new int[n][m];
        ArrayList<Integer> K = new ArrayList<>();

        System.out.println("Z mass: ");

        for (int i = 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                Z[i][j] = (int) (Math.random()*10);

                System.out.print(" "+Z[i][j]+"");
                K.add(Z[i][j]);
            }
            System.out.println();
        }
        

        int Lsum = 0;
        int Bsum = 0;

        for (int value : K) {
            if (value < 7) {
                Lsum += value;
            } else if (value > 7) {
                Bsum += value;
            }
        }

        int diff = Lsum - Bsum;

        System.out.println("\nK list: " + K);
        System.out.println("Sum of elements < 7: " + Lsum);
        System.out.println("Sum of elements > 7: " + Bsum);
        System.out.println("Difference (Less - Greater): " + diff);

        sc.close();
        
    }
}
