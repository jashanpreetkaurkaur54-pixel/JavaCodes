public class AddMatrix {
public static void main(String[] args) {
int a[][] = {{2, 2}, {2, 4}};
int b[][] = {{2, 6}, {2, 8}};
int sum[][] = new int[2][2];
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
sum[i][j] = a[i][j] + b[i][j];
            }
        }
 System.out.println("Sum of matrices:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
 System.out.print(sum[i][j] + " ");
            }
 System.out.println();
        }
    }
}