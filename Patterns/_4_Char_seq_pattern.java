public class _4_Char_seq_pattern {
    public static void main(String[] args) {
        char ch = 'A';
        
        for(int i = 0; i < 4; i++) {
            for(int j =0; j<= i; j++) {
                System.out.printf("%c ",ch++);
            }
            System.out.println();
        }
    }
}
