// package AC lecture Codes.functions;

public class _3_optimized_prime_no {
    public static boolean isPrime(int n) {
        boolean prime = true;
        for(int i = 2; i*i <= n ; i++) {
            if( n % i ==0) {
                prime = false;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        int n = 29;
        System.out.printf("%d is a prime number \nAnswer = %b", n, isPrime(n));
    }
}
