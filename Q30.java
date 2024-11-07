import java.util.Scanner;
class Q30{
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int[] a = new int[size];
        System.out.println("Enter array element");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.println(" array element is ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nAlternate element of array \n");
        for(int i=0;i<size;i += 2){
           System.out.print(a[i]+" ");
        }
    }
}