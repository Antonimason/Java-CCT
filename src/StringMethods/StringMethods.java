
package StringMethods;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("What is your name?");
            String userName = sc.nextLine();
            String lastName = " Giambra";
            System.out.println("Your name is " + userName.length() + " characters long."); //this indicate how many characters has your string
            System.out.println("Your trimmed name is " + userName.trim().length() + " characters long."); //Deleted white spaces at the start and end of the string
            System.out.println(userName.trim().concat(lastName));
            System.out.println(userName.equals(userName.trim())); // Your string is equal to?
            System.out.println(userName.contains("Ant")); // your string has this letter?
            System.out.println(userName.indexOf("Jose")); // position of this letter in your string
            System.out.println(userName.substring(2,4)); // make a new string from last string using start or/and end position indicated
            System.out.println(userName.matches("[a-zA-Z]+"));
            // Antonio -> true
            // Antonio1 -> false
            System.out.println(userName.matches("[a-zA-Z]{3}.*"));
            // {3} means exactly 3 instances
            // . matches with any character
            // * 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
