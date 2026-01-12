public class fucktorial {
    public static void main(String[] args) {
        System.out.println("factorial of 5 is +" + new fucktorial().factorial(5));

    }
    int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}