import java.util.Scanner;

class TempConvert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Enter Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Fahrenheit = " + fahrenheit);
    }
}