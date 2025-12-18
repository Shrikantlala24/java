
public class Rev_String {
    public static void main(String[] args) {
        String str = "Hello meow **";
        String str2  = "Programming";
        
//       --- reverse a string ---
//      1. direct String method    
        
        String rev = new StringBuilder(str).reverse().toString();
        
        
        System.out.println(rev);
        
//      2. use loop and do it :-

        String rev2 = "";
        int len = str2.length();
        
        for(int i = len - 1; i >= 0 ; i--) {
            rev2 += str2.charAt(i);
        }
        
        System.out.println(rev2);
        
    }
}