import java.util.Scanner;
class Q23A{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k=1;
        for(int i =0;i<=4;i+=2){
           for(int j=0;j<=i;j++){
            System.out.print(k);

            k++;
           }
           System.out.println("");
        }
        
    }
}