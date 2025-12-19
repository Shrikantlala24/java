public class array_sort_check {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr)); // Output: true

        int[] arr2 = {5, 3, 4, 1, 2};
        System.out.println(isSorted(arr2)); // Output: false
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
