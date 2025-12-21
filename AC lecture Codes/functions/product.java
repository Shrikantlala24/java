public class product {
    public static int produc(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int result = produc(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
    }
}