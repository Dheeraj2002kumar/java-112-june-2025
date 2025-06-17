
import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter useranme");

            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }
    }
}
