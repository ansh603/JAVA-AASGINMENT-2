import java.util.Scanner;
class Q27{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int[] a = new int[size];
        System.out.println("eneter array element");
        for(int i=0;i<size;i++){
            a[i] = s.nextInt();
        }
        System.out.println(" array element is");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int small = a[0];
        for(int i=0;i<size;i++){
                if(a[i]<small){
                    small=a[i];
                }

            }
            System.out.println("Smallest element of array is:  "+small);
        }
       
}