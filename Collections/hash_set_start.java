import java.util.*;

public class hash_set_start {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(5);
        hs1.add(null);

        System.out.println( hs1);
        
    }
}
// Output: [null, 20, 5, 10] (order may vary)