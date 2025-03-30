import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        int newValue = 99;

        int[] newArray = new int[A.length + 1];

        for (int i = 0; i < k; i++) {
            newArray[i] = A[i];
        }

        newArray[k] = newValue;

        for (int i = k; i < A.length; i++) {
            newArray[i + 1] = A[i];
        }

        System.out.println("Prev arr: " +Arrays.toString(A));
        System.out.println("Updated arr: " +Arrays.toString(newArray));
    }
}
