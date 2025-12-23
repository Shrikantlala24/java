public class method_overloading {
    public static void main(String[] args) {
        System.out.println(Maths.add(1,2));
        System.out.println(Maths.add(1,2,3));
        System.out.println(Maths.add(1.1,2.1));
        System.out.println(Maths.add(1.10f,2.10f,3.10f));
        
    }
}


class Maths {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a+b+c;
    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
}