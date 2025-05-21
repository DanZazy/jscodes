import java.util.Scanner;

public class triang {

    private double x1, y1;
    private double x2, y2;
    private double x3, y3;

    // Конструктор
    public triang(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    // Обчислення відстані між двома точками
    private double distance(double xA, double yA, double xB, double yB) {
        return Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
    }

    // Обчислення периметра
    public double getPerimeter() {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        return a + b + c;
    }

    // Обчислення площі за формулою Герона
    public double getArea() {
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x1, y1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Метод main з введенням координат з консолі
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координати трьох вершин трикутника:");

        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();

        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        System.out.print("x3 = ");
        double x3 = scanner.nextDouble();
        System.out.print("y3 = ");
        double y3 = scanner.nextDouble();

        scanner.close();

        triang triangle = new triang(x1, y1, x2, y2, x3, y3);

        System.out.println("Периметр трикутника: "+ triangle.getPerimeter());
        System.out.println("Площа трикутника: "+ triangle.getArea());
    }
}

