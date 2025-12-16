public class string {
    public static void main(String[] args) {
    /* we'll use these fucntions fir now :-
    1. toLowerCase()
    2. toUpperCase()
    3. indexOf()
    4. split()
    5. charAt()
    */
    String str1 = "Hello busd nfbvsu".toLowerCase();

    int a  = str1.indexOf("h");
    System.out.println(a);
    String[] parts = str1.split(" ");
    
    for (int i = 0; i < parts.length; i++) {
        System.out.println(parts[i]);
    }
    }  
}