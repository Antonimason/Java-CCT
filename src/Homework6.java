/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Homework6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me your first number");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Give me your second number");
        int num2 = Integer.parseInt(reader.readLine());
        int result = num1 + num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }
}
