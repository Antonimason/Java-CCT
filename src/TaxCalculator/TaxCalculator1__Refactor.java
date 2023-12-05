
package TaxCalculator;

import java.util.Scanner;

public class TaxCalculator1__Refactor {
    
    public static double payeCutOff(double income){
        double payeCutoff = 40000;
        double paye = 0;
        if (income > payeCutoff) {
            paye += payeCutoff * 0.2;
            paye += (income - payeCutoff) * 0.4;
        } else {
            paye = income * 0.2;
        }
        return paye;
    }
    
    public static double prsi(double income){
        double prsi = income * 0.04;
        return prsi;
    }
    
    public static double uscRates (double income){
        // Usc Rates (0.005, 0.02, 0.045, 0.08)
        // Usc Band (0, 12012, 10908, 47124)
        double usc = 0;
        if (income < 12012) {
            usc = income * 0.005;
        } else {
            usc += 12012 * 0.005;
            income -= 12012;
        } 
        
        if (income < 10908) {
            usc += income * 0.02;
        } else {
            usc += 10908 * 0.02;
            income -= 10908;
        }
        
        if (income < 47124) {
            usc += income * 0.045;
        } else {
            usc += 47124 * 0.045;
            income -= 47124;
            
            usc += income * 0.08;
        }
        return usc;
    }

    public static void main(String[] args) {
        try{
            Scanner totalIncome = new Scanner(System.in);
            System.out.println("Tell me how much is your Annual Gross Pay");
            String sc = totalIncome.nextLine();
            if(sc.matches("^[0-9\\.\\/]+$")){
                double income = Double.parseDouble(sc);
                System.out.println("Your Annual Tax is: " + (payeCutOff(income) + prsi(income) + uscRates(income)) + " and your Annual Profit is: " + (income - (payeCutOff(income) + prsi(income) + uscRates(income))));
            }else{
                System.out.println("Sorry, you must provide a number and it should be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
