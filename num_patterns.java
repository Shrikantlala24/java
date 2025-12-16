public class num_patterns {
    public static void main(String[] args) {
        int n = 0;

        System.out.println("---- no. sequence in each row ----");
        
        for(int i =1; i <= 5; i++) {
            for(int j = 1; j <= i; j ++) {
                System.out.print(n+j);
            }
            System.err.println("");
        }

        System.out.println("----  print the pyramid with continus sequence ----");

        
        for(int i =0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(n+i+j);
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
