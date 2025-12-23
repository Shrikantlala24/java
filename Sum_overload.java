import java.util.*;

public class Sum_overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int loop = sc.nextInt();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(maths.sum(a,b));
        
        // int count3 ;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(maths.sum(x,y,z));
        
        // int


        sc.close();
    }
}

 class maths {
     static int sum (int a, int b) {
         return a + b;
     }
     static int sum (int n, int[] arr) {
         int sum = 0;
         for (int a : arr) {
             sum+=a;
         }
         return sum;
     }
     static int sum(int a, int b, int c) {
         return a+b+c;
     }
 }
 
 