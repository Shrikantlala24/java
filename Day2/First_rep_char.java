package Day2;

public class First_rep_char {
    public static void main(String [] args) {
        String str = "HARSHAD";
        String result = "";
        
        for (int i = 0; i < str.length(); i ++) {
            char ch = str.charAt(i);
            
            
            if (result.indexOf(ch) != -1) {
                System.out.println("the first repeating character is "+ ch);
                break;
            }
            if (result.indexOf(ch) == -1 ) {
                result += ch;
            }
            
        }
    }
}
