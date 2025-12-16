public class StarPatterns {
    public static void main(String[] args) {
        System.out.println("InWords class executed");

        for(int i =1; i <= 5; i++) {
            for(int j = 1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.err.println("");
        }

        System.out.println("-----  print only odd number of stars -----");

        
        for(int i =1; i <= 7; i+=2) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.err.println("");
        }

        System.out.println("-----  print opposite pyramid of stars -----");
        
        for(int i =5; i >= 0; i--) {
            for(int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.err.println("");
        }
    }
}
