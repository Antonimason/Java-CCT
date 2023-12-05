
import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {
        Scanner color = new Scanner(System.in);
        System.out.println("What is the colour of the light?");
        String colour = color.nextLine();
        switch (colour) {
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Slow Down");
                break;
            case "green":
                System.out.println("Keep going");
                break;
            default:
                System.out.println("The colour doesn't exist");
        }
    }
}
