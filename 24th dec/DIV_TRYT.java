public class DIV_TRYT {
    public static void main(String[] args) {
        int[] A = {8,6,4,2};
        int[] B = {2,0,2,0};

        System.out.println("");


        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            try {
                System.out.println(A[i] / B[i]);
                sum += A[i] / B[i];
            }
            catch (ArithmeticException e) {
            System.out.println("Division by zero error at index " + i);
            }
        }
        System.out.println("\nSum: " + sum);

    }
}
