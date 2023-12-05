//2) Create a program that will read NUMBERS from a file named data.txt. Add up all the numbers in the file and output the AVERAGE to the screen (e.g. “The average of the numbers in the file is <average goes here>”)

package whileLoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class HomeworkB {
    public static void main(String[] args){
        try{
          BufferedReader sc = new BufferedReader(new FileReader("C:\\Users\\anton\\OneDrive\\Documentos\\NetBeansProjects\\FirstProgram\\build\\classes\\data.txt"));
          String line;
          double total = 0;
          int count = 0;
          while((line = sc.readLine()) != null){
              double num = Double.parseDouble(line);
              total += num;
              count++;
          }
          System.out.println("The average of the numbers in the file is: " + total/count);
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
