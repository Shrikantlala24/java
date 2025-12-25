import java.util.*;

public class smar_dev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String deviceType = sc.nextLine();
        int voltage = sc.nextInt();

        if (deviceType.equals("fan")) {
            PowerDevice device = new fan();
            device.turnOn(voltage);
        }
        else if (deviceType.equals("heater")) {
            PowerDevice device = new heater();
            device.turnOn(voltage);

        }
        else {
            System.out.println("Invalid device");
        }

        sc.close();
    }
}

interface PowerDevice {
        void turnOn(int voltage) ;
}

class fan implements PowerDevice {
    public void turnOn(int voltage) {
        if(voltage <= 240) {
            System.out.println("Device turned on");
        }
        else {
            System.out.println("Power error");
        }
    }
}
class heater implements PowerDevice {
    public void turnOn(int voltage) {
        if(voltage <= 2000) {
            System.out.println("Device Turned on");
        }
        else {
            System.out.println("Power error");
        }
    }
}