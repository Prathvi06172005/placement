

public class Test2 {
    public static void main(String[] args) {
      int n=5;
      char ch='e';
      for(int i=0;i<n;i++)
      {
          System.out.print(ch+ " ");
          if(i<n/2){
          ch--;
          }
          else{
          ch++;
          }
      }
    }
    
}