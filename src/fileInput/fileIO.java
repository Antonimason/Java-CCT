package fileInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class fileIO {
    public static void main(String[] args){
        try{
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\anton\\OneDrive\\Escritorio\\example.txt"));
            bw.write("Hello.\n\nWorld");
            bw.close();
            
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anton\\OneDrive\\Escritorio\\example.txt"));
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
