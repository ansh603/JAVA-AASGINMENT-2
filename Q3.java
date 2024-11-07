import java.util.Scanner;
 class Q3{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 3 no.");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is big");
                else{
                    System.out.println("c is big");
                }
            }
            else{
                if(b>c){
                System.out.println("b is big");
                }
                else{
                    System.out.println("c is big");
                }
            }
        }

    }

}