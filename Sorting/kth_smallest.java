import java.util.Scanner;

public class kth_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        
        // main logic
        
        for(int i =0; i < n; i++) {
            int min_i = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_i]) {
                    min_i =j;
                }
            }
            // here we'll swap the value at i to min value
            
            int temp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = temp;
        }

        // print the sorted array

        for(int i =0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int k = sc.nextInt();
        System.out.println("\n" + arr[k-1]);

        sc.close();
    }
}
