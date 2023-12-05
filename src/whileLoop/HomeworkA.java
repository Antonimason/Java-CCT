//1) Create a program that will ask the user to enter their name (as text). Check to see if their name starts with the letter ‘B’. If it does, output “You can join the club”. Otherwise, output “No Entry”

package whileLoop;

import java.util.Scanner;

public class HomeworkA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        do{
            System.out.println("What is your name?");
            name = sc.nextLine();
            if(name.startsWith("b") || name.startsWith("B")){
                System.out.println("You can join the club.");
            }else {
                System.out.println("No entry");
            }
        }while(!name.startsWith("b") || !name.startsWith("B"));
    }
}
