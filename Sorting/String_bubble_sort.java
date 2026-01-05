import java.util.*;


public class String_bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }

        boolean swapped;

        for (int i = 0; i < size -1; i++) {
            swapped = false;

            for(int j = 0; j < size -1-i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true;
                }
            }
            
            if(!swapped) break;
        }
        
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }


        sc.close();
    }
}