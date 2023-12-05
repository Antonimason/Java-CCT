package Homework2;

import java.util.Scanner;
public class Homework9 {
        
    private static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Give your first number");
        String num1 = first.nextLine();
        
        Scanner second = new Scanner(System.in);
        System.out.println("You gave me your first number, now a second number is needed");
        String num2 = second.nextLine();
        
        if(isNumeric(num1) == true && isNumeric(num2) == true){
            int num3 = Integer.parseInt(num1);
            int num4 = Integer.parseInt(num2);
            if(num3 == num4)System.out.println("the numbers are the same");
            else if(num3 > num4)System.out.println("Your first number is bigger than your second numbner");
            else System.out.println("Your second number is bigger than your first number");
        }else System.out.println("Sorry, one of your number is a String");
    }
}
