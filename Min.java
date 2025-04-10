public class Min{
public static void main(String[] args){
int[] n={21,22,23,24,25};
int min =n[0];
int index=0;
for(int i=1;i<n.length;i++){
if(n[i]<min){
index=i;
}
}
System.out.println(index);
}
}