
package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        
        Scanner play = new Scanner(System.in);
        System.out.println("Let´s play, give me your wished number");
        int number = Integer.parseInt(play.nextLine());
        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
