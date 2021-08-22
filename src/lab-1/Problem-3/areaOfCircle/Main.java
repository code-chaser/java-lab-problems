/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n----------------------------------------------------\n");
        System.out.println("         | A R E A | O F | C I R C L E |\n");
        System.out.println("----------------------------------------------------\n\n");
            double r;
            System.out.println("Enter radius of the CIRCLE :\n");
            r = input.nextDouble();
            Circle c = new Circle(r);
            System.out.println("\nArea of the CIRCLE : ");
            c.printArea();
            System.out.println("\n----------------------------------------------------\n\n");
        input.close();
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/