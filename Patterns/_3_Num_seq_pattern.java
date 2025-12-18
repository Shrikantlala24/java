public class _3_Num_seq_pattern {
    public static void main(String[] args) {
        int n = 4;
        
        int num = 0;
        for(int i = 1; i <= n; i++) {
            for (int j = 0; j< i; j++) {
                System.out.printf("%d ",(++num));
            }
            System.out.println("");
        }
    
    }
}
