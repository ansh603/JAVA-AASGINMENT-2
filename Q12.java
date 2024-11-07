import java.util.Scanner;
class Q12{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter marks of maths");
        int m=s.nextInt();
        System.out.println("enter marks of physics");
        int p=s.nextInt();
        System.out.println("enter marks of chemistry");
        int c=s.nextInt();
        int t=c+p+m;
        if((m>=60&&p>=50&&c>=40&&t>=200)||(p+m)>=150){
            System.out.println("eligible");
        }
        else {
                System.out.println("not eligible");
            }
    }
}