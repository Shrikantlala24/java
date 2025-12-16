import java.util.*;
public class Progression {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Arithmatic progression----");
        
        System.out.println("First term: ");
        int a = sc.nextInt();
        
        System.out.println("Common Ratio: ");
        int r = sc.nextInt();
        
        for(int i = 0; i <= 7; i++) {
            System.out.print((a + (r*i)) + " ");
            
        }

        sc.close();
    }
}
