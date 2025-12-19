public class k_rotation_array {
    public static void main(String[] args) {

        // declare the array input

        int n = 5;
        int k =2;
        int[] arr = {1,2,3,4,5};
        
        // k = 2, => do baar loop chalao
        while (k > 0) {
            // last el pakad ke rakho
            int last = arr[n-1];
            
            // loop chala peeche se aage tak shift karne ke liye
            for( int i = n-1; i >0 ;i--) {
                arr[i] = arr[i-1];
            }
            // last el ko first position pe daal do
            arr[0] = last;
            k--;
        }
        // print the array
        for( int i = 0; i < n ;i++) {
            System.out.print(" " + arr[i]);
        } 
    }
}
