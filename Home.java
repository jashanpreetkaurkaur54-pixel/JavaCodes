interface SmartDevice {

    void turnOn();
    void turnOff();
}

class TV implements SmartDevice {

    public void turnOn() {
        System.out.println("TV Turned ON");
    }

    public void turnOff() {
        System.out.println("TV Turned OFF");
    }
}

public class Home {

    public static void main(String[] args) {

        TV t1 = new TV();

        t1.turnOn();
        t1.turnOff();
    }
} 
