public class bin_to_dec_string {
    public static void main(String[] args) {
        String binaryString = "1101"; // Example binary string
        int decimalValue = Integer.parseInt(binaryString, 2);
        System.out.println("Decimal value: " + decimalValue);
    }
}
