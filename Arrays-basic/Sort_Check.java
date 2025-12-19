import java.util.*;

public class Sort_Check {
    public static void main(String[] args) {
        int[] arr = {10,15,21,7,9};
        Arrays.sort(arr);
        
        // System.out.println(arr);
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                System.out.println("It's not sorted");
                break;
            }
            else if (i == arr.length - 2) {
                System.out.println("yess sorted");
            }
        }
        
    }
}
