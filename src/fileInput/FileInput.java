
package fileInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(new FileReader("C:\\Users\\anton\\OneDrive\\Escritorio\\hola.txt"));
        System.out.println(sc.next());
        System.out.println(sc.hasNext());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        
        } catch (Exception e){
            System.out.println(e);
        }
        
        System.out.println("-------BUFFERED READER-----------");
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anton\\OneDrive\\Escritorio\\hola.txt"));
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
