import java.util.Scanner;
class addition{
    int a,b,c;
    public
    addition(int a, int b){
         a = a;
         b = b;
    }
    void show(){
        c=a+b;
        System.out.println("Addition is:  "+c);
    }
};

 class Q32{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("eneter 2 no:  ");
        int a = s.nextInt();
        int b = s.nextInt();
        addition x = new addition(a,b);
        x.show();
    }
 }