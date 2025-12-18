public class _5_Word_count {
    public static void main(String[] args) {

        String str = "Hello bro take this gig";
        
//      we are creating an array of string where each element is a word from the string
//      1. trim()
//      2. split(" ")

        String[] arr = str.trim().split(" ");

//      In array, length is a attribute, not a method.
        System.out.println(arr.length);
    }
}
