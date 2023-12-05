package whileLoop;

import java.util.Scanner;

public class PasswordCheckerIntermediate {
    public static void main(String[] args){
        String currentPassword = "Antonio";
        Scanner sc = new Scanner(System.in);
        int attempts = 5;
        String password;
        do{
            System.out.println("What is your password?");
            password = sc.nextLine();
            if(currentPassword.equals(password) && attempts > 0){
                System.out.println("Access granted!");
                break;
                
            } else{
                attempts--;
                System.out.println("You have " + attempts + " chances left.");
                if(attempts == 0){
                    System.out.println("Access Denied!");
                    break;
                }
            }
        } while(!currentPassword.equals(password));
    }
}
