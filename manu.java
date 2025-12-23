class shape {
    int area() {
        return 0;
    }
}
class rectangle {
    int length;
    int breadth;

    rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
    
}

public class manu {
    public static void main(String[] args) {
        rectangle r = new rectangle(5, 6);
        System.out.println("Area of rectangle: " + r.area());
    }
}