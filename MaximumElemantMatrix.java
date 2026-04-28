public class MaximumElemantMatrix {
    public static void main(String[] args) {
 int arr[][] = {
{1, 9, 3},
{4, 15, 6},
{7, 8, 2}
 };
int max = arr[0][0]; 
for(int i = 0; i < arr.length; i++) {
for(int j = 0; j < arr[i].length; j++) {
 if(arr[i][j] > max) {
 max = arr[i][j];
    }
 }
 }
 System.out.println("Maximum Element = " + max);
    }
}