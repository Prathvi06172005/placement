public class Test5 {
    public static void main(String[] args) {
      int n=5;
      int k=1;
      for(int i=0;i<n;i++)
      {
          System.out.print(k+ " ");
          if(i<n/2){
          k++;
          }
          else{
          k--;}
      }
    }
  
}