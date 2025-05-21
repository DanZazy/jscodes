
public class Progress { // Головний клас Progress {}
        public static void main(String[] args) {
        Progressions[] progressions = {

            new ArithmeticProgression1(1, 5, 2),  // 1, 3, 5, 7, 9
            new GeometricProgression2(2, 4, 3)   // 2, 6, 18, 54
        };

        for (Progressions p : progressions) {
            System.out.println(p);
        }
}
}


abstract class Progressions{ // Абстрактний батьківський клас Progressions {}
    protected double first;
    protected int n;

    Progressions(double first, int n){
        this.first = first;
        this.n = n;
    }


    public abstract double getElement(int i);

    public abstract double getSum();

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return String.format("Тип: \t %s, %d-й елемент: %.2f, Сума: %.2f",
                getType(), n, getElement(n), getSum() );
    }

}

class ArithmeticProgression1 extends Progressions { // Дочірній клас 1 {}
    private double diff;

    ArithmeticProgression1(double first, int n, double diff){
        super(first, n);
        this.diff = diff;

    }
    @Override
    public double getElement(int i) {
        return first + (i - 1) * diff;
    }

    public double getSum(){
        return (n/2)*first + getElement(n);
    }
}

class GeometricProgression2 extends Progressions { // Дочірній клас 2 {}
    private double ratio;

    public GeometricProgression2(double first, int n, double ratio) {
        super(first, n);
        this.ratio = ratio;
    }

    @Override
    public double getElement(int i) {
        return first * Math.pow(ratio, i - 1);
    }

    @Override
    public double getSum() {
        if (ratio == 1) {
            return first * n;
        } else {
            return first * (1 - Math.pow(ratio, n)) / (1 - ratio);
        }
    }
}


