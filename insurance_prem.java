public class insurance_prem {
    public static void main(String[] args) {
        car c1 = new car(10000);
        c1.premium_account();

        health h1 = new health(20000);
        h1.premium_account();

    }
}
class insurance {
    int amt;
    insurance(int amt) {
        this.amt = amt;
    }
    void premium_account() {
        System.out.println(amt);
    }
    int getamount() {
        return amt;
    }
}
class car extends insurance {
    car(int amt) {
        super(amt);
    }
    int amt = getamount();
    @Override
    void premium_account() {
        System.out.println(amt + amt * 15 / 100);
    }
}

class health extends insurance {
    health(int amt) {
        super(amt);
    }
    @Override
    void premium_account() {
        System.out.println(amt + amt * 20 / 100);
    }
}
