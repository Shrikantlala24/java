public class _1_leap_year {
    public static void main(String[] args) {
//      you will be given the year as a number,
//      check if it is leap year or not
        int year = 1;
        
        if (year % 4 == 0) {
            if (year % 100 == 0 ) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                }
                else {
                    System.out.println("Not a Leap year");
                }
            }
            else {
                System.out.println("Leap year");
            }
        }
        else {
            System.out.println("Not a Leap year");
        }
    }
}