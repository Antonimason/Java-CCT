package fileInput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WritingHW {
    public static void main(String[] args){
        System.out.println("What is the file name?");
        Scanner sc = new Scanner(System.in);
        try{
            String fileName = sc.nextLine();
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            System.out.println("What is your first number?");
            int num1 = sc.nextInt();
            System.out.println("What is your second number?");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            bw.write(Integer.toString(sum));
            bw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
