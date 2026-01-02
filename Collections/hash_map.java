import java.util.*;

public class hash_map {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm1 = new TreeMap<>();
        tm1.put("Apple", 50);
        tm1.put("Banana", 20);
        tm1.put("Orange", 30);
        // tm1.put(null, 10); // This will throw NullPointerException

        System.out.println(tm1);
        for (Map.Entry<String, Integer> en : tm1.entrySet()) {

            System.out.println("Key: " + en.getKey() + ", Value: " + en.getValue());
        }
    }
}
