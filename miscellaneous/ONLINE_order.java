package miscellaneous;
import java.util.Scanner;

public class ONLINE_order {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String item = sc.nextLine();
        int order_amt = sc.nextInt();

        DiscountOrder order1 = new DiscountOrder(item, order_amt);
        double final_amt = order1.applyDiscount();
        System.out.println(final_amt);
        
        sc.close();
    }
}

class order {
    String item;
    private int order_amt;
    order (String item, int order_amt) {
        this.item = item;
        this.order_amt = order_amt;
    }

    int get_amt() {
        return this.order_amt;
    }

}
class DiscountOrder extends order {
    DiscountOrder(String item, int order_amt) {
        super(item, order_amt);
    }
    double applyDiscount() {
        int amt = get_amt();
        if(amt > 5000) {
            double disc_var = amt - (amt*0.1);
            return disc_var;
        } else {
            return amt;
        }
}
    // String item;
    // private String order_amt;

}
