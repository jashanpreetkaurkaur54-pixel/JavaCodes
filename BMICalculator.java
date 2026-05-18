import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight, height, bmi;

        System.out.print("Enter Weight in kg: ");
        weight = sc.nextDouble();

        System.out.print("Enter Height in meter: ");
        height = sc.nextDouble();

        bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);
    }
}