public class Max{
public static void main(String[] args){
int[] n={21,22,23,24,25};
int max=n[0];
int index=0;
for(int i=1;i<n.length;i++){
if(n[i]>max){
index=i;
}
}
System.out.println(index);
}
}