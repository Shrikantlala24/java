import java.util.*;

public class problem_nihar {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n]; 

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(str));
        Collections.sort(a1);

        for (String s : a1) {
            System.out.println(" " + s);
            
        }

        sc.close();
    }   
}
