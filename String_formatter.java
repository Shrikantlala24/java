import java.util.*;

public class String_formatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String a1 = sc.nextLine();
        String[] arr1 =  a1.split(" ");
        
        // String a2 = sc.nextLine();
        // String[] arr2 =  a2.split(" ");
        
        str s1 = new str();
        s1.upper(arr1[1]);
        // s1.Concat(arr1[0], arr1[1]);


        sc.close();
    }
}

class str {
    // String _s;
    
    void upper(String s) {
        System.out.println(s.toUpperCase());
    }
    void Concat(String s1, String s2) {
        System.out.println(s1 + s2);
    }
    String repeat(int n, String strn) {
        String strong = "";
        for (int i =0; i < n; i++) {
            strong += strn ;
        }
        return strong;
    }
}