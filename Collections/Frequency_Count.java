import java.util.*;

public class Frequency_Count {
    public static void main(String[] args) {

        int[] arr = {6,4,2,4,6,4};

        TreeMap<Integer, Integer> freq = new TreeMap<>();

        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        // Convert map to list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(freq.entrySet());

        // Sort by frequency (descending)
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Print
        for (Map.Entry<Integer, Integer> e : list) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
