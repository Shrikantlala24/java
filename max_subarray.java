public class max_subarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1};
        

        // output should be 4
        
        int currsum = 0;
        int maxsum = 0;
        
        for (int num : arr) {
            currsum += num;
            if (currsum < 0) {
                currsum = 0;
            }
            if (currsum > maxsum) {
                maxsum = currsum;
            }
        }
        System.out.println(maxsum);
    }
}
