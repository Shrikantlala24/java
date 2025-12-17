package Day2;

public class str_drop_duplicates {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(result.indexOf(ch) == -1 ) {
                result += ch;
            }
        }    
        System.out.println(result);
    }
}
