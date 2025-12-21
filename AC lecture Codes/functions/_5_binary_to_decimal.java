// package AC lecture Codes.functions;

// import java.util.*;
public class _5_binary_to_decimal {
    public static int B_to_D(int num) {
        int bin = 0;
        // int dig_count = 0;
        int i =0;
        while (num >0) {
            int digit = num %10;
            bin = bin + digit * (int)Math.pow(2,i);
            num /= 10;
            i++;
        }
        return bin;
    }
    
    public static void main(String[] args) {
        // int n = 001;
        /*here you can't use 001 because in java, number starts with zero is an octal number*/
        int n = 10101;
        System.out.printf("the binary of %d is %d",n, B_to_D(n));   
    }
}
