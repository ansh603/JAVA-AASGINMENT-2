import java.util.Scanner;
class Q19{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter a no");
int n=s.nextInt();
int m=n;
int r=0,sum=0;
while(n>0){
    r=n%10;
    sum=(sum*10)+r;
    n=n/10;
}
if(sum==m){
    System.out.print("palindrome no.");
}
else{
System.out.print("Not a palindrome no.");
}

}
}