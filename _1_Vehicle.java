import java.util.Scanner;

public class _1_Vehicle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        int boost = sc.nextInt();
        
        Car c1 = new Car(speed, boost);

        System.out.println("Base Speed: " + c1.returnSpeed());
        System.out.println("Boosted Speed: " + c1.returnBoostedSpeed());
        sc.close();
    }
}
class Vehicle {
    int speed;
    Vehicle(int speed) {
        this.speed = speed;
    }
    int returnSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    int boost;
    Car(int speed, int boost) {
        super(speed);
        this.boost = boost;
    }
    int returnBoostedSpeed() {
        return speed + boost;
    }
}