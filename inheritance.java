public class inheritance {
    
    public static void main(String[] args) {
        student s1 = new student();

        s1.greet();
    }
}

class teacher {
    String name ;
    void greet() {
        System.out.println("good morning teacher");
    }
}
class student extends teacher  {
    String name;
    // void greet() {
    //     System.out.println("good morning student");
    // }
}