import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");

        for(int i = 0; i < n; i++) {
            System.out.printf("Element %d: ", i + 1);
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
