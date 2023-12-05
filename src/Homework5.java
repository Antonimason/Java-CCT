/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class Homework5 {
    public static void main(String[] args){
        
        Scanner Q1 = new Scanner(System.in);
        System.out.println("Give me your first number");
        int num1 = Integer.parseInt(Q1.nextLine());
        
        Scanner Q2 = new Scanner(System.in);
        System.out.println("Give me your second number");
        int num2 = Integer.parseInt(Q2.nextLine());
        int result = num1 + num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }
}
