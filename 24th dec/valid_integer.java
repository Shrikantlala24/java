import java.util.Scanner;

public class valid_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] test_ip = new String[n];
        for(int i = 0; i < n; i++) {
            test_ip[i] = sc.nextLine();
        }
        try {
            for(int i = 0; i < n; i++) {
                int num = Integer.parseInt(test_ip[i]);
                System.out.println(num);
                // System.out.println("Valid Integer");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Integer");
        }
    }
}
