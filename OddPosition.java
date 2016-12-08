import java.util.Scanner;
public class OddPosition{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the string to be reversed");
String a=s.nextLine();
String ans="";
for(int i=0;i<a.length();i++){
if(i%2==0){
ans+=a.charAt(i);
}
else{
ans+=a.charAt(a.length()-i-1);
}
}
System.out.println(ans);
}
}
