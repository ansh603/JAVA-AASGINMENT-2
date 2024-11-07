import java.util.Scanner;
class Q4{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 2 no.");
        int a=s.nextInt();
        int b=s.nextInt();
        int c;
        
        System.out.print("no before swapping a="+a);
        System.out.println("  b="+b);
        c=b;
        b=a;
        a=c;
        System.out.print("no after swapping a="+a);
        System.out.println("  b="+b);
        
    }
}
