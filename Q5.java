import java.util.Scanner;
class java_ass15{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("eneter choice 1 or 2");
        int a=s.nextInt();
        if (a==1){
        System.out.println("enter distance in kilometer");
        double kilometer = s.nextDouble();
        double miles = kilometer/1.609; 
        System.out.println("distance in miles");
        System.out.println(miles);
        }
        else if(a==2){
            System.out.println("enter distance in miles");
            double miles = s.nextDouble();
            double kilometer = miles*1.609; 
            System.out.println("distance in kilometer");
            System.out.println(kilometer);
      }
      else{
          System.out.println("Invalid choice");
      }
  }
  }