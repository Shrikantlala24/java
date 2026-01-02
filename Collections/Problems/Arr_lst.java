package Problems;
import java.util.*;


public class Arr_lst {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the ArrayList:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < n; i++) {
            a1.add(sc.nextInt());
        }
        System.out.println("The even numbers in the ArrayList are:");
        even_nums(a1);

        sc.close();
    }

    public static void even_nums(ArrayList<Integer> a1) {
        for (int i : a1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
