package Work;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] n = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            n[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n.length; i++) 
        {
            if (n[i] > max) {
                secondMax = max;
                max = n[i];
            } 
            else if (n[i] > secondMax && n[i] != max)
            {
                secondMax = n[i]; 
            }
        }
        if (secondMax == Integer.MIN_VALUE) 
        {
            System.out.println("There is no second maximum element.");
        }
        else 
        {
            System.out.println("The second maximum element is: " + secondMax);
        }
    }
}
