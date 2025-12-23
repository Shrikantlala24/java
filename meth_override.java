public class meth_override {
    public static void main(String[] args) {
    Animal D1 = new Dog();
    Animal C1 = new Cat();
    D1.sound();
    C1.sound();

    Animal A1 = new Animal();
    A1.sound();
    }
}


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}