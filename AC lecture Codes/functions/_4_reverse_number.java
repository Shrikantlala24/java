// package AC lecture Codes.functions;

public class _4_reverse_number {
    public static int reverseNumber(int num) {
        int rev = 0;
        // int numcopy = num;
        
/*      Don't do this because even if the num is changed, it won't affect in the main         function because java works on the basis of "call by values"
        
        =>  the value changed in function != value change in actual (i.e. main function)
        
        */
        // int i =0;
        while(num > 0) {
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num / 10;
            // i++;
        }
        return rev;
        
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
    } 
}
