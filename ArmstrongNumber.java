public class ArmstrongNumber {
 public static void main(String[] args) {
 int num = 370;  
 int temp = num;
int digit, sum = 0;
while (temp > 0) {
digit = temp % 10;
sum += digit * digit * digit;
temp = temp / 10;
 }
if (sum == num) {
System.out.println(num + " is Armstrong");
 } else {
 System.out.println(num + " is NOT Armstrong");
        }
    }
}