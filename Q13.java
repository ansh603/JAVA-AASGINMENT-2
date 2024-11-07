import java.util.Scanner;
class Q13{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no");
        int n=s.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of n natural no is:"+sum);
    }
}