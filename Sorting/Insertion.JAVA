public class Insertion {
    public static void insertionSort(int[] array) {
        int[] arr = {8, 3, 5, 2, 9};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];     // element to insert
            int j = i - 1;

            // shift larger elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // insert key at correct position
            arr[j + 1] = key;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
