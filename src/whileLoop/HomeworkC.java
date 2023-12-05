
package whileLoop;

import java.io.FileReader;
import java.util.Scanner;

public class HomeworkC {
    public static void main(String[] args){
        try{
            Scanner sc2 = new Scanner(new FileReader("C:\\Users\\anton\\OneDrive\\Documentos\\NetBeansProjects\\FirstProgram\\build\\classes\\data.txt"));
            while(sc2.hasNext()){
                System.out.println(sc2.nextLine());
            }
            System.out.println("End of list");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
