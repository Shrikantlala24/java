import java.util.*;

public class Fibonacci_memorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
    
        
        int n = sc.nextInt();
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        int result = fibonacci(n, memo);
        System.out.println("Fibonacci of " + n + " is: " + result);
        sc.close();

    }

    public static int fibonacci(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }
}