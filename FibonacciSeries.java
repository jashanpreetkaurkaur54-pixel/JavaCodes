import java.util.Scanner;
public class FibonacciSeries {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of terms: ");
int n = sc.nextInt();
 int a = 0, b = 1;
 System.out.println("Fibonacci Series:");
for (int i = 0; i <= n; i++) {
 int c = a + b;
a = b;
b = c;
System.out.print(a+ " ");
}
}
}

