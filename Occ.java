public class Occ{
public static void main(String[] args){
int[] n={21,22,23,23,25};
int target=23;
int count=0;
for(int i=0;i<n.length;i++){
if(n[i]==target)
{
count++;
}
}
System.out.println("number of occurrence of" + target + ":" + count);
}
}