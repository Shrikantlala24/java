public class E_binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println("element found at " + BS(arr, 0, n -1, 6) + " postion");
        
    }


    public static int BS(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left)/2;
        
        if(arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            return BS(arr, mid +1, right, target);
        }
        else{
            return BS(arr, left, mid - 1, target);
        }
    }
}

