// import java.util.*;

public class array_rot {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
    //   int n = sc.nextInt();
    //   int k = sc.nextInt();
        
        
        int n = 5;
        int k =2;
        int[] arr = {1,2,3,4,5};
        
        while (k > 0) {
            int last = arr[n-1];
            
            for( int i = n-1; i >0 ;i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            k--;
        }
        for( int i = 0; i < n ;i++) {
            System.out.print(" " + arr[i]);
        } 
        
    }
}