import java.util.Scanner;
class Q8{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a dividend");
        int a=s.nextInt();
        System.out.println("Enter a divisor");
        int b=s.nextInt();
        if(a%b==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}