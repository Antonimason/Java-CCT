
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("dame un numero papa");
        int num1 = number.nextInt();
        if(num1 > 100){
            System.out.println("too big");
        } else {
            System.out.println("Perfect");
        }
        System.out.println("end of program");
    }
}
