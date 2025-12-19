public class max_product {
    public static void main(String[] args) {
        int[] arr = {1,10,2,6,5};

        int Product = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            // Product = Product * arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                temp = arr[i] * arr[j];
                if (Product < temp ) {
                    Product = temp;
                    // System.out.println(Product);
                }
            }
        }
        System.out.println("Maximum Product Subarray is " + Product);
    }

}