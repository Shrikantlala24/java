import java.util.*;

public class sum {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter two numbers to find their sum:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(calculator.add(a, b));
    System.out.println(calculator.subtract(a, b));
    sc.close();
    }
}

class calculator {
    // constructor() {
    //     int a;
    //     int b;
    // }
    static int add(int x, int y) {
        return x + y;
    }
    static int subtract(int x, int y) {
        return x - y;
    }
    static int multiply(int x, int y) {
        return x * y;
    }
    static int divide(int x, int y) {
        return x / y;
    }

}