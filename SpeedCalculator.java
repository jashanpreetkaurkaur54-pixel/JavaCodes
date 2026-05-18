import java.util.Scanner;

class SpeedCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distance, time, speed;

        System.out.print("Enter Distance: ");
        distance = sc.nextDouble();

        System.out.print("Enter Time: ");
        time = sc.nextDouble();

        speed = distance / time;

        System.out.println("Speed = " + speed);
    }
}