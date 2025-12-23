package miscellaneous;
public class tough_2 {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 2, 0, 1},
            {1, 2, 0, 5},
            { 0, 5, 1, 2},
            { 1, 2, 0, 5}
        };

        int[] order = {1, 2, 0, 5};
        
        for (int i = 0; i < order.length; i++) {
            int[] sorted = new int[4];
            int sort_i = 0;

            for (int k = 0; k < arr.length; k++) {
                for (int j = 0; j < arr[k].length; j++) {
                    if (arr[j][i] == order[k]) {
                        sorted[sort_i++] = arr[j][i];
                    }
                }
            }
            
            
        }
    }
}
