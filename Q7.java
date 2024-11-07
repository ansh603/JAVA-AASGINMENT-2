import java.util.Scanner;
class Q7{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("eneter a grade in perecnt");
        int grade=s.nextInt();
        if(grade>=90){
            System.out.println("Grade A");
        }
            else if(grade>=80){
            System.out.println("Grade B");
            }
            else if(grade>=70){
            System.out.println("Grade C");
            }
            else if(grade>=60){
            System.out.println("Grade D");
            }
            else if(grade>=50){
            System.out.println("Grade E");
            }
            else if(grade<=40){
            System.out.println("Grade F ");
            }
        }
    }