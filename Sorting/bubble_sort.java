import java.util.*;

public class bubble_sort {
    public static void main(String[] args) {
        // int[] arr = {8,7,5,4,3,6,2};
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // int 
        int n = arr.length;
        // int swaps = 0;
        boolean swapped;
        
        for(int i =0; i < n -1; i++) {
            swapped = false;
            
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                //     System.out.printf("%d is swapped with %d\n", arr[j], arr[j+1]);
                //     System.out.println(Arrays.toString(arr));

                //     swaps++;
                }
                
            }
            if(!swapped) {
                break;
            }
        }


        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println(" \n" + swaps);



        sc.close();
    }
}