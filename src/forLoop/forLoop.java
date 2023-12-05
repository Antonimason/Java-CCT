package forLoop;

import java.util.Scanner;

public class forLoop {
  public static void main(String[] args){
      
      for(int counter = -2; counter < 10; counter++){
          System.out.println(counter);
      }
      
      try{
          Scanner sc = new Scanner(System.in);
          System.out.println("What integer would you like to get the factorial of?");
          double sr = Integer.parseInt(sc.nextLine());
          double total = 1;
          for(double i = sr; i >= 1 ; i--){
              total = total * i;
              System.out.println(total);
          }
      }catch(Exception e){
          System.out.println(e);
      }
  }  
}
 