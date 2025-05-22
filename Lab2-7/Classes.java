class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}


class Triangle { // Батьківський клас Triangle
    Point a, b, c;

    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPerimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    double getArea() { // Формула Герона
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        double s = (ab + bc + ca) / 2;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    @Override
    public String toString() {
        return "Triangle: \n \t Периметр: " + getPerimeter() + ", Площа: " + getArea();
    }
}

class Polygon extends Triangle { // Дочірній клас Polygon
    Point[] vertices;

    Polygon(Point[] vertices) {
        super(vertices[0], vertices[1], vertices[2]); // сумісність з Triangle
        this.vertices = vertices;
    }

    @Override
    double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < vertices.length; i++) {
            perimeter += vertices[i].distance(vertices[(i + 1) % vertices.length]);
        }
        return perimeter;
    }

    @Override
    double getArea() { // Формула "черевика" для площі багатокутника
        double area = 0;
        for (int i = 0; i < vertices.length; i++) {
            Point p1 = vertices[i];
            Point p2 = vertices[(i + 1) % vertices.length];
            area += (p1.x * p2.y - p2.x * p1.y);
        }
        return Math.abs(area) / 2;
    }

    @Override
    public String toString() { // Вивід результатів обчислень
        return "Polygon: \n \t Периметр: " + getPerimeter() + ", Площа: " + getArea();
    }
}

public class Classes { // Головний клас Classses з методом main 
    public static void main(String[] args) {
        Object[] shapes = {
            new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3)),
            new Polygon(new Point[] {
                new Point(0, 0),
                new Point(4, 0),
                new Point(4, 3),
                new Point(0, 3)
            })
        };

        for (Object shape : shapes) {
            System.out.println(shape);
        }
    }
}
