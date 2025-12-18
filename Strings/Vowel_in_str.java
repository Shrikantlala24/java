package Strings;
public class Vowel_in_str {
    
    public static void main(String[] args) {
        String str = "hEllO nigger, motherfucker";
        String vowel = "aeiou";
        int vowel_count = 0;
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if(vowel.indexOf(ch) != -1) {
                vowel_count++;
            }
            else {
                continue;
            }
        }
        
        System.out.println(vowel_count);
    }
}