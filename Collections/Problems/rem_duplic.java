package Problems;
import java.util.*;

public class rem_duplic {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(3);

        TreeSet<Integer> ts = new TreeSet<>(a1);

        System.out.println(ts);
        

    }
}
