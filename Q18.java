import java.util.Scanner;
class Q18{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a no");
int n=s.nextInt();
int m;
int count=0;
while(n>0){
    n=n/10;
    count++;
}
System.out.println("digit in the no. is:"+count);
}
}