public class merge_n_sort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] mergedArray = new int[n1 + n2];

        // Merging the two arrays
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int j = 0; j < n2; j++) {
            mergedArray[n1 + j] = arr2[j];
        }

        // Sorting the merged array using Bubble Sort
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - i - 1; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }
        
        // Printing the sorted merged array
        System.out.print("Merged and Sorted Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}