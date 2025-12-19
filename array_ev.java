import java.util.Arrays;

public class array_ev {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        // split to two arrays
        // odd array - addition
        // even array - multiplication

        int[] arr_odd = new int[numbers.length];
        int[] arr_even = new int[numbers.length];

        int odd_i = 0;
        int even_i = 0;

        int odd_addition = 0;
        int even_multiplication = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                arr_even[even_i++] = numbers[i];
            } else {
                arr_odd[odd_i++] = numbers[i];
            }
        }

        for (int i = 0; i < odd_i; i++) {
            odd_addition += arr_odd[i];
        }

        for (int i = 0; i < even_i; i++) {
            even_multiplication *= arr_even[i];
        }

        System.out.println("Odd Addition: " + odd_addition);
        System.out.println("Even Multiplication: " + even_multiplication);

        armstrong(numbers);
    }

    static void armstrong(int[] arr) {

        int final_output = 0;

        for (int num : arr) {
            final_output += Math.pow(num, 3);
        }

        System.out.println("Armstrong Sum: " + final_output);

        String num_str = Arrays.toString(arr).replaceAll("[\\[\\], ]", "");

        System.out.println(num_str);

        if (num_str.equals(Integer.toString(final_output))) {
            System.out.println("The given array is an Armstrong number");
        } else {
            System.out.println("The given array is not an Armstrong number");
        }
    }
}
