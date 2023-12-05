package whileLoop;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){
        int total = 0; 
        int currNum = 0;
        Scanner sc = new Scanner(System.in);
        while(currNum != -1){
            System.out.println("What is the next number?\nEnter -1 to stop.");
            currNum = sc.nextInt();
            total += currNum;
        }
        System.out.println(total+1);
    }
}
