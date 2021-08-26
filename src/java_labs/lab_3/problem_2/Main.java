/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Main {
    public static void main(String[] Args) {
        while (true) {
            Scanner input = new Scanner(System.in);NonAbstractArithmetic obj = new NonAbstractArithmetic();
            double a, b;
            System.out.println("\n\n---------------------------------");
            System.out.println("\n      A R I T H M E T I C\n");
            System.out.println("---------------------------------\n");
            System.out.println("Enter two numbers:\n");
            a = input.nextDouble();
            b = input.nextDouble();
            System.out.println("\n---------------------------------\n");
            System.out.println("Addition        = " + obj.addition(a,b));
            System.out.println("Subtraction     = " + obj.subtraction(a,b));
            System.out.println("Multiplication  = " + obj.multiplication(a,b));
            System.out.println("Division        = " + obj.division(a,b) + "\n");
            System.out.println("---------------------------------\n\n");
            System.out.print("Do you wish to try again? (Y = Yes || N = No): ");
            char choice = input.next().charAt(0);
            if (choice == 'N') {
                System.out.println("\n\n---------------------------------");
                System.out.println("\nExiting...");
                System.out.println("\n---------------------------------");
                return;
            }
            while(choice != 'Y') {
                System.out.print("\nY or N? : ");
                choice = input.next().charAt(0);
                if (choice == 'N') {
                    System.out.println("\n\n---------------------------------");
                    System.out.println("\nExiting...");
                    System.out.println("\n---------------------------------");
                    return;
                }
            }
            System.out.println("\n\n---------------------------------");
        }
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/