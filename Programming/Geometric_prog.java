import java.util.*;

public class Geometric_prog {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Geometric progression----");
        
        System.out.println("First term: ");
        int a = sc.nextInt();
        
        System.out.println("Common Ratio: ");
        int d = sc.nextInt();
        
        for(int i = 0; i < 7; i++) {
            System.out.print((a * Math.pow(d,i)) + " - ");
        }
        sc.close();
    }
}
