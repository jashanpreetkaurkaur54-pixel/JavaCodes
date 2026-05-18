import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p, r, t, amount, ci;

        System.out.print("Enter Principal: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        r = sc.nextDouble();

        System.out.print("Enter Time: ");
        t = sc.nextDouble();

        amount = p * Math.pow((1 + r / 100), t);

        ci = amount - p;

        System.out.println("Compound Interest = " + ci);
    }
}