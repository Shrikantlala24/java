import java.util.*;

public class Input {
    public static void main(String[] args) {

        /* here we'll create a Scanner object with the name sc
        and put System.in inside the  */
        Scanner sc = new Scanner(System.in);

        System.out.println("give me your name");
        String name = sc.nextLine();

        System.out.print("Hi ");
        System.out.println(name);

        sc.close();

    }
}
