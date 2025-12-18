public class Remove_spaces {
    public static void main(String[] args) {
        
        String str = "   Hello bro take this gig   ";
        
        String str2 = str.trim().replace(" ","");
        System.out.println(str2);
    }
}
// Output: Hellobrotakethisgig