/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class Homework3 {
    public static void main(String[] args) {
        Scanner Q1 = new Scanner(System.in);
        System.out.println("What is your quest?");
        String A1 = Q1.nextLine();
               
        Scanner Q2 = new Scanner(System.in);
        System.out.println("What is your favourite colour");
        String A2 = Q2.nextLine();
        
        System.out.println("Ah, I see your quest is to " + A1 + ", and your favourite colour is " + A2);
    }
}
