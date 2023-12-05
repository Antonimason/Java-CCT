
package MethodExample;

import java.util.Scanner;

public class MethodExample {
    
    static int bestNum = 7;
    public static void main(String[] args){
        sayHello();
        saySomething("Java is fun!");
        int result = squareNumber(3);
        System.out.println(result);
        String userName = askUser("What is your name?");
        System.out.println(evenOdd(result));
        System.out.println("The best num is " + bestNum);
        
    }
    public static void sayHello(){
        System.out.println("Hello World! " + bestNum);
    }
    public static void saySomething(String something){
        System.out.println(something);
    }
    public static int squareNumber(int numToSquare){
        return(numToSquare * numToSquare);
    }
    public static String askUser(String prompt){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(prompt);
        try{
            String answer = myScanner.nextLine();
            return answer;
        }catch(Exception e){
            return "";
        }
    }
    public static boolean evenOdd(int number){
         if(number%2 == 0){
            return true;
        }
            return false;
    }
}
