package miniHomework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class miniHomework {
    public static void main(String[] args){
        try{
        BufferedReader trade = new BufferedReader(new FileReader("trades.txt")); //Access to the txt file to obtain the trade 
        String trading = trade.readLine();//Reading the trade in txt file
        
        if(trading.matches("[a-zA-Z]{3}.*")){ // Verifying the three first letters (ORIGIN CURRENCY)
  
            if(trading.matches("[a-zA-Z]{6}.*")){ //Verifying the next three letters (DERSTINATION CURRENCY)

                if(trading.contains("-")){ // Verifying if the transaction symbol exist
                    
                    int position = (trading.indexOf("-") - 6) + 6; //Verifying the position of the symbol
                    
                    if(trading.substring(6,position).matches("[1-9][0-9]+")){ // Verifying the trade amount price
                        
                        if(trading.substring(trading.indexOf("-") + 1,trading.length() - 1).matches("[0-9]+")){ //Verifying the trade price amount exchanged
                            
                            if(trading.endsWith("R") || trading.endsWith("O")){ //Verifying if reversed trade is correct.
                                
                                //Creating variables
                                String originCurrency = trading.substring(0,3);
                                String destinationCurrency = trading.substring(3,6);
                                String priceTrade = trading.substring(6,position);
                                String amountTraded = trading.substring(trading.indexOf("-") + 1,trading.length() - 1);
                                char format = trading.charAt(trading.length()-1);
                                
                                //Writing all information into csv file
                                BufferedWriter tradeTransfer = new BufferedWriter(new FileWriter("trades.csv"));
                                try{
                                    tradeTransfer.write(originCurrency);
                                    tradeTransfer.write(",");
                                    tradeTransfer.write(destinationCurrency);
                                    tradeTransfer.write(",");
                                    tradeTransfer.write(priceTrade);
                                    tradeTransfer.write(",");
                                    tradeTransfer.write(amountTraded);
                                    tradeTransfer.write(",");
                                    tradeTransfer.write(format);
                                    tradeTransfer.close();
                                    System.out.println("Congratulations! Your csv file has been created");
                                } catch(IOException e){
                                    System.out.println(e);
                                }
                                
                            }else{
                                System.out.println("Error: The reversed trade symbol is not correct");
                            }   
                        }else {
                            System.out.println("Error: There is no valid amount traded");
                        }
                    }else{
                        System.out.println("Error: There is no valid price for trading");
                    }
                }else{
                    System.out.println("Error: The transaction doesn't have the symbol '-'.");
                }
            }else{
                System.out.println("Error: The destination currency must have 3 letters");
            }
        }else {
            System.out.println("Error: The origin currency must have 3 letters");
        }
        
        }catch(IOException e){
            System.out.print("Please follow up the following Error")
            System.out.println(e);
        }
    }
}