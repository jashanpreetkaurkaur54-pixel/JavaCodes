public class MagicNumber {
public static void main(String[] args) {
int num = 1729; 
int sum = num;
 while (sum > 9) {
int temp = sum;
sum = 0;
 while (temp > 0) {
sum = sum + (temp % 10);
temp = temp / 10;
            }
        }
 if (sum == 1) {
 System.out.println(num + " is a Magic Number");
        } else {
System.out.println(num + " is NOT a Magic Number");
        }
    }
}
