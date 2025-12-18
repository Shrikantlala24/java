public class big_factor_in_arr {
    public static void main(String[] args) {
        int[] arr = {10,15,21,7,9};
        int largest_factor = 0;
        int num_w_lf = 0;

        for(int a : arr) {
            System.out.printf("\n--- factor of %d ---\n",a);
            for(int i = a-1;i >0;i--) {
                if(a%i == 0) {
                    System.out.printf("factor is %d \n",i);
                    if(i > largest_factor) {
                        largest_factor = i;
                        num_w_lf = a;
                    }
                    else {
                        continue;
                    }
                }
            }
        }
        
        System.out.printf("\nthe largest factor in whole array is %d of number %d",largest_factor,num_w_lf);
        
        // int a = 12;
        // for(int i = a-1;i >0;i--) {
        //     if(a%i == 0) {
        //         System.out.printf("factor is %d \n",i);
        //     }
        // }
    }
}
