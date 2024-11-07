import java.util.Scanner;
class Q14{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no");
        int n=s.nextInt();
        int i;
        System.out.print("multiple of 10 : ");
        for(i=1;i<=n;i++)
        {
           if((10%i)==00){
            System.out.print(i);
            System.out.print(" ");
           }
        }
        
    }
}