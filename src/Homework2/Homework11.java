package Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework11 {

    private static boolean isNumeric(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me a number");

        String number = reader.readLine();

        if (isNumeric(number) == true) {
            int num = Integer.parseInt(number);
            if (num % 2 == 0) {
                System.out.println("Result: " + num % 2 + " Your number is EVEN");
            } else {
                System.out.println("Result: " + num % 2 + " Your number is ODD");
            }
        } else {
            System.out.println("Is not a number");
        }
    }

}
