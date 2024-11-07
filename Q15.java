import java.util.Scanner;
class Q15
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no for table");
        int t=s.nextInt();
        int i,sum=0;
        System.out.println("Table of no is");
        for(i=1;i<=10;i++)
        {
            sum=t*i;
            System.out.println(sum);

        }
        
    }
}