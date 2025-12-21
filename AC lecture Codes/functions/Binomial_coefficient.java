// package AC lecture Codes.functions;

public class Binomial_coefficient {
    public static int facto(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }


    public static int bino(int n, int r) {
        int bino_coeff = facto(n) / (facto(r) * facto(n - r));
        return bino_coeff;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result = bino(n, r);
        System.out.println("The Binomial Coefficient C(" + n + ", " + r + ") is: " + result);
    }
}
