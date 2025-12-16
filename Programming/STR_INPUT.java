import java.util.*;

public class STR_INPUT {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    Scanner sc = new Scanner(System.in);
    int int1 = sc.nextInt();
    double dou = sc.nextDouble();
    sc.nextLine();
    String str = sc.nextLine();        
    
    System.out.println("String: " + str);
    System.out.println("Double: "+ dou);   
    System.out.println("Int: "+int1);

    sc.close();
    }
}


