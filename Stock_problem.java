public class Stock_problem {
    public static void main(String[] args) {

        int[] arr = {7, 2, 5, 3, 6, 4, 1};

        int buying_option = Integer.MAX_VALUE;
        int BO_index = -1;

        // find buying option
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < buying_option) {
                buying_option = arr[i];
                BO_index = i;
            }
        }

        int selling_option = 0;

        // find selling option after buying
        for (int i = BO_index + 1; i < arr.length; i++) {
            if (arr[i] > selling_option) {
                selling_option = arr[i];
            }
        }

        System.out.println(selling_option - buying_option);
    }
}
