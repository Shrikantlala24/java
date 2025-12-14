import java.util.*;

public class Input {
    public static void main(String[] args) {

        /* */
        Scanner sc = new Scanner(System.in);

        System.out.println("give me your name");
        String name = sc.nextLine();

        System.out.print("Hi ");
        System.out.println(name);

        sc.close();

    }
}
