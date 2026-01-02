import java.util.*;

public class Linked_list_start {
    public static void main(String[] args) {
        
        String[] str = {"hello","brooo"};
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("huttt");
        l1.add("saalee");
        l1.addAll(Arrays.asList(str));

        System.out.println(l1);

        l1.addFirst("not");
        l1.addLast("it is");
        
        System.out.println(l1);
        
        for(String a : l1) {
            System.out.print(a +  " ");
        }
        
    }
}
