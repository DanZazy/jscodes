import java.util.Scanner;
import java.lang.Math;

public class task1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double z1,z2,a;

        System.out.print("Input value (a): ");
        a = sc.nextDouble();

        z1 = Math.cos(a) + Math.sin(a) + Math.cos(3 * a) + Math.sin(3 * a);

        z2 = 2*Math.sqrt(2)*Math.cos(a)*Math.sin(3.14/a*3.14 + 2*a);

        System.out.println("Z1 = " + z1);
        System.out.println("Z2 = " + z2);

        sc.close();
    }
}
