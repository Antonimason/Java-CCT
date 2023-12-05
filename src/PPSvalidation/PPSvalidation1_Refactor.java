package PPSvalidation;

public class PPSvalidation1_Refactor {
    
    public static boolean checkLength(String ppsn){
        return (ppsn.length() == 8 || ppsn.length()  == 9);
    }
    public static boolean checkForNums(String ppsn){
        String first7 = ppsn.substring(0,7);
        return (first7.matches("[0-9]+"));
    } 
    public static boolean checkForChars(String ppsn){
        String lastChars = ppsn.substring(7);
        return (lastChars.matches("[a-zA-Z]+"));
    }
    
    public static boolean validatePPSN(String ppsn){
        if(!checkLength(ppsn)){
           System.out.println("Incorrect length");
           return false;
        }
        if(!checkForNums(ppsn)){
           System.out.println("First 7 characters are not numbers");
           return false;
        }
        
        if(!checkForChars(ppsn)){
           System.out.println("Last character must be letters");
           return false;
        }
        System.out.println("Valid PPSN!");
        return true;
    }
    public static void main(String[] args){
        String ppsn = "9630108IA";
        boolean isValidPPSN = validatePPSN(ppsn);
        
        if(isValidPPSN){
            System.out.println("Valid PPSN!");
        }
    }
}
