package Homework2;

import java.util.Scanner;

public class Homework10 {

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("first number to divide");
        String num1 = first.nextLine();

        Scanner second = new Scanner(System.in);
        System.out.println("Second number to divide");
        String num2 = second.nextLine();

        double result;

        if (isNumeric(num1) == true && isNumeric(num2) == true) {
            Double num3 = Double.parseDouble(num1);
            Double num4 = Double.parseDouble(num2);
            if (num4 == 0) {
                System.out.println("Error");
            } else {
                result = num3 / num4;
                System.out.println("The result is: " + result);
            }
        } else {
            System.out.println("Sorry, one of your number is a String");
        }

    }
}
