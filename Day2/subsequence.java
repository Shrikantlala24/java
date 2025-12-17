package Day2;

public class subsequence {
    public static void main(String[] args) {
        
        
        String s1 = "hello madam", s2 = "helol";
        
        
        
        for(int i = 0; i < s2.length(); i++) {
//          first take the character at "i" index :-
            char ch = s2.charAt(i);
            
//          now if character is not in s1 => not a subsequence and break the loop
//          else if we reach the end of s2 => it's a subsequence
            if (s1.indexOf(ch) == -1) {
                System.out.println("Not a subsequence");
                break;
            }
            else if (i== s2.length()-1) {
                System.out.println("Yesss it's a subsequence");
            }
        }
        
    }
}
