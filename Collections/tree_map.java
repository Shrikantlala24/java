import java.util.*;

public class tree_map {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tm1 = new TreeMap<>();

        tm1.put(1, 100);
        tm1.put(2, 200);
        tm1.put(3, 300);
        // tm1.put(null, 400); // This will throw NullPointerException

        System.out.println(tm1);
        for (Map.Entry<Integer, Integer> en : tm1.entrySet()) {
            System.out.println("Key: " + en.getKey() + ", Value: " + en.getValue());
        }
        

        // in string type key in tree map

        TreeMap<String, Integer> tm2 = new TreeMap<>();
        tm2.put("A", 100);
        tm2.put("B", 200);
        tm2.put("C", 300);
        System.out.println(tm2);
        for (Map.Entry<String, Integer> en : tm2.entrySet()) {
            System.out.println("Key: " + en.getKey() + ", Value: " + en.getValue());
    }
}
}
