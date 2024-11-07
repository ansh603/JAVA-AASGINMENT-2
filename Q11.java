import java.util.Scanner;
class Q11{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=0;
System.err.print("reverse of a no is:");
while(n>0){
    m=n%10;
    System.out.print(m);
    n=n/10;
}

}
}