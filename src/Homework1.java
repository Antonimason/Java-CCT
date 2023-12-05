/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
 *
 * @author anton
 */
public class Homework1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print ( "Who are you? " );
        String name = reader.readLine();
        System.out.println("Oh, that is a very nice name, " + name);
     
    }
}
