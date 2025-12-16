import java.util.Scanner;

public class PALINDROME {
    public static void main(String[]args) {
        // String number = "123321";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.next();

        String rev = "";

        /*  here is the logic for reversing a string
        for(int i = str.length() - 1; i >= 0;i--) {
            rev = rev + str.charAt(i);
        } */

        // another way to reverse a string using StringBuilder

String rev = new StringBuilder().reverse()

        if (rev.equals(str)){
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

    }
}