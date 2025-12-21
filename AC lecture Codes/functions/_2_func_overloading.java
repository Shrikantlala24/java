// package AC lecture Codes.functions;

public class _2_func_overloading {
    public static int sum(int a , int b) {
        return a+b;
    }
    public static int sum (int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.printf(" sum of 2 & 4 = %d\n sum of 2,4 & 5 = %d",sum(2,4), sum(2,4,5));
    }
}
