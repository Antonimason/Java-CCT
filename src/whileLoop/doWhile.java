package whileLoop;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args){
        int total = 0;
        int currNum = -1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("What is the next number\nEnter -1 to stop.");
            currNum = sc.nextInt();
            total += currNum;
        } while(currNum != -1);
        System.out.println(total +1);
   
    }
}
