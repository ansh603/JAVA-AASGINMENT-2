import java.util.Scanner;
class Q29{
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

        int count = 0;

        for(int i = 0; i<size; i++){
            for(int j = 1; i<size; i++){
                if(a[i]==a[j]){
                    count++;
                    System.out.println("dublicats element in array is:  "+a[i]);
                }

            }
        }
        System.out.println("Frequency of duplictes element is:  "+count);     
     }
}
