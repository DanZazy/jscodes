import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class proj1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Як вас звати?");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String userName = input.readLine();

        int date = 2024;
        System.out.println("Скільки вам років?");
        int age = Integer.parseInt(input.readLine());
           
        System.out.println("Введіть масу тіла:");
        float mass = Float.parseFloat(input.readLine());


        System.out.println("Привіт, " + userName + "!, " + "що народився в " + (date-age) + " році" + " та важить " + mass + "  кілограми" + "!");
    }
}
