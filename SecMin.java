


package Work;
import java.util.Scanner;
public class SecMin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] n = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            n[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : n) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum number.");
        } else {
            System.out.println("Second minimum number is: " + secondMin);
        }

        scanner.close();
    }
}
