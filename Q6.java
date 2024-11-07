import java.util.Scanner;
class Q6{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("eneter a year");
        int year=s.nextInt();
        if(year%4==0){
            System.out.println("leap year");
        }
            else{
            System.out.println("it is not a leap year");
            }
        }
    }
    