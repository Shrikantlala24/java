public class toolboothtraffic {
    public static void main(String[] args) {
        int[] times = {3,4,2,5,3};
        int m = 2;

        int total = 0;
        int count = 0;
        for (int i = 0; i < times.length; i++) {
            total += times[i];
            count++;
            
            if(count == m || i != times.length - 1) {
                total += 2;
                count = 0;
            }

        }

        System.out.println("Total time taken: " + total + " minutes");
    }
}
