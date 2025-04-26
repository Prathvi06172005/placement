package Work;
import java.util.Scanner;
public class MaxIndex{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] n = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            n[i] = scanner.nextInt();
        }
        int max=n[0];
        int index=0;
       
        for(int i=1;i<n.length;i++)
        {
            if(n[i]>max){
                max = n[i]; 
                index=i;
            }
        }
        System.out.println(index);
    }
}
