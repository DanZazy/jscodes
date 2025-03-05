import java.util.Scanner;
import java.lang.Math;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double y1,g,x,b;

        System.out.print("Input x: ");
        x = sc.nextDouble(); 

        System.out.print("Input g: ");
        g = sc.nextDouble();  
        
        b = (2 - Math.pow(x, 2) / 9 - g);

        if (x == g) y1 = x;
        else  y1 = b;



        System.out.println("y1: " + y1);

        System.out.println("\n ---New_Example---");

        double y2,m,a,k;

        System.out.print("Input a: ");
        m = sc.nextDouble(); 

        System.out.print("Input m: ");
        a = sc.nextDouble(); 

        k = (Math.pow(m, 3) + Math.pow(2.17, -a * m));

        if (a < m) 
            y2 = a * Math.pow(m, 2);
        else
            y2 = k;

        System.out.println("y: " + y2);

         sc.close();
    }
    
}
