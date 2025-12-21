public class tough {
    public static void main(String[] args) {

        int[][] arr = {
            {5, 2, 0, 1},
            {1, 2, 0, 5},
            {0, 5, 1, 2},
            {1, 2, 0, 5}
        };

        // desired order: 1, 2, 0, 5  (0 should come at index 2)
        int[] order = {1, 2, 0, 5};

        for (int i = 0; i < arr.length; i++) {

            int[] sorted = new int[4];
            int idx = 0;

            // place elements row-wise according to order
            for (int k = 0; k < order.length; k++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == order[k]) {
                        sorted[idx++] = arr[i][j];
                    }
                }
            }

            // copy back to original array
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sorted[j];
                System.out.print(arr[i][j]);
                if (j < 3) System.out.print(", ");
            }
            System.out.println();
        }
    }
}