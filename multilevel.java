public class multilevel {
    public static void main(String[] args) {
    son s1 = new son();
    s1.greet();
    s1.greet_dad();
    s1.greet_grand();
    }
}

class grandfather {
    String name;
    void greet_grand() {
        System.out.println("good morning grandpa");
    }
}
class father extends grandfather {
    String name;
    void greet_dad() {
        System.out.println("good morning dad");
    }
}
class son extends father{
    String name;
    void greet() {
        System.out.println("good morning son");
    }
}