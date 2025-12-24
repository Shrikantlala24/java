public class polymorphy {
    public static void main(String[] args) {
        circle c1 = new circle(12);
        // c1.area();
        System.out.println("Area of circle: " + c1.area());
    }
}

abstract class shape {
    abstract double area();
}
class circle extends shape {
    double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}