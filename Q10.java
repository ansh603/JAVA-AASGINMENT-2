import java.util.Scanner;
class Q10{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int previous=0;
        int current=1,sum=0;
        for(int i=1;i<=n;i++){
           sum = previous+current;
           System.out.print(" "+sum);
           previous=current;

           current=sum;
           
        
        }
    }

}