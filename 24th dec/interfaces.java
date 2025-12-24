public class interfaces {
    public static void main(String[] args) {
        payment p1 = new upi();

        p1.pay(500);
    }
}

interface payment {
    void pay(double amount);   
}

class upi implements payment {

    // int amt;
    // upi(int amt) {
    //     this.amt = amt;
    // }
    @Override
    public void pay(double amount) {
        System.out.println("\nPaid using UPI: " + amount + "\n");
    }
}