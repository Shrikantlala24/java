public class hierarchy {
    public static void main (String[] args) {
        cat c1 = new cat();
        dog d1 = new dog();
        c1.cat_sound();
        d1.dog_sound();
        
        c1.sound();
        d1.sound();
    }
}

class animal {
    String name;
    void sound() {
        System.out.println("i am animal");
    }
}

class dog extends animal {
    void dog_sound() {
        System.out.println("i am dog");
    }
}

class cat extends animal {
    void cat_sound() {
        System.out.println("i am cat");
    }
}
