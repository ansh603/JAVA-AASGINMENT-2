
import java.util.Scanner;

class  Q1{
    public static void main(String[] args){
      Scanner s= new Scanner(System.in);
               
      System.out.println("eneter choice 1 or 2");
      int a=s.nextInt(); 
      if (a==1){
      System.out.println("enter temperature in celsius");
      double celsius=s.nextInt();
      double fahrenheit = (celsius * 9/5) + 32;
      System.out.println("temperature in fahrenheit");
      System.out.println(fahrenheit);
      }
      else if(a==2){
      System.out.println("enter temperature in fahrenheit");
      double fahrenheit=s.nextInt();
      double celsius = (fahrenheit - 32) * 5/9;
      System.out.println("enter temperature in celsius");
      System.out.println(celsius);
    }
    else{
        System.out.println("Invalid choice");
    }
}
}