// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class bin_to_dec_string {
    
    static void btod(String n) {
        // int num = n;
        // int bin = 0;
        // int i = 0 ;
        // while(num > 0) {
        //     int digit = num %10;
        //     bin += digit*Math.pow(2,i);
        //     num /= 10;
        //     i++;
        // }
        int bin = 0;
        
        for(int i = 0; i < n.length(); i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            bin += num * Math.pow(2,i);
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        // int n = 1111;
        String n = "0101";
        btod(n);
    }
}