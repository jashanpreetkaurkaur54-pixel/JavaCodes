import java.util.Scanner;
public class InchesToMeters {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter inches: ");
double inches = sc.nextDouble();
double meter = inches * 0.0254;
System.out.println("Meters = " + meter);
    }
}
