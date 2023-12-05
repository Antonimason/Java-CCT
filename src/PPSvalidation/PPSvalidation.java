package PPSvalidation;

public class PPSvalidation {
    public static void main(String[] args){
        String ppsn = "9630138IA";
        System.out.println(ppsn.length());
        if (ppsn.length() < 8 || ppsn.length()  > 9) {
            System.out.println("Incorrect length");
        } else {
            String first7 = ppsn.substring(0,7);
            if (!first7.matches("[0-9]+")){
                System.out.println("Firsdt 7 characters are not numbers");
            } else {
                String lastChars = ppsn.substring(7);
                if (!lastChars.matches("[a-zA-Z]+")){
                    System.out.println("Last caracters must be letters");
                } else{
                    System.out.println("Valid PPSN!!!");
                }
            }
        }
    }
}
