package Work;
public class Min1{
    public static void main(String[] args) {
        int[] n = {5, 7, 8, 9, 3};        
             int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                secondMin = min;  
                min = n[i];      
            } else if (n[i] < secondMin && n[i] != min) {
                secondMin = n[i]; 
            }
        }
        if (secondMin == Integer.MAX_VALUE) 
        {
            System.out.println("There is no second minimum number.");
        }
        else
        {
            System.out.println("Second minimum number is: " + secondMin);
        }
    }
}
