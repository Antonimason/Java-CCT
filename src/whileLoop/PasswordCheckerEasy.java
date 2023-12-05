package whileLoop;

import java.util.Scanner;

public class PasswordCheckerEasy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String correctPassword = "I love Java";
        String password; // Variable scope
        
        do{
            System.out.println("What is your password?");
            password = sc.nextLine();
        } while(!correctPassword.equals(password));
        System.out.println("Success! Welcome back.");
    }
}
