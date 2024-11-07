import java.util.Scanner;
class Q16{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1st no");
        int a=s.nextInt();
        System.out.println("enter 2nd no");
        int b=s.nextInt();
        int hcf=0;
        for(int i=1;i<=a||i<=b;i++){
            if(a%i==0&&b%i==0){
                hcf=i;
            }
        }
        
        System.out.println("HCF of two no is: "+hcf);
    }
}